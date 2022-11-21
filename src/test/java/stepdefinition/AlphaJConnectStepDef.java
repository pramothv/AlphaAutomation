package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObject.*;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AlphaJConnectStepDef extends BaseClass {


    PropertiesFileReader obj = new PropertiesFileReader();

    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;

    JConnectChatPage jConnectChatPage;

    public JCollaborateQALoginPage jCollaborateQALoginPage;

    public AmazonWebMailPage amazonWebMailPage;

    public SubjectListPage subjectListPage;
    public StudyListPage studyListPage;
    public WebAppLoginPage webAppLoginPage;
    public CallSchedulePage callSchedulePage;
    public JCollaborateWelcomePage jCollaborateWelcomePage;

    public SubjectCreatePage subjectCreatePage;
    private Scenario scenario;
    public static ExtentTest extentTest;
    //    private final Logger logger = Logger.getLogger(ILABFlow.class);
//  private static final Logger logger = logger.getLogger(ILABFlow.class);
    private static Logger logger = LogManager.getLogger(AlphaJConnectStepDef.class);

    public AlphaJConnectStepDef() {
    }

    public AlphaJConnectStepDef(WebDriver driver) {
        super(driver);
    }

    @Before
    public void initializeScenario(Scenario scenario) throws Exception {
        this.scenario = scenario;
        Properties properties = obj.getProperty();
        System.out.println(properties);
        openBrowser(properties.getProperty("browser.baseURL"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
//            takeScreenShot(scenario);

//            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
//            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshotTaken,"image/png", "error screen");

            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

        try {
//            driver.quit();
        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
    }


//
//    @Before
//    public void Setup() {
//        ExtentHtmlReporter reporter  = new ExtentHtmlReporter();
//        this.scenario = scenario;
//        Properties properties=obj.getProperty();
//        System.out.println(properties);
//        openBrowser( properties.getProperty("browser.baseURL"));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }

//    @After
//    public void tearDown(Scenario scenario) {
//        if(scenario.isFailed()) {
//            takeScreenShot(scenario);
////            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
////            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshotTaken,"image/png", "error screen");
//        }
//
//        try {
//            driver.quit();
//        }
//        catch(Exception e) {
//            System.out.println(String.valueOf(e));
//        }
//    }


//    @AfterStep
//    public void attachScreenshot(Scenario scenario){
//
//        if(scenario.isFailed()) {
//
//            byte[] screenshotTaken = ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshotTaken, "image/png", "error screen");
//        }
//            try {
//            driver.quit();
//        }
//        catch(Exception e) {
//            System.out.println(String.valueOf(e));
//        }
//    }








    @And("click on the apply online link")
    public void clickOnTheApplyOnlineLink() {

    }










    @Given("I capture {string}{string} and click Signin")
    public void iCaptureAndClickSignin(String username, String password) {


        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to captureUserName", jCollaborateQALoginPage.captureUserName(username));
        Assert.assertTrue("unable to capturePassword", jCollaborateQALoginPage.capturePassword(password));


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSignIn", jCollaborateQALoginPage.clickSignIn());
        ExtentCucumberAdapter.addTestStepLog("Loged into Jconnect Successfully");
        takeScreenShotNew(this.scenario);

    }

    @When("I click on JConnectBuild Option")
    public void iClickOnJConnectBuildOption() {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);


//        seleniumAdaptor.pauseFor(4);
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickJConnectBuild", jCollaborateWelcomePage.clickJConnectBuild());

    }


    @And("I click on Subject and CreateSubject Option and capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnSubjectAndCreateSubjectOptionAndCapture(String firstname, String lastname, String site, String subNum, String subExtID, String phoneCode, String phoneNum, String email, String role, String startDate, String language) {

        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

//        Assert.assertTrue("unable to clickJconnectWidget", subjectCreatePage.clickJconnectWidget());
        takeScreenShotNew(this.scenario);

        putValue("EDiaryVersionDesc", subjectCreatePage.getEDiaryVersion());
        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Description in JConnect is " + getValue("EDiaryVersionDesc"));
        putValue("EDiaryVersionNum", subjectCreatePage.getEDiaryVersionNum());
        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Number in JConnect is " + getValue("EDiaryVersionNum"));

        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        Assert.assertTrue("unable to clickCreate", subjectCreatePage.clickCreate());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureFirstName", subjectCreatePage.captureFirstName(firstname));
        Assert.assertTrue("unable to captureLastName", subjectCreatePage.captureLastName(lastname));
        Assert.assertTrue("unable to captureSelectSite", subjectCreatePage.captureSelectSite(site));
        Assert.assertTrue("unable to captureSubjectNumMRN", subjectCreatePage.captureSubjectNumMRN(subNum));
        Assert.assertTrue("unable to captureSubjectExtID", subjectCreatePage.captureSubjectExtID(subExtID));
        Assert.assertTrue("unable to capturePhoneNumCode", subjectCreatePage.capturePhoneNumCode(phoneCode));
        Assert.assertTrue("unable to captureUserName", subjectCreatePage.capturePhoneNum(phoneNum));
        Assert.assertTrue("unable to capturePhoneNum", subjectCreatePage.captureEmail(email));
        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole(role));
        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail("pramoth.vm@jivascience.com"));
//        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole1(role));

//        Assert.assertTrue("unable to clickCustomDate", subjectCreatePage.clickCustomDate());

        Assert.assertTrue("unable to clickCustomDateIfAvailable", subjectCreatePage.clickCustomDateIfAvailable());
//        Assert.assertTrue("unable to captureSubjectStartDate", subjectCreatePage.captureSubjectStartDate1(startDate));
        Assert.assertTrue("unable to clickCalenderIconSubjectCreate", subjectCreatePage.clickCalenderIconSubjectCreate());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(startDate));
        seleniumAdaptor.pauseFor(1);

        //        Assert.assertTrue("unable to captureSubjectStartDate", subjectCreatePage.captureSubjectStartDate(startDate));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureLanguage", subjectCreatePage.captureLanguage(language));
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureUserName", subjectCreatePage.clickSaveandNext());
        takeScreenShotNew(this.scenario);
        putValue("SubCreationAlert", subjectCreatePage.getSubCreationAlertMsg());
        ExtentCucumberAdapter.addTestStepLog("The SubCreationAlert Message in JConnect is " + getValue("SubCreationAlert"));
        putValue("SubCreationCancelBtnMsg", subjectCreatePage.getSubCreationCancelBtnMsg());
        ExtentCucumberAdapter.addTestStepLog("The SubCreationCancelBtnMsg in JConnect is " + getValue("SubCreationCancelBtnMsg"));

        Assert.assertTrue("unable to captureUserName", subjectCreatePage.clickSubCreationOK());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(4);
        amazonWebMailPage.CheckingChkboxScreening();
        putValue("Chktxt", amazonWebMailPage.getCheckingChkboxScreening());
        validate("", amazonWebMailPage.getCheckingChkboxScreening());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
    }


    @And("I launch AmazonWebmail and capture {string}{string}")
    public void iLaunchAmazonWebmailAndCapture(String mailusername, String mailpassword) {
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);

        amazonWebMailPage.opentabAmazonWebMail();
        Assert.assertTrue("unable to captureAmazonWebMailUsername", amazonWebMailPage.captureAmazonWebMailUsername(mailusername));
        Assert.assertTrue("unable to captureAmazonWebMailPassword", amazonWebMailPage.captureAmazonWebMailPassword(mailpassword));
        Assert.assertTrue("unable to clickSignIn", amazonWebMailPage.clickSignIn());
        takeScreenShotNew(this.scenario);
    }


    @And("I capture {string} in searchbox and retrieve the credentials")
    public void iCaptureInSearchboxAndRetrieveTheCredentials(String eDiaryLogin) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);

        Assert.assertTrue("unable to captureWebmailSearch", amazonWebMailPage.captureWebmailSearch(eDiaryLogin));
        Assert.assertTrue("unable to captureWebmailSearchBtn", amazonWebMailPage.captureWebmailSearchBtn());
        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to switchtoWebMailIFrame2", amazonWebMailPage.switchtoWebMailIFrame2());
