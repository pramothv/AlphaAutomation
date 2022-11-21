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

    @FindBy(xpath="(//span[text()='Schedule Call'])[1]")
    private WebElement btn_ScheduleCall;

    @FindBy(xpath="(//span[text()='Unscheduled Visit'])[1]")
    private WebElement btn_VisitTypeUnScheduledVisit;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[1]")
    private WebElement btn_Create;

    @FindBy(xpath="(//div[text()='Save'])[1]")
    private WebElement btn_TimeZoneSave;

    @FindBy(xpath="(//div[text()='Calls'])[1]")
    private WebElement btn_Calls;

    @FindBy(xpath="//*[contains(text(),'ICF')]")
    private WebElement lnk_CalendarICFmeeting;

    @FindBy(xpath="//*[contains(text(),'Safer')]")
    private WebElement lnk_SaferInterview;

    @FindBy(xpath="//*[contains(text(),'Start/Join Call')]")
    private WebElement btn_StartJoinCall;
    @FindBy(xpath="(//*[contains(text(),'Join meeting')])[2]")
    private WebElement btn_JoinMeeting;

    @FindBy(xpath="(//div[@data-testid='prejoin.joinMeeting'])[1]")
    private WebElement btn_JoinMeeting2;

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[8]")
    private WebElement btn_Toggle;

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[9]")
    private WebElement btn_Toggle1;


    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[10]")
    private WebElement btn_JconnectEndCall1;

    @FindBy(xpath="(//i[@class='anticon anticon-close ant-modal-close-icon'])[1]")
    private WebElement btn_CloseScheduleCall;

    private By btn_JconnectEndCall = By.xpath("(//div[@class='jitsi-icon jitsi-icon-default '])[10]");

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[10]")
    private WebElement btn_JconnectEndCall2;

    private By btn_Toggle2 = By.xpath("(//div[@class='jitsi-icon jitsi-icon-default '])[9]");

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[9]")
    private WebElement btn_Toggle3;
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

    @FindBy(xpath="(//div[@class=' css-1hwfws3'])[3]")
    private WebElement btn_drpSubject10;

    @FindBy(xpath="(//span[@class='ant-form-item-children'])[3]")
    private WebElement btn_drpSubject9;

    @FindBy(xpath="(//div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-16 ant-col-sm-16 ant-col-md-16'])[2]")
    private WebElement btn_drpSubject8;

    @FindBy(xpath="//label[@title='Subject']//following::input[1]")
    private WebElement txt_Subject;

    @FindBy(xpath="(//label[@title='Subject']//following::input[1])[2]")
    private WebElement txt_Subject1;

    @FindBy(xpath="(//div[@class=' css-1hwfws3'])[3]")
    private WebElement subject2;

    @FindBy(xpath="(//div[@class=' css-yk16xz-control'])[3]")
    private WebElement subject3;

    @FindBy(xpath="(//div[@class='ant-form-item-control'])[3]")
    private WebElement subject4;

    @FindBy(xpath="(//div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-16 ant-col-sm-16 ant-col-md-16'])[2]")
    private WebElement subject5;
    @FindBy(xpath="(//span[@class='ant-select-arrow'])[3]")
    private WebElement btn_drpScheduleInfoTimeZone;

    @FindBy(xpath="(//input[@placeholder='Select date'])[1]")
    private WebElement input_Date;

    @FindBy(xpath="//span[@id='callSchedule.date']/div/input")
    private WebElement btn_CalenderIcon;

    @FindBy(xpath="(//span[@class='ant-calendar-picker']/div/input)[7]")
    private WebElement btn_CalenderIconDiaryWindowStartWeek3;

    @FindBy(xpath="(//i[@class='anticon anticon-calendar ant-calendar-picker-icon'])[7]")
    private WebElement btn_CalenderIcon1DiaryWindowStartWeek3;

    private By windowStartDateWeek3 = By.xpath("(//span[@class='ant-calendar-picker']/div/input)[7]");

    @FindBy(xpath="(//span[@class='ant-calendar-picker']/div/input)[7]")
    private WebElement window3StartDateWeek3;
    private By windowEndDateWeek3 = By.xpath("(//span[@class='ant-calendar-picker']/div/input)[8]");
    @FindBy(xpath="(//span[@class='ant-calendar-picker']/div/input)[8]")
    private WebElement btn_CalenderIconDiaryWindowEndWeek3;

    @FindBy(xpath="(//i[@class='anticon anticon-calendar ant-calendar-picker-icon'])[8]")
    private WebElement btn_CalenderIcon1DiaryWindowEndWeek3;

    @FindBy(xpath="//span[text()='OK']")
    private WebElement btn_OK;


    @FindBy(xpath="//input[@id='callSchedule.time']")
    private WebElement btn_TimeIcon;

    @FindBy(xpath="(//input[@placeholder='Select time'])[1]")
    private WebElement input_Time;

    @FindBy(xpath="(//input[@id='callSchedule.time'])[1]")
    private WebElement input_Time1;

    @FindBy(xpath="(//span[@class='ant-select-arrow'])[2]")
    private WebElement btn_drpVisit;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[2]")
    private WebElement btn_drpVisit1;

    @FindBy(xpath="(//div[@class='ant-select ant-select-enabled ant-select-allow-clear'])[1]")
    private WebElement input_Visit;

    @FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[3]")
    private WebElement input_Visit2;

    @FindBy(xpath="(//span[@class='ant-select-arrow'])[2]")
    private WebElement input_Visit4;
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

    @FindBy(xpath="(//div[@class='pageableSelect'])[5]")
    private WebElement input_ScheduleTeleVisitSubject5;

    @FindBy(xpath="(//div[@class=' css-1hwfws3'])[5]")
    private WebElement input_ScheduleTeleVisitSubject6;

    @FindBy(xpath="(//div[@class=' css-1uccc91-singleValue'])[5]")
    private WebElement input_ScheduleTeleVisitSubject7;

    @FindBy(xpath="(//div[@class=' css-1hwfws3'])[5]")
    private WebElement input_ScheduleTeleVisitSubject8;

    @FindBy(xpath="(//div[@class=' css-yk16xz-control'])[5]")
    private WebElement input_ScheduleTeleVisitSubject9;

    @FindBy(xpath="(//span[@class='ant-form-item-children'])[6]")
    private WebElement input_ScheduleTeleVisitSubject10;

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

    private WebElement getSubject(){
        return subject2;
    }

    private WebElement getSubject1(){
        return subject3;
    }

    private WebElement getSubject2(){
        return subject4;
    }

    private WebElement getSubject3(){
        return subject5;
    }

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

    public boolean clickSubject(){
        try{

            loggerObj.info("The subject2 is not clicked");
            seleniumAdaptor.JavaScriptClick(subject2);
            seleniumAdaptor.explicitWait(getSubject()).click();
            seleniumAdaptor.pauseFor(5);
            loggerObj.info("The subject2 is clicked");

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



    public boolean clickScheduleCall() {
        try {

            loggerObj.info("The btn_ScheduleCall is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ScheduleCall);
            loggerObj.info("The btn_ScheduleCall is clicked");

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

    public boolean captureSubject10(String subject){
        try{
            loggerObj.info("The btn_drpSubject is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_drpSubject8);
            loggerObj.info("The btn_drpSubject is clicked");
//            seleniumAction.clearText(btn_drpSubject10);
//            seleniumAction.clearText(btn_drpSubject10);
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptSetValue(btn_drpSubject8,subject);
            loggerObj.info("The Subject is captured");

//            seleniumAction.typeText(btn_drpSubject9,subject);
            driver.findElement(By.xpath("(//div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-16 ant-col-sm-16 ant-col-md-16'])[2]")).sendKeys(subject);
            loggerObj.info("The Subject is not captured");
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
//            seleniumAdaptor.JavaScriptClick(subject2);
            seleniumAdaptor.pauseFor(4);

//            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + subject + "']")));

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubject11(String subject){
        try{
            loggerObj.info("The btn_drpSubject is not clicked");

            seleniumAction.clickElement(btn_drpSubject);
            loggerObj.info("The btn_drpSubject is clicked");

            seleniumAdaptor.pauseFor(2);

            driver.findElement(By.xpath("//label[@title='Subject']//following::input[1]")).sendKeys(subject);
            seleniumAdaptor.pauseFor(1);
            txt_Subject.sendKeys(new CharSequence[] {Keys.ARROW_DOWN});
//            seleniumAdaptor.pauseFor(2);
            txt_Subject.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The Subject is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubject12(String subject){
        try{
            loggerObj.info("The btn_drpSubject is not clicked");

            seleniumAction.clickElement(btn_drpTeleVisitSubject);
            loggerObj.info("The btn_drpSubject is clicked");

            seleniumAdaptor.pauseFor(4);

            driver.findElement(By.xpath("(//label[@title='Subject']//following::input[1])[2]")).sendKeys(subject);
            seleniumAdaptor.pauseFor(2);
            txt_Subject.sendKeys(new CharSequence[] {Keys.ARROW_DOWN});
            seleniumAdaptor.pauseFor(2);
            txt_Subject.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The Subject is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubject9(){
        try{
			seleniumAdaptor.pauseFor(2);
            seleniumAction.WaitFoElementToBeVisible(getSubject3());
//            seleniumAdaptor.explicitWait(getSubject1()).click();
            seleniumAdaptor.sendKeysAndTryMultiple(getSubject3(), "AA99(AABI Ad)", 10);
            seleniumAdaptor.explicitWait(getSubject3()).click();

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
//        seleniumAction.clearText(input_Date);
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
    public boolean clickCalenderIcon() {
        try {

            loggerObj.info("The btn_CalenderIcon is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_CalenderIcon);
            loggerObj.info("The btn_CalenderIcon is clicked");


            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean clickCalenderIconDiaryWindowStartWeek3() {
        try {

            loggerObj.info("The btn_CalenderIconDiaryWindowStartWeek3 is not clicked");
            seleniumAction.clickElement(btn_CalenderIcon1DiaryWindowStartWeek3);
//            seleniumAdaptor.JavaScriptClick(btn_CalenderIcon1DiaryWindowStartWeek3);
            loggerObj.info("The btn_CalenderIconDiaryWindowStartWeek3 is clicked");


            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public String getWindowStartDateWeek3AfterChanging() {

        seleniumAction.clickElement(windowStartDateWeek3);
        seleniumAdaptor.JavaScriptClick(window3StartDateWeek3);
        System.out.println("The windowStartDateWeek3 is clicked");
        String startdate = driver.findElement(windowStartDateWeek3).getAttribute("value");
        loggerObj.info("The StartDate for Week3 is :" + startdate);


        return startdate;
    }

    public String getWindowStartDateWeek3BeforeChanging() {

        seleniumAction.clickElement(windowStartDateWeek3);
        seleniumAdaptor.JavaScriptClick(window3StartDateWeek3);
        loggerObj.info("The windowStartDateWeek3 is clicked");
        String startdate = driver.findElement(windowStartDateWeek3).getAttribute("value");
        loggerObj.info("The StartDate for Week3 Before Changing is :" + startdate);


        return startdate;
    }
    public String getWindowEndDateWeek3AfterChanging() {

        seleniumAction.clickElement(windowEndDateWeek3);
        System.out.println("The windowEndDateWeek3 is clicked");
//        String enddate = driver.findElement(windowEndDateWeek3).getText();
        String enddate = driver.findElement(windowEndDateWeek3).getAttribute("value");
        loggerObj.info("The EndDate for Week3 is :" + enddate);
        return enddate;
    }

    public String getWindowEndDateWeek3BeforeChanging() {

        seleniumAction.clickElement(windowEndDateWeek3);
        System.out.println("The windowEndDateWeek3 is clicked");
//        String enddate = driver.findElement(windowEndDateWeek3).getText();
        String enddate = driver.findElement(windowEndDateWeek3).getAttribute("value");
        loggerObj.info("The EndDate for Week3 Before Changing is :" + enddate);
        return enddate;
    }

    public boolean clickCalenderIconDiaryWindowEndWeek3() {
        try {

            loggerObj.info("The btn_CalenderIconDiaryWindowEndWeek3 is not clicked");
            seleniumAction.clickElement(btn_CalenderIcon1DiaryWindowEndWeek3);
//            seleniumAction.clickElement(btn_CalenderIcon1DiaryWindowEndWeek3);
//            seleniumAdaptor.JavaScriptClick(btn_CalenderIcon1DiaryWindowEndWeek3);
            loggerObj.info("The btn_CalenderIconDiaryWindowEndWeek3 is clicked");


            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean clickCalenderIcon2DiaryWindowEndWeek3() {
        try {

            System.out.println("The btn_CalenderIconDiaryWindowEndWeek3 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_CalenderIconDiaryWindowEndWeek3);
            loggerObj.info("The btn_CalenderIconDiaryWindowEndWeek3 is clicked");


            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean clickOK() {
        try {

            loggerObj.info("The btn_OK is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_OK);
            loggerObj.info("The btn_OK is clicked");


            return true;
        } catch (Exception var2) {
            return false;
        }
    }
    public boolean captureTimeHrs(String timehrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();

//            String[] strArr= callDurationHrs.split(" ");
//            loggerObj.info("The CallDurationHrs is selected");
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[6]//li[starts-with(text(),'"+timehrs+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+timehrs+"')]")));
            loggerObj.info("The Timehrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimeHrs1(String timehrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();

//            String[] strArr= callDurationHrs.split(" ");
//            loggerObj.info("The CallDurationHrs is selected");
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[6]//li[starts-with(text(),'"+timehrs+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[6]//li[starts-with(text(),'"+timehrs+"')]")));
            loggerObj.info("The Timehrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimeHrs2(String timehrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();

//            String[] strArr= callDurationHrs.split(" ");
//            loggerObj.info("The CallDurationHrs is selected");
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[6]//li[starts-with(text(),'"+timehrs+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+timehrs+"')]")));
            loggerObj.info("The Timehrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureTimeMins(String timemins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+timemins+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+timemins+"')]")));
            loggerObj.info("The TimeMins is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimeMins1(String timemins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+timemins+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+timemins+"')]")));
            loggerObj.info("The TimeMins is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimeMins2(String timemins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+timemins+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+timemins+"')]")));
            loggerObj.info("The TimeMins is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimeMins4(String timemins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+timemins+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[starts-with(text(),'"+timemins+"')]")));
            loggerObj.info("The TimeMins is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureTimetype(String timetype){
        try{
            seleniumAction.scrollBy("0", "1400");
//            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();

//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[2][starts-with(text(),'"+timetype+"')]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+timetype+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+timetype+"')]")));
            loggerObj.info("The Timetype is selected");
            seleniumAdaptor.JavaScriptClick(input_BatteryLink);
            seleniumAction.clickElement(input_BatteryLink);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimetype2(String timetype){
        try{
            seleniumAction.scrollBy("0", "1400");
//            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();

//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[2][starts-with(text(),'"+timetype+"')]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+timetype+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[starts-with(text(),'"+timetype+"')]")));
            loggerObj.info("The Timetype is selected");
            seleniumAdaptor.JavaScriptClick(input_BatteryLink);
            seleniumAction.clickElement(input_BatteryLink);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimetype1(String timetype){
        try{
            seleniumAction.scrollBy("0", "1400");
//            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();

//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[2][starts-with(text(),'"+timetype+"')]")));
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+timetype+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+timetype+"')]")));
            loggerObj.info("The Timetype is selected");
            seleniumAdaptor.JavaScriptClick(input_BatteryLink);
            seleniumAction.clickElement(input_BatteryLink);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickTimeIcon() {
        try {

            System.out.println("The btn_TimeIcon is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_TimeIcon);
            loggerObj.info("The btn_TimeIcon is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureDateCalendar(String date){
        try{

            String dates []= date.split("-");
            driver.findElement(By.xpath(".//a[@title='Choose a year']")).click();
            String selecteddecadexpath = ".//span[@class='ant-calendar-year-panel-decade-select-content']";
            boolean year = false;
            while(!year)
            {
                String selecteddecade []= driver.findElement(By.xpath(selecteddecadexpath)).getText().split("-");

                if(Integer.parseInt(dates[2])>=Integer.parseInt(selecteddecade[0]) && Integer.parseInt(dates[2])<=Integer.parseInt(selecteddecade[1]))
                    break;
                if(Integer.parseInt(dates[2])<Integer.parseInt(selecteddecade[0]))
                    driver.findElement(By.xpath("//a[@title='Last decade']")).click();
                else
                    driver.findElement(By.xpath("//a[@title='Next decade']")).click();

            }

            seleniumAdaptor.pauseFor(2);
            driver.findElement(By.xpath("//a[text()='"+dates[2]+"' and @class= 'ant-calendar-year-panel-year']")).click();
            seleniumAdaptor.pauseFor(2);
            driver.findElement(By.xpath(".//a[@title='Choose a month']")).click();
            seleniumAdaptor.pauseFor(2);
//            driver.findElement(By.xpath("//a[text()='"+dates[1]+"' and @class= 'ant-calendar-month-panel-month']")).click();
            seleniumAdaptor.JavaScriptClick( driver.findElement(By.xpath("//a[text()='"+dates[1]+"' and @class= 'ant-calendar-month-panel-month']")));
            seleniumAdaptor.pauseFor(2);
//            driver.findElement(By.xpath("//td[not(contains(@class,' ant-calendar-next-month-btn-day') )and not(contains(@class,' ant-calendar-last-month-cell') )]/div[text()='"+dates[0]+"']")).click();
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//td[not(contains(@class,' ant-calendar-next-month-btn-day') )and not(contains(@class,' ant-calendar-last-month-cell') )]/div[text()='"+dates[0]+"']")));

            loggerObj.info("The input_Date is captured");

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

    public boolean captureCallDurationHrs2(String callDurationHrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationHrs);
            loggerObj.info("The btn_drpCallDurationHrs is selected");
            String[] strArr= callDurationHrs.split(" ");
            loggerObj.info("The CallDurationHrs is selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The callDurationHrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureCallDurationHrs3(String callDurationHrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationHrs);
            loggerObj.info("The btn_drpCallDurationHrs is selected");
            String[] strArr= callDurationHrs.split(" ");
            loggerObj.info("The CallDurationHrs is selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The callDurationHrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean captureCallDurationHrs8(String callDurationHrs){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationHrs);
            loggerObj.info("The btn_drpCallDurationHrs is selected");
//            String[] strArr= callDurationHrs.split(" ");

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+callDurationHrs+"')]")));
            loggerObj.info("The callDurationHrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureCallDurationMins8(String callDurationMins){
        try{
            seleniumAction.scrollBy("0", "1400");
			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationMins);
            loggerObj.info("The btn_drpCallDurationMins is selected");


            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+callDurationMins+"')]")));
            loggerObj.info("The callDurationMins is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureAlert8(String alert){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpAlert);
            loggerObj.info("The btn_drpAlert is selected");


            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+alert+"')]")));
            loggerObj.info("The Alert is captured");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public void gettext(){

        WebElement element = driver.findElement(By.id("id value"));
        String val=element.getAttribute("innerT");
    }

    public void switchToTab0(){

        seleniumAdaptor.switchToTab(0);
    }

    public void switchToTab1(){

        seleniumAdaptor.switchToTab(1);
        loggerObj.info("The Tab is switched to 1");
    }

    public void switchToTab2(){

        seleniumAdaptor.switchToTab(2);
    }
    public void switchToTab3(){

        seleniumAdaptor.switchToTab(3);
    }
    public void switchToTab4(){

        seleniumAdaptor.switchToTab(4);
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

            loggerObj.info(callDurationMins);

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The CallDurationMins is selected");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureCallDurationMins2(String callDurationMins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationMins);
            loggerObj.info("The btn_drpCallDurationMins is selected");
            String[] strArr= callDurationMins.split(" ");

            loggerObj.info(callDurationMins);

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The CallDurationMins is selected");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureCallDurationMins3(String callDurationMins){
        try{
            seleniumAction.scrollBy("0", "1400");
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpCallDurationMins);
            loggerObj.info("The btn_drpCallDurationMins is selected");
            String[] strArr= callDurationMins.split(" ");



            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[10]//li[starts-with(text(),'"+strArr[0]+"')]")));
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

    public boolean captureAlert2(String alert){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpAlert);
            loggerObj.info("The btn_drpAlert is selected");
            String[] strArr= alert.split(" ");

            System.out.println(alert);

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The Alert is captured");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean captureAlert3(String alert){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpAlert);
            loggerObj.info("The btn_drpAlert is selected");
            String[] strArr= alert.split(" ");

            System.out.println(alert);

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[11]//li[starts-with(text(),'"+strArr[0]+"')]")));
            loggerObj.info("The Alert is captured");
//            seleniumAdaptor.pauseFor(8);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}
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

    public boolean captureVisit1(String subject){
        try{
            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            loggerObj.info("The input_Visit is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Visit4);
            loggerObj.info("The input_Visit is clicked");
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + subject + "']")));
            loggerObj.info("The Visit is captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureVisit3(String subject){
        try{
            seleniumAdaptor.pauseFor(1);
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.scrollDown();
            loggerObj.info("The input_Visit is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Visit4);
            loggerObj.info("The input_Visit is clicked");
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + subject + "']")));
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
            loggerObj.info("The Title is not clicked");
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
            loggerObj.info("The btn_AddGuest is not clicked");
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
            loggerObj.info("The input_GuestName is not clicked");
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
            loggerObj.info("The input_GuestEmail is not clicked");
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
            loggerObj.info("The AddGuestOK is not clicked");
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

    public boolean captureScheduleTeleVisitSubject12(String teleVisitSubject){
        try{
            loggerObj.info("The btn_drpSubject is not clicked");

            seleniumAction.clickElement(btn_drpTeleVisitSubject);
            loggerObj.info("The btn_drpSubject is clicked");

            seleniumAdaptor.pauseFor(2);

            driver.findElement(By.xpath("(//label[@title='Subject']//following::input[1])[2]")).sendKeys(teleVisitSubject);
            seleniumAdaptor.pauseFor(1);
            txt_Subject1.sendKeys(new CharSequence[] {Keys.ARROW_DOWN});
//            seleniumAdaptor.pauseFor(2);
            txt_Subject1.sendKeys(new CharSequence[] {Keys.ENTER});
            loggerObj.info("The Subject is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureScheduleTeleVisitSubject5(String ScheduleCallsubject) {
        try {
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The webmailusername is not clicked");
//            seleniumAdaptor.JavaScriptClick(input_ScheduleTeleVisitSubject5);
//            seleniumAction.clearText(input_ScheduleTeleVisitSubject5);

            seleniumAction.clickElement(btn_drpTeleVisitSubject);
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptSetValue(input_ScheduleTeleVisitSubject10,ScheduleCallsubject);
//            seleniumAction.typeText(input_ScheduleTeleVisitSubject5, teleVisitSubject);
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean captureScheduleTeleVisitSubject2(String teleVisitSubject){
        try{

            seleniumAction.clickElement(btn_drpTeleVisitSubject);
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div//div[text()='" + teleVisitSubject + "'])[2]")));
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



    public boolean clickTimeZoneSave(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_TimeZoneSave);
            loggerObj.info("The btn_TimeZoneSave is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCalls(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_Calls);
            loggerObj.info("The btn_Calls is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickCalendarICFmeeting() {
        try {
            loggerObj.info("The lnk_CalendarICFmeeting is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CalendarICFmeeting);
            loggerObj.info("The lnk_CalendarICFmeeting is clicked");

            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean clickSaferInterviewmeeting() {
        try {
            loggerObj.info("The lnk_SaferInterview is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_SaferInterview);
            loggerObj.info("The lnk_SaferInterview is clicked");

            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean clickStartJoinCall() {
        try {
            loggerObj.info("The btn_StartJoinCallJconnect is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_StartJoinCall);
            loggerObj.info("The btn_StartJoinCallJconnect is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickJoinCall() {
        try {
//            seleniumAdaptor.switchToTab(1);
            loggerObj.info("The btn_JoinMeeting is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_JoinMeeting);
            loggerObj.info("The btn_JoinMeeting is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickJoinCall1() {
        try {

            loggerObj.info("The btn_JoinMeeting2 is not clicked");
            seleniumAction.WaitFoElementToBeVisible(btn_JoinMeeting2);
            seleniumAction.clickElement(btn_JoinMeeting2);
            seleniumAdaptor.JavaScriptClick(btn_JoinMeeting2);
            seleniumAction.clickElement(btn_JoinMeeting2);
            loggerObj.info("The btn_JoinMeeting2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickJoinCall5() {
        try {

            loggerObj.info("The btn_JoinMeeting2 is not clicked");
            seleniumAction.WaitFoElementToBeVisible(btn_JoinMeeting2);
            seleniumAction.clickElement(btn_JoinMeeting2);
            seleniumAdaptor.JavaScriptClick(btn_JoinMeeting2);
            seleniumAction.clickElement(btn_JoinMeeting2);
            seleniumAdaptor.JavaScriptClick(btn_JoinMeeting2);
            seleniumAction.clickElement(btn_JoinMeeting2);
            btn_JoinMeeting2.click();
            loggerObj.info("The btn_JoinMeeting2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickToggle() {
        try {

            loggerObj.info("The btn_Toggle is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Toggle);
            loggerObj.info("The btn_Toggle is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickToggle1() {
        try {
            seleniumAction.hoverMouseOverElement(btn_Toggle2);
            loggerObj.info("The btn_Toggle2 is not clicked");
            seleniumAction.WaitFoElementToBeVisible(btn_Toggle3);
            seleniumAction.clickElement(btn_Toggle2);
            seleniumAdaptor.JavaScriptClick(btn_Toggle3);
            seleniumAction.clickElement(btn_Toggle2);
            loggerObj.info("The btn_JconnectEndCall2 is clicked");
            seleniumAdaptor.JavaScriptClick(btn_Toggle3);
            loggerObj.info("The btn_Toggle1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickToggle2() {
        try {
            seleniumAction.hoverMouseOverElement(btn_Toggle2);
            loggerObj.info("The btn_Toggle1 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Toggle1);
            loggerObj.info("The btn_Toggle1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickEndCallJconnect() {
        try {
            seleniumAction.hoverMouseOverElement(btn_JconnectEndCall);
            loggerObj.info("The btn_JconnectEndCall1 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_JconnectEndCall1);
            loggerObj.info("The btn_JconnectEndCall1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickEndCallJconnect1() {
        try {

            seleniumAction.hoverMouseOverElement(btn_JconnectEndCall);
            seleniumAdaptor.JavaScriptClick(btn_JconnectEndCall2);
            seleniumAction.clickElement(btn_JconnectEndCall2);
            loggerObj.info("The btn_1JconnectEndCall2 is clicked");

//            loggerObj.info("The btn_JconnectEndCall2 is not clicked");
//            seleniumAction.WaitFoElementToBeVisible(btn_JconnectEndCall2);
//            seleniumAction.clickElement(btn_JconnectEndCall2);
//            seleniumAdaptor.JavaScriptClick(btn_JconnectEndCall2);
//            seleniumAction.clickElement(btn_JconnectEndCall2);
//            loggerObj.info("The btn_JconnectEndCall2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCloseScheduleCall() {
        try {

            loggerObj.info("The CloseScheduleCall is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_CloseScheduleCall);
            loggerObj.info("The btn_CloseScheduleCall is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }









}



