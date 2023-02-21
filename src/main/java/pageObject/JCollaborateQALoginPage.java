package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
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

    @FindBy(xpath="(//button[text()='Validate Credentials'])[1]")
    private WebElement btn_ValidateCredentials1;

    private By txt_UserName1 = By.xpath("(//input[@id='username'])[1]");

    private By txt_Password1 = By.xpath("(//input[@id='password'])[1]");

    private By txt_Login1 = By.xpath("(//button[text()='Sign In'])[1]");




    public String getUserNameText() {

        seleniumAction.clickElement(txt_UserName1);
        loggerObj.info("The UserNameText is clicked");
        String text = driver.findElement(txt_UserName1).getText();
        loggerObj.info("The UserNameText is :" + text);

        return text;
    }

    public String getPasswordText() {

        seleniumAction.clickElement(txt_Password1);
        loggerObj.info("The Password Text is clicked");
        String text = driver.findElement(txt_Password1).getText();
        loggerObj.info("The Password Text is :" + text);

        return text;
    }

    public String getLoginText() {

//        seleniumAction.clickElement(txt_Login1);
//        loggerObj.info("The txt_Login1 is clicked");
        String text = driver.findElement(txt_Login1).getText();
        loggerObj.info("The Login Text is :" + text);

        return text;
    }
    public void CheckingTRYALLOGOLoginScreen(){

        WebElement i = driver.findElement(By.xpath("(//img[@class='logo-image'])[1]"));
        Boolean p = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0" , i);
        if(p) {
            System.out.println("TRYAL Logo is present");
        }else{System.out.println("TRYAL Logo is not present");
        }

    }

    public boolean clickKeyBoardENTER(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_Password is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_Password);
            txt_Password.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The ENTER button in Keyboard is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public void opentabJConnectDemoDAPResearchSite1(){

        seleniumAdaptor.openNewTabJS(0);
        seleniumAdaptor.switchToTab(0);
        driver.get("https://jconnect-build.ut1.tryallabs.com/api/DallasPharmaInc/DAPResearchSite/login");

    }

    public boolean captureUserName(String username){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The UserName is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_UserName);
            seleniumAction.clearText(txt_UserName);
            seleniumAction.typeText(txt_UserName,username);
            loggerObj.info("The txt_UserName is captured successfully");
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
            loggerObj.info("The txt_Password is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSignIn(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SignIn is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SignIn);
            loggerObj.info("The btn_SignIn is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickValidateCredentials1(){
        try{

            loggerObj.info("The btn_ValidateCredentials1 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ValidateCredentials1);
            loggerObj.info("The btn_ValidateCredentials1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

}
