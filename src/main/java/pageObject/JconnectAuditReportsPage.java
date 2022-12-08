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

public class JconnectAuditReportsPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(JconnectAuditReportsPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public JconnectAuditReportsPage(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "(//span[text()='Audit Reports'])[1]")
    private WebElement lnk_AuditReports;

    @FindBy(xpath = "(//span[text()='Call History'])[1]")
    private WebElement lnk_CallHistory;

    @FindBy(xpath = "(//span[text()='Search'])[1]")
    private WebElement btn_Search;

    @FindBy(xpath = "(//i[@class='anticon anticon-down'])[1]")
    private WebElement btn_ActionsDrpdown;

    @FindBy(xpath = "(//a[text()='Actions '])[1]")
    private WebElement btn_Actions;

    @FindBy(xpath = "(//i[@class='anticon anticon-down'])[1]")
    private WebElement btn_Actionsdrp;

    @FindBy(xpath = "(//a[@class='ant-dropdown-link ant-dropdown-trigger actionsDropdown'])[1]")
    private WebElement btn_Actionsdrp3;

    @FindBy(xpath = "(//*[contains(text(),'Act')])[14]")
    private WebElement btn_Actionsdrp5;

    private By btn_Actions1 = By.xpath("(//a[text()='Actions '])[1]");

    private By btn_ActionsDrp1 = By.xpath("(//i[@class='anticon anticon-down'])[1]");

    private By btn_ActionsDrp5 = By.xpath("(//*[contains(text(),'Act')])[14]");

    private By btn_ActionsDrp2 = By.xpath("(//a[@class='ant-dropdown-link ant-dropdown-trigger actionsDropdown'])[1]");

    @FindBy(xpath = "(//li[text()='Participants History'])[1]")
    private WebElement btn_ParticipantHistory;

    private By btn_ParticipantHistory1 = By.xpath("(//li[text()='Participants History'])[1]");

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[1]")
    private WebElement btn_drpStudy;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[1]")
    private WebElement btn_drpSite;

    @FindBy(xpath="(//span[text()='Ok'])[1]")
    private WebElement btn_OK;


    @FindBy(xpath="//label[@title='Study']//following::input[1]")
    private WebElement txt_Study;

    @FindBy(xpath="//label[@title='Site']//following::input[1]")
    private WebElement txt_Site;

    private By txt_Participant1Name = By.xpath("(//div[@class='ant-table-body']//table/tbody/tr[1]/td[1])[2]");

    private By txt_Participant1Status1 = By.xpath("(//div[@class='ant-table-body']//table/tbody/tr[1]/td[3])[2]");

    private By txt_Participant2Name = By.xpath("(//div[@class='ant-table-body']//table/tbody/tr[1]/td[1])[2]");

    private By txt_Participant2Status2 = By.xpath("(//div[@class='ant-table-body']//table/tbody/tr[2]/td[3])[2]");


    private By txt_participantHistoryTitle = By.xpath("((//span[@class='ant-descriptions-item-content']))[1]");

    private By txt_participantHistoryScheduledDate = By.xpath("((//span[@class='ant-descriptions-item-content']))[2]");

    private By txt_participantHistoryScheduledTime = By.xpath("((//span[@class='ant-descriptions-item-content']))[3]");

    private By txt_participantHistoryTimeZone = By.xpath("((//span[@class='ant-descriptions-item-content']))[4]");





    public String getParticipant1Name() {

        seleniumAction.clickElement(txt_Participant1Name);
        loggerObj.info("The txt_Participant1Name is clicked");
        String txt = driver.findElement(txt_Participant1Name).getText();
        loggerObj.info("The Participant1Name is :" + txt);
        return txt;
    }

    public String getParticipant1Status1() {

        seleniumAction.clickElement(txt_Participant1Status1);
        loggerObj.info("The txt_Participant1Status1 is clicked");
        String txt = driver.findElement(txt_Participant1Status1).getText();
        loggerObj.info("The Participant1 Status1 is :" + txt);
        return txt;
    }

    public String getParticipant2Name() {

        seleniumAction.clickElement(txt_Participant2Name);
        loggerObj.info("The txt_Participant2Name is clicked");
        String txt = driver.findElement(txt_Participant2Name).getText();
        loggerObj.info("The Participant2Name is :" + txt);
        return txt;
    }

    public String getParticipant2Status2() {

        seleniumAction.clickElement(txt_Participant2Status2);
        loggerObj.info("The txt_Participant1Status2 is clicked");
        String txt = driver.findElement(txt_Participant2Status2).getText();
        loggerObj.info("The Participant2 Status2 is :" + txt);
        return txt;
    }

    public String getParticipantHistoryTitle() {

        seleniumAction.clickElement(txt_participantHistoryTitle);
        loggerObj.info("The txt_participantHistoryTitle is clicked");
        String txt = driver.findElement(txt_participantHistoryTitle).getText();
        loggerObj.info("The participantHistoryTitle is :" + txt);
        return txt;
    }

    public String getParticipantHistoryScheduledDate() {

        seleniumAction.clickElement(txt_participantHistoryScheduledDate);
        loggerObj.info("The txt_participantHistoryScheduledDate is clicked");
        String txt = driver.findElement(txt_participantHistoryScheduledDate).getText();
        loggerObj.info("The participantHistoryScheduledDate is :" + txt);
        return txt;
    }

    public String getParticipantHistoryScheduledTime() {

        seleniumAction.clickElement(txt_participantHistoryScheduledTime);
        loggerObj.info("The txt_participantHistoryScheduledTime is clicked");
        String txt = driver.findElement(txt_participantHistoryScheduledTime).getText();
        loggerObj.info("The participantHistoryTime is :" + txt);
        return txt;
    }

    public String getParticipantHistoryScheduledTimeZone() {

        seleniumAction.clickElement(txt_participantHistoryTimeZone);
        loggerObj.info("The txt_participantHistoryTimeZone is clicked");
        String txt = driver.findElement(txt_participantHistoryTimeZone).getText();
        loggerObj.info("The participantHistoryTimeZone is :" + txt);
        return txt;
    }

    public boolean clickParticipantHistory(){
        try{


//            seleniumAction.hoverMouseOverElement(btn_ParticipantHistory1);
            seleniumAdaptor.JavaScriptClick(btn_ParticipantHistory);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }





    public boolean clickAuditReports(){
        try{
//            seleniumAdaptor.pauseFor(2);

            loggerObj.info("The lnk_AuditReports is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_AuditReports);
            loggerObj.info("The lnk_AuditReports is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickCallHistory(){
        try{

            loggerObj.info("The lnk_CallHistory is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CallHistory);
            loggerObj.info("The lnk_CallHistory is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSearch(){
        try{

            loggerObj.info("The btn_Search is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Search);
            loggerObj.info("The btn_Search is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickActionsDrpdown(){
        try{

            loggerObj.info("The btn_ActionsDrpdown is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ActionsDrpdown);
            loggerObj.info("The btn_ActionsDrpdown is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickActions(){
        try{

            loggerObj.info("The btn_Actions is not clicked");
            seleniumAction.hoverMouseOverElement(btn_Actions1);
            seleniumAdaptor.JavaScriptClick(btn_Actions);
            seleniumAction.clickElement(btn_Actions);
            seleniumAction.clickElement(btn_Actions);
            seleniumAdaptor.JavaScriptClick(btn_Actions);
            loggerObj.info("The btn_Actions is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickActions1(){
        try{

            loggerObj.info("The btn_Actions1 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_ActionsDrp1);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp);
            seleniumAction.clickElement(btn_Actionsdrp);
            seleniumAction.clickElement(btn_Actionsdrp);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp);
            loggerObj.info("The btn_Actionsdrp is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickActions2(){
        try{

            loggerObj.info("The btn_ActionsDrp2 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_ActionsDrp2);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp3);
            seleniumAction.clickElement(btn_Actionsdrp3);
            seleniumAction.clickElement(btn_Actionsdrp3);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp3);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp);
            seleniumAdaptor.JavaScriptClick(btn_Actions);
            loggerObj.info("The btn_Actionsdrp3 is clicked");
            seleniumAction.hoverMouseOverElement(btn_ActionsDrp1);
            seleniumAction.clickElement(btn_Actions1);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp3);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp);

            loggerObj.info("The btn_Actionsdrp3 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickActions3(){
        try{

            loggerObj.info("The btn_ActionsDrp5 is not clicked");

            seleniumAction.hoverMouseOverElement(btn_ActionsDrp5);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp5);
            seleniumAction.clickElement(btn_Actionsdrp5);
            seleniumAction.clickElement(btn_Actionsdrp5);
            seleniumAdaptor.JavaScriptClick(btn_Actionsdrp5);

            loggerObj.info("The btn_Actionsdrp5 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickOK(){
        try{

            loggerObj.info("The btn_OK is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_OK);
            loggerObj.info("The btn_OK is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureSite(String site){
        try{
            loggerObj.info("The btn_drpSite is not clicked");

            seleniumAction.clickElement(btn_drpSite);
            loggerObj.info("The btn_drpSite is clicked");

            seleniumAdaptor.pauseFor(2);

            driver.findElement(By.xpath("//label[@title='Site']//following::input[1]")).sendKeys(site);
            seleniumAdaptor.pauseFor(1);
            txt_Site.sendKeys(new CharSequence[] {Keys.ARROW_DOWN});
//            seleniumAdaptor.pauseFor(2);
            txt_Site.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The Site is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }










    public boolean captureStudy(String study){
        try{
            loggerObj.info("The btn_drpStudy is not clicked");

            seleniumAction.clickElement(btn_drpStudy);
            loggerObj.info("The btn_drpStudy is clicked");

            seleniumAdaptor.pauseFor(2);

            driver.findElement(By.xpath("//label[@title='Study']//following::input[1]")).sendKeys(study);
            seleniumAdaptor.pauseFor(1);
            txt_Study.sendKeys(new CharSequence[] {Keys.ARROW_DOWN});
//            seleniumAdaptor.pauseFor(2);
            txt_Study.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The Study is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

}
