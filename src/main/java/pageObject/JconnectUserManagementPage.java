package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class JconnectUserManagementPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(JconnectUserManagementPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public JconnectUserManagementPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//span[text()='Call Schedule'])[1]")
    private WebElement btn_CallSchedule;

    @FindBy(xpath = "(//span[text()='Next'])[1]")
    private WebElement btn_Next;

    @FindBy(xpath = "(//span[text()='Previous'])[1]")
    private WebElement btn_Previous;

    private By userDetailsTitle = By.xpath("(//input[@id='user.title'])[1]");

    private By userDetailsEmail = By.xpath("(//input[@id='user.email'])[1]");

    private By txt_UserLoginDetails = By.xpath("(//div[text()='Login Details'])[1]");

    private By txt_UserDetails = By.xpath("(//div[text()='User Details'])[1]");

    private By txt_UserAddPrivillagestxt = By.xpath("(//div[text()='Add Privileges'])[1]");



    public boolean clickNext(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_Next);
            loggerObj.info("The btn_Next is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickPrevious(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_Previous);
            loggerObj.info("The btn_Previous is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean captureUserManageListName(String name){
        try{


//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//*[contains(text(),'"+name+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//a[text()='"+name+"'])[1]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='" + name + "'])[2]")));
            loggerObj.info("The UserManageListName is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getUserDetailsTitle() {

        seleniumAction.clickElement(userDetailsTitle);
        seleniumAdaptor.pauseFor(1);

        loggerObj.info("The StartDate for subEmail is clicked");
        String email = driver.findElement(userDetailsTitle).getAttribute("value");
        loggerObj.info("The userDetailsTitle is :" + email);

        return email;
    }


    public String getUserDetailsEmail() {

        seleniumAction.clickElement(userDetailsEmail);
        seleniumAdaptor.pauseFor(1);

        loggerObj.info("The StartDate for subEmail is clicked");
        String email = driver.findElement(userDetailsEmail).getAttribute("value");
        loggerObj.info("The userDetailsEmail is :" + email);

        return email;
    }



    public String getUserLoginDetailstxt() {

        seleniumAction.clickElement(txt_UserLoginDetails);
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(txt_UserLoginDetails).getText();
        loggerObj.info("The UserLoginDetails Tab Description in JConnect is :" + txt);
        return txt;
    }

    public String getUserDetailstxt() {

        seleniumAction.clickElement(txt_UserDetails);
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(txt_UserDetails).getText();
        loggerObj.info("The UserDetails Tab  Description in JConnect is :" + txt);
        return txt;
    }

    public String getUserAddPrivillagestxt() {

        seleniumAction.clickElement(txt_UserAddPrivillagestxt);
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(txt_UserAddPrivillagestxt).getText();
        loggerObj.info("The UserAddPrivillagestxt Tab Description in JConnect is :" + txt);
        return txt;
    }








}

