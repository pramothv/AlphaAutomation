package pageObject;

import base.BaseClass;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;

public class GenerateHAR extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(GenerateHAR.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public void generateHARFile() throws IOException {


        BrowserMobProxy myProxy = new BrowserMobProxyServer();
            myProxy.start(4455);

            Proxy seleniumProxy = new Proxy();
        seleniumProxy.setHttpProxy("localhost:" +myProxy.getPort());
        seleniumProxy.setSslProxy("localhost:" +myProxy.getPort());


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);

        EnumSet<CaptureType> captureTypes= CaptureType.getAllContentCaptureTypes();

        captureTypes.addAll(CaptureType.getCookieCaptureTypes());
        captureTypes.addAll(CaptureType.getHeaderCaptureTypes());
        captureTypes.addAll(CaptureType.getRequestCaptureTypes());
        captureTypes.addAll(CaptureType.getResponseCaptureTypes());

        myProxy.setHarCaptureTypes(captureTypes);

        myProxy.newHar("MyHAR");


        Har har = myProxy.getHar();

        File myHARFile= new File(System.getProperty("user.dir")+"/HARFolder/googleHAR1.har");
        har.writeTo(myHARFile);

        loggerObj.info("HAR Details saved in the file");



        }









}