//        Assert.assertTrue("unable to clickEdiaryLoginInfo", amazonWebMailPage.clickEdiaryLoginInfo());
        Assert.assertTrue("unable to clickNoReply", amazonWebMailPage.clickNoReply());
        Assert.assertTrue("unable to switchtoWebMailIFrame2", amazonWebMailPage.switchtoWebMailIFrame2());
        takeScreenShotNew(this.scenario);
        putValue("password", amazonWebMailPage.getPassword());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to amazonWebMailPage", amazonWebMailPage.clickLogOut());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);


    }

    @And("I launch the JConnect WebApp and capture {string}{string}\"password and login")
    public void iLaunchTheJConnectWebAppAndCapturePasswordAndLogin(String phoneCode, String phoneNum) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickNoReply", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);

    }


    @And("I click on CallSchedule and capture {string}{string}{string}{string}{string} and click on Schedule Visit")
    public void iClickOnCallScheduleAndCaptureAndClickOnScheduleVisit(String time, String study, String site, String subject, String sitestaff) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureStudy(study));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureSite(site));
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(subject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(subject));
        Assert.assertTrue("unable to captureSiteStaff", callSchedulePage.captureSiteStaff(sitestaff));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to Schedule a Call screen and capture {string} click AddGuest and capture {string}{string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndCaptureClickAddGuestAndCapture(String title, String guestname, String guestemail, String ScheduleCallsubject, String ScheduleCallsitestaff) {


        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to captureTime", callSchedulePage.clickAddGuest());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureGuestName(guestname));
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureGuestEmail(guestemail));
        Assert.assertTrue("unable to captureTime", callSchedulePage.clickAddGuestOK());
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject1(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff1(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to VisitDetails section and select ScheduleVisit and capture {string}{string}")
    public void iNavigateToVisitDetailsSectionAndSelectScheduleVisitAndCapture(String visit, String batterylink) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickVisitTypeScheduledVisit", callSchedulePage.clickVisitTypeScheduledVisit());
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickVisitTypeUnScheduledVisit", callSchedulePage.clickVisitTypeUnScheduledVisit());
//        Assert.assertTrue("unable to clickVisitTypeScheduledVisit", callSchedulePage.clickVisitTypeScheduledVisit());

//        Assert.assertTrue("unable to captureTime", callSchedulePage.clickVisit());
        Assert.assertTrue("unable to captureVisit", callSchedulePage.captureVisit1(visit));
//        Assert.assertTrue("unable to captureVisit", callSchedulePage.captureVisit(visit));

        Assert.assertTrue("unable to captureBatteryLink", callSchedulePage.captureBatteryLink(batterylink));

        seleniumAdaptor.pauseFor(1);


    }


    @And("I navigate to ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}")
    public void iNavigateToScheduleInfoSectionAndCapture(String date, String time, String timeZone, String calldurationHrs, String calldurationMins, String alert, String host) {


        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins1(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert1(alert));
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);


    }


    @And("I navigate to Schedule a Call screen and must capture {string} click AddGuest and capture {string}{string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndMustCaptureClickAddGuestAndCapture(String title, String guestname, String guestemail, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to captureTime", callSchedulePage.clickAddGuest());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureGuestName(guestname));
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureGuestEmail(guestemail));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureTime", callSchedulePage.clickAddGuestOK());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(1);


    }


    @And("I navigate to Schedule a Call screen and capture {string} click AddGuest and capture {string}{string}")
    public void iNavigateToScheduleACallScreenAndCaptureClickAddGuestAndCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject1(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }


    @And("I navigate to Schedule a Call screen and capture {string} {string}{string}")
    public void iNavigateToScheduleACallScreenAndCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject5(ScheduleCallsubject));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}")
    public void iNavigateToScheduleInfoSectionAndCapture(String date, String time, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs2(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins2(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert2(alert));
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
        seleniumAdaptor.pauseFor(5);


        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//


    }


    @And("I visit JConnect WebApp and click on Screening and AuditOption")
    public void iVisitJConnectWebAppAndClickOnScreeningAndAuditOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab1();
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall());
        callSchedulePage.switchToTab2();


    }


    @And("I visit JConnect WebApp and click on Screening")
    public void iVisitJConnectWebAppAndClickOnScreening() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab2();
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());

        Assert.assertTrue("unable to clickScreening", webAppLoginPage.clickScreening());


    }


    @And("I click on DepressionForm and select {string}\"and select Field Options")
    public void iClickOnDepressionFormAndSelectAndSelectFieldOptions(String OptionstobeSlected) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureOptionstobeSlected", webAppLoginPage.captureOptionstobeSlected(OptionstobeSlected));
        Assert.assertTrue("unable to clickDepField1Option1", webAppLoginPage.clickDepField1Option1());
        Assert.assertTrue("unable to clickDepField2Option1", webAppLoginPage.clickDepField2Option1());


    }


    @And("I click on DepressionForm and select {string}{string}and select Field Options")
    public void iClickOnDepressionFormAndSelectAndSelectFieldOptions(String OptionstobeSlected, String Field123) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDepressionForm", webAppLoginPage.clickDepressionForm());
        Assert.assertTrue("unable to captureOptionstobeSlected", webAppLoginPage.captureOptionstobeSlected(OptionstobeSlected));
        Assert.assertTrue("unable to captureField123", webAppLoginPage.captureField123(Field123));
        Assert.assertTrue("unable to clickDepField1Option1", webAppLoginPage.clickDepField1Option1());
        Assert.assertTrue("unable to clickDepField2Option1", webAppLoginPage.clickDepField2Option1());
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        takeScreenShotNew(this.scenario);
    }

    @And("I click on NewForm and capture {string}{string}{string}")
    public void iClickOnNewFormAndCapture(String TestField1, String TestField2, String TestField3) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickNewForm", webAppLoginPage.clickNewForm());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.captureTestField1(TestField1));
        Assert.assertTrue("unable to captureTestField2", webAppLoginPage.captureTestField2(TestField2));
        Assert.assertTrue("unable to captureTestField3", webAppLoginPage.captureTestField3(TestField3));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());

    }


    @And("I click on SixOption form and capture the options")
    public void iClickOnSixOptionFormAndCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSixOptionsForm", webAppLoginPage.clickSixOptionsForm());
        Assert.assertTrue("unable to clickField2SwellingOnmLegs", webAppLoginPage.clickField2SwellingOnmLegs());
        Assert.assertTrue("unable to clickField4SwellingOnmLegs", webAppLoginPage.clickField4SwellingOnmLegs());
        Assert.assertTrue("unable to clickField5SwellingOnmLegs", webAppLoginPage.clickField5SwellingOnmLegs());
        Assert.assertTrue("unable to clickFieldNameQuesSwellingOnmLegs", webAppLoginPage.clickFieldNameQuesSwellingOnmLegs());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
    }

    @And("I click PHQ{int} form and capture the options")
    public void iClickPHQFormAndCaptureTheOptions(int arg0) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickFeelingDownNotAtAll());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickTroubleFallingNotAtAll());
        Assert.assertTrue("unable to captureTestField2", webAppLoginPage.clickFeelingTiredNotAtAll());
        Assert.assertTrue("unable to captureTestField3", webAppLoginPage.clickPoorAppetiteNotAtAll());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickFeelingBadNotAtAll());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickTroubleConcentratingNotAtAll());
        Assert.assertTrue("unable to captureTestField2", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
        Assert.assertTrue("unable to captureTestField3", webAppLoginPage.clickThoughtsNotAtAll());
        Assert.assertTrue("unable to captureTestField2", webAppLoginPage.clickDifficultyNotAtAll());


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
    }


    @And("I click on FormForGrid and capture {string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnFormForGridAndCapture(String Field2option, String Singleselectopt, String Field1, String field21, String field22, String field, String field4) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormForGrid", webAppLoginPage.clickFormForGrid());
        Assert.assertTrue("unable to captureField2option", webAppLoginPage.captureField2option(Field2option));
//        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.capturefield4(Singleselectopt));
        Assert.assertTrue("unable to captureSingleselectopt", webAppLoginPage.captureSingleselectopt(Singleselectopt));
        Assert.assertTrue("unable to capturefield11", webAppLoginPage.capturefield11(field21));
        Assert.assertTrue("unable to captureinput_2field2", webAppLoginPage.captureinput_2field2(field22));
        Assert.assertTrue("unable to captureinput_2field1", webAppLoginPage.captureinput_2field1(field));
//        Assert.assertTrue("unable to captureTestField3", webAppLoginPage.captureinput_field(field4));
        Assert.assertTrue("unable to capturefield4yes", webAppLoginPage.capturefield4yes());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());

    }


    @And("I click PHQ form and capture the options")
    public void iClickPHQFormAndCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickPHQForm());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickFeelingDownNotAtAll());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickTroubleFallingNotAtAll());
        Assert.assertTrue("unable to captureTestField2", webAppLoginPage.clickFeelingTiredNotAtAll());
        Assert.assertTrue("unable to captureTestField3", webAppLoginPage.clickPoorAppetiteNotAtAll());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickFeelingBadNotAtAll());
        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.clickTroubleConcentratingNotAtAll());
        Assert.assertTrue("unable to captureTestField2", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
        Assert.assertTrue("unable to captureTestField3", webAppLoginPage.clickThoughtsNotAtAll());
        Assert.assertTrue("unable to clickDifficultyNotAtAll", webAppLoginPage.clickDifficultyNotAtAll());
//        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
//        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
    }


    @And("I navigate to ScheduleInfo section and must capture {string}{string}{string}{string}{string}{string}")
    public void iNavigateToScheduleInfoSectionAndMustCapture(String date, String time, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));

        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins1(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert1(alert));
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1("07-Nov-2022"));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1("1:02 pm"));
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1("07-Nov-2022"));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1("1:02 pm"));


    }

    @And("I click on CallSchedule and capture the {string}{string}{string}{string}{string} and click on Schedule Visit")
    public void iClickOnCallScheduleAndCaptureTheAndClickOnScheduleVisit(String time, String study, String site, String subject, String sitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureStudy(study));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureSite(site));
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(subject));
        Assert.assertTrue("unable to captureSubject10", callSchedulePage.captureSubject11(subject));
        Assert.assertTrue("unable to captureSiteStaff", callSchedulePage.captureSiteStaff(sitestaff));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to Subject List and must enter {string} and fetch the record")
    public void iNavigateToSubjectListAndMustEnterAndFetchTheRecord(String firstname) {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());

//        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
//        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
//        seleniumAdaptor.pauseFor(5);
//        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to clickSubject", callSchedulePage.clickSubject());
//        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
//        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
//        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));
//        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
//        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
//        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
//        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
//        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to clickSubject", callSchedulePage.clickSubject());
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
//        Assert.assertTrue("unable to clickMyAccount", subjectListPage.clickMyAccount());
    }

    @And("I navigate to Schedule a Call screen and must capture {string} {string}{string}")
    public void iNavigateToScheduleACallScreenAndMustCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject5", callSchedulePage.captureScheduleTeleVisitSubject5(ScheduleCallsubject));

//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to CallSchedule and ScheduleTelevisit for Screening and must capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForScreeningAndMustCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I click on CHRTSR Form and capture the options")
    public void iClickOnCHRTSRFormAndCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCHRTSRForm", webAppLoginPage.clickCHRTSRForm());
        Assert.assertTrue("unable to clickCHRTNeverBetterDisagree", webAppLoginPage.clickCHRTNeverBetterDisagree1());
        Assert.assertTrue("unable to clickCHRTNoFutureDisagree", webAppLoginPage.clickCHRTNoFutureDisagree1());
        Assert.assertTrue("unable to clickCHRTNothingRightDisagree", webAppLoginPage.clickCHRTNothingRightDisagree1());
        Assert.assertTrue("unable to clickCHRTEverythingWrongDisagree", webAppLoginPage.clickCHRTEverythingWrongDisagree1());
        Assert.assertTrue("unable to clickNoOneDependOnDisagree", webAppLoginPage.clickNoOneDependOnDisagree1());
        Assert.assertTrue("unable to clickAreGoneDisagree", webAppLoginPage.clickAreGoneDisagree1());
        Assert.assertTrue("unable to clickSufferingDisagree", webAppLoginPage.clickSufferingDisagree1());
        Assert.assertTrue("unable to clickNoReasonToLiveDisagree", webAppLoginPage.clickNoReasonToLiveDisagree1());
        Assert.assertTrue("unable to clickGoToSleepDisagree", webAppLoginPage.clickGoToSleepDisagree1());
        Assert.assertTrue("unable to clickKillingMyselfDisagree", webAppLoginPage.clickKillingMyselfDisagree1());
        Assert.assertTrue("unable to clickHowToKillingMyselfDisagree", webAppLoginPage.clickHowToKillingMyselfDisagree1());
        Assert.assertTrue("unable to clickPlanToKillingMyselfDisagree", webAppLoginPage.clickPlanToKillingMyselfDisagree1());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I click PHQ form and must capture the options")
    public void iClickPHQFormAndMustCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickFeelingDownNotAtAll());
        Assert.assertTrue("unable to clickTroubleFallingNotAtAll", webAppLoginPage.clickTroubleFallingNotAtAll());
        Assert.assertTrue("unable to clickFeelingTiredNotAtAll", webAppLoginPage.clickFeelingTiredNotAtAll());
        Assert.assertTrue("unable to clickPoorAppetiteNotAtAll", webAppLoginPage.clickPoorAppetiteNotAtAll());
        Assert.assertTrue("unable to clickFeelingBadNotAtAll", webAppLoginPage.clickFeelingBadNotAtAll());
        Assert.assertTrue("unable to clickTroubleConcentratingNotAtAll", webAppLoginPage.clickTroubleConcentratingNotAtAll());
        Assert.assertTrue("unable to clickSpeakingSlowlyNotAtAll", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
        Assert.assertTrue("unable to clickThoughtsNotAtAll", webAppLoginPage.clickThoughtsNotAtAll());
        Assert.assertTrue("unable to clickDifficultyNotAtAll", webAppLoginPage.clickDifficultyNotAtAll());
        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());
        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickLittleInterest());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I click on AUDIT Form and capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnAUDITFormAndCapture(String frequencyOfAlcohol, String nOfDrinks, String sixOrMoreDrinks, String stopDrinkingOnceStarted, String failedToDo, String heavyDrinkingSeason, String feelingGuilt, String unableToRemember, String injured, String cutDown) {


        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickAuditForm", webAppLoginPage.clickAuditForm());
        Assert.assertTrue("unable to captureFrequencyOfAlcohol", webAppLoginPage.captureFrequencyOfAlcohol(frequencyOfAlcohol));
        Assert.assertTrue("unable to captureNoOfDrinks", webAppLoginPage.captureNoOfDrinks(nOfDrinks));
        Assert.assertTrue("unable to captureSixOrMoreDrinks", webAppLoginPage.captureSixOrMoreDrinks(sixOrMoreDrinks));
        Assert.assertTrue("unable to captureStopDrinkingOnceStarted", webAppLoginPage.captureStopDrinkingOnceStarted(stopDrinkingOnceStarted));
        Assert.assertTrue("unable to captureFailedToDo", webAppLoginPage.captureFailedToDo(failedToDo));
        Assert.assertTrue("unable to captureHeavyDrinkingSeason", webAppLoginPage.captureHeavyDrinkingSeason(heavyDrinkingSeason));
        Assert.assertTrue("unable to captureFeelingGuilt", webAppLoginPage.captureFeelingGuilt(feelingGuilt));
        Assert.assertTrue("unable to captureUnableToRemember", webAppLoginPage.captureUnableToRemember(unableToRemember));
        Assert.assertTrue("unable to captureInjured", webAppLoginPage.captureInjured1(injured));
        Assert.assertTrue("unable to captureCutDown", webAppLoginPage.captureCutDown1(cutDown));
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
    }


    @And("I click on DiaryBack button and check Screening Status")
    public void iClickOnDiaryBackButtonAndCheckScreeningStatus() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBackDiary", webAppLoginPage.clickBackDiary());
        seleniumAdaptor.pauseFor(2);
        putValue("Status", webAppLoginPage.getCheckingStatusScreening1());
