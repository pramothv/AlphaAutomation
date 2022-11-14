package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;

public class AmazonWebMailPage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(AmazonWebMailPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public AmazonWebMailPage(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement input_WebmailSearch;

    @FindBy(xpath = "(//span[@aria-label='Submit search'])[1]")
    private WebElement btn_WebmailSearch;

    @FindBy(xpath = "(//div[text()='eDiary Login Information'])[1]")
    private WebElement txt_ediaryLoginInfo;

    @FindBy(xpath = "(//div[text()='Noreply'])[1]")
    private WebElement txt_NoReply;

    @FindBy(xpath = "(//iframe[@id='ext-gen2422'])[1]")
    private WebElement webmailIframe1;

    @FindBy(xpath = "(//iframe[@title='message body'])[1]")
    private WebElement webmailIframe2;


    private By webmailPassword = By.xpath("//*[contains(text(), 'Password')]");

    private By webmailVideoCallScheduled = By.xpath("//*[contains(text(), 'Video Call is scheduled with ')]");

    private By chkbox_Screening1 = By.xpath("(//input[@class='ant-checkbox-input'])[2]");

    private By chkbox_WeekOneBaseLine1 = By.xpath("(//input[@class='ant-checkbox-input'])[3]");

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[2]")
    private WebElement chkbox_Screening;
    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[3]")
    private WebElement chkbox_WeekOneBaseLine;

    @FindBy(xpath = "(//input[@id='wdc_username'])[1]")
    private WebElement input_AmazonWebMailUsername;

    @FindBy(xpath = "(//input[@id='wdc_password'])[1]")
    private WebElement input_AmazonWebMailPassword;

    @FindBy(xpath = "(//button[@id='wdc_login_button'])[1]")
    private WebElement btn_SignIn;

    @FindBy(xpath = "(//img[@src='assets/images/jConfigure_build.svg'])[1]")
    private WebElement lnk_JConfigureBuild;

    @FindBy(xpath = "(//img[@src='assets/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild;

    @FindBy(xpath = "(//button[@id='ext-gen250'])[1]")
    private WebElement btn_LogOut;

    @FindBy(xpath = "(//button[@id='ext-gen1348'])[1]")
    private WebElement btn_LogOutYes;


    public boolean captureWebmailSearch(String webmailSearch) {
        try {
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The input_WebmailSearch is not clicked");
            seleniumAdaptor.JavaScriptClick(input_WebmailSearch);
            seleniumAction.clearText(input_WebmailSearch);
            seleniumAction.typeText(input_WebmailSearch, webmailSearch);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureWebmailSearchBtn() {
        try {
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_WebmailSearch is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_WebmailSearch);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_WebmailSearch is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickEdiaryLoginInfo() {
        try {
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The txt_ediaryLoginInfo is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_ediaryLoginInfo);
            seleniumAdaptor.JavaScriptClick(txt_ediaryLoginInfo);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The txt_ediaryLoginInfo is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }


    }

    public boolean clickNoReply() {
        try {
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The NoReply is not clicked");
            seleniumAction.clickElement(txt_NoReply);
            seleniumAdaptor.JavaScriptClick(txt_NoReply);
            seleniumAdaptor.JavaScriptClick(txt_NoReply);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The NoReply is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickLogOut() {
        try {
//            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.switchTodefaultContent();
            System.out.println("The btn_LogOut is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_LogOut);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_LogOut is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickLogOutYes() {
        try {
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_LogOutYes is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_LogOutYes);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_LogOutYes is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean switchtoWebMailIFrame1() {
        try {
            driver.switchTo().defaultContent();
            seleniumAdaptor.explicitWait(webmailIframe1);
            seleniumAdaptor.switchToFrame(webmailIframe1);
            System.out.println("Switched to webmailIframe1 successfully");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean switchtoWebMailIFrame2() {
        try {
            driver.switchTo().defaultContent();
            seleniumAdaptor.explicitWait(webmailIframe2);
            seleniumAdaptor.switchToFrame(webmailIframe2);
            System.out.println("Switched to webmailIframe2 successfully");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getPassword() {

        seleniumAction.clickElement(webmailPassword);
        System.out.println("The Password is clicked");
        String password = driver.findElement(webmailPassword).getText();
        String number = password.split(":")[1].trim();
        loggerObj.info("The Password is :" + number);
        System.out.println("The Password is :" + number);

        return number;
    }

    public String getwebmailVideoCallScheduled() {

        String notification=driver.findElement(webmailVideoCallScheduled).getText();
        loggerObj.info("The VideoCall Guest email notification Description is :" + notification);
        return notification;
    }

    public void CheckingChkboxScreening(){
        String val=chkbox_Screening.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_Screening.isSelected();
        if (checkstatus==true){
            loggerObj.info("Screening Checkbox is already checked");
        }
        else
        {

            loggerObj.info("Screening Checkbox is not selected");
        }
    }

    public void CheckingChkboxWeekOneBaseLine(){
        String val=chkbox_WeekOneBaseLine.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_WeekOneBaseLine.isSelected();
        if (checkstatus==true){
            loggerObj.info("WeekOneBaseLine Checkbox is already checked");
        }
        else
        {

            loggerObj.info("WeekOneBaseLine is not selected");
        }
    }

    public String getCheckingChkboxScreening() {

//        seleniumAction.clickElement(webmailPassword);
        String val=driver.findElement(chkbox_Screening1).getText();
        loggerObj.info("The text is :" + val);
        return val;
    }

    public String getCheckingChkboxWeekOneBaseLine() {


        String val=driver.findElement(chkbox_WeekOneBaseLine1).getText();
        loggerObj.info("The text is :" + val);
        return val;
    }

    public void opentabAmazonWebMail(){

    seleniumAdaptor.openNewTabJS(1);
        seleniumAdaptor.switchToTab(1);
        driver.get("https://webmail.mail.us-east-1.awsapps.com/workmail/?organization=jivascience");

    }

    public void opentabJconnect(){

        seleniumAdaptor.openNewTabJS(1);
        seleniumAdaptor.switchToTab(1);
        driver.get("https://jconnect-build.qa.jivascience.com/webapp/admin/auth/login");

    }

    public void opentabAmazonWebApp(){

        seleniumAdaptor.openNewTabJS(1);
        seleniumAdaptor.switchToTab(1);
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

    }
    public void opentabAmazonWebAppReal(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

//        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

    }

    public void opentabAmazonWebAppReal1(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

//        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

    }
    public void opentabJconnectReal1(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://jcollaborate.jiva-demo.jivascience.com/api/CRIOIntegration/users/sign_in");

//        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

    }
    public void opentabJConnect(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://jcollaborate.jiva-demo.jivascience.com/api/CRIOIntegration/users/sign_in");

//        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

    }

    public boolean captureAmazonWebMailUsername(String webmailusername) {
        try {
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The webmailusername is not clicked");
            seleniumAdaptor.JavaScriptClick(input_AmazonWebMailUsername);
            seleniumAction.clearText(input_AmazonWebMailUsername);
            seleniumAction.typeText(input_AmazonWebMailUsername, webmailusername);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureAmazonWebMailPassword(String webmailpassword) {
        try {
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The input_AmazonWebMailPassword is not clicked");
            seleniumAdaptor.JavaScriptClick(input_AmazonWebMailPassword);
            seleniumAction.clearText(input_AmazonWebMailPassword);
            seleniumAction.typeText(input_AmazonWebMailPassword, webmailpassword);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSignIn() {
        try {
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_SignIn is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SignIn);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_SignIn is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }






}





























