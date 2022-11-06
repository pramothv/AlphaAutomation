package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class JCollaborateWelcomePage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(JCollaborateWelcomePage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public JCollaborateWelcomePage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//img[@src='assets/images/jConfigure_live.svg'])[1]")
    private WebElement lnk_JConfigureLive;

    @FindBy(xpath="(//img[@src='assets/images/jConnect_live.svg'])[1]")
    private WebElement lnk_JConnectLive;

    @FindBy(xpath="(//img[@src='assets/images/jConfigure_build.svg'])[1]")
    private WebElement lnk_JConfigureBuild;

    @FindBy(xpath="(//img[@src='assets/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild;

    @FindBy(xpath="(//a[text()=' Log Out '])[1]")
    private WebElement btn_SignOut;



    public boolean clickSignOut(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_SignOut is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SignOut);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_SignOut is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickJConfigureLive(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The lnk_JConfigureLive is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_JConfigureLive);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_JConfigureLive is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }




    public boolean clickJConnectLive(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The lnk_JConnectLive is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_JConnectLive);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_JConnectLive is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }



       public boolean clickJConfigureBuild(){
        try{
        seleniumAdaptor.pauseFor(2);
        System.out.println("The lnk_JConfigureBuild is not clicked");
        seleniumAdaptor.JavaScriptClick(lnk_JConfigureBuild);
//			loggerObj.debug("Print Logger");
        loggerObj.info("The lnk_JConfigureBuild is clicked");

        return true;
        } catch(Exception var2) {
        return false;
        }
        }



        public boolean clickJConnectBuild(){
        try{
//        seleniumAdaptor.pauseFor(2);
        System.out.println("The lnk_JConnectBuild is not clicked");
        seleniumAdaptor.JavaScriptClick(lnk_JConnectBuild);
//			loggerObj.debug("Print Logger");
        loggerObj.info("The lnk_JConnectBuild is clicked");

        return true;
        } catch(Exception var2) {
            var2.printStackTrace();
        return false;
        }
        }




}