//        validate("Completed", webAppLoginPage.getCheckingStatusScreening());
        ExtentCucumberAdapter.addTestStepLog("The Screening Status in WebApp is " + getValue("Status"));
        takeScreenShotNew(this.scenario);
        driver.close();
        callSchedulePage.switchToTab0();

    }

    @And("I validate the Screening checkbox and click summary and check Summary")
    public void iValidateTheScreeningCheckboxAndClickSummaryAndCheckSummary() {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);

        amazonWebMailPage.CheckingChkboxScreening();
//        putValue("Chktxt", amazonWebMailPage.getCheckingChkboxScreening());
//        validate("", amazonWebMailPage.getCheckingChkboxScreening());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());

        putValue("ICFtxt", subjectListPage.getICFDesc());
        validate("ICF", subjectListPage.getICFDesc());

//        putValue("ICFStatus", subjectListPage.getICFStatus());
//        validate("In Progress", subjectListPage.getICFStatus());

        putValue("SAFERInterviewtxt", subjectListPage.geSAFERInterviewDesc());
        validate("SAFER Interview", subjectListPage.geSAFERInterviewDesc());

//        putValue("SAFERInterviewStatus", subjectListPage.getSAFERInterviewStatus());
//        validate("In Progress", subjectListPage.getSAFERInterviewStatus());

        putValue("Screeningtxt", subjectListPage.getScreeningDesc());
        validate("Screening", subjectListPage.getScreeningDesc());

        putValue("ScreeningStatus", subjectListPage.getScreeningStatus());
        validate("Completed", subjectListPage.getScreeningStatus());


    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch SAFER Interview meeting")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchSAFERInterviewMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickSaferInterviewmeeting", callSchedulePage.clickSaferInterviewmeeting());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();

    }

    @And("I click on ScreeningPass")
    public void iClickOnScreeningPass() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        subjectListPage = new SubjectListPage(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickScreeningPass", subjectListPage.clickScreeningPass());
        Assert.assertTrue("unable to clickScreeningPassOK", subjectListPage.clickScreeningPassOK());

        takeScreenShotNew(this.scenario);
        subjectListPage.CheckingChkboxWeek1Baseline();


    }


    @And("I select WeekOneBaseline check box ans SafetyFollowUp checkbox and click SaveandNext")
    public void iSelectWeekOneBaselineCheckBoxAnsSafetyFollowUpCheckboxAndClickSaveandNext() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        subjectListPage = new SubjectListPage(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickWeek1BaseLineCheckbox", subjectListPage.clickWeek1BaseLineCheckbox());
        Assert.assertTrue("unable to clickSafetyFollowUpCheckbox", subjectListPage.clickSafetyFollowUpCheckbox());
        Assert.assertTrue("unable to clickSaveandNext", subjectListPage.clickSaveandNext());

        takeScreenShotNew(this.scenario);

    }


    @And("I check the status of WeekOne BaseLine and WeekOne")
    public void iCheckTheStatusOfWeekOneBaseLineAndWeekOne() {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        seleniumAdaptor.pauseFor(9);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());

        putValue("WeekOneBaseLinetxt", subjectListPage.getWeekOneBaseLineDesc());
        validate("Week -1 Baseline", subjectListPage.getWeekOneBaseLineDesc());

        putValue("ScreeningStatus", subjectListPage.getWeekOneBaseLineStatus());
//        validate("In Progress", subjectListPage.getWeekOneBaseLineStatus());

        putValue("WeekOneBaseLinetxt", subjectListPage.getWeek1Desc());
        validate("Week 1", subjectListPage.getWeek1Desc());

        putValue("ScreeningStatus", subjectListPage.getWeek1Status());
//        validate("Not Started", subjectListPage.getWeek1Status());

        takeScreenShotNew(this.scenario);

    }

    @And("I switch to WebApp and select WeekOne Baseline option")
    public void iSwitchToWebAppAndSelectWeekOneBaselineOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickWeek1Baseline", webAppLoginPage.clickWeek1Baseline());
        seleniumAdaptor.pauseFor(2);
        putValue("Status", webAppLoginPage.getCheckingStatusScreening());
        validate("Completed", webAppLoginPage.getCheckingStatusScreening());
    }

    @And("I click on AAA Form and capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnAAAFormAndCapture(String antiDepressent, String daysAWeekNeeded, String timesADayNeeded, String takeDrugInPast, String daysAWeek, String timesADayUsuallyTake, String pillsEachTime, String pillsMissed) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickAAAForm", webAppLoginPage.clickAAAForm());
        Assert.assertTrue("unable to captureAntiDepressent", webAppLoginPage.captureAntiDepressent(antiDepressent));
        Assert.assertTrue("unable to captureDaysaWeekNeeded", webAppLoginPage.captureDaysaWeekPrescribedByDoc(daysAWeekNeeded));
        Assert.assertTrue("unable to captureTimesADayPrescribedByDoc", webAppLoginPage.captureTimesADayPrescribedByDoc(timesADayNeeded));
        Assert.assertTrue("unable to captureTakeDrugInPast", webAppLoginPage.captureTakeDrugInPast(takeDrugInPast));
        Assert.assertTrue("unable to captureDaysaWeekYouNeedDrug", webAppLoginPage.captureDaysaWeekYouNeedDrug(daysAWeek));
        Assert.assertTrue("unable to captureTimesADayUsuallyTake", webAppLoginPage.captureTimesADayUsuallyTake(timesADayUsuallyTake));
        Assert.assertTrue("unable to capturePillsEachTime", webAppLoginPage.capturePillsEachTime(pillsEachTime));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.capturePillsMissed(pillsMissed));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);
    }


    @And("I navigate to JConnect and Subject List and enter {string} and fetch the record to find WeekOneBaseline checkbox and SafetyFollowUp Checkbox")
    public void iNavigateToJConnectAndSubjectListAndEnterAndFetchTheRecordToFindWeekOneBaselineCheckboxAndSafetyFollowUpCheckbox(String firstname) {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        callSchedulePage = new CallSchedulePage(driver);


        seleniumAdaptor.pauseFor(0);
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        subjectListPage.CheckingChkboxWeek1Baseline();
        subjectListPage.CheckingChkboxSafetyFollowUp();
        seleniumAdaptor.pauseFor(1);
    }


    @And("I navigate to Schedule a Call screen and must capture {string} and addGuest with {string}{string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndMustCaptureAndAddGuestWith(String title, String guestname, String guestemail, String ScheduleCallsubject, String ScheduleCallsitestaff) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to clickAddGuest", callSchedulePage.clickAddGuest());
        Assert.assertTrue("unable to captureGuestName", callSchedulePage.captureGuestName(guestname));
        Assert.assertTrue("unable to captureGuestEmail", callSchedulePage.captureGuestEmail(guestemail));
        Assert.assertTrue("unable to clickAddGuestOK", callSchedulePage.clickAddGuestOK());


        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }


    @And("I navigate to VisitDetails section and select ScheduleVisit and select UnscheduledOption")
    public void iNavigateToVisitDetailsSectionAndSelectScheduleVisitAndSelectUnscheduledOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickVisitTypeUnScheduledVisit", callSchedulePage.clickVisitTypeUnScheduledVisit());
        takeScreenShotNew(this.scenario);


    }

    @And("I switch to WebApp and select WeekOne")
    public void iSwitchToWebAppAndSelectWeekOne() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);


        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab3();
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickWeek1", webAppLoginPage.clickWeek1());
        seleniumAdaptor.pauseFor(2);
        putValue("Status", webAppLoginPage.getCheckingStatusScreening());
        validate("Completed", webAppLoginPage.getCheckingStatusScreening());

    }

    @And("I join the meeting and join the meeting from Webapp and end")
    public void iJoinTheMeetingAndJoinTheMeetingFromWebappAndEnd() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


//        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab2();
//        seleniumAdaptor.pauseFor(10);
//        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab1();
//
//        seleniumAdaptor.pauseFor(2);
//        callSchedulePage.switchToTab1();


        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(4);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(20);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to callSchedulePage", callSchedulePage.clickCloseScheduleCall());

        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(50);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickEndCallWebApp", webAppLoginPage.clickEndCallWebApp());
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickEndCallJconnect", callSchedulePage.clickEndCallJconnect());
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCloseScheduleCall", callSchedulePage.clickCloseScheduleCall());
    }


    @And("I navigate to Jconnect CallSchedule capture {string} and launch the ICF meeting")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchTheICFMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickCalendarICFmeeting", callSchedulePage.clickCalendarICFmeeting());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);


    }


    @And("I validate NoDiaryQuestionnarires and check for ICF in calls")
    public void iValidateNoDiaryQuestionnariresAndCheckForICFInCalls() {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        putValue("NoDiaryQuestionare", webAppLoginPage.gettxtNoDiaryQuestionare());
        validate("No Diary/Questionnaires are available. Please contact your Site Staff", webAppLoginPage.gettxtNoDiaryQuestionare());

        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        putValue("ICFtxt", webAppLoginPage.gettxtICF());
        validate("ICF", webAppLoginPage.gettxtICF());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());
        Assert.assertTrue("unable to clickWebAppLogOut", webAppLoginPage.clickWebAppLogOut());
        Assert.assertTrue("unable to clickWebAppLogOutYes", webAppLoginPage.clickWebAppLogOutYes());
        seleniumAdaptor.pauseFor(5);
        driver.close();
        seleniumAdaptor.pauseFor(2);
        callSchedulePage.switchToTab0();


    }


    @And("I join the meeting fromJConnect and join the meeting from Webapp and conclude the call")
    public void iJoinTheMeetingFromJConnectAndJoinTheMeetingFromWebappAndConcludeTheCall() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


//        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab2();
//        seleniumAdaptor.pauseFor(10);
//        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab1();
//
//        seleniumAdaptor.pauseFor(2);
//        callSchedulePage.switchToTab1();

        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(4);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(20);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());


        callSchedulePage.switchToTab1();

        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(50);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickEndCallWebApp", webAppLoginPage.clickEndCallWebApp());
        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
//        Assert.assertTrue("unable to clickEndCallJconnect", callSchedulePage.clickEndCallJconnect());
        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCloseScheduleCall", callSchedulePage.clickCloseScheduleCall());
    }

    @And("I join the meeting from JConnect and from Webapp and conclude the call")
    public void iJoinTheMeetingFromJConnectAndFromWebappAndConcludeTheCall() {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
//        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab2();
//        seleniumAdaptor.pauseFor(10);
//        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab1();
//
//        seleniumAdaptor.pauseFor(2);
//        callSchedulePage.switchToTab1();

//        amazonWebMailPage.opentabAmazonWebApp();
//        //        webAppLoginPage.opentabJconnectWebApp();
//        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode("91"));
//        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum("9989878767"));
//        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePassword("7582"));
//        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());

        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(4);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(25);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());


//        amazonWebMailPage.opentabAmazonWebApp();
//        //        webAppLoginPage.opentabJconnectWebApp();
//        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode("91"));
//        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum("9989878767"));
//        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePassword("7582"));
//        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


//        callSchedulePage.switchToTab0();
//        Assert.assertTrue("unable to callSchedulePage", callSchedulePage.clickCloseScheduleCall());

        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickPastCalls", webAppLoginPage.clickPastCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(20);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());

