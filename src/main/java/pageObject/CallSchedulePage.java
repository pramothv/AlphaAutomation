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

    @FindBy(xpath="(//span[text()='Scheduled Visit'])[1]")
    private WebElement btn_VisitTypeScheduledVisit;

    @FindBy(xpath="(//span[text()='Unscheduled Visit'])[1]")
    private WebElement btn_VisitTypeUnScheduledVisit;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[1]")
    private WebElement btn_Create;

    @FindBy(xpath="(//span[text()='Create'])[1]")
    private WebElement btn_drpDay;

    @FindBy(xpath="(//div[@class='indicator'])[1]")
    private WebElement btn_drpStudy;

    @FindBy(xpath="(//span[@class='ant-select-arrow'])[1]")
    private WebElement btn_drpTime;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[2]")
    private WebElement btn_drpSite;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[3]")
    private WebElement btn_drpSubject;



    @FindBy(xpath="(//span[@class='ant-select-arrow'])[3]")
    private WebElement btn_drpScheduleInfoTimeZone;

    @FindBy(xpath="(//input[@placeholder='Select date'])[1]")
    private WebElement input_Date;

    @FindBy(xpath="(//input[@placeholder='Select time'])[1]")
    private WebElement input_Time;

    @FindBy(xpath="(//span[@class='ant-select-arrow'])[2]")
    private WebElement btn_drpVisit;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[2]")
    private WebElement btn_drpVisit1;

    @FindBy(xpath="(//div[@class='ant-select ant-select-enabled ant-select-allow-clear'])[1]")
    private WebElement input_Visit;

    @FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[3]")
    private WebElement input_Visit2;
    @FindBy(xpath="(//span[@class='ant-select-arrow'])[6]")
    private WebElement btn_drpAlert;

    @FindBy(xpath="(//span[@class='ant-select-arrow'])[5]")
    private WebElement btn_drpCallDurationMins;

    @FindBy(xpath="(//span[@class='ant-select-arrow'])[4]")
    private WebElement btn_drpCallDurationHrs;

    @FindBy(xpath="(//textarea[@id='batteryLink'])[1]")
    private WebElement input_BatteryLink;


    @FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[8]")
    private WebElement btn_drpHost;

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

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[5]")
    private WebElement btn_drpTeleVisitSubject;

    @FindBy(xpath="(//span[@class='anticon anticon-down dropdownIndicator'])[6]")
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



    public boolean clickCallScheduleMenu(){
        try{
            seleniumAdaptor.pauseFor(1);
            System.out.println("The btn_CallSchedule is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_CallSchedule);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_CallSchedule is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickScheduleTeleVisit(){
        try{
            seleniumAdaptor.pauseFor(1);
            System.out.println("The btn_ScheduleTeleVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ScheduleTeleVisit);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The ScheduleTeleVisit is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickVisitTypeScheduledVisit() {
        try {
            seleniumAdaptor.pauseFor(1);
            loggerObj.info("The btn_VisitTypeScheduledVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_VisitTypeScheduledVisit);
            seleniumAdaptor.pauseFor(2);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_VisitTypeScheduledVisit is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickVisitTypeUnScheduledVisit() {
        try {
            seleniumAdaptor.pauseFor(1);
            System.out.println("The btn_VisitTypeUnScheduledVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_VisitTypeUnScheduledVisit);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_VisitTypeUnScheduledVisit is clicked");

            return true;
        } catch (Exception var2) {
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
			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_drpStudy is not clicked");
//            seleniumAdaptor.JavaScriptClick(btn_drpStudy);
            seleniumAction.clickElement(btn_drpStudy);
            loggerObj.info("The btn_drpStudy is clicked");
//            seleniumAdaptor.pauseFor(8);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + study + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTime(String time){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpTime);
//            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + time + "']")));
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + time + "']")));
            loggerObj.info("The time is selected");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSite(String site){
        try{
//			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drpSite);
            seleniumAction.clickElement(btn_drpSite);
//            seleniumAdaptor.pauseFor(4);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + site + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubject(String subject){
        try{
//			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drpSubject);
            seleniumAction.clickElement(btn_drpSubject);
//            seleniumAdaptor.pauseFor(4);

            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + subject + "']")));

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureScheduleInfoTimeZone(String scheduleInfoTimeZone){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpScheduleInfoTimeZone);
            loggerObj.info("The btn_drpScheduleInfoTimeZone is selected");
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + scheduleInfoTimeZone + "']")));
            loggerObj.info("The ScheduleInfoTimeZone is captured");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureScheduleDate(String date){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The input_Date is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Date);
            seleniumAction.clearText(input_Date);
            seleniumAction.typeText(input_Date,"04-Nov-2022");
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureScheduleDate1(String date){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The input_Date is not clicked");
//            seleniumAdaptor.JavaScriptClick(input_Date);
//            seleniumAction.clearText(input_Date);
            seleniumAdaptor.JavaScriptSetValue(input_Date,date);
            loggerObj.info("The input_Date is captured");
//            seleniumAdaptor.pauseFor(4);
            return true;
        } catch(Exception var2) {
             var2.printStackTrace();
            return false;
        }
    }

    public boolean captureScheduleTime1(String time){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The input_Date is not clicked");
//            seleniumAdaptor.JavaScriptClick(input_Date);
//            seleniumAction.clearText(input_Date);
            seleniumAdaptor.JavaScriptSetValue(input_Time,time);
            loggerObj.info("The input_Time is captured");
//            seleniumAdaptor.pauseFor(5);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureScheduleTime(String time){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The time is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Time);
            seleniumAction.clearText(input_Time);
            seleniumAction.typeText(input_Time,time);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureCallDurationHrs(String callDurationHrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationHrs);
            loggerObj.info("The btn_drpCallDurationHrs is selected");

//            WebElement element = driver.findElement(By.xpath("(//ul/li[text()='3'])[1]"));
//            String val=element.getAttribute("innerText");
//            String val1=element.getText();
//            loggerObj.info("The text is :" + val);
//            System.out.println("The text is :" + val1);

            String[] strArr= callDurationHrs.split(" ");
//            callDurationHrs= strArr[0]+"\n"+" "+strArr[1];
            loggerObj.info("The CallDurationHrs is selected");

//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//li[contains(text(),strArr[0]) and contains(text(),strArr[1])]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+strArr[0]+"')]")));




//                    seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//ul//li[text()='" + callDurationHrs + "']")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='" + callDurationHrs + "'])[1]")));
//            seleniumAction.clickElement(driver.findElement(By.xpath("(//ul//li[text()='9'])[1]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='9'])[1]")));
            //            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + callDurationHrs + "']")));
            loggerObj.info("The callDurationHrs is selected");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public void gettext(){

        WebElement element = driver.findElement(By.id("id value"));
        String val=element.getAttribute("innerT");
    }

    public boolean captureCallDurationMins1(String callDurationMins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationMins);
            loggerObj.info("The btn_drpCallDurationMins is selected");
            String[] strArr= callDurationMins.split(" ");

            System.out.println(callDurationMins);

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The CallDurationMins is selected");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureCallDurationMins(String callDurationMins){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationMins);
            loggerObj.info("The btn_drpCallDurationMins is selected");
//            seleniumAdaptor.pauseFor(10);
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='" + callDurationMins + "'])[3]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='" + callDurationMins + "'])[2]")));

            //            seleniumAction.clickElement(driver.findElement(By.xpath("(//ul//li[text()='" + callDurationMins + "'])[3]")));
            //            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='10'])[1]")));
            loggerObj.info("The captureCallDurationMins is selected");
