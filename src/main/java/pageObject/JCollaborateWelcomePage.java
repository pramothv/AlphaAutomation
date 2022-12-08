package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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


    private By txt_Welcome = By.xpath("(//span[@class='section-text-header'])[1]");

    private By txt_SelectProduct = By.xpath("(//span[text()='Please select a product to continue...'])[1]");


    private By txt_SelectProductJconnectBuild = By.xpath("(//img[@src='assets/images/jConnect_build.svg'])[1]");



    private By txt_SelectProductJconfigureBuild = By.xpath("(//img[@src='assets/images/jConfigure_build.svg'])[1]");


    @FindBy(xpath="(//img[@src='assets/images/jConfigure_live.svg'])[1]")
    private WebElement lnk_JConfigureLive;

    @FindBy(xpath="(//img[@src='assets/images/jConnect_live.svg'])[1]")
    private WebElement lnk_JConnectLive;

    @FindBy(xpath="(//img[@src='assets/images/jConfigure_build.svg'])[1]")
    private WebElement lnk_JConfigureBuild;

    private By txt_PI = By.xpath("(//span[text()=' PI'])[1]");

    private By txt_PrincipalInvestigator = By.xpath("(//span[text()=' Principal Investigator'])[1]");

    private By txt_PIname = By.xpath("(//a[@class='dropdown-toggle nav-link'])[1]");

    @FindBy(xpath="(//img[@src='assets/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild;

    @FindBy(xpath="(//img[@src='assts/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild1;

    @FindBy(xpath="(//a[text()=' Log Out '])[1]")
    private WebElement btn_SignOut;



    public String getWelcomeText() {

        seleniumAction.clickElement(txt_Welcome);
        loggerObj.info("The Welcome Text is clicked");
        String text = driver.findElement(txt_Welcome).getText();
        loggerObj.info("The Welcome Text is :" + text);

        return text;
    }

    public String getSelectProductText() {

        seleniumAction.clickElement(txt_SelectProduct);
        loggerObj.info("The SelectProduct Text is clicked");
        String text = driver.findElement(txt_SelectProduct).getText();
        loggerObj.info("The SelectProduct Text is :" + text);

        return text;
    }

    public String getSelectProductJconnectBuildText() {
//        seleniumAdaptor.pauseFor(1);
//        seleniumAction.clickElement(txt_SelectProductJconnectBuild);
//        loggerObj.info("The SelectProductJconnectBuild Text is clicked");
        String text = driver.findElement(txt_SelectProductJconnectBuild).getText();
        loggerObj.info("The SelectProductJconnectBuild Text is :" + text);

        return text;
    }

    public String getSelectProductJconfigureBuildText() {

//        seleniumAdaptor.pauseFor(1);

//        seleniumAction.clickElement(txt_SelectProductJconfigureBuild);
//        loggerObj.info("The SelectProductJconfigureBuild Text is clicked");
        String text = driver.findElement(txt_SelectProductJconfigureBuild).getText();
        loggerObj.info("The SelectProductJconfigureBuild Text is :" + text);

        return text;
    }


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

    public String getPItext() {

        seleniumAdaptor.pauseFor(1);
        seleniumAction.clickElement(txt_PI);
        loggerObj.info("The txt_PI is clicked");
        String txt = driver.findElement(txt_PI).getText();
        loggerObj.info("The Principal Investigator Description in JConnect is :" + txt);
        return txt;
    }

    public String getPrincipalInvestigatortext() {

//        seleniumAdaptor.pauseFor(1);
        seleniumAction.clickElement(txt_PrincipalInvestigator);
        loggerObj.info("The txt_PrincipalInvestigator is clicked");
        String txt = driver.findElement(txt_PrincipalInvestigator).getText();
        loggerObj.info("The Principal Investigator Description in JConnect is :" + txt);
        return txt;
    }

    public String getPIName() {


//        seleniumAdaptor.pauseFor(1);
//        seleniumAction.clickElement(txt_PIname);
//        loggerObj.info("The txt_PIname is clicked");
        String txt = driver.findElement(txt_PIname).getText();
        loggerObj.info("The Principal Investigator Name in JConnect is :" + txt);
        return txt;
    }



        public boolean clickJConnectBuild(){
        try{
//        seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_JConnectBuild is not clicked");
             seleniumAdaptor.JavaScriptClick(lnk_JConnectBuild);
             loggerObj.info("The lnk_JConnectBuild is clicked");

        return true;
        } catch(Exception var2) {
            var2.printStackTrace();
        return false;
        }
        }


    public boolean clickJConnectBuild1(){
        try{

            loggerObj.info("The lnk_JConnectBuild1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_JConnectBuild1);
            loggerObj.info("The lnk_JConnectBuild1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

}