//        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        Assert.assertTrue("unable to clickToggle1", callSchedulePage.clickToggle1());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickEndCallWebApp", webAppLoginPage.clickEndCallWebApp());
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickEndCallJconnect", callSchedulePage.clickEndCallJconnect());
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCloseScheduleCall", callSchedulePage.clickCloseScheduleCall());
    }


    @And("I navigate to Jconnect CallSchedule capture {string}")
    public void iNavigateToJconnectCallScheduleCapture(String ScheduleCallsubject) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);


        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to clickCalendarICFmeeting", callSchedulePage.clickCalendarICFmeeting());

        amazonWebMailPage.opentabAmazonWebApp();
        //        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode("91"));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum("9900878767"));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePassword("2630"));
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        callSchedulePage.switchToTab0();
//        Assert.assertTrue("unable to clickCalendarICFmeeting", callSchedulePage.clickCalendarICFmeeting());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
//        seleniumAdaptor.pauseFor(1);


//        callSchedulePage.switchToTab0();
//        seleniumAdaptor.pauseFor(4);
//        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab2();
//        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(35);
        Assert.assertTrue("unable to clickJoinCall5", callSchedulePage.clickJoinCall5());
//        Assert.assertTrue("unable to clickJoinCall1", callSchedulePage.clickJoinCall1());
        //        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());


        callSchedulePage.switchToTab2();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickPastCalls", webAppLoginPage.clickPastCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());

    }

    @And("I navigate to Jconnect CallSchedule capture {string} with meeting")
    public void iNavigateToJconnectCallScheduleCaptureWithMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);


        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));

        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickCalendarICFmeeting", callSchedulePage.clickCalendarICFmeeting());

        amazonWebMailPage.opentabAmazonWebApp();
        seleniumAdaptor.pauseFor(5);
        //        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode("91"));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum("9099898867"));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePassword("0318"));
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());
        Assert.assertTrue("unable to clickWebAppLogOut", webAppLoginPage.clickWebAppLogOut());
        driver.close();
        seleniumAdaptor.pauseFor(5);
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());

        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(4);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(25);

        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
//        seleniumAdaptor.pauseFor(25);


//        callSchedulePage.switchToTab0();
//        driver.close();
//        seleniumAdaptor.pauseFor(1);
        amazonWebMailPage.opentabAmazonWebAppReal();
        //        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode("91"));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum("9099898867"));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePassword("0318"));
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(50);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());

        amazonWebMailPage.opentabAmazonWebAppReal();
        seleniumAdaptor.pauseFor(10);
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
//        Assert.assertTrue("unable to clickEndCallJconnect", callSchedulePage.clickEndCallJconnect());
        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab2();
    }

    @And("I join the meeting fromJConnect")
    public void iJoinTheMeetingFromJConnect() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(4);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(20);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());

    }

    @And("I launch the JConnect WebApp with {string}{string} password and join the meeting from WebApp and conclude")
    public void iLaunchTheJConnectWebAppWithPasswordAndJoinTheMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();
        amazonWebMailPage.opentabAmazonWebAppReal();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(50);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabAmazonWebAppReal();
//        seleniumAdaptor.pauseFor(10);
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        takeScreenShotNew(this.scenario);
        driver.close();
        callSchedulePage.switchToTab0();

        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
        seleniumAdaptor.pauseFor(5);
        driver.close();

        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab2();

    }

    @And("I launch JConnect and capture {string}{string} and click Signin")
    public void iLaunchJConnectAndCaptureAndClickSignin(String username, String password) {


        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);

        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabJconnectReal1();
//        Assert.assertTrue("unable to captureUserName", jCollaborateQALoginPage.captureUserName(username));
//        Assert.assertTrue("unable to capturePassword", jCollaborateQALoginPage.capturePassword(password));
//
//
//        ExtentCucumberAdapter.addTestStepLog("The message is good");
//
//
//        takeScreenShotNew(this.scenario);
////        seleniumAdaptor.pauseFor(1);
//
//        Assert.assertTrue("unable to clickSignIn", jCollaborateQALoginPage.clickSignIn());
        takeScreenShotNew(this.scenario);

    }

    @And("I launch JConnect WebApp with {string}{string} password and click on Screening")
    public void iLaunchJConnectWebAppWithPasswordAndClickOnScreening(String phoneCode, String phoneNum) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(3);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(3);
        Assert.assertTrue("unable to clickScreening", webAppLoginPage.clickScreening());


    }

    @And("I launch the JConnect WebApp and capture {string}{string} and password and login")
    public void iLaunchTheJConnectWebAppAndCaptureAndPasswordAndLogin(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();
        amazonWebMailPage.opentabJconnect();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword("1311");
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);


    }

    @And("I navigate to Jconnect CallSchedule capture the {string} with meeting")
    public void iNavigateToJconnectCallScheduleCaptureTheWithMeeting(String ScheduleCallsubject) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);


        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject10(ScheduleCallsubject));
        Assert.assertTrue("unable to clickCalendarICFmeeting", callSchedulePage.clickCalendarICFmeeting());


    }

    @And("I navigate to CallSchedule and ScheduleTelevisit for Screening and should capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForScreeningAndShouldCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
    }

    @And("I navigate to ScheduleInfo section and should capture {string}{string}{string}{string}{string}{string}")
    public void iNavigateToScheduleInfoSectionAndShouldCapture(String date, String time, String timeZone, String calldurationHrs, String calldurationMins, String alert) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));

        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs2(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins2(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert2(alert));
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1("07-Nov-2022"));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1("1:02 pm"));
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1("07-Nov-2022"));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1("1:02 pm"));


    }

    @And("I navigate to CallSchedule and ScheduleTelevisit for WeekOneBaseLine and should capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForWeekOneBaseLineAndShouldCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I launch the JConnect WebApp with {string}{string} password and join the Safer meeting from WebApp and conclude")
    public void iLaunchTheJConnectWebAppWithPasswordAndJoinTheSaferMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();
        amazonWebMailPage.opentabAmazonWebAppReal();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
//        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickWebAppSafermeeting", webAppLoginPage.clickWebAppSafermeeting());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());

        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(50);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabAmazonWebAppReal();
//        seleniumAdaptor.pauseFor(10);
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        takeScreenShotNew(this.scenario);
        driver.close();
        callSchedulePage.switchToTab0();

        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
        seleniumAdaptor.pauseFor(5);
        driver.close();

        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab2();

    }

    @And("I launch JConnect WebApp with {string}{string} password and select WeekOne Baseline option")
    public void iLaunchJConnectWebAppWithPasswordAndSelectWeekOneBaselineOption(String phoneCode, String phoneNum) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
//        amazonWebMailPage.opentabJconnectReal1();
        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        Assert.assertTrue("unable to clickScreening", webAppLoginPage.clickScreening());

        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(6);
        Assert.assertTrue("unable to clickWeek1Baseline", webAppLoginPage.clickWeek1Baseline());
        seleniumAdaptor.pauseFor(2);
//        putValue("Status", webAppLoginPage.getCheckingStatusScreening());
//        validate("Completed", webAppLoginPage.getCheckingStatusScreening());
    }


    @And("I navigate to CallSchedule and ScheduleTelevisit for WeekOne and should capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForWeekOneAndShouldCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to JConnect and Subject List and enter {string} and fetch the record to find WeekOneBaseline checkbox and SafetyFollowUp Checkbox and ArmAssignment segment")
    public void iNavigateToJConnectAndSubjectListAndEnterAndFetchTheRecordToFindWeekOneBaselineCheckboxAndSafetyFollowUpCheckboxAndArmAssignmentSegment(String firstname) {


        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        callSchedulePage = new CallSchedulePage(driver);


        seleniumAdaptor.pauseFor(0);
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        subjectListPage.CheckingChkboxWeek1Baseline();
        seleniumAdaptor.pauseFor(1);
        subjectListPage.CheckingChkboxSafetyFollowUp();
        seleniumAdaptor.pauseFor(1);
        putValue("ArmAssignDesc", subjectListPage.getArmAssignDesc());
        validate("ARM1 ARM1", subjectListPage.getArmAssignDesc());


    }

    @And("I navigate to Schedule a Call screen and capture {string} click AddGuest and must capture {string}{string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndCaptureClickAddGuestAndMustCapture(String title, String guestname, String guestemail, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to clickAddGuest", callSchedulePage.clickAddGuest());
        Assert.assertTrue("unable to captureGuestName", callSchedulePage.captureGuestName(guestname));
        Assert.assertTrue("unable to captureGuestEmail", callSchedulePage.captureGuestEmail(guestemail));
        Assert.assertTrue("unable to clickAddGuestOK", callSchedulePage.clickAddGuestOK());
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to VisitDetails section and click on UnscheduledVisit option")
    public void iNavigateToVisitDetailsSectionAndClickOnUnscheduledVisitOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickVisitTypeScheduledVisit", callSchedulePage.clickVisitTypeUnScheduledVisit());
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);
    }

    @And("I navigate to ScheduleInfo section and should be able to capture {string}{string}{string}{string}{string}{string}")
    public void iNavigateToScheduleInfoSectionAndShouldBeAbleToCapture(String date, String time, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));

        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs2(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins2(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert2", callSchedulePage.captureAlert2(alert));
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1("07-Nov-2022"));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1("1:02 pm"));
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1("07-Nov-2022"));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1("1:02 pm"));


    }


    @And("I launch AmazonWebmail capturing {string}{string} and check for GuestParticipant email Notification Call")
    public void iLaunchAmazonWebmailCapturingAndCheckForGuestParticipantEmailNotificationCall(String mailusername, String mailpassword) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        amazonWebMailPage.opentabAmazonWebMail();
        Assert.assertTrue("unable to captureAmazonWebMailUsername", amazonWebMailPage.captureAmazonWebMailUsername(mailusername));
        Assert.assertTrue("unable to captureAmazonWebMailPassword", amazonWebMailPage.captureAmazonWebMailPassword(mailpassword));
        Assert.assertTrue("unable to clickSignIn", amazonWebMailPage.clickSignIn());


    }

    @And("I launch AmazonWebmail capturing {string}{string} {string} and check for GuestParticipant email Notification Call")
    public void iLaunchAmazonWebmailCapturingAndCheckForGuestParticipantEmailNotificationCall(String mailusername, String mailpassword, String videoCallScheduled) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        amazonWebMailPage.opentabAmazonWebMail();
        Assert.assertTrue("unable to captureAmazonWebMailUsername", amazonWebMailPage.captureAmazonWebMailUsername(mailusername));
        Assert.assertTrue("unable to captureAmazonWebMailPassword", amazonWebMailPage.captureAmazonWebMailPassword(mailpassword));
        Assert.assertTrue("unable to clickSignIn", amazonWebMailPage.clickSignIn());

        Assert.assertTrue("unable to captureWebmailSearch", amazonWebMailPage.captureWebmailSearch(videoCallScheduled));
        Assert.assertTrue("unable to captureWebmailSearchBtn", amazonWebMailPage.captureWebmailSearchBtn());
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickNoReply", amazonWebMailPage.clickNoReply());
        Assert.assertTrue("unable to switchtoWebMailIFrame2", amazonWebMailPage.switchtoWebMailIFrame2());
        takeScreenShotNew(this.scenario);
