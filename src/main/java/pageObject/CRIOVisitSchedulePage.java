package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class CRIOVisitSchedulePage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(CRIOVisitSchedulePage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public CRIOVisitSchedulePage(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "(//label[text()='Schedule a visit'])[1]")
    private WebElement lnk_ScheduleVisitWeek1Screening;

    @FindBy(xpath = "(//label[text()='Schedule a visit'])[1]")
    private WebElement lnk_ScheduleVisit;

    @FindBy(xpath = "(//input[@value='Create Unscheduled Visit'])[1]")
    private WebElement lnk_CreateUnScheduleVisit;

    @FindBy(xpath = "(//*[contains(text(),'Usha')])[1]")
    private WebElement lnk_AdminUsha;

    @FindBy(xpath = "(//*[contains(text(),'Joshna')])[1]")
    private WebElement lnk_invJoshna;

    @FindBy(xpath = "(//*[contains(text(),'More')])[1]")
    private WebElement lnk_More;

    @FindBy(xpath = "(//*[contains(text(),'TODAY')])[1]")
    private WebElement lnk_CalendarToday;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[3]")
    private WebElement btn_TimeSelectIcon;

    @FindBy(xpath="(//span[@class='fc-grid-hover'])[1]")
    private WebElement btn_TimeSelectIcon2;


    @FindBy(xpath="//span[@class='fc-grid-hover']/span")
    private WebElement btn_TimeSelectIcon11;

    @FindBy(xpath="(//div[@class='fc-highlight-container'])[1]")
    private WebElement btn_TimeSelectIcon10;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[4]")
    private WebElement btn_TimeSelectIcon17;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[6]")
    private WebElement btn_TimeSelectIcon19;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[8]")
    private WebElement btn_TimeSelectIcon21;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[9]")
    private WebElement btn_TimeSelectIcon25;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[10]")
    private WebElement btn_TimeSelectIcon27;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[11]")
    private WebElement btn_TimeSelectIcon29;


    private By btn_TimeSelectIcon12 =  By.xpath("//span[@class='fc-grid-hover']/span");

    private By btn_TimeSelectIcon9 =  By.xpath("(//div[@class='fc-highlight-container'])[1]");


    private By btn_TimeSelectIcon16 =  By.xpath("(//td[@class='fc-widget-content'])[4]");

    private By btn_TimeSelectIcon18 =  By.xpath("(//td[@class='fc-widget-content'])[6]");

    private By btn_TimeSelectIcon20 =  By.xpath("(//td[@class='fc-widget-content'])[8]");

    private By btn_TimeSelectIcon24 =  By.xpath("(//td[@class='fc-widget-content'])[9]");

    private By btn_TimeSelectIcon26 =  By.xpath("(//td[@class='fc-widget-content'])[10]");

    private By btn_TimeSelectIcon28 =  By.xpath("(//td[@class='fc-widget-content'])[11]");

    private By btn_TimeSelectIcon3 =  By.xpath("(//span[@class='fc-grid-hover'])[1]");

    private By btn_TimeSelectIcon5 =  By.xpath("(//div[@class='fc-event-container'])[1]");
    @FindBy(xpath="(//div[@class='fc-event-container'])[1]")
    private WebElement btn_SaveTimeCRIO6;

    @FindBy(xpath="(//input[@id='new_event_create'])[1]")
    private WebElement btn_SaveTimeCRIO;

    @FindBy(xpath="(//select[@class='new_event_time_start'])[1]")
    private WebElement btn_StartTime;

    @FindBy(xpath="(//select[@class='new_event_time_end'])[1]")
    private WebElement btn_EndTime;


    public boolean clickScheduleVisitWeek1Screening() {
        try {
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_ScheduleVisitWeek1Screening is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_ScheduleVisitWeek1Screening);
            loggerObj.info("The lnk_ScheduleVisitWeek1Screening is clicked");
            seleniumAdaptor.pauseFor(2);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickScheduleVisit() {
        try {
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_ScheduleVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_ScheduleVisit);
            loggerObj.info("The lnk_ScheduleVisit is clicked");
//            seleniumAdaptor.pauseFor(2);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCreateUnScheduleVisit() {
        try {

            loggerObj.info("The lnk_CreateUnScheduleVisit is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CreateUnScheduleVisit);
            loggerObj.info("The lnk_CreateUnScheduleVisit is clicked");
//            seleniumAdaptor.pauseFor(2);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickAdminUsha() {
        try {
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_AdminUsha is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_AdminUsha);
            loggerObj.info("The lnk_AdminUsha is clicked");
//            seleniumAdaptor.pauseFor(2);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickInvJoshna() {
        try {
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_invJoshna is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_invJoshna);
            loggerObj.info("The lnk_invJoshna is clicked");
//            seleniumAdaptor.pauseFor(2);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickMore() {
        try {
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_More is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_More);
            loggerObj.info("The lnk_More is clicked");
            seleniumAdaptor.pauseFor(1);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureprocedure1(String procedure1){
        try{

            loggerObj.info("The procedure1 is not clicked");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//label[text()='" + procedure1 + "']")));
            loggerObj.info("The procedure1 is captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureprocedure2(String procedure2){
        try{

            loggerObj.info("The procedure2 is not clicked");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//label[text()='" + procedure2 + "']")));
            loggerObj.info("The procedure2 is captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCalendarToday() {
        try {
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_CalendarToday is not clicked");

//            seleniumAdaptor.JavaScriptClick(lnk_CalendarToday);
            seleniumAction.clickElement(lnk_CalendarToday);
            loggerObj.info("The lnk_CalendarToday is clicked");
            seleniumAdaptor.pauseFor(2);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickTimeSelectCRIO() {
        try {

            loggerObj.info("The btn_TimeSelectIcon is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon3);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon2);
            seleniumAction.clickElement(btn_TimeSelectIcon2);
            loggerObj.info("The btn_TimeSelectIcon2 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}


    public boolean clickTimeSelectCRIO1() {
        try {

            loggerObj.info("The btn_TimeSelectIcon is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon5);
            seleniumAdaptor.JavaScriptClick(btn_SaveTimeCRIO6);
            seleniumAction.clickElement(btn_TimeSelectIcon5);
            loggerObj.info("The btn_TimeSelectIcon2 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO2() {
        try {

            loggerObj.info("The btn_TimeSelectIcon is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon12);
//            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon11);
            seleniumAction.clickElement(btn_TimeSelectIcon11);
            loggerObj.info("The btn_TimeSelectIcon2 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO3() {
        try {

            loggerObj.info("The btn_TimeSelectIcon9 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon9);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon10);
            seleniumAction.clickElement(btn_TimeSelectIcon10);
            loggerObj.info("The btn_TimeSelectIcon10 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO4() {
        try {

            loggerObj.info("The btn_TimeSelectIcon16 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon16);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon17);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon17);
            seleniumAction.clickElement(btn_TimeSelectIcon17);
            loggerObj.info("The btn_TimeSelectIcon17 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO6() {
        try {

            loggerObj.info("The btn_TimeSelectIcon20 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon20);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon21);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon21);
            seleniumAction.clickElement(btn_TimeSelectIcon21);
            loggerObj.info("The btn_TimeSelectIcon21 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO7() {
        try {

            loggerObj.info("The btn_TimeSelectIcon24 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon24);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon25);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon25);
            seleniumAction.clickElement(btn_TimeSelectIcon25);
            loggerObj.info("The btn_TimeSelectIcon25 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO8() {
        try {

            loggerObj.info("The btn_TimeSelectIcon26 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon26);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon27);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon27);
            seleniumAction.clickElement(btn_TimeSelectIcon27);
            loggerObj.info("The btn_TimeSelectIcon27 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO9() {
        try {

            loggerObj.info("The btn_TimeSelectIcon28 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon28);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon29);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon29);
            seleniumAction.clickElement(btn_TimeSelectIcon29);
            loggerObj.info("The btn_TimeSelectIcon29 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickTimeSelectCRIO5() {
        try {

            loggerObj.info("The btn_TimeSelectIcon18 is not clicked");
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon18);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon19);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon19);
            seleniumAction.clickElement(btn_TimeSelectIcon19);
            loggerObj.info("The btn_TimeSelectIcon19 is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}


    public boolean captureVisitFromTime(String visitfromTime){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_StartTime);
			seleniumAdaptor.pauseFor(1);
            seleniumAction.clickElement(driver.findElement(By.xpath("(//select//option[text()='" + visitfromTime + "'])[1]")));

            loggerObj.info("The VisitFromTime is captured");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureVisitToTime(String visitToTime){
        try{
//			seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_EndTime);
            seleniumAdaptor.pauseFor(1);
            seleniumAction.clickElement(driver.findElement(By.xpath("(//select//option[text()='" + visitToTime + "'])[2]")));

            loggerObj.info("The VisitEndTime is captured");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickSaveTimeCRIO() {
        try {

            loggerObj.info("The btn_SaveTimeCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SaveTimeCRIO);
            loggerObj.info("The btn_SaveTimeCRIO is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}





}