//            seleniumAdaptor.pauseFor(10);

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureAlert1(String alert){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpAlert);
            loggerObj.info("The btn_drpAlert is selected");
            String[] strArr= alert.split(" ");

            System.out.println(alert);

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The Alert is captured");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureAlert(String alert){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_drpAlert);
            loggerObj.info("The btn_drpAlert is selected");
//            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + alert + "']")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul//li[text()='" + alert + "'])[3]")));
            loggerObj.info("The callDurationHrs is selected");
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.pauseFor(5);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickVisit(){
        try{
            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            System.out.println("The input_Visit is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Visit2);
//            seleniumAction.clickElement(input_Visit);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The input_Visit is clicked");
//            seleniumAdaptor.pauseFor(10);

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureVisit(String subject){
        try{
            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            loggerObj.info("The input_Visit is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Visit2);
            loggerObj.info("The input_Visit is clicked");
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + subject + "']")));
            loggerObj.info("The Visit is captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

//    public boolean capturehost(String host){
//        try{
////			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drphost);
//            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + host + "']")));
//            return true;
//        } catch(Exception var2) {
//            return false;
//        }
//    }

    public boolean captureBatteryLink(String batteryLink){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The batteryLink is not entered");
            loggerObj.info("The The batteryLink is not captured");
            seleniumAdaptor.JavaScriptClick(input_BatteryLink);
            seleniumAction.clearText(input_BatteryLink);
            seleniumAction.typeText(input_BatteryLink,batteryLink);
            loggerObj.info("The batteryLink is captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureHost(String host){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            System.out.println("The btn_drpHost is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_drpHost);
            loggerObj.info("The btn_drpHost is clicked");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//ul//li[text()='" + host + "']")));
            loggerObj.info("The hostvalue is captured");
            seleniumAdaptor.pauseFor(5);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureSiteStaff(String siteStaff){
        try{
//			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drpSiteStaff);
            seleniumAction.clickElement(btn_drpSiteStaff);
//            seleniumAdaptor.pauseFor(4);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + siteStaff + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
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
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickAddGuest(){
        try{
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_AddGuest is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddGuest);
            loggerObj.info("The btn_AddGuest is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
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
            var2.printStackTrace();
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
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAddGuestOK() {
        try {
//            seleniumAdaptor.pauseFor(2);
            System.out.println("The AddGuestOK is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddGuestOK);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The AddGuestOK is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
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
//            seleniumAdaptor.JavaScriptClick(btn_drpTeleVisitSubject);
            seleniumAction.clickElement(btn_drpTeleVisitSubject);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + teleVisitSubject + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureScheduleTeleVisitSubject1(String teleVisitSubject){
        try{
//			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drpTeleVisitSubject);
            seleniumAction.clickElement(btn_drpTeleVisitSubject);
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+strArr[0]+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div//div[text()='" + teleVisitSubject + "'])[1]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(), teleVisitSubject )]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[4]//li[starts-with(text(),'"+teleVisitSubject+"')]")));
            seleniumAdaptor.pauseFor(4);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureScheduleTeleVisitSubject2(String teleVisitSubject){
        try{

            seleniumAction.clickElement(btn_drpTeleVisitSubject);
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div//div[text()='" + teleVisitSubject + "'])[2]")));
            seleniumAdaptor.pauseFor(4);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureScheduleTeleVisitSiteStaff(String teleVisitSiteStaff){
        try{
//			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drpTeleVisitSiteStaff);
            seleniumAction.clickElement(btn_drpTeleVisitSiteStaff);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + teleVisitSiteStaff + "']")));

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean captureScheduleTeleVisitSiteStaff1(String ScheduleCallsitestaff){
        try{
//			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(btn_drpTeleVisitSubject);
            seleniumAction.clickElement(btn_drpTeleVisitSiteStaff);
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+strArr[0]+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div//div[text()='" + ScheduleCallsitestaff + "'])[1]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(), teleVisitSubject )]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[4]//li[starts-with(text(),'"+teleVisitSubject+"')]")));
            seleniumAdaptor.pauseFor(4);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean captureScheduleTeleVisitSiteStaff2(String ScheduleCallsitestaff){
        try{

            seleniumAction.clickElement(btn_drpTeleVisitSiteStaff);
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div//div[text()='" + ScheduleCallsitestaff + "'])[2]")));
            seleniumAdaptor.pauseFor(4);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}
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