//        putValue("notfn", amazonWebMailPage.getwebmailVideoCallScheduled());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to amazonWebMailPage", amazonWebMailPage.clickLogOut());
        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to JConnect Subject List and enter {string} and fetch the record")
    public void iNavigateToJConnectSubjectListAndEnterAndFetchTheRecord(String firstname) {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

    }

    @And("I Check for DiaryWindowStart dates for the Treatment Visits")
    public void iCheckForDiaryWindowStartDatesForTheTreatmentVisits() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        subjectListPage = new SubjectListPage(driver);

        takeScreenShotNew(this.scenario);
        putValue("VisitDiaryWindowWeek3", subjectListPage.getTreatmentVisitDiaryWindowWeek1());
        putValue("VisitDiaryWindowWeek4", subjectListPage.getTreatmentVisitDiaryWindowWeek3());
        putValue("VisitDiaryWindowWeek5", subjectListPage.getTreatmentVisitDiaryWindowWeek5());
        putValue("VisitDiaryWindowWeek6", subjectListPage.getTreatmentVisitDiaryWindowWeek7());
        putValue("VisitDiaryWindowWeek7", subjectListPage.getTreatmentVisitDiaryWindowWeek9());


        takeScreenShotNew(this.scenario);

    }


    @And("I launch JConnect WebApp with {string}{string} password and select WeekOne option")
    public void iLaunchJConnectWebAppWithPasswordAndSelectWeekOneOption(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab0();
//        driver.close();
//        callSchedulePage.switchToTab0();
        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        Assert.assertTrue("unable to clickScreening", webAppLoginPage.clickScreening());

        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(7);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickWeek1", webAppLoginPage.clickWeek1());
        seleniumAdaptor.pauseFor(2);
//        putValue("Status", webAppLoginPage.getCheckingStatusScreening());
//        validate("Completed", webAppLoginPage.getCheckingStatusScreening());
    }

    @And("I lick on QLEFQSEF Form and capture the options")
    public void iLickOnQLEFQSEFFormAndCaptureTheOptions() {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCHRTSRForm", webAppLoginPage.clickOLESQSFForm());
        Assert.assertTrue("unable to clickPhysicalHealthPoor", webAppLoginPage.clickPhysicalHealthPoor());
        Assert.assertTrue("unable to clickMoodPoor", webAppLoginPage.clickMoodPoor());
        Assert.assertTrue("unable to clickWorkPoor", webAppLoginPage.clickWorkPoor());
        Assert.assertTrue("unable to clickHouseHoldActivitiesPoor", webAppLoginPage.clickHouseHoldActivitiesPoor());
        Assert.assertTrue("unable to clickSocialRelationshipPoor", webAppLoginPage.clickSocialRelationshipPoor());
        Assert.assertTrue("unable to clickFamilyRelationshipPoor", webAppLoginPage.clickFamilyRelationshipPoor());
        Assert.assertTrue("unable to clickLeisureTimePoor", webAppLoginPage.clickLeisureTimePoor());
        Assert.assertTrue("unable to clickFunctionPoor", webAppLoginPage.clickFunctionPoor());
        Assert.assertTrue("unable to clickPerformancePoor", webAppLoginPage.clickPerformancePoor());
        Assert.assertTrue("unable to clickEconomicStatusPoor", webAppLoginPage.clickEconomicStatusPoor());
        Assert.assertTrue("unable to clickHousingSituationPoor", webAppLoginPage.clickHousingSituationPoor());
        Assert.assertTrue("unable to clickFeelingDizzyPoor", webAppLoginPage.clickFeelingDizzyPoor());
        Assert.assertTrue("unable to clickVisiontoWorkPoor", webAppLoginPage.clickVisiontoWorkPoor());
        Assert.assertTrue("unable to clickWellBeingPoor", webAppLoginPage.clickWellBeingPoor());
        Assert.assertTrue("unable to clickMedicationPoor", webAppLoginPage.clickMedicationPoor());
        Assert.assertTrue("unable to clickOverallSatisfactionPoor", webAppLoginPage.clickOverallSatisfactionPoor());


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);


    }

    @And("I lick on SHAPS Form and capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iLickOnSHAPSFormAndCapture(String enjoyTelevision, String enjoyBeingWithFamily, String pleasureInHobbies, String enjoyFavouriteMeal, String enjoyShower, String pleasureInBread, String enjoySeingZPeopleSmile, String enjoyLookingSmart, String enjoyReadingBook, String enjoyTea, String pleasureInSmallThings, String enjoyView, String pleasureFromHelpingOthers, String pleasureFromPraise) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSHAPSForm", webAppLoginPage.clickSHAPSForm());
        Assert.assertTrue("unable to captureAntiDepressent", webAppLoginPage.captureEnjoyTelevision(enjoyTelevision));
        Assert.assertTrue("unable to captureDaysaWeekNeeded", webAppLoginPage.captureEnjoyBeingWithFamily(enjoyBeingWithFamily));
        Assert.assertTrue("unable to captureTimesADayNeeded", webAppLoginPage.capturePleasureInHobbies(pleasureInHobbies));
        Assert.assertTrue("unable to captureTakeDrugInPast", webAppLoginPage.captureEnjoyFavouriteMeal(enjoyFavouriteMeal));
        Assert.assertTrue("unable to captureTakeDrugInPast", webAppLoginPage.captureEnjoyShower(enjoyShower));
        Assert.assertTrue("unable to captureTimesADayUsuallyTake", webAppLoginPage.capturePleasureInBread(pleasureInBread));
        Assert.assertTrue("unable to capturePillsEachTime", webAppLoginPage.captureEnjoySeingZPeopleSmile(enjoySeingZPeopleSmile));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.captureEnjoyLookingSmart(enjoyLookingSmart));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.captureEnjoyReadingBook(enjoyReadingBook));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.captureEnjoyTea(enjoyTea));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.capturePleasureInSmallThings(pleasureInSmallThings));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.captureEnjoyView(enjoyView));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.capturPleasureFromHelpingOthers(pleasureFromHelpingOthers));
        Assert.assertTrue("unable to capturePillsMissed", webAppLoginPage.capturPleasureFromPraise(pleasureFromPraise));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);

    }

    @And("I lick on GADSeven Form and capture {string} problems options and {string}")
    public void iLickOnGADSevenFormAndCaptureProblemsOptionsAnd(String name, String difficultToWork) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickGAD7Form", webAppLoginPage.clickGAD7Form());
        Assert.assertTrue("unable to captureAntiDepressent", webAppLoginPage.captureName(name));
        Assert.assertTrue("unable to clickFeelingNervousNotAtAll", webAppLoginPage.clickFeelingNervousNotAtAll());
        Assert.assertTrue("unable to clickStopWorrying", webAppLoginPage.clickStopWorrying());
        Assert.assertTrue("unable to clickWorryingTooMuchNotAtAll", webAppLoginPage.clickWorryingTooMuchNotAtAll());
        Assert.assertTrue("unable to clickTroubleRelaxingNotAtAll", webAppLoginPage.clickTroubleRelaxingNotAtAll());
        Assert.assertTrue("unable to clickRestless", webAppLoginPage.clickRestless());
        Assert.assertTrue("unable to clickBecomeAnnoyedNotAtAll", webAppLoginPage.clickBecomeAnnoyedNotAtAll());
        Assert.assertTrue("unable to clickFeelingAfraidNotAtAll", webAppLoginPage.clickFeelingAfraidNotAtAll());
        Assert.assertTrue("unable to captureDifficultToWork", webAppLoginPage.captureDifficultToWork(difficultToWork));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);

    }

    @And("I lick on CPFQ Form and capture {string}{string}{string}{string}{string}{string}{string}")
    public void iLickOnCPFQFormAndCapture(String motivationCPFQ, String wakefullnessCPFQ, String energyCPFQ, String focusCPFQ, String abilityToRememberCPFQ, String abilityToFindWords, String sharpnessCPFQ) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCPFQForm", webAppLoginPage.clickCPFQForm());
        Assert.assertTrue("unable to captureMotivationCPFQ", webAppLoginPage.captureMotivationCPFQ(motivationCPFQ));
        Assert.assertTrue("unable to captureWakefullnessCPFQ", webAppLoginPage.captureWakefullnessCPFQ(wakefullnessCPFQ));
        Assert.assertTrue("unable to captureEnergyCPFQ", webAppLoginPage.captureEnergyCPFQ(energyCPFQ));
        Assert.assertTrue("unable to captureFocusCPFQ", webAppLoginPage.captureFocusCPFQ(focusCPFQ));
        Assert.assertTrue("unable to captureAbilityToRememberCPFQ", webAppLoginPage.captureAbilityToRememberCPFQ(abilityToRememberCPFQ));
        Assert.assertTrue("unable to captureAbilityToFindWordsCPFQ", webAppLoginPage.captureAbilityToFindWordsCPFQ(abilityToFindWords));
        Assert.assertTrue("unable to captureSharpnessCPFQ", webAppLoginPage.captureSharpnessCPFQ(sharpnessCPFQ));


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);


    }

    @And("I click on InsomniaSeverityIndex Form and capture the options")
    public void iClickOnInsomniaSeverityIndexFormAndCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickInsomniaSeverityIndexForm", webAppLoginPage.clickInsomniaSeverityIndexForm());
        Assert.assertTrue("unable to clickInsomniaDifficultSleep", webAppLoginPage.clickInsomniaDifficultSleep());
        Assert.assertTrue("unable to clickInsomniaStayingASleep", webAppLoginPage.clickInsomniaStayingASleep());
        Assert.assertTrue("unable to clickInsomniaProblemWaking", webAppLoginPage.clickInsomniaProblemWaking());
        Assert.assertTrue("unable to clickInsomniaCurrentSleepPattern", webAppLoginPage.clickInsomniaCurrentSleepPattern());
        Assert.assertTrue("unable to clickSocialRelationshipPoor", webAppLoginPage.clickInsomniaInterfere());
        Assert.assertTrue("unable to clickInsomniaNoticiable", webAppLoginPage.clickInsomniaNoticiable());
        Assert.assertTrue("unable to clickInsomniaWorried", webAppLoginPage.clickInsomniaWorried());


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);


    }


    @And("I click on QIDSSR Form and capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnQIDSSRFormAndCapture(String fallingAsleepQIDS, String sleepDuringNightQIDS, String wakingUpTooEarlyQIDS, String sleepingTooMuchQIDS, String feelingSadQIDS, String decreasedAppetiteQIDS, String increasedAppetiteQIDS, String decreasedWeightQIDS, String increasedWeightQIDS, String concentrationQIDS, String viewOfMyselfQIDS, String thoughtsOfDeathQIDS, String generalInterest, String energyLevelQIDS, String slowedDown, String feelingRestless) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickQIDSSRForm", webAppLoginPage.clickQIDSSRForm());
        Assert.assertTrue("unable to captureFallingAsleepQIDS", webAppLoginPage.captureFallingAsleepQIDS(fallingAsleepQIDS));
        Assert.assertTrue("unable to captureSleepDuringNightQIDS", webAppLoginPage.captureSleepDuringNightQIDS(sleepDuringNightQIDS));
        Assert.assertTrue("unable to captureWakingUpTooEarlyQIDS", webAppLoginPage.captureWakingUpTooEarlyQIDS(wakingUpTooEarlyQIDS));
        Assert.assertTrue("unable to captureSleepingTooMuchQIDS", webAppLoginPage.captureSleepingTooMuchQIDS(sleepingTooMuchQIDS));
        Assert.assertTrue("unable to captureFeelingSadQIDS", webAppLoginPage.captureFeelingSadQIDS(feelingSadQIDS));
        Assert.assertTrue("unable to captureDecreasedAppetiteQIDS", webAppLoginPage.captureDecreasedAppetiteQIDS(decreasedAppetiteQIDS));
        Assert.assertTrue("unable to captureIncreasedAppetiteQIDS", webAppLoginPage.captureIncreasedAppetiteQIDS(increasedAppetiteQIDS));
        Assert.assertTrue("unable to captureDecreasedWeightQIDS", webAppLoginPage.captureDecreasedWeightQIDS(decreasedWeightQIDS));
        Assert.assertTrue("unable to captureIncreasedWeightQIDS", webAppLoginPage.captureIncreasedWeightQIDS(increasedWeightQIDS));
        Assert.assertTrue("unable to captureConcentrationQIDS", webAppLoginPage.captureConcentrationQIDS(concentrationQIDS));
        Assert.assertTrue("unable to captureViewOfMyselfQIDS", webAppLoginPage.captureViewOfMyselfQIDS(viewOfMyselfQIDS));
        Assert.assertTrue("unable to captureThoughtsOfDeathQIDS", webAppLoginPage.captureThoughtsOfDeathQIDS(thoughtsOfDeathQIDS));
        Assert.assertTrue("unable to captureGeneralInterestQIDS", webAppLoginPage.captureGeneralInterestQIDS(generalInterest));
        Assert.assertTrue("unable to captureEnergyLevelQIDS", webAppLoginPage.captureEnergyLevelQIDS(energyLevelQIDS));
        Assert.assertTrue("unable to captureSlowedDownQIDS", webAppLoginPage.captureSlowedDownQIDS(slowedDown));
        Assert.assertTrue("unable to captureFeelingRestlessQIDS", webAppLoginPage.captureFeelingRestlessQIDS(feelingRestless));



        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);


    }


    @And("I must navigate to ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustNavigateToScheduleInfoSectionAndCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeHrs(timehours));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeMins(timemins));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimetype(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins1(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert1(alert));
        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//



}

    @And("I navigate to Subject List and enter {string} and fetch the record")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecord(String firstname) {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

    }

    @And("I must be able to navigate to ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustBeAbleToNavigateToScheduleInfoSectionAndCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeHrs1(timehours));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeMins1(timemins));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimetype1(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs2(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins2(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert2(alert));
        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//



    }

    @And("I must click PHQ form and must capture the options")
    public void iMustClickPHQFormAndMustCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickWeek1Baseline", webAppLoginPage.clickWeek1Baseline());
        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
        Assert.assertTrue("unable to clickPHQLittleInterest1", webAppLoginPage.clickPHQLittleInterest1());
        Assert.assertTrue("unable to clickTroubleFallingNotAtAll1", webAppLoginPage.clickTroubleFallingNotAtAll1());
        Assert.assertTrue("unable to clickFeelingTiredNotAtAll1", webAppLoginPage.clickFeelingTiredNotAtAll1());
        Assert.assertTrue("unable to clickPoorAppetiteNotAtAll1", webAppLoginPage.clickPoorAppetiteNotAtAll1());
        Assert.assertTrue("unable to clickFeelingBadNotAtAll1", webAppLoginPage.clickFeelingBadNotAtAll1());
        Assert.assertTrue("unable to clickTroubleConcentratingNotAtAll1", webAppLoginPage.clickTroubleConcentratingNotAtAll1());
        Assert.assertTrue("unable to clickSpeakingSlowlyNotAtAll1", webAppLoginPage.clickSpeakingSlowlyNotAtAll1());
        Assert.assertTrue("unable to clickThoughtsNotAtAll1", webAppLoginPage.clickThoughtsNotAtAll1());
        Assert.assertTrue("unable to clickDifficultyNotAtAll1", webAppLoginPage.clickDifficultyNotAtAll1());
