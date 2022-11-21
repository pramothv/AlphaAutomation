package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.HashMap;

public class JConnectChatPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(JConnectChatPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public JConnectChatPage(WebDriver driver)
    {
        super(driver);

    }


private String homeDirectory = System.getProperty("user.dir");
    private String resources = "resources";
    private String testdata = "testdata";
    @FindBy(xpath="(//span[text()='Chat'])[1]")
    private WebElement lnk_Chat;
    @FindBy(xpath="//*[contains(text(),'Jackie Shroff,JA SC')]")
    private WebElement lnk_ChatParticipants;

    @FindBy(xpath="(//div[@class='sendButton'])[1]")
    private WebElement btn_messageSend;

    @FindBy(xpath = "(//textarea[@placeholder='Type a message'])[1]")
    private WebElement input_Message;


    @FindBy(xpath="(//span[@class='anticon anticon-check-circle'])[1]")
    private WebElement btn_CheckCircle;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[1]")
    private WebElement btn_drpUsers;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[2]")
    private WebElement btn_drpSubject;


    private By message = By.xpath("//*[contains(text(),'Hello')]");

    @FindBy(xpath="(//input[@type='file'])[1]")
    private WebElement inputAddFileMessageJconnect;

    @FindBy(xpath="//label[@title='Subject']//following::input[1]")
    private WebElement txt_Subject;


    public boolean clickChat(){
        try{
            seleniumAdaptor.pauseFor(2);

            loggerObj.info("The lnk_Chat is not clicked");
            seleniumAction.clickElement(lnk_Chat);
            loggerObj.info("The lnk_Chat is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickChatParticipants(){
        try{


            loggerObj.info("The lnk_ChatParticipants is not clicked");
            seleniumAction.clickElement(lnk_ChatParticipants);
            loggerObj.info("The lnk_ChatParticipants is clicked");
            seleniumAdaptor.pauseFor(2);


            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickMessageSend(){
        try{


            loggerObj.info("The btn_messageSend is not clicked");
            seleniumAction.clickElement(btn_messageSend);
            loggerObj.info("The btn_messageSend is clicked");



            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureMessage(String message) {
        try {

            System.out.println("The input_Message is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Message);
            seleniumAction.clearText(input_Message);
            seleniumAction.typeText(input_Message, message);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCheckCircle(){
        try{

            loggerObj.info("The btn_checkCircle is not clicked");
            seleniumAction.clickElement(btn_CheckCircle);
            loggerObj.info("The btn_checkCircle is clicked");
            seleniumAdaptor.pauseFor(2);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }







    public boolean captureUsers(String users){
        try{

            seleniumAction.clickElement(btn_drpUsers);
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div//div[text()='" + users + "'])[1]")));
            seleniumAdaptor.pauseFor(1);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean captureSubjectChat(String subject){
        try{
            loggerObj.info("The btn_drpSubject is not clicked");

            seleniumAction.clickElement(btn_drpSubject);
            loggerObj.info("The btn_drpSubject is clicked");

            seleniumAdaptor.pauseFor(2);

            driver.findElement(By.xpath("//label[@title='Subject']//following::input[1]")).sendKeys(subject);
            seleniumAdaptor.pauseFor(1);
            txt_Subject.sendKeys(new CharSequence[] {Keys.ARROW_DOWN});
            txt_Subject.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The Subject is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean UploadFileMessageJconnect(){
        try{
            seleniumAction.scrollDown();
            seleniumAction.scrollDown();

            inputAddFileMessageJconnect.sendKeys(new CharSequence[]{System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + resources + File.separator + testdata + File.separator + "AutomationTestPlan.pdf"});


            loggerObj.info("The File is uploaded");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public String getMessage() {

        seleniumAction.clickElement(message);
        loggerObj.info("The message is not clicked");
        String desc = driver.findElement(message).getText();
        loggerObj.info("The Message from WebApp chat is :" + desc);
        return desc;
    }





}
