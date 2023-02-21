package pageObject;

import base.BaseClass;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;

public class GenerateHAR extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(GenerateHAR.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public GenerateHAR(WebDriver driver) {
        super(driver);

    }

    public void generateHARFile() throws IOException {


        BrowserMobProxy myProxy=new BrowserMobProxyServer();

        myProxy.start(4455);

        //2. Set SSL and HTTP proxy in SeleniumProxy
        Proxy seleniumProxy=new Proxy();
        seleniumProxy.setHttpProxy("localhost:" +myProxy.getPort());
        seleniumProxy.setSslProxy("localhost:" +myProxy.getPort());

        //3. Add Capability for PROXY in DesiredCapabilities
        DesiredCapabilities capability=new DesiredCapabilities();
        capability.setCapability(CapabilityType.PROXY, seleniumProxy);
        capability.acceptInsecureCerts();
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        //4. Set captureTypes
        EnumSet <CaptureType> captureTypes=CaptureType.getAllContentCaptureTypes();
        captureTypes.addAll(CaptureType.getCookieCaptureTypes());
        captureTypes.addAll(CaptureType.getHeaderCaptureTypes());
        captureTypes.addAll(CaptureType.getRequestCaptureTypes());
        captureTypes.addAll(CaptureType.getResponseCaptureTypes());

        //5. setHarCaptureTypes with above captureTypes
        myProxy.setHarCaptureTypes(captureTypes);

        //6. HAR name
        myProxy.newHar("MyHAR");

//        Har har = myProxy.getHar();
//
//        File myHARFile= new File(System.getProperty("user.dir")+"/HARFolder/googleHAR2.har");
//        har.writeTo(myHARFile);
//
//        loggerObj.info("HAR Details has been successfully in the file");



        }

    public void generateHARFileAfter() throws IOException {


        BrowserMobProxy myProxy = new BrowserMobProxyServer();
//        myProxy.start(4455);




        Har har = myProxy.getHar();

        File myHARFile= new File(System.getProperty("user.dir")+"/HARFolder/googleHAR2.har");
        har.writeTo(myHARFile);

        loggerObj.info("HAR Details has been successfully in the file");



    }








}