//        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
//        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());
//        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickLittleInterest());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I should be able to navigate to ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iShouldBeAbleToNavigateToScheduleInfoSectionAndCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureTimeHrs2", callSchedulePage.captureTimeHrs2(timehours));
        Assert.assertTrue("unable to captureTimeMins2", callSchedulePage.captureTimeMins2(timemins));
        Assert.assertTrue("unable to captureTimetype2", callSchedulePage.captureTimetype2(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
//        Assert.assertTrue("unable to captureCallDurationHrs3", callSchedulePage.captureCallDurationHrs3(calldurationHrs));
//        Assert.assertTrue("unable to captureCallDurationMins3", callSchedulePage.captureCallDurationMins3(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureCallDurationMins3", callSchedulePage.captureCallDurationMins3(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert3", callSchedulePage.captureAlert3(alert));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//



     }

    @And("I should click PHQ form and must capture the options")
    public void iShouldClickPHQFormAndMustCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickWeek1Baseline", webAppLoginPage.clickWeek1Baseline());
        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
        Assert.assertTrue("unable to clickPHQLittleInterest1", webAppLoginPage.clickPHQLittleInterest1());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTroubleFallingNotAtAll", webAppLoginPage.clickTroubleFallingNotAtAll());
        Assert.assertTrue("unable to clickFeelingTiredNotAtAll", webAppLoginPage.clickFeelingTiredNotAtAll());
        Assert.assertTrue("unable to clickPoorAppetiteNotAtAll", webAppLoginPage.clickPoorAppetiteNotAtAll());
        Assert.assertTrue("unable to clickFeelingBadNotAtAll", webAppLoginPage.clickFeelingBadNotAtAll());
        Assert.assertTrue("unable to clickTroubleConcentratingNotAtAll", webAppLoginPage.clickTroubleConcentratingNotAtAll());
        Assert.assertTrue("unable to clickSpeakingSlowlyNotAtAll", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
        Assert.assertTrue("unable to clickThoughtsNotAtAll", webAppLoginPage.clickThoughtsNotAtAll());
        Assert.assertTrue("unable to clickDifficultyNotAtAll", webAppLoginPage.clickDifficultyNotAtAll());
        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());
        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickLittleInterest());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);


}
    @And("I navigate to JConnect Subject List enter {string} and fetch the record and under TreatmentVisits I should be able to change {string} and {string} for WeekThree")
    public void iNavigateToJConnectSubjectListEnterAndFetchTheRecordAndUnderTreatmentVisitsIShouldBeAbleToChangeAndForWeekThree(String firstname, String diaryWindowStartDateWeek3, String diaryWindowEndDateWeek3) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());


        putValue("WindowStartDateWeek3JconnectBeforeChanging", callSchedulePage.getWindowStartDateWeek3BeforeChanging());
        ExtentCucumberAdapter.addTestStepLog("The WindowStartDateWeek3 in JConnect BeforeChanging is :" + getValue("WindowStartDateWeek3JconnectBeforeChanging"));

        putValue("WindowEndDateWeek3JconnectBeforeChanging", callSchedulePage.getWindowEndDateWeek3BeforeChanging());
        ExtentCucumberAdapter.addTestStepLog("The WindowStartDateWeek3 in JConnect BeforeChanging is :" + getValue("WindowEndDateWeek3JconnectBeforeChanging"));


        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIconDiaryWindowStartWeek3());
        seleniumAdaptor.pauseFor(8);
        Assert.assertTrue("unable to clickCalenderIconDiaryWindowStartWeek3", callSchedulePage.captureDateCalendar(diaryWindowStartDateWeek3));
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalenderIconDiaryWindowEndWeek3", callSchedulePage.clickCalenderIconDiaryWindowEndWeek3());
        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(diaryWindowEndDateWeek3));
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickOK", callSchedulePage.clickOK());
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
//        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
//        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());

        putValue("WindowStartDateWeek3JconnectAfterChanging", callSchedulePage.getWindowStartDateWeek3AfterChanging());
        ExtentCucumberAdapter.addTestStepLog("The WindowStartDateWeek3 in JConnect AfterChanging is :" + getValue("WindowStartDateWeek3JconnectAfterChanging"));
        putValue("WindowEndDateWeek3JconnectAfterChanging", callSchedulePage.getWindowEndDateWeek3AfterChanging());
        ExtentCucumberAdapter.addTestStepLog("The WindowStartDateWeek3 in JConnect AfterChanging is :" + getValue("WindowEndDateWeek3JconnectAfterChanging"));

