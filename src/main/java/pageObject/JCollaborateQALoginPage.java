package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class JCollaborateQALoginPage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(JCollaborateQALoginPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public JCollaborateQALoginPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//input[@id='username'])[1]")
    private WebElement txt_UserName;

    @FindBy(xpath="(//input[@id='password'])[1]")
    private WebElement txt_Password;

    @FindBy(xpath="(//button[text()='Sign In'])[1]")
    private WebElement btn_SignIn;




    public boolean captureUserName(String username){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The UserName is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_UserName);
            seleniumAction.clearText(txt_UserName);
            seleniumAction.typeText(txt_UserName,username);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePassword(String password){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_Password is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_Password);
            seleniumAction.clearText(txt_Password);
            seleniumAction.typeText(txt_Password,password);


            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSignIn(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SignIn is clicked");
            seleniumAdaptor.JavaScriptClick(btn_SignIn);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_SignIn is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

}
