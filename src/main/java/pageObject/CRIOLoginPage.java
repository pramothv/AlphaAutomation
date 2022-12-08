package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
public class CRIOLoginPage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(CRIOLoginPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public CRIOLoginPage(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "(//input[@name='email'])[1]")
    private WebElement txt_EmailCRIO;

    @FindBy(xpath = "(//input[@name='password'])[1]")
    private WebElement txt_PasswordCRIO;


    @FindBy(xpath = "(//button[text()='Sign In'])[1]")
    private WebElement btn_SignInCRIO;


    @FindBy(xpath = "(//button[text()='Next'])[1]")
    private WebElement btn_NextCRIO;



    public void opentabCRIO(){

        seleniumAdaptor.openNewTabJS(1);
        seleniumAdaptor.switchToTab(1);
        driver.get("https://n5.np.clinicalresearch.io/login");

    }

    public boolean captureEmailCRIO(String emailCRIO){
        try{

            loggerObj.info("The UserName is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_EmailCRIO);
            seleniumAction.clearText(txt_EmailCRIO);
            seleniumAction.typeText(txt_EmailCRIO,emailCRIO);
            loggerObj.info("The txt_EmailCRIO is captured successfully");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePasswordCRIO(String password){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_Password is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_PasswordCRIO);
            seleniumAction.clearText(txt_PasswordCRIO);
            seleniumAction.typeText(txt_PasswordCRIO,password);
            loggerObj.info("The txt_PasswordCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSignInCRIO(){
        try{
            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SignInCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SignInCRIO);
            loggerObj.info("The btn_SignInCRIO is clicked");
            seleniumAdaptor.pauseFor(5);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickNextCRIO(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_NextCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_NextCRIO);
            loggerObj.info("The btn_NextCRIO is clicked");
            seleniumAdaptor.pauseFor(1);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


}