//        Assert.assertTrue("unable to clickOK", subjectListPage.clickOK());
    }



    @And("I navigate to WebApp be able to find the StartDate and EndDate for WeekThree")
    public void iNavigateToWebAppBeAbleToFindTheStartDateAndEndDateForWeekThree() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAction = new SeleniumAction(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());

        putValue("WindowStartDateWeek3", webAppLoginPage.getWindowStartDateWeek3());
        ExtentCucumberAdapter.addTestStepLog("The WindowStartDateWeek3 in WebApp is :" + getValue("WindowStartDateWeek3"));
        putValue("WindowEndDateWeek3", webAppLoginPage.getWindowEndDateWeek3());
        ExtentCucumberAdapter.addTestStepLog("The WindowEndDateWeek3 in WebApp is :" + getValue("WindowEndDateWeek3"));
    }

    @And("I check the Submitbutton Visibility for the already SubmittedForms in WebApp")
    public void iCheckTheSubmitbuttonVisibilityForTheAlreadySubmittedFormsInWebApp() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        seleniumAction = new SeleniumAction(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickWeek1", webAppLoginPage.clickWeek1());
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickCHRTSRForm", webAppLoginPage.clickCHRTSRForm());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(1);
        webAppLoginPage.checkFormsSubmitButtonVisibility2();


    }

    @And("I click on SaveandNext and capture {string} and save")
    public void iClickOnSaveandNextAndCaptureAndSave(String SelectAuthorVisitStatementTestementType) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAction = new SeleniumAction(driver);



        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickSaveandNext", subjectListPage.clickSaveandNext());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.SelectAuthorVisitStatementTestementType(SelectAuthorVisitStatementTestementType));
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickAuthorVisitSave", subjectListPage.clickAuthorVisitSave());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I navigate to JConnect and retrieve the DiaryWindow and Status of the Visits")
    public void iNavigateToJConnectAndRetrieveTheDiaryWindowAndStatusOfTheVisits() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAction = new SeleniumAction(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        seleniumAdaptor.pauseFor(2);

        putValue("ICFStatus", subjectListPage.getICFStatus());
        ExtentCucumberAdapter.addTestStepLog("The ICFStatus in JConnect is :" + getValue("ICFStatus"));
        putValue("ICFDiaryWindow", subjectListPage.getICFDiaryWindowJconnect());
        ExtentCucumberAdapter.addTestStepLog("The ICFDiaryWindow in JConnect is :" + getValue("ICFDiaryWindow"));

        putValue("ScreeningStatus", subjectListPage.getScreeningStatus());
        ExtentCucumberAdapter.addTestStepLog("The ScreeningStatus in JConnect is :" + getValue("ScreeningStatus"));
        putValue("ScreeningDiaryWindow", subjectListPage.getScreeningDiaryWindowJconnect());
        ExtentCucumberAdapter.addTestStepLog("The Screening DiaryWindow in JConnect is :" + getValue("ScreeningDiaryWindow"));

        putValue("SAFERInterviewStatus", subjectListPage.getSAFERInterviewStatus());
        ExtentCucumberAdapter.addTestStepLog("The SAFERInterview Status in JConnect is :" + getValue("SAFERInterviewStatus"));
        putValue("SaferInterviewDiary", subjectListPage.getSaferInterviewDiaryWindowJconnect());
        ExtentCucumberAdapter.addTestStepLog("The SaferInterview DiaryWindow in JConnect is :" + getValue("SaferInterviewDiary"));


        putValue("Week1BaseLineStatus", subjectListPage.getWeek1BaseLineStatus1());
        ExtentCucumberAdapter.addTestStepLog("The Week1BaseLineStatus in JConnect is :" + getValue("Week1BaseLineStatus"));
        putValue("Week1BaselineDiary", subjectListPage.getWeek1BaselineDiaryWindowJconnect());
        ExtentCucumberAdapter.addTestStepLog("The Week1Baseline DiaryWindow in JConnect is :" + getValue("Week1BaselineDiary"));

//        putValue("UnscheduledVisit", subjectListPage.getUnscheduledVisitStatus());
//        ExtentCucumberAdapter.addTestStepLog("The UnscheduledVisit Status in JConnect is :" + getValue("UnscheduledVisit"));
//        putValue("UnscheduledDiary", subjectListPage.getUnscheduledDiaryWindowJconnect());
//        ExtentCucumberAdapter.addTestStepLog("The Unscheduled DiaryWindow in JConnect is " + getValue("UnscheduledDiary"));

        putValue("UnscheduledVisit1", subjectListPage.getUnscheduledVisitStatus1());
        ExtentCucumberAdapter.addTestStepLog("The UnscheduledVisit Status in JConnect is :" + getValue("UnscheduledVisit1"));
        putValue("UnscheduledDiary", subjectListPage.getUnscheduledDiaryWindowJconnect1());
        ExtentCucumberAdapter.addTestStepLog("The Unscheduled DiaryWindow in JConnect is " + getValue("UnscheduledDiary"));

        putValue("Week1Status", subjectListPage.getWeek1Status2());
        ExtentCucumberAdapter.addTestStepLog("The Week1 Status in JConnect is :" + getValue("Week1Status"));
        putValue("Week1Diary", subjectListPage.getWeek1DiaryWindowJconnect1());
        ExtentCucumberAdapter.addTestStepLog("The Week1 DiaryWindow in JConnect is :" + getValue("Week1Diary"));


//        putValue("Week1Status", subjectListPage.getWeek1Status1());
//        ExtentCucumberAdapter.addTestStepLog("The Week1 Status in JConnect is :" + getValue("Week1Status"));
//        putValue("Week1Diary", subjectListPage.getWeek1DiaryWindowJconnect());
//        ExtentCucumberAdapter.addTestStepLog("The Week1 DiaryWindow in JConnect is :" + getValue("Week1Diary"));


        putValue("Week3Status", subjectListPage.getWeek3Status());
        ExtentCucumberAdapter.addTestStepLog("The Week3 Status in JConnect is :" + getValue("Week3Status"));
        putValue("Week3Diary", subjectListPage.getWeek3DiaryWindowJconnect());
        ExtentCucumberAdapter.addTestStepLog("The Week3 DiaryWindow in JConnect is :" + getValue("Week3Diary"));


        putValue("Week5Status", subjectListPage.getWeek5Status());
        ExtentCucumberAdapter.addTestStepLog("The Week5 Status in JConnect is :" + getValue("Week5Status"));
        putValue("Week5Diary", subjectListPage.getWeek5DiaryWindowJconnect());
        ExtentCucumberAdapter.addTestStepLog("The Week5 DiaryWindow in JConnect is :" + getValue("Week5Diary"));



    }

    @And("I navigate to StudyList List and enter {string} and fetch the record")
    public void iNavigateToStudyListListAndEnterAndFetchTheRecord(String studyNum) {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        studyListPage = new StudyListPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickJconnectWidget", subjectCreatePage.clickJconnectWidget());

        Assert.assertTrue("unable to clickStudy", studyListPage.clickStudy());
        Assert.assertTrue("unable to clickStudyListMenu", studyListPage.clickStudyListMenu());
        Assert.assertTrue("unable to captureStudyListSearch", studyListPage.captureStudyListSearch(studyNum));
        Assert.assertTrue("unable to clickStudyListSearch", studyListPage.clickStudyListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", studyListPage.clickStudyNumberMRN(studyNum));
        seleniumAdaptor.pauseFor(2);

        takeScreenShotNew(this.scenario);

        putValue("SponsorNameStudy", studyListPage.getSponsorNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The SponsorNameStudy in JConnect is :" + getValue("SponsorNameStudy"));
        validate("MedPlusInc", studyListPage.getSponsorNameStudy());
        putValue("VersionName", studyListPage.getVersionNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The VersionName Study in JConnect is :" + getValue("VersionName"));
        validate("Version 12.0", studyListPage.getVersionNameStudy());

        studyListPage.CheckingChkboxLanguageSource();
        studyListPage.CheckingChkboxLanguageTarget();

        Assert.assertTrue("unable to clickMappedOrg", studyListPage.clickMappedOrg());
        seleniumAdaptor.pauseFor(2);
        putValue("StudyOrgName", studyListPage.getStudyOrgName());
        ExtentCucumberAdapter.addTestStepLog("The StudyOrganisation Name in JConnect is :" + getValue("StudyOrgName"));
        validate("160 - The Bishop Center for Translational Neuroscience", studyListPage.getStudyOrgName());



    }

    @And("I validate the Screening checkbox and WeekOneBaseLine checkbox in the PrepaymentVisit section")
    public void iValidateTheScreeningCheckboxAndWeekOneBaseLineCheckboxInThePrepaymentVisitSection() {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);

        amazonWebMailPage.CheckingChkboxScreening();
        putValue("screeningChktxt", amazonWebMailPage.getCheckingChkboxScreening());
        validate("", amazonWebMailPage.getCheckingChkboxScreening());

        amazonWebMailPage.CheckingChkboxWeekOneBaseLine();
        putValue("weekoneChktxt", amazonWebMailPage.getCheckingChkboxWeekOneBaseLine());
        validate("", amazonWebMailPage.getCheckingChkboxWeekOneBaseLine());

    }

    @And("I navigate to Subject List and enter {string} and must fetch the record")
    public void iNavigateToSubjectListAndEnterAndMustFetchTheRecord(String firstname) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickJconnectWidget", subjectCreatePage.clickJconnectWidget());
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

    }

    @And("I navigate to StudyList List and capture {string} and fetch the record")
    public void iNavigateToStudyListListAndCaptureAndFetchTheRecord(String studyNum) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        studyListPage = new StudyListPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickJconnectWidget", subjectCreatePage.clickJconnectWidget());

        Assert.assertTrue("unable to clickStudy", studyListPage.clickStudy());
        Assert.assertTrue("unable to clickStudyListMenu", studyListPage.clickStudyListMenu());
        Assert.assertTrue("unable to captureStudyListSearch", studyListPage.captureStudyListSearch(studyNum));
        Assert.assertTrue("unable to clickStudyListSearch", studyListPage.clickStudyListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", studyListPage.clickStudyNumberMRN(studyNum));
        seleniumAdaptor.pauseFor(2);

        takeScreenShotNew(this.scenario);

        putValue("SponsorNameStudy", studyListPage.getSponsorNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The SponsorNameStudy in JConnect is :" + getValue("SponsorNameStudy"));
        validate("MedPlusInc", studyListPage.getSponsorNameStudy());
        putValue("VersionName", studyListPage.getVersionNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The VersionName Study in JConnect is :" + getValue("VersionName"));
        validate("Version 12.0", studyListPage.getVersionNameStudy());

        studyListPage.CheckingChkboxLanguageSource();
        studyListPage.CheckingChkboxLanguageTarget();

        Assert.assertTrue("unable to clickMappedOrg", studyListPage.clickMappedOrg());
        seleniumAdaptor.pauseFor(2);
        putValue("StudyOrgName", studyListPage.getStudyOrgName());
        ExtentCucumberAdapter.addTestStepLog("The StudyOrganisation Name in JConnect is :" + getValue("StudyOrgName"));
        validate("160 - The Bishop Center for Translational Neuroscience", studyListPage.getStudyOrgName());



    }

    @And("I should be able to navigate to the ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iShouldBeAbleToNavigateToTheScheduleInfoSectionAndCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureTimeHrs2", callSchedulePage.captureTimeHrs2(timehours));
        Assert.assertTrue("unable to captureTimeMins2", callSchedulePage.captureTimeMins2(timemins));
        Assert.assertTrue("unable to captureTimetype2", callSchedulePage.captureTimetype2(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
//        Assert.assertTrue("unable to captureCallDurationHrs3", callSchedulePage.captureCallDurationHrs3(calldurationHrs));
//        Assert.assertTrue("unable to captureCallDurationMins3", callSchedulePage.captureCallDurationMins3(calldurationMins));
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureCallDurationHrs8", callSchedulePage.captureCallDurationHrs8(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));

        seleniumAdaptor.pauseFor(6);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureCallDurationMins3", callSchedulePage.captureCallDurationMins3(calldurationMins));
        Assert.assertTrue("unable to captureCallDurationMins8", callSchedulePage.captureCallDurationMins8(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert1", callSchedulePage.captureAlert1(alert));
//        Assert.assertTrue("unable to captureAlert8", callSchedulePage.captureAlert8(alert));


        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//



     }

    @And("I should click PHQ form and and fill it Partially without submitting and click back button")
    public void iShouldClickPHQFormAndAndFillItPartiallyWithoutSubmittingAndClickBackButton() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
        seleniumAdaptor.pauseFor(3);
//        Assert.assertTrue("unable to clickPHQLittleInterest1", webAppLoginPage.clickPHQLittleInterest1());
        Assert.assertTrue("unable to clickCHRTNeverBetterDisagree", webAppLoginPage.clickCHRTNeverBetterDisagree());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTroubleFallingNotAtAll", webAppLoginPage.clickTroubleFallingNotAtAll());
        Assert.assertTrue("unable to clickFeelingTiredNotAtAll", webAppLoginPage.clickFeelingTiredNotAtAll());
        Assert.assertTrue("unable to clickPoorAppetiteNotAtAll", webAppLoginPage.clickPoorAppetiteNotAtAll());
        Assert.assertTrue("unable to clickFeelingBadNotAtAll", webAppLoginPage.clickFeelingBadNotAtAll());
//        Assert.assertTrue("unable to clickTroubleConcentratingNotAtAll", webAppLoginPage.clickTroubleConcentratingNotAtAll());
//        Assert.assertTrue("unable to clickSpeakingSlowlyNotAtAll", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
//        Assert.assertTrue("unable to clickThoughtsNotAtAll", webAppLoginPage.clickThoughtsNotAtAll());
//        Assert.assertTrue("unable to clickDifficultyNotAtAll", webAppLoginPage.clickDifficultyNotAtAll());
//        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
//        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());
//        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickLittleInterest());

        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        Assert.assertTrue("unable to clickBack", webAppLoginPage.clickBack());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickBackDiary", webAppLoginPage.clickBackDiary());
        seleniumAdaptor.pauseFor(2);


     }

    @And("I navigate to JConnect Subject List enter {string} and fetch the record and capture {string} check details for Completed Form and capture {string} check the partially submitted form")
    public void iNavigateToJConnectSubjectListEnterAndFetchTheRecordAndCaptureCheckDetailsForCompletedFormAndCaptureCheckThePartiallySubmittedForm(String subNum, String visit, String visit4) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(subNum));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(subNum));
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsPHQ());
//        Assert.assertTrue("unable to clickVisitCompletedForms", subjectListPage.clickVisitCompletedForms());
        takeScreenShotNew(this.scenario);

        putValue("StartDate", subjectListPage.getSubFormsStartDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for ScreeningVisit Completed Form Schedule StartTime in JConnect is :" + getValue("StartDate"));
        putValue("EndDate", subjectListPage.getSubFormsEndDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for ScreeningVisit Completed Form Schedule EndTime in JConnect is :" + getValue("EndDate"));
        putValue("ActualSubmissionDate", subjectListPage.getActualSubmissionDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for ScreeningVisit Completed Form ActualSubmissionDate in JConnect is :" + getValue("ActualSubmissionDate"));

        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit1(visit4));
        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsPHQ());
        Assert.assertTrue("unable to clickVisitPartiallSubmittedForms", subjectListPage.clickVisitPartiallSubmittedForms());

        takeScreenShotNew(this.scenario);
        putValue("StartDate1", subjectListPage.getSubFormsStartDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for Week1 Visit PartiallySubmitted Form Schedule StartTime in JConnect is :" + getValue("StartDate1"));
        putValue("EndDate1", subjectListPage.getSubFormsEndDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for Week1 Visit PartiallySubmitted Form Schedule EndTime in JConnect is :" + getValue("EndDate1"));
        putValue("ActualSubmissionDate1", subjectListPage.getActualSubmissionDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for Week1 Visit PartiallySubmitted Form ActualSubmissionDate in JConnect is :" + getValue("ActualSubmissionDate1"));
        validate("", subjectListPage.getActualSubmissionDate());



    }

    @And("I should navigate to WebApp and select WeekOne option and complete the full PHQ form")
    public void iShouldNavigateToWebAppAndSelectWeekOneOptionAndCompleteTheFullPHQForm() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickWeek1", webAppLoginPage.clickWeek1());
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
//        Assert.assertTrue("unable to clickPHQLittleInterest1", webAppLoginPage.clickPHQLittleInterest1());
//        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickTroubleFallingNotAtAll", webAppLoginPage.clickTroubleFallingNotAtAll());
//        Assert.assertTrue("unable to clickFeelingTiredNotAtAll", webAppLoginPage.clickFeelingTiredNotAtAll());
//        Assert.assertTrue("unable to clickPoorAppetiteNotAtAll", webAppLoginPage.clickPoorAppetiteNotAtAll());
//        Assert.assertTrue("unable to clickFeelingBadNotAtAll", webAppLoginPage.clickFeelingBadNotAtAll());
        Assert.assertTrue("unable to clickTroubleConcentratingNotAtAll", webAppLoginPage.clickTroubleConcentratingNotAtAll());
        Assert.assertTrue("unable to clickSpeakingSlowlyNotAtAll", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
        Assert.assertTrue("unable to clickThoughtsNotAtAll", webAppLoginPage.clickThoughtsNotAtAll());
        Assert.assertTrue("unable to clickDifficultyNotAtAll", webAppLoginPage.clickDifficultyNotAtAll());
        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());
        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickLittleInterest());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);






    }

    @When("I click on the JConnectBuild Option")
    public void iClickOnTheJConnectBuildOption() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);


//        seleniumAdaptor.pauseFor(4);
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickJConnectBuild1", jCollaborateWelcomePage.clickJConnectBuild1());

     }

    @And("I must join the meeting from JConnect")
    public void iMustJoinTheMeetingFromJConnect() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(4);
        callSchedulePage.switchToTab1();
        seleniumAdaptor.pauseFor(8);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
        takeScreenShotNew(this.scenario);

}

    @And("I launch JConnect WebApp with {string}{string} password and join the meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndJoinTheMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();
        amazonWebMailPage.opentabAmazonWebAppReal();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(8);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabAmazonWebAppReal();
//        seleniumAdaptor.pauseFor(10);
        callSchedulePage.switchToTab1();
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        seleniumAdaptor.pauseFor(3);
        takeScreenShotNew(this.scenario);
        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
        seleniumAdaptor.pauseFor(3);
        takeScreenShotNew(this.scenario);
        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab2();


}

    @And("I launch JConnect WebApp with {string}{string} password and join the Safer meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndJoinTheSaferMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();
        amazonWebMailPage.opentabAmazonWebAppReal();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
//        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickWebAppSafermeeting", webAppLoginPage.clickWebAppSafermeeting());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
//        callSchedulePage.switchToTab3();
        seleniumAdaptor.pauseFor(8);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall1());
        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabAmazonWebAppReal();
