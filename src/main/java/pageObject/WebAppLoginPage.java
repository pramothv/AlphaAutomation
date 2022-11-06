package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class WebAppLoginPage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(WebAppLoginPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public WebAppLoginPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement input_PhoneCode;

    @FindBy(xpath="(//input[@placeholder='Enter your 10-Digit Phone Number.'])[1]")
    private WebElement input_PhoneNum;

    @FindBy(xpath="(//input[@type='password'])[1]")
    private WebElement input_Password;
    @FindBy(xpath="(//div[text()='Save'])[1]")
    private WebElement btn_SaveTimeZone;

    @FindBy(xpath="(//div[text()='Diary'])[1]")
    private WebElement btn_Diary;

    @FindBy(xpath="(//div[text()='Calls'])[1]")
    private WebElement btn_Calls;

    @FindBy(xpath="(//div[text()='Chat'])[1]")
    private WebElement btn_Chat;

    @FindBy(xpath="(//div[text()='More'])[1]")
    private WebElement btn_More;

    @FindBy(xpath="(//div[text()='Login'])[1]")
    private WebElement btn_Login;

    @FindBy(xpath="(//img[@src='assets/images/jConfigure_build.svg'])[1]")
    private WebElement lnk_JConfigureBuild;

    @FindBy(xpath="(//img[@src='assets/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild;

    @FindBy(xpath="(//input[@placeholder='Select Timezone'])[1]")
    private WebElement lnk_TimeZone;

    @FindBy(xpath="(//a[text()=' Log Out '])[1]")
    private WebElement btn_SignOut;



    public boolean captureTimeZoneOption(String timezone){

        try{

            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + timezone + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean capturePhoneCode(String phoneCode){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_PhoneCode is not clicked");
            seleniumAdaptor.JavaScriptClick(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAction.typeText(input_PhoneCode,phoneCode);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean capturePhoneNum(String phoneNum){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_PhoneNum is not clicked");
            seleniumAdaptor.JavaScriptClick(input_PhoneNum);
            seleniumAction.clearText(input_PhoneNum);
            seleniumAction.typeText(input_PhoneNum,phoneNum);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public void opentabJconnectWebApp(){


//        seleniumAdaptor.openNewTabJS(2);
//       Set<String> handles=driver.getWindowHandles();
//       for(String actual: handles){
//
//           if(!actual.equalsIgnoreCase(currentHandle)){
//               driver.switchTo().window(actual);
               ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(w.get(1));
//        seleniumAdaptor.switchToTab(3);
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

    }

    public boolean capturePassword(String password){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_Password is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Password);
            seleniumAction.clearText(input_Password);
            seleniumAction.typeText(input_Password,password);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickSaveTimeZone(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SaveTimeZone is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SaveTimeZone);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_SaveTimeZone is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickLogin(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Login is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Login);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Login is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickDiary(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Diary is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Diary);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Diary is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }



    public boolean clickCalls(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Calls is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Calls);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Calls is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }



    public boolean clickChat(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Chat is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Chat);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Chat is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }



    public boolean clickMore(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_More is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_More);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_More is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }





    public boolean clickJConnectBuild(){
        try{
//        seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_JConnectBuild is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_JConnectBuild);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_JConnectBuild is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickTimeZone(){
        try{
//        seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_TimeZone is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_TimeZone);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_TimeZone is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }




}









