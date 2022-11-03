package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class CallSchedulePage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(CallSchedulePage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public CallSchedulePage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//span[text()='Call Schedule'])[1]")
    private WebElement btn_CallSchedule;

    @FindBy(xpath="(//span[text()='Schedule TeleVisit'])[1]")
    private WebElement btn_ScheduleTeleVisit;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[1]")
    private WebElement btn_Create;

    @FindBy(xpath="(//span[text()='Create'])[1]")
    private WebElement btn_drpDay;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[1]")
    private WebElement btn_drpStudy;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[2]")
    private WebElement btn_drpSite;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[3]")
    private WebElement btn_drpSubject;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[4]")
    private WebElement btn_drpSiteStaff;

    @FindBy(xpath="(//input[@id='callSchedule.title'])[1]")
    private WebElement input_Title;

    @FindBy(xpath="(//span[text()=' + Add Guest '])[1]")
    private WebElement btn_AddGuest;

    @FindBy(xpath="(//input[@id='firstName'])[1]")
    private WebElement txt_FirstName;

    @FindBy(xpath="(//input[@id='guestName'])[1]")
    private WebElement input_GuestName;

    @FindBy(xpath="(//input[@id='guestEmail'])[1]")
    private WebElement input_GuestEmail;

    @FindBy(xpath="(//span[text()='OK'])[1]")
    private WebElement btn_AddGuestOK;

    @FindBy(xpath="(//span[text()='Cancel'])[1]")
    private WebElement btn_drpTeleVisitSubject;

    @FindBy(xpath="(//span[text()='Cancel'])[1]")
    private WebElement btn_drpTeleVisitSiteStaff;

    @FindBy(xpath="(//span[text()='Cancel'])[1]")
    private WebElement btn_AddGuestCancel;

    @FindBy(xpath="(//span[text()='Cancel'])[1]")
    private WebElement btn_drpScheduleTeleVisit;

    @FindBy(xpath="(//span[text()='Unscheduled Visit'])[1]")
    private WebElement btn_UnScheduledVisit;

    @FindBy(xpath="(//span[text()='Scheduled Visit'])[1]")
    private WebElement btn_ScheduledVisit;

    @FindBy(xpath="(//input[@id='lastName'])[1]")
    private WebElement txt_LastName;



    public boolean clickSubject(){
        try{
            seleniumAdaptor.pauseFor(1);
            System.out.println("The btn_CallSchedule is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_CallSchedule);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_CallSchedule is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickScheduleTeleVisit(){
        try{
            seleniumAdaptor.pauseFor(1);
            System.out.println("The ScheduleTeleVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ScheduleTeleVisit);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The ScheduleTeleVisit is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureDay(String day){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpDay);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + day + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureStudy(String study){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpStudy);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + study + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureSite(String site){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpSite);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + site + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureSubject(String subject){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpSubject);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + subject + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureSiteStaff(String siteStaff){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpSiteStaff);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + siteStaff + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureTitle(String title){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The Title is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Title);
            seleniumAction.clearText(input_Title);
            seleniumAction.typeText(input_Title,title);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickAddGuest(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_AddGuest is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddGuest);
            loggerObj.info("The btn_AddGuest is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean captureGuestName(String guestName){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The input_GuestName is not clicked");
            seleniumAdaptor.JavaScriptClick(input_GuestName);
            seleniumAction.clearText(input_GuestName);
            seleniumAction.typeText(input_GuestName,guestName);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureGuestEmail(String guestEmail){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The input_GuestEmail is not clicked");
            seleniumAdaptor.JavaScriptClick(input_GuestEmail);
            seleniumAction.clearText(input_GuestEmail);
            seleniumAction.typeText(input_GuestEmail,guestEmail);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickAddGuestOK() {
        try {
            seleniumAdaptor.pauseFor(2);
            System.out.println("The AddGuestOK is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddGuestOK);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The AddGuestOK is clicked");

            return true;
        } catch (Exception var2) {
            return false;
        }
    }

        public boolean clickAddGuestCancel() {
            try {
                seleniumAdaptor.pauseFor(2);
                System.out.println("The btn_AddGuestCancel is not clicked");
                seleniumAdaptor.JavaScriptClick(btn_AddGuestCancel);
//			loggerObj.debug("Print Logger");
                loggerObj.info("The btn_AddGuestCancel is clicked");

                return true;
            } catch (Exception var2) {
                return false;
            }
        }

    public boolean captureScheduleTeleVisitSubject(String teleVisitSubject){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpTeleVisitSubject);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + teleVisitSubject + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean captureScheduleTeleVisitSiteStaff(String teleVisitSiteStaff){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpTeleVisitSiteStaff);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + teleVisitSiteStaff + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean captureScheduleTeleVisit(String scheduleTeleVisit){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpScheduleTeleVisit);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + scheduleTeleVisit + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickScheduledVisit(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The ScheduledVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ScheduledVisit);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_ScheduledVisit is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickUnScheduledVisit(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_UnScheduledVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_UnScheduledVisit);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_UnScheduledVisit is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickCreate(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_Create is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Create);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Create is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }







}