//        seleniumAdaptor.pauseFor(10);
        callSchedulePage.switchToTab1();
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        driver.close();
        callSchedulePage.switchToTab0();

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
        seleniumAdaptor.pauseFor(5);
        driver.close();

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab2();

     }

    @And("I launch the JConnect WebApp and capture {string}{string}\"password and login and click Savebuton for TimeZone")
    public void iLaunchTheJConnectWebAppAndCapturePasswordAndLoginAndClickSavebutonForTimeZone(String phoneCode, String phoneNum) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
//        seleniumAdaptor.pauseFor(10);

    }


    @And("I navigate to Schedule a Call screen and must be able to capture {string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndMustBeAbleToCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);

     }

    @And("I navigate to Questionnaire and capture {string}{string}{string}{string}")
    public void iNavigateToQuestionnaireAndCapture(String questionnaire1, String questionnaire2, String questionnaire3, String questionnaire4) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire1));
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire2));
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire3));
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire4));
//        Assert.assertTrue("unable to capturequestionnaire1", callSchedulePage.capturequestionnaire1(questionnaire1));
//        Assert.assertTrue("unable to capturequestionnaire2", callSchedulePage.capturequestionnaire1(questionnaire2));
//        Assert.assertTrue("unable to capturequestionnaire3", callSchedulePage.capturequestionnaire1(questionnaire3));
//        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire1(questionnaire4));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
    }

    @And("I should be able to navigate to ScheduleInfo section and must capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iShouldBeAbleToNavigateToScheduleInfoSectionAndMustCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureTimeHrs2", callSchedulePage.captureTimeHrs2(timehours));
        Assert.assertTrue("unable to captureTimeMins2", callSchedulePage.captureTimeMins(timemins));
        Assert.assertTrue("unable to captureTimetype2", callSchedulePage.captureTimetype(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
//        Assert.assertTrue("unable to captureCallDurationHrs3", callSchedulePage.captureCallDurationHrs3(calldurationHrs));
//        Assert.assertTrue("unable to captureCallDurationMins3", callSchedulePage.captureCallDurationMins3(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureCallDurationHrs9", callSchedulePage.captureCallDurationHrs9(calldurationHrs));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureCallDurationMins9", callSchedulePage.captureCallDurationMins9(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert9", callSchedulePage.captureAlert9(alert));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(1);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//



     }

    @And("I should click PHQ form and must capture the options and select Option Two for hurting Yourself")
    public void iShouldClickPHQFormAndMustCaptureTheOptionsAndSelectOptionTwoForHurtingYourself() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        seleniumAdaptor.pauseFor(4);
//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickWeek1Baseline", webAppLoginPage.clickWeek1Baseline());
        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
        Assert.assertTrue("unable to clickPHQLittleInterest1", webAppLoginPage.clickPHQLittleInterest1());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTroubleFallingNotAtAll", webAppLoginPage.clickTroubleFallingNotAtAll());
        Assert.assertTrue("unable to clickFeelingTiredNotAtAll", webAppLoginPage.clickFeelingTiredNotAtAll());
        Assert.assertTrue("unable to clickPoorAppetiteNotAtAll", webAppLoginPage.clickPoorAppetiteNotAtAll());
        Assert.assertTrue("unable to clickFeelingBadNotAtAll", webAppLoginPage.clickFeelingBadNotAtAll());
        Assert.assertTrue("unable to clickTroubleConcentratingNotAtAll", webAppLoginPage.clickTroubleConcentratingNotAtAll());
        Assert.assertTrue("unable to clickSpeakingSlowlyNotAtAll", webAppLoginPage.clickSpeakingSlowlyNotAtAll());
        Assert.assertTrue("unable to clickThoughtsNotAtAll", webAppLoginPage.clickThoughtsNotAtAll());
        Assert.assertTrue("unable to clickDifficultyNotAtAll", webAppLoginPage.clickDifficultyNotAtAll());
        Assert.assertTrue("unable to clickPHQTGetAlongNotAtAll", webAppLoginPage.clickPHQTGetAlongNotAtAll());
//        Assert.assertTrue("unable to clickPHQHurtYourselfNotAtAll", webAppLoginPage.clickPHQHurtYourselfNotAtAll());
        Assert.assertTrue("unable to clickPHQHurtingYourselfMorethanHalf", webAppLoginPage.clickPHQHurtingYourselfMorethanHalf());
        Assert.assertTrue("unable to clickFeelingDownNotAtAll", webAppLoginPage.clickLittleInterest());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);


     }

    @And("I click on CHRTSR Form and capture the options and select Option ten eleven and twelve as Strongly Agree")
    public void iClickOnCHRTSRFormAndCaptureTheOptionsAndSelectOptionTenElevenAndTwelveAsStronglyAgree() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCHRTSRForm", webAppLoginPage.clickCHRTSRForm());
        Assert.assertTrue("unable to clickCHRTNeverBetterDisagree", webAppLoginPage.clickCHRTNeverBetterDisagree1());
        Assert.assertTrue("unable to clickCHRTNoFutureDisagree", webAppLoginPage.clickCHRTNoFutureDisagree1());
        Assert.assertTrue("unable to clickCHRTNothingRightDisagree", webAppLoginPage.clickCHRTNothingRightDisagree1());
        Assert.assertTrue("unable to clickCHRTEverythingWrongDisagree", webAppLoginPage.clickCHRTEverythingWrongDisagree1());
        Assert.assertTrue("unable to clickNoOneDependOnDisagree", webAppLoginPage.clickNoOneDependOnDisagree1());
        Assert.assertTrue("unable to clickAreGoneDisagree", webAppLoginPage.clickAreGoneDisagree1());
        Assert.assertTrue("unable to clickSufferingDisagree", webAppLoginPage.clickSufferingDisagree1());
        Assert.assertTrue("unable to clickNoReasonToLiveDisagree", webAppLoginPage.clickNoReasonToLiveDisagree1());
        Assert.assertTrue("unable to clickGoToSleepDisagree", webAppLoginPage.clickGoToSleepDisagree1());
        Assert.assertTrue("unable to clickKillingMyselfStronglyagree", webAppLoginPage.clickKillingMyselfStronglyagree());
        Assert.assertTrue("unable to clickHowToKillingMyselfStronglyagree", webAppLoginPage.clickHowToKillingMyselfStronglyagree());
        Assert.assertTrue("unable to clickPlanToKillingMyselfStronglyagree", webAppLoginPage.clickPlanToKillingMyselfStronglyagree());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);

        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Questionnaire and must be able to capture {string}{string}{string}")
    public void iNavigateToQuestionnaireAndMustBeAbleToCapture(String questionnaire1, String questionnaire2, String questionnaire3) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire1));
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire2));
        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire4(questionnaire3));

//        Assert.assertTrue("unable to capturequestionnaire1", callSchedulePage.capturequestionnaire1(questionnaire1));
//        Assert.assertTrue("unable to capturequestionnaire2", callSchedulePage.capturequestionnaire1(questionnaire2));
//        Assert.assertTrue("unable to capturequestionnaire3", callSchedulePage.capturequestionnaire1(questionnaire3));
//        Assert.assertTrue("unable to capturequestionnaire4", callSchedulePage.capturequestionnaire1(questionnaire4));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
    }


    @And("I navigate to JConnect Chat section click NewChat and capture {string}{string}{string}")
    public void iNavigateToJConnectChatSectionClickNewChatAndCapture(String users, String subject, String message) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to captureUsers", jConnectChatPage.captureUsers(users));
        Assert.assertTrue("unable to captureSubjectChat", jConnectChatPage.captureSubjectChat(subject));
        Assert.assertTrue("unable to clickCheckCircle", jConnectChatPage.clickCheckCircle());
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipants", jConnectChatPage.clickChatParticipants());
        Assert.assertTrue("unable to captureMessage", jConnectChatPage.captureMessage(message));
        Assert.assertTrue("unable to captureSiteStaff", jConnectChatPage.clickCheckCircle());
        Assert.assertTrue("unable to UploadFileMessageJconnect", jConnectChatPage.UploadFileMessageJconnect());
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);

    }


    @And("I navigate to WebApp and navigate to Chat Option and capture {string}")
    public void iNavigateToWebAppAndNavigateToChatOptionAndCapture(String message1) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickChat", webAppLoginPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipantsWebApp", webAppLoginPage.clickChatParticipantsWebApp());
        Assert.assertTrue("unable to captureMessageWebApp", webAppLoginPage.captureMessageWebApp(message1));
        Assert.assertTrue("unable to clickCheckCircleWebApp", webAppLoginPage.clickCheckCircleWebApp());
        callSchedulePage.switchToTab1();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to JConnect Chat section and validate the chat")
    public void iNavigateToJConnectChatSectionAndValidateTheChat() {


        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipants", jConnectChatPage.clickChatParticipants());

        putValue("Message", jConnectChatPage.getMessage());
        validate("Hello", jConnectChatPage.getMessage());
        ExtentCucumberAdapter.addTestStepLog("The Message from WebApp chat is :" + getValue("Message"));




    }
}


//    @And("I click Gridform and the options {string}{string}{string}")
//    public void iClickGridformAndTheOptions(String arg0, String arg1, String arg2) {
//
//        callSchedulePage = new CallSchedulePage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//
//        callSchedulePage = new CallSchedulePage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickGridForm123", webAppLoginPage.clickGridForm123());
//        Assert.assertTrue("unable to captureField2option", webAppLoginPage.captureField2option(Field2option));
////        Assert.assertTrue("unable to captureTestField1", webAppLoginPage.capturefield4(Singleselectopt));
//        Assert.assertTrue("unable to captureSingleselectopt", webAppLoginPage.captureSingleselectopt(Singleselectopt));
//        Assert.assertTrue("unable to capturefield11", webAppLoginPage.capturefield11(field21));
//    }


