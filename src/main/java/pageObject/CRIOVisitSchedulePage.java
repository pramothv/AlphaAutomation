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

    @FindBy(xpath = "(//*[contains(text(),'Usha')])[1]")
    private WebElement lnk_AdminUsha;

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

    private By btn_TimeSelectIcon12 =  By.xpath("//span[@class='fc-grid-hover']/span");

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
