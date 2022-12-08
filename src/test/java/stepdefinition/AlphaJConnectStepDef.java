package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.masterthought.cucumber.ReportResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObject.*;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AlphaJConnectStepDef extends BaseClass {


    PropertiesFileReader obj = new PropertiesFileReader();

    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;

    JConnectChatPage jConnectChatPage;

    JconnectAuditReportsPage jconnectAuditReportsPage;

    JconnectUserManagementPage jconnectUserManagementPage;

    MyAccountPage myAccountPage;

    public JCollaborateQALoginPage jCollaborateQALoginPage;

    public AmazonWebMailPage amazonWebMailPage;

    public CRIOLoginPage cRIOLoginPage;

    public CRIOSubjectCreationPage cRIOSubjectCreationPage;

    public CRIOVisitSchedulePage cRIOVisitSchedulePage;

    public CRIOSubjectListPage cRIOSubjectListPage;

    public SubjectListPage subjectListPage;
    public StudyListPage studyListPage;
    public WebAppLoginPage webAppLoginPage;
    public CallSchedulePage callSchedulePage;
    public MenuItemsJconnectPage menuItemsJconnectPage;

    public PDFReaderPage pDFReaderPage;

    public ExcelUtilTest excelUtilTest;
    public JCollaborateWelcomePage jCollaborateWelcomePage;

    public SubjectListAuditTrailPage subjectListAuditTrailPage;

    public SubjectCreatePage subjectCreatePage;
    private Scenario scenario;
    public static ExtentTest extentTest;
    //    private final Logger logger = Logger.getLogger(ILABFlow.class);
//  private static final Logger logger = logger.getLogger(ILABFlow.class);
    private static Logger logger = LogManager.getLogger(AlphaJConnectStepDef.class);

    ExtentReports extent;

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
//        extent = new ExtentReports();

//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "./Reports/report.html");
//        ExtentReports extent;
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//        htmlReporter.config().setDocumentTitle("MyReport");





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
//            extent.flush();
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
    public void iCaptureAndClickSignin(String username, String password) throws IOException {

//        ExtentTest test = extent.createTest("FirstTest");
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);

//        takeScreenShotNew(this.scenario);
//        getScreenshotAsBase64(scenario);

        Assert.assertTrue("unable to captureUserName", jCollaborateQALoginPage.captureUserName(username));
        Assert.assertTrue("unable to capturePassword", jCollaborateQALoginPage.capturePassword(password));

//       test.pass("result", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());

//        takeScreenShotNew2(this.scenario);

//        takeScreenShotNew5(this.scenario);
//               takeScreenShotNew(this.scenario);
//        takeScreenShotNew1(this.scenario);

//        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSignIn", jCollaborateQALoginPage.clickSignIn());
        ExtentCucumberAdapter.addTestStepLog("Loged into Jconnect Successfully");
        ReportResult.getCurrentTime();

//        takeScreenShotNew(this.scenario);

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
        Assert.assertTrue("unable to clickCreate1", subjectCreatePage.clickCreate1());
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
        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail(email));
//        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole1(role));

//        Assert.assertTrue("unable to clickCustomDate", subjectCreatePage.clickCustomDate());

//        Assert.assertTrue("unable to clickCustomDateIfAvailable", subjectCreatePage.clickCustomDateIfAvailable());
//        Assert.assertTrue("unable to clickCalenderIconSubjectCreate", subjectCreatePage.clickCalenderIconSubjectCreate());
//        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(startDate));
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

        Assert.assertTrue("unable to clickSubCreationOK", subjectCreatePage.clickSubCreationOK());
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
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

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
//        validate("Completed  ", subjectListPage.getScreeningStatus());


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
        callSchedulePage = new CallSchedulePage(driver);

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
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

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
        seleniumAdaptor.pauseFor(6);
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
        seleniumAdaptor.pauseFor(2);
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
        seleniumAction = new SeleniumAction(driver);

        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickQIDSSRForm", webAppLoginPage.clickQIDSSRForm());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
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
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        takeScreenShotNew(this.scenario);
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

        putValue("WindowStartDateWeek3", webAppLoginPage.getWindow1StartDateWeek3());
        ExtentCucumberAdapter.addTestStepLog("The WindowStartDateWeek3 in WebApp is :" + getValue("WindowStartDateWeek3"));
        putValue("WindowEndDateWeek3", webAppLoginPage.getWindow1EndDateWeek3());
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

        Assert.assertTrue("unable to clickStudyLanguage", studyListPage.clickStudyLanguage());
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
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit4));
        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsPHQ());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickVisitPartiallSubmittedForms", subjectListPage.clickVisitPartiallSubmittedForms());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        putValue("StartDate1", subjectListPage.getSubFormsStartDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for Week1 Visit PartiallySubmitted Form Schedule StartTime in JConnect is :" + getValue("StartDate1"));
        seleniumAdaptor.pauseFor(2);
        putValue("EndDate1", subjectListPage.getSubFormsEndDate());
        ExtentCucumberAdapter.addTestStepLog("The PHQ form for Week1 Visit PartiallySubmitted Form Schedule EndTime in JConnect is :" + getValue("EndDate1"));
        seleniumAdaptor.pauseFor(2);
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
        seleniumAdaptor.pauseFor(2);
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
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        Assert.assertTrue("unable to clickFeelingNervousNotAtAll", webAppLoginPage.clickFeelingNervousNotAtAll());
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
//        Assert.assertTrue("unable to clickPHQHurtingYourselfMorethanHalf", webAppLoginPage.clickPHQHurtingYourselfMorethanHalf());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickPHQHurtingYourselfNearlyEveryDay", webAppLoginPage.clickPHQHurtingYourselfNearlyEveryDay());
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
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        Assert.assertTrue("unable to clickCHRTNeverBetterDisagree", webAppLoginPage.clickCHRTNeverBetterDisagree1());
        Assert.assertTrue("unable to clickCHRTNoFutureDisagree", webAppLoginPage.clickCHRTNoFutureDisagree1());
        Assert.assertTrue("unable to clickCHRTNothingRightDisagree", webAppLoginPage.clickCHRTNothingRightDisagree1());
        Assert.assertTrue("unable to clickCHRTEverythingWrongDisagree", webAppLoginPage.clickCHRTEverythingWrongDisagree1());
        Assert.assertTrue("unable to clickNoOneDependOnDisagree", webAppLoginPage.clickNoOneDependOnDisagree1());
        Assert.assertTrue("unable to clickAreGoneDisagree", webAppLoginPage.clickAreGoneDisagree1());
        Assert.assertTrue("unable to clickSufferingDisagree", webAppLoginPage.clickSufferingDisagree1());
        Assert.assertTrue("unable to clickNoReasonToLiveDisagree", webAppLoginPage.clickNoReasonToLiveDisagree1());
        Assert.assertTrue("unable to clickGoToSleepDisagree", webAppLoginPage.clickGoToSleepDisagree1());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        takeScreenShotNew(this.scenario);
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

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }


    @And("I navigate to JConnect Chat section click NewChat and capture {string}{string}{string}")
    public void iNavigateToJConnectChatSectionClickNewChatAndCapture(String users, String subject, String message) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickNewChat1", jConnectChatPage.clickNewChat1());
//        Assert.assertTrue("unable to captureUsers", jConnectChatPage.captureUsers(users));
        Assert.assertTrue("unable to captureUsers1", jConnectChatPage.captureUsers1(users));
        Assert.assertTrue("unable to captureSubjectChat", jConnectChatPage.captureSubjectChat(subject));
        Assert.assertTrue("unable to clickCheckCircle", jConnectChatPage.clickCheckCircle());
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipants3", jConnectChatPage.clickChatParticipants3());
        Assert.assertTrue("unable to captureMessage", jConnectChatPage.captureMessage(message));
//        Assert.assertTrue("unable to clickSendMessage", jConnectChatPage.clickSendMessage());

        Assert.assertTrue("unable to UploadFileMessageJconnect", jConnectChatPage.UploadFileMessageJconnect());
        Assert.assertTrue("unable to clickSendMessage", jConnectChatPage.clickSendMessage());
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
        Assert.assertTrue("unable to clickChatParticipantsWebApp", webAppLoginPage.clickChatParticipantsWebApp1());
        Assert.assertTrue("unable to captureMessageWebApp", webAppLoginPage.captureMessageWebApp(message1));
        Assert.assertTrue("unable to clickChatAttachment", webAppLoginPage.clickChatAttachment());
        Assert.assertTrue("unable to buttonBackBrowser", webAppLoginPage.buttonBackBrowser());

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
        callSchedulePage.switchToTab0();

        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipants1", jConnectChatPage.clickChatParticipants1());

        putValue("Message", jConnectChatPage.getMessage1());
        validate("Hello", jConnectChatPage.getMessage1());
        ExtentCucumberAdapter.addTestStepLog("The Message from WebApp chat is :" + getValue("Message"));


    }

    @And("I navigate to WebApp and select the Unscheduled option")
    public void iNavigateToWebAppAndSelectTheUnscheduledOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());


        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickUnscheduled2", webAppLoginPage.clickUnscheduled1());
        seleniumAdaptor.pauseFor(2);


    }

    @And("I must be able to navigate to ScheduleInfo section and must capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustBeAbleToNavigateToScheduleInfoSectionAndMustCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(3);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        seleniumAdaptor.pauseFor(2);
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
//        Assert.assertTrue("unable to captureCallDurationHrs9", callSchedulePage.captureCallDurationHrs9(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureCallDurationMins9", callSchedulePage.captureCallDurationMins3(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert9", callSchedulePage.captureAlert3(alert));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(2);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//


    }

    @And("I launch JConnect WebApp with {string}{string} password and select Unscheduled option")
    public void iLaunchJConnectWebAppWithPasswordAndSelectUnscheduledOption(String phoneCode, String phoneNum) {
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
//        amazonWebMailPage.opentabJconnectReal1();
        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword("3793");
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

//        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
//        seleniumAdaptor.pauseFor(6);
//        Assert.assertTrue("unable to clickUnscheduled2", webAppLoginPage.clickUnscheduled1());
//        seleniumAdaptor.pauseFor(2);


    }

    @And("I must navigate to WebApp and navigate to Chat Option and capture {string}")
    public void iMustNavigateToWebAppAndNavigateToChatOptionAndCapture(String message1) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickChat", webAppLoginPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipantsWebApp", webAppLoginPage.clickChatParticipantsWebApp1());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureMessageWebApp", webAppLoginPage.captureMessageWebApp(message1));
        Assert.assertTrue("unable to clickCheckCircleWebApp", webAppLoginPage.clickCheckCircleWebApp());
        Assert.assertTrue("unable to clickChatAttachment3", webAppLoginPage.clickChatAttachment3());
//        Assert.assertTrue("unable to buttonBackBrowser", webAppLoginPage.buttonBackBrowser());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

    }

    @And("I must be able to navigate to ScheduleInfo section and should capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustBeAbleToNavigateToScheduleInfoSectionAndShouldCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        seleniumAdaptor.pauseFor(2);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//


    }

    @And("I should navigate to WebApp and navigate to Chat Option and capture {string}")
    public void iShouldNavigateToWebAppAndNavigateToChatOptionAndCapture(String message1) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickChat", webAppLoginPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipantsWebApp", webAppLoginPage.clickChatParticipantsWebApp1());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureMessageWebApp", webAppLoginPage.captureMessageWebApp(message1));
        Assert.assertTrue("unable to clickCheckCircleWebApp", webAppLoginPage.clickCheckCircleWebApp());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickChatAttachment4", webAppLoginPage.clickChatAttachment4());
//        Assert.assertTrue("unable to buttonBackBrowser", webAppLoginPage.buttonBackBrowser());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

    }

    @And("I click on SubjectDetails section and click View Encrypted Data and retrieve the PhoneNum and Email")
    public void iClickOnSubjectDetailsSectionAndClickViewEncryptedDataAndRetrieveThePhoneNumAndEmail() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);



        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectDetails1", subjectCreatePage.clickSubjectDetails1());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectDetails", subjectCreatePage.clickSubViewEncryptedData());
        subjectCreatePage.getPhoneNum();
        subjectCreatePage.getSubEmail();
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} check the forms for AUDIT CHRTSR PHQ")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureCheckTheFormsForAUDITCHRTSRPHQ(String firstname, String visit) {
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
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        subjectListPage.getFormsPHQ();
        subjectListPage.getFormsAUDIT();
        subjectListPage.getFormsCHRTSR();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and click AUDIT form and click AuditFormTrial and click on Export")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndClickAUDITFormAndClickAuditFormTrialAndClickOnExport(String firstname, String visit) {
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
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAUDIT());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());
        Assert.assertTrue("unable to clickExport", subjectListPage.clickExport());
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        Assert.assertTrue("unable to clickAction()", subjectListPage.clickAction());
        Assert.assertTrue("unable to clickPrint()", subjectListPage.clickPrint());
//        driver.close();
        callSchedulePage.switchToTab0();


        subjectListPage.getFormsPHQ();
        subjectListPage.getFormsAUDIT();
        subjectListPage.getFormsCHRTSR();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Subject List and enter {string} and fetch the record and click on send notification and capture {string} and send")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndClickOnSendNotificationAndCaptureAndSend(String firstname, String message) {
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
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickActionSubjectList()", subjectListPage.clickActionSubjectList());
        Assert.assertTrue("unable to captureMessageToSubject", subjectListPage.captureMessageToSubject(message));
        Assert.assertTrue("unable to clickSendMsg", subjectListPage.clickSendMsg());
        seleniumAdaptor.pauseFor(1);

        callSchedulePage.switchToTab0();

    }

    @And("I launch JConnect WebApp with {string}{string} password")
    public void iLaunchJConnectWebAppWithPassword(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);

        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab0();
//        driver.close();
//        callSchedulePage.switchToTab0();
//        amazonWebMailPage.opentabJconnectReal1();
        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword("4668");
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);


    }

    @And("I check the notification message")
    public void iCheckTheNotificationMessage() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());
        Assert.assertTrue("unable to clickNotifications", webAppLoginPage.clickNotifications());

        webAppLoginPage.gettxtAlert();
        putValue("Message", webAppLoginPage.gettxtAlert());
        validate("Hi", webAppLoginPage.gettxtAlert());
        ExtentCucumberAdapter.addTestStepLog("The Notification Alert Message is :" + getValue("Message"));
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Subject List and enter {string} and fetch the record and visit SubjectDetails and change the status by capturing {string}and save")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndVisitSubjectDetailsAndChangeTheStatusByCapturingAndSave(String firstname, String reasonForChange) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSubjectDetails()", subjectCreatePage.clickSubjectDetails());
        Assert.assertTrue("unable to clickSubViewEncryptedData", subjectCreatePage.clickSubViewEncryptedData());
        Assert.assertTrue("unable to captureMessageToSubject", subjectCreatePage.clickStatusChange());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectCreatePage.captureReasonForChange(reasonForChange));
        Assert.assertTrue("unable to click OK button", subjectCreatePage.clickSubCreationOK());
        Assert.assertTrue("unable to clickSaveandNext", subjectCreatePage.clickSaveandNext());
        Assert.assertTrue("unable to click OK button", subjectCreatePage.clickSubCreationOK());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Subject List and enter {string} and fetch the record and check the Status")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCheckTheStatus(String firstname) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        subjectListPage.getStatus1();
        putValue("Status", subjectListPage.getStatus1());
        validate("Inactive", subjectListPage.getStatus1());
        ExtentCucumberAdapter.addTestStepLog("The Subject Status is :" + getValue("Status"));
        takeScreenShotNew(this.scenario);


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


    @And("I navigate to Jconnect CallSchedule capture {string} and launch Screening meeting and amend {string}{string}{string} and reschedule call")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchScreeningMeetingAndAmendAndRescheduleCall(String ScheduleCallsubject, String timehours, String timemins, String timetype) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickSaferInterviewmeeting", callSchedulePage.clickSaferInterviewmeeting());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeHrs1(timehours));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeMins1(timemins));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimetype1(timetype));

        Assert.assertTrue("unable to clickRescheduleCall", callSchedulePage.clickRescheduleCall());

        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();

    }

    @And("I navigate to WebApp and check the Notification Alert Message")
    public void iNavigateToWebAppAndCheckTheNotificationAlertMessage() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab2();

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());
        Assert.assertTrue("unable to clickNotifications", webAppLoginPage.clickNotifications());

        webAppLoginPage.gettxtAlert();
        putValue("Message", webAppLoginPage.gettxtAlert());
        validate("Hi", webAppLoginPage.gettxtAlert());
        ExtentCucumberAdapter.addTestStepLog("The Notification Alert Message is :" + getValue("Message"));
        takeScreenShotNew(this.scenario);
    }


    @And("I navigate to WebApp and must select the Unscheduled option")
    public void iNavigateToWebAppAndMustSelectTheUnscheduledOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());


        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickUnscheduled2", webAppLoginPage.clickUnscheduled2());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I launch JConnect WebApp with {string}{string} password and check the Notification Alert Message")
    public void iLaunchJConnectWebAppWithPasswordAndCheckTheNotificationAlertMessage(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);

        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());
        Assert.assertTrue("unable to clickNotifications", webAppLoginPage.clickNotifications());

        webAppLoginPage.gettxtAlert();
        putValue("Message", webAppLoginPage.gettxtAlert());
        validate("Hi", webAppLoginPage.gettxtAlert());
        ExtentCucumberAdapter.addTestStepLog("The Notification Alert Message is :" + getValue("Message"));
        takeScreenShotNew(this.scenario);
    }

    @And("I launch JConnect WebApp with {string}{string} password and check access is inactivated message")
    public void iLaunchJConnectWebAppWithPasswordAndCheckAccessIsInactivatedMessage(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);

        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);

        webAppLoginPage.gettxtAccessInactivated();
        putValue("Alert", webAppLoginPage.gettxtAccessInactivated());
        validate("Your access is inactivated. Please contact your Study Coordinator.", webAppLoginPage.gettxtAccessInactivated());
        ExtentCucumberAdapter.addTestStepLog("The Notification Alert Message in WebApp is :" + getValue("Alert"));
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
    }


    @And("I navigate to Subject List and enter {string} and fetch the record and visit SubjectDetails and change the status to active by capturing {string}and save")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndVisitSubjectDetailsAndChangeTheStatusToActiveByCapturingAndSave(String firstname, String reasonForChange) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSubjectDetails()", subjectCreatePage.clickSubjectDetails());
        Assert.assertTrue("unable to clickSubViewEncryptedData", subjectCreatePage.clickSubViewEncryptedData());
        Assert.assertTrue("unable to captureMessageToSubject", subjectCreatePage.clickStatusChange1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectCreatePage.captureReasonForChange(reasonForChange));
        Assert.assertTrue("unable to click OK button", subjectCreatePage.clickSubCreationOK());
        Assert.assertTrue("unable to clickSaveandNext", subjectCreatePage.clickSaveandNext());
        Assert.assertTrue("unable to click OK button", subjectCreatePage.clickSubCreationOK());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }


    @And("I navigate to Subject List and enter {string} and fetch the record and must check the Status")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndMustCheckTheStatus(String firstname) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        subjectListPage.getStatus();
        putValue("Status", subjectListPage.getStatus());
        validate("Active", subjectListPage.getStatus());
        ExtentCucumberAdapter.addTestStepLog("The Subject Status is :" + getValue("Status"));
        takeScreenShotNew(this.scenario);


    }


    @And("I navigate to Subject List and enter {string} and fetch the record and navigate to Visits section and click Withdrawn and capture {string} and save")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndNavigateToVisitsSectionAndClickWithdrawnAndCaptureAndSave(String firstname, String withdrawnComments) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        Assert.assertTrue("unable to clickWithdrawn", subjectListPage.clickWithdrawn());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to withdrawnComments", subjectListPage.captureWithdrawnComments1(withdrawnComments));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to click OK button", subjectListPage.clickSaveComments());

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Subject List and enter {string} and fetch the record and should check the Status")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndShouldCheckTheStatus(String firstname) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        subjectListPage.getStatus1();
        putValue("Status", subjectListPage.getStatus1());
        validate("Withdrawn", subjectListPage.getStatus1());
        ExtentCucumberAdapter.addTestStepLog("The Subject Status is :" + getValue("Status"));
        takeScreenShotNew(this.scenario);


    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch Screening meeting and must amend {string}{string}{string} and reschedule call")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchScreeningMeetingAndMustAmendAndRescheduleCall(String ScheduleCallsubject, String timehours, String timemins, String timetype) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickScreeningMeetingJconnect", callSchedulePage.clickScreeningMeetingJconnect());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeHrs1(timehours));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimeMins1(timemins));
        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureTimetype1(timetype));

        Assert.assertTrue("unable to clickRescheduleCall", callSchedulePage.clickRescheduleCall());

        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();

    }

    @And("I click on CHRTSR Form and must capture the options")
    public void iClickOnCHRTSRFormAndMustCaptureTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCHRTSRForm", webAppLoginPage.clickCHRTSRForm());
        Assert.assertTrue("unable to clickCHRTNeverBetterAgree", webAppLoginPage.clickCHRTNeverBetterAgree());
        Assert.assertTrue("unable to clickCHRTNoFutureAgree", webAppLoginPage.clickCHRTNoFutureAgree());
        Assert.assertTrue("unable to clickCHRTNothingRightAgree", webAppLoginPage.clickCHRTNothingRightAgree());
        Assert.assertTrue("unable to clickCHRTEverythingWrongAgree", webAppLoginPage.clickCHRTEverythingWrongAgree());
        Assert.assertTrue("unable to clickNoOneDependOnAgree", webAppLoginPage.clickNoOneDependOnAgree());
        Assert.assertTrue("unable to clickAreGoneAgree", webAppLoginPage.clickAreGoneAgree());
        Assert.assertTrue("unable to clickSufferingAgree", webAppLoginPage.clickSufferingAgree());
        Assert.assertTrue("unable to clickNoReasonToLiveAgree", webAppLoginPage.clickNoReasonToLiveAgree());
        Assert.assertTrue("unable to clickGoToSleepAgree", webAppLoginPage.clickGoToSleepAgree());
        Assert.assertTrue("unable to clickKillingMyselfAgree", webAppLoginPage.clickKillingMyselfAgree());
        Assert.assertTrue("unable to clickHowToKillingMyselfAgree", webAppLoginPage.clickHowToKillingMyselfAgree());
        Assert.assertTrue("unable to clickPlanToKillingMyselfAgree", webAppLoginPage.clickPlanToKillingMyselfAgree());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I launch Webmail and capture {string}{string}")
    public void iLaunchWebmailAndCapture(String mailusername, String mailpassword) {
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);

//        amazonWebMailPage.opentabWebMail2();
        amazonWebMailPage.opentabWebMail();
        Assert.assertTrue("unable to captureWebMailUsername", amazonWebMailPage.captureWebMailUsername(mailusername));
        Assert.assertTrue("unable to captureWebMailPassword", amazonWebMailPage.captureWebMailPassword(mailpassword));
        Assert.assertTrue("unable to clickLogIn", amazonWebMailPage.clickLogIn());
        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} in searchbox and must retrieve the credentials")
    public void iCaptureInSearchboxAndMustRetrieveTheCredentials(String eDiaryLogin) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);

        Assert.assertTrue("unable to captureMailSearch", amazonWebMailPage.captureMailSearch(eDiaryLogin));
        Assert.assertTrue("unable to captureMailSearchBtn", amazonWebMailPage.captureMailSearchBtn());
        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to switchtoWebMailIFrame2", amazonWebMailPage.switchtoWebMailIFrame2());
//        Assert.assertTrue("unable to clickEdiaryLoginInfo", amazonWebMailPage.clickEdiaryLoginInfo());
        Assert.assertTrue("unable to clickEDiaryLogin", amazonWebMailPage.clickEDiaryLogin());
        Assert.assertTrue("unable to switchtoWebMaileDiaryIframe", amazonWebMailPage.switchtoWebMaileDiaryIframe());
        takeScreenShotNew(this.scenario);
        putValue("password", amazonWebMailPage.getPassword1());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickWebmailLogOutDownArrow", amazonWebMailPage.clickWebmailLogOutDownArrow());
        Assert.assertTrue("unable to clickWebmailLogOut", amazonWebMailPage.clickWebmailLogOut());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);


    }

    @And("I launch Webmail capturing {string}{string} {string} and check for GuestParticipant email Notification Call")
    public void iLaunchWebmailCapturingAndCheckForGuestParticipantEmailNotificationCall(String mailusername, String mailpassword, String videoCallScheduled) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab1();
        driver.close();
        callSchedulePage.switchToTab0();
        amazonWebMailPage.opentabWebMail();
        Assert.assertTrue("unable to captureWebMailUsername", amazonWebMailPage.captureWebMailUsername(mailusername));
        Assert.assertTrue("unable to captureWebMailPassword", amazonWebMailPage.captureWebMailPassword(mailpassword));
        Assert.assertTrue("unable to clickLogIn", amazonWebMailPage.clickLogIn());

        Assert.assertTrue("unable to captureMailSearch", amazonWebMailPage.captureMailSearch(videoCallScheduled));
        Assert.assertTrue("unable to captureMailSearchBtn", amazonWebMailPage.captureMailSearchBtn());
        Assert.assertTrue("unable to captureMailSearchOptionsBtn", amazonWebMailPage.captureMailSearchOptionsBtn());
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickVideoCallScheduled", amazonWebMailPage.clickVideoCallScheduled());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to switchtoWebMailVideoCallIframe", amazonWebMailPage.switchtoWebMailVideoCallIframe());
        takeScreenShotNew(this.scenario);
//        putValue("notfn", amazonWebMailPage.getwebmailVideoCallScheduled());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickWebmailLogOutDownArrow", amazonWebMailPage.clickWebmailLogOutDownArrow());
        Assert.assertTrue("unable to clickWebmailLogOut", amazonWebMailPage.clickWebmailLogOut());
        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and click AUDIT form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndClickAUDITFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String firstname, String visit, String visit1) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAUDIT());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());


        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit1));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
//        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit1));

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);

        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);


        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());

        takeScreenShotNew(this.scenario);

    }

    @And("I click CHRTSR form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iClickCHRTSRFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit1) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickFormsCHRTSR", subjectListPage.clickFormsCHRTSR());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit1));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
//        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit1));

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName14", subjectListAuditTrailPage.getVisitName14());
        ExtentCucumberAdapter.addTestStepLog("The VisitName14 is :" + getValue("VisitName14"));
        putValue("FormName14", subjectListAuditTrailPage.getFormName14());
        ExtentCucumberAdapter.addTestStepLog("The FormName14 is :" + getValue("FormName14"));
        putValue("FieldName14", subjectListAuditTrailPage.getFieldName14());
        ExtentCucumberAdapter.addTestStepLog("The FieldName14 is :" + getValue("FieldName14"));
        putValue("ModificationDate14", subjectListAuditTrailPage.getModificationDate14());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate14 is :" + getValue("ModificationDate14"));
        putValue("NewValue14", subjectListAuditTrailPage.getNewValue14());
        ExtentCucumberAdapter.addTestStepLog("The NewValue14 is :" + getValue("NewValue14"));
        putValue("DiaryVersion14", subjectListAuditTrailPage.geteDiaryVersion14());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion14 is :" + getValue("DiaryVersion14"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

    }

    @And("I click PHQ form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iClickPHQFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit1) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsPHQ());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit1));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
//        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit1));

        seleniumAdaptor.pauseFor(2);

        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and click AAA form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndClickAAAFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String firstname, String visit3, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit3));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAAA());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
//        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit1));

        seleniumAdaptor.pauseFor(2);

        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());

        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} click CHRTSR form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iCaptureClickCHRTSRFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit, String visit3) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsCHRTSR", subjectListPage.clickFormsCHRTSR());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit3));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName14", subjectListAuditTrailPage.getVisitName14());
        ExtentCucumberAdapter.addTestStepLog("The VisitName14 is :" + getValue("VisitName14"));
        putValue("FormName14", subjectListAuditTrailPage.getFormName14());
        ExtentCucumberAdapter.addTestStepLog("The FormName14 is :" + getValue("FormName14"));
        putValue("FieldName14", subjectListAuditTrailPage.getFieldName14());
        ExtentCucumberAdapter.addTestStepLog("The FieldName14 is :" + getValue("FieldName14"));
        putValue("ModificationDate14", subjectListAuditTrailPage.getModificationDate14());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate14 is :" + getValue("ModificationDate14"));
        putValue("NewValue14", subjectListAuditTrailPage.getNewValue14());
        ExtentCucumberAdapter.addTestStepLog("The NewValue14 is :" + getValue("NewValue14"));
        putValue("DiaryVersion14", subjectListAuditTrailPage.geteDiaryVersion14());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion14 is :" + getValue("DiaryVersion14"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} click PHQ form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iCaptureClickPHQFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit3, String visit) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit3));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsPHQ());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and click AAA form and click AuditFormTrial and search with {string} and fetch the records from table")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndClickAAAFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTable(String firstname, String visit3, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit3));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAAA());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
//        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit1));

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());

        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} click CPFQ form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iCaptureClickCPFQFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit3, String visit) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit3));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsCPFQ());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I capture {string} click GAD Seven form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iCaptureClickGADSevenFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsGAD7", subjectListPage.clickFormsGAD7());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I capture {string} click Insomnia Severity form and click AuditFormTrial and search with {string} and fetch the records from the table")
    public void iCaptureClickInsomniaSeverityFormAndClickAuditFormTrialAndSearchWithAndFetchTheRecordsFromTheTable(String visit, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsInsomniaSeverity", subjectListPage.clickFormsInsomniaSeverity());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

//        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
//        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
//        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
//        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
//        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
//        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
//        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
//        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
//        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
//        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
//        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
//        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} click PHQ form and click AuditFormTrial and search with {string} and must fetch the records from the table")
    public void iCaptureClickPHQFormAndClickAuditFormTrialAndSearchWithAndMustFetchTheRecordsFromTheTable(String visit, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsPHQ", subjectListPage.clickFormsPHQ());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);

        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I capture {string} click QLESQSF form and click AuditFormTrial and search with {string} and must fetch the records from the table")
    public void iCaptureClickQLESQSFFormAndClickAuditFormTrialAndSearchWithAndMustFetchTheRecordsFromTheTable(String visit, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsQLESQSF", subjectListPage.clickFormsQLESQSF());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName14", subjectListAuditTrailPage.getVisitName14());
        ExtentCucumberAdapter.addTestStepLog("The VisitName14 is :" + getValue("VisitName14"));
        putValue("FormName14", subjectListAuditTrailPage.getFormName14());
        ExtentCucumberAdapter.addTestStepLog("The FormName14 is :" + getValue("FormName14"));
        putValue("FieldName14", subjectListAuditTrailPage.getFieldName14());
        ExtentCucumberAdapter.addTestStepLog("The FieldName14 is :" + getValue("FieldName14"));
        putValue("ModificationDate14", subjectListAuditTrailPage.getModificationDate14());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate14 is :" + getValue("ModificationDate14"));
        putValue("NewValue14", subjectListAuditTrailPage.getNewValue14());
        ExtentCucumberAdapter.addTestStepLog("The NewValue14 is :" + getValue("NewValue14"));
        putValue("DiaryVersion14", subjectListAuditTrailPage.geteDiaryVersion14());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion14 is :" + getValue("DiaryVersion14"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName15", subjectListAuditTrailPage.getVisitName15());
        ExtentCucumberAdapter.addTestStepLog("The VisitName15 is :" + getValue("VisitName15"));
        putValue("FormName15", subjectListAuditTrailPage.getFormName15());
        ExtentCucumberAdapter.addTestStepLog("The FormName15 is :" + getValue("FormName15"));
        putValue("FieldName15", subjectListAuditTrailPage.getFieldName15());
        ExtentCucumberAdapter.addTestStepLog("The FieldName15 is :" + getValue("FieldName15"));
        putValue("ModificationDate15", subjectListAuditTrailPage.getModificationDate15());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate15 is :" + getValue("ModificationDate15"));
        putValue("NewValue15", subjectListAuditTrailPage.getNewValue15());
        ExtentCucumberAdapter.addTestStepLog("The NewValue15 is :" + getValue("NewValue13"));
        putValue("DiaryVersion15", subjectListAuditTrailPage.geteDiaryVersion15());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion15 is :" + getValue("DiaryVersion15"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName16", subjectListAuditTrailPage.getVisitName16());
        ExtentCucumberAdapter.addTestStepLog("The VisitName16 is :" + getValue("VisitName16"));
        putValue("FormName16", subjectListAuditTrailPage.getFormName16());
        ExtentCucumberAdapter.addTestStepLog("The FormName16 is :" + getValue("FormName16"));
        putValue("FieldName16", subjectListAuditTrailPage.getFieldName16());
        ExtentCucumberAdapter.addTestStepLog("The FieldName16 is :" + getValue("FieldName16"));
        putValue("ModificationDate16", subjectListAuditTrailPage.getModificationDate16());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate16 is :" + getValue("ModificationDate16"));
        putValue("NewValue16", subjectListAuditTrailPage.getNewValue16());
        ExtentCucumberAdapter.addTestStepLog("The NewValue16 is :" + getValue("NewValue16"));
        putValue("DiaryVersion16", subjectListAuditTrailPage.geteDiaryVersion16());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion16 is :" + getValue("DiaryVersion16"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName17", subjectListAuditTrailPage.getVisitName17());
        ExtentCucumberAdapter.addTestStepLog("The VisitName17 is :" + getValue("VisitName17"));
        putValue("FormName17", subjectListAuditTrailPage.getFormName17());
        ExtentCucumberAdapter.addTestStepLog("The FormName17 is :" + getValue("FormName17"));
        putValue("FieldName17", subjectListAuditTrailPage.getFieldName17());
        ExtentCucumberAdapter.addTestStepLog("The FieldName17 is :" + getValue("FieldName17"));
        putValue("ModificationDate17", subjectListAuditTrailPage.getModificationDate17());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate17 is :" + getValue("ModificationDate17"));
        putValue("NewValue17", subjectListAuditTrailPage.getNewValue17());
        ExtentCucumberAdapter.addTestStepLog("The NewValue17 is :" + getValue("NewValue17"));
        putValue("DiaryVersion17", subjectListAuditTrailPage.geteDiaryVersion17());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion17 is :" + getValue("DiaryVersion17"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} click QIDSSR form and click AuditFormTrial and search with {string} and must fetch the records from the table")
    public void iCaptureClickQIDSSRFormAndClickAuditFormTrialAndSearchWithAndMustFetchTheRecordsFromTheTable(String visit, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsQIDSSR", subjectListPage.clickFormsQIDSSR());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName14", subjectListAuditTrailPage.getVisitName14());
        ExtentCucumberAdapter.addTestStepLog("The VisitName14 is :" + getValue("VisitName14"));
        putValue("FormName14", subjectListAuditTrailPage.getFormName14());
        ExtentCucumberAdapter.addTestStepLog("The FormName14 is :" + getValue("FormName14"));
        putValue("FieldName14", subjectListAuditTrailPage.getFieldName14());
        ExtentCucumberAdapter.addTestStepLog("The FieldName14 is :" + getValue("FieldName14"));
        putValue("ModificationDate14", subjectListAuditTrailPage.getModificationDate14());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate14 is :" + getValue("ModificationDate14"));
        putValue("NewValue14", subjectListAuditTrailPage.getNewValue14());
        ExtentCucumberAdapter.addTestStepLog("The NewValue14 is :" + getValue("NewValue14"));
        putValue("DiaryVersion14", subjectListAuditTrailPage.geteDiaryVersion14());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion14 is :" + getValue("DiaryVersion14"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName15", subjectListAuditTrailPage.getVisitName15());
        ExtentCucumberAdapter.addTestStepLog("The VisitName15 is :" + getValue("VisitName15"));
        putValue("FormName15", subjectListAuditTrailPage.getFormName15());
        ExtentCucumberAdapter.addTestStepLog("The FormName15 is :" + getValue("FormName15"));
        putValue("FieldName15", subjectListAuditTrailPage.getFieldName15());
        ExtentCucumberAdapter.addTestStepLog("The FieldName15 is :" + getValue("FieldName15"));
        putValue("ModificationDate15", subjectListAuditTrailPage.getModificationDate15());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate15 is :" + getValue("ModificationDate15"));
        putValue("NewValue15", subjectListAuditTrailPage.getNewValue15());
        ExtentCucumberAdapter.addTestStepLog("The NewValue15 is :" + getValue("NewValue13"));
        putValue("DiaryVersion15", subjectListAuditTrailPage.geteDiaryVersion15());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion15 is :" + getValue("DiaryVersion15"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName16", subjectListAuditTrailPage.getVisitName16());
        ExtentCucumberAdapter.addTestStepLog("The VisitName16 is :" + getValue("VisitName16"));
        putValue("FormName16", subjectListAuditTrailPage.getFormName16());
        ExtentCucumberAdapter.addTestStepLog("The FormName16 is :" + getValue("FormName16"));
        putValue("FieldName16", subjectListAuditTrailPage.getFieldName16());
        ExtentCucumberAdapter.addTestStepLog("The FieldName16 is :" + getValue("FieldName16"));
        putValue("ModificationDate16", subjectListAuditTrailPage.getModificationDate16());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate16 is :" + getValue("ModificationDate16"));
        putValue("NewValue16", subjectListAuditTrailPage.getNewValue16());
        ExtentCucumberAdapter.addTestStepLog("The NewValue16 is :" + getValue("NewValue16"));
        putValue("DiaryVersion16", subjectListAuditTrailPage.geteDiaryVersion16());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion16 is :" + getValue("DiaryVersion16"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName17", subjectListAuditTrailPage.getVisitName17());
        ExtentCucumberAdapter.addTestStepLog("The VisitName17 is :" + getValue("VisitName17"));
        putValue("FormName17", subjectListAuditTrailPage.getFormName17());
        ExtentCucumberAdapter.addTestStepLog("The FormName17 is :" + getValue("FormName17"));
        putValue("FieldName17", subjectListAuditTrailPage.getFieldName17());
        ExtentCucumberAdapter.addTestStepLog("The FieldName17 is :" + getValue("FieldName17"));
        putValue("ModificationDate17", subjectListAuditTrailPage.getModificationDate17());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate17 is :" + getValue("ModificationDate17"));
        putValue("NewValue17", subjectListAuditTrailPage.getNewValue17());
        ExtentCucumberAdapter.addTestStepLog("The NewValue17 is :" + getValue("NewValue17"));
        putValue("DiaryVersion17", subjectListAuditTrailPage.geteDiaryVersion17());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion17 is :" + getValue("DiaryVersion17"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

    }

    @And("I capture {string} click SHAPS form and click AuditFormTrial and search with {string} and must fetch the records from the table")
    public void iCaptureClickSHAPSFormAndClickAuditFormTrialAndSearchWithAndMustFetchTheRecordsFromTheTable(String visit, String visit4) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        subjectListAuditTrailPage = new SubjectListAuditTrailPage(driver);

        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickFormsSHAPS", subjectListPage.clickFormsSHAPS());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureListSearch", subjectListPage.captureListSearch(visit4));
        Assert.assertTrue("unable to clickListSearch", subjectListPage.clickListSearch());
        seleniumAdaptor.pauseFor(2);


        takeScreenShotNew(this.scenario);
        putValue("VisitName1", subjectListAuditTrailPage.getVisitName1());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName1"));
        putValue("FormName1", subjectListAuditTrailPage.getFormName1());
        ExtentCucumberAdapter.addTestStepLog("The FormName1 is :" + getValue("FormName1"));
        putValue("FieldName1", subjectListAuditTrailPage.getFieldName1());
        ExtentCucumberAdapter.addTestStepLog("The FieldName1 is :" + getValue("FieldName1"));
        putValue("ModificationDate1", subjectListAuditTrailPage.getModificationDate1());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate1 is :" + getValue("ModificationDate1"));
        putValue("NewValue1", subjectListAuditTrailPage.getNewValue1());
        ExtentCucumberAdapter.addTestStepLog("The NewValue1 is :" + getValue("NewValue1"));
        putValue("DiaryVersion1", subjectListAuditTrailPage.geteDiaryVersion1());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion1 is :" + getValue("DiaryVersion1"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName2", subjectListAuditTrailPage.getVisitName2());
        ExtentCucumberAdapter.addTestStepLog("The VisitName2 is :" + getValue("VisitName2"));
        putValue("FormName2", subjectListAuditTrailPage.getFormName2());
        ExtentCucumberAdapter.addTestStepLog("The FormName2 is :" + getValue("FormName2"));
        putValue("FieldName2", subjectListAuditTrailPage.getFieldName2());
        ExtentCucumberAdapter.addTestStepLog("The FieldName2 is :" + getValue("FieldName2"));
        putValue("ModificationDate2", subjectListAuditTrailPage.getModificationDate2());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate2 is :" + getValue("ModificationDate2"));
        putValue("NewValue2", subjectListAuditTrailPage.getNewValue2());
        ExtentCucumberAdapter.addTestStepLog("The NewValue2 is :" + getValue("NewValue2"));
        putValue("DiaryVersion2", subjectListAuditTrailPage.geteDiaryVersion2());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion2 is :" + getValue("DiaryVersion2"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName3", subjectListAuditTrailPage.getVisitName3());
        ExtentCucumberAdapter.addTestStepLog("The VisitName3 is :" + getValue("VisitName3"));
        putValue("FormName3", subjectListAuditTrailPage.getFormName3());
        ExtentCucumberAdapter.addTestStepLog("The FormName3 is :" + getValue("FormName3"));
        putValue("FieldName3", subjectListAuditTrailPage.getFieldName3());
        ExtentCucumberAdapter.addTestStepLog("The FieldName3 is :" + getValue("FieldName3"));
        putValue("ModificationDate3", subjectListAuditTrailPage.getModificationDate3());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate3 is :" + getValue("ModificationDate3"));
        putValue("NewValue3", subjectListAuditTrailPage.getNewValue3());
        ExtentCucumberAdapter.addTestStepLog("The NewValue3 is :" + getValue("NewValue3"));
        putValue("DiaryVersion3", subjectListAuditTrailPage.geteDiaryVersion3());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion3 is :" + getValue("DiaryVersion3"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName4", subjectListAuditTrailPage.getVisitName4());
        ExtentCucumberAdapter.addTestStepLog("The VisitName4 is :" + getValue("VisitName4"));
        putValue("FormName4", subjectListAuditTrailPage.getFormName4());
        ExtentCucumberAdapter.addTestStepLog("The FormName4 is :" + getValue("FormName4"));
        putValue("FieldName4", subjectListAuditTrailPage.getFieldName4());
        ExtentCucumberAdapter.addTestStepLog("The FieldName4 is :" + getValue("FieldName4"));
        putValue("ModificationDate4", subjectListAuditTrailPage.getModificationDate4());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate4 is :" + getValue("ModificationDate4"));
        putValue("NewValue4", subjectListAuditTrailPage.getNewValue4());
        ExtentCucumberAdapter.addTestStepLog("The NewValue4 is :" + getValue("NewValue4"));
        putValue("DiaryVersion4", subjectListAuditTrailPage.geteDiaryVersion4());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion4 is :" + getValue("DiaryVersion4"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName5", subjectListAuditTrailPage.getVisitName5());
        ExtentCucumberAdapter.addTestStepLog("The VisitName5 is :" + getValue("VisitName5"));
        putValue("FormName5", subjectListAuditTrailPage.getFormName5());
        ExtentCucumberAdapter.addTestStepLog("The FormName5 is :" + getValue("FormName5"));
        putValue("FieldName5", subjectListAuditTrailPage.getFieldName5());
        ExtentCucumberAdapter.addTestStepLog("The FieldName5is :" + getValue("FieldName5"));
        putValue("ModificationDate5", subjectListAuditTrailPage.getModificationDate5());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate5 is :" + getValue("ModificationDate5"));
        putValue("NewValue5", subjectListAuditTrailPage.getNewValue5());
        ExtentCucumberAdapter.addTestStepLog("The NewValue5 is :" + getValue("NewValue5"));
        putValue("DiaryVersion5", subjectListAuditTrailPage.geteDiaryVersion5());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion5 is :" + getValue("DiaryVersion5"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName6", subjectListAuditTrailPage.getVisitName6());
        ExtentCucumberAdapter.addTestStepLog("The VisitName6is :" + getValue("VisitName6"));
        putValue("FormName6", subjectListAuditTrailPage.getFormName6());
        ExtentCucumberAdapter.addTestStepLog("The FormName6 is :" + getValue("FormName6"));
        putValue("FieldName6", subjectListAuditTrailPage.getFieldName6());
        ExtentCucumberAdapter.addTestStepLog("The FieldName6 is :" + getValue("FieldName6"));
        putValue("ModificationDate6", subjectListAuditTrailPage.getModificationDate6());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate6 is :" + getValue("ModificationDate6"));
        putValue("NewValue6", subjectListAuditTrailPage.getNewValue6());
        ExtentCucumberAdapter.addTestStepLog("The NewValue6 is :" + getValue("NewValue6"));
        putValue("DiaryVersion6", subjectListAuditTrailPage.geteDiaryVersion6());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion6 is :" + getValue("DiaryVersion6"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName7", subjectListAuditTrailPage.getVisitName7());
        ExtentCucumberAdapter.addTestStepLog("The VisitName7 is :" + getValue("VisitName7"));
        putValue("FormName7", subjectListAuditTrailPage.getFormName7());
        ExtentCucumberAdapter.addTestStepLog("The FormName7 is :" + getValue("FormName7"));
        putValue("FieldName7", subjectListAuditTrailPage.getFieldName7());
        ExtentCucumberAdapter.addTestStepLog("The FieldName7 is :" + getValue("FieldName7"));
        putValue("ModificationDate7", subjectListAuditTrailPage.getModificationDate7());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate7 is :" + getValue("ModificationDate7"));
        putValue("NewValue7", subjectListAuditTrailPage.getNewValue7());
        ExtentCucumberAdapter.addTestStepLog("The NewValue7 is :" + getValue("NewValue7"));
        putValue("DiaryVersion7", subjectListAuditTrailPage.geteDiaryVersion7());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion7 is :" + getValue("DiaryVersion7"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName8", subjectListAuditTrailPage.getVisitName8());
        ExtentCucumberAdapter.addTestStepLog("The VisitName8 is :" + getValue("VisitName8"));
        putValue("FormName8", subjectListAuditTrailPage.getFormName8());
        ExtentCucumberAdapter.addTestStepLog("The FormName8 is :" + getValue("FormName8"));
        putValue("FieldName8", subjectListAuditTrailPage.getFieldName8());
        ExtentCucumberAdapter.addTestStepLog("The FieldName8 is :" + getValue("FieldName8"));
        putValue("ModificationDate8", subjectListAuditTrailPage.getModificationDate8());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate8 is :" + getValue("ModificationDate8"));
        putValue("NewValue8", subjectListAuditTrailPage.getNewValue8());
        ExtentCucumberAdapter.addTestStepLog("The NewValue8 is :" + getValue("NewValue8"));
        putValue("DiaryVersion8", subjectListAuditTrailPage.geteDiaryVersion8());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion8 is :" + getValue("DiaryVersion8"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName9", subjectListAuditTrailPage.getVisitName9());
        ExtentCucumberAdapter.addTestStepLog("The VisitName9 is :" + getValue("VisitName9"));
        putValue("FormName9", subjectListAuditTrailPage.getFormName9());
        ExtentCucumberAdapter.addTestStepLog("The FormName9 is :" + getValue("FormName9"));
        putValue("FieldName9", subjectListAuditTrailPage.getFieldName9());
        ExtentCucumberAdapter.addTestStepLog("The FieldName9 is :" + getValue("FieldName9"));
        putValue("ModificationDate9", subjectListAuditTrailPage.getModificationDate9());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate9 is :" + getValue("ModificationDate9"));
        putValue("NewValue9", subjectListAuditTrailPage.getNewValue9());
        ExtentCucumberAdapter.addTestStepLog("The NewValue9 is :" + getValue("NewValue9"));
        putValue("DiaryVersion9", subjectListAuditTrailPage.geteDiaryVersion9());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion9 is :" + getValue("DiaryVersion9"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName10", subjectListAuditTrailPage.getVisitName10());
        ExtentCucumberAdapter.addTestStepLog("The VisitName1 is :" + getValue("VisitName10"));
        putValue("FormName10", subjectListAuditTrailPage.getFormName10());
        ExtentCucumberAdapter.addTestStepLog("The FormName10 is :" + getValue("FormName10"));
        putValue("FieldName10", subjectListAuditTrailPage.getFieldName10());
        ExtentCucumberAdapter.addTestStepLog("The FieldName10 is :" + getValue("FieldName10"));
        putValue("ModificationDate10", subjectListAuditTrailPage.getModificationDate10());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate10 is :" + getValue("ModificationDate10"));
        putValue("NewValue10", subjectListAuditTrailPage.getNewValue10());
        ExtentCucumberAdapter.addTestStepLog("The NewValue10 is :" + getValue("NewValue10"));
        putValue("DiaryVersion10", subjectListAuditTrailPage.geteDiaryVersion10());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion10 is :" + getValue("DiaryVersion10"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickArrowNextPage", subjectListAuditTrailPage.clickArrowNextPage());
        takeScreenShotNew(this.scenario);

        takeScreenShotNew(this.scenario);
        putValue("VisitName11", subjectListAuditTrailPage.getVisitName11());
        ExtentCucumberAdapter.addTestStepLog("The VisitName11 is :" + getValue("VisitName11"));
        putValue("FormName11", subjectListAuditTrailPage.getFormName11());
        ExtentCucumberAdapter.addTestStepLog("The FormName11 is :" + getValue("FormName11"));
        putValue("FieldName11", subjectListAuditTrailPage.getFieldName11());
        ExtentCucumberAdapter.addTestStepLog("The FieldName11 is :" + getValue("FieldName11"));
        putValue("ModificationDate11", subjectListAuditTrailPage.getModificationDate11());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate11 is :" + getValue("ModificationDate11"));
        putValue("NewValue11", subjectListAuditTrailPage.getNewValue11());
        ExtentCucumberAdapter.addTestStepLog("The NewValue11 is :" + getValue("NewValue11"));
        putValue("DiaryVersion11", subjectListAuditTrailPage.geteDiaryVersion11());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion11 is :" + getValue("DiaryVersion11"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName12", subjectListAuditTrailPage.getVisitName12());
        ExtentCucumberAdapter.addTestStepLog("The VisitName12 is :" + getValue("VisitName12"));
        putValue("FormName12", subjectListAuditTrailPage.getFormName12());
        ExtentCucumberAdapter.addTestStepLog("The FormName12 is :" + getValue("FormName12"));
        putValue("FieldName12", subjectListAuditTrailPage.getFieldName12());
        ExtentCucumberAdapter.addTestStepLog("The FieldName12 is :" + getValue("FieldName12"));
        putValue("ModificationDate12", subjectListAuditTrailPage.getModificationDate12());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate12 is :" + getValue("ModificationDate12"));
        putValue("NewValue12", subjectListAuditTrailPage.getNewValue12());
        ExtentCucumberAdapter.addTestStepLog("The NewValue12 is :" + getValue("NewValue12"));
        putValue("DiaryVersion12", subjectListAuditTrailPage.geteDiaryVersion12());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion12 is :" + getValue("DiaryVersion12"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName13", subjectListAuditTrailPage.getVisitName13());
        ExtentCucumberAdapter.addTestStepLog("The VisitName13 is :" + getValue("VisitName13"));
        putValue("FormName13", subjectListAuditTrailPage.getFormName13());
        ExtentCucumberAdapter.addTestStepLog("The FormName13 is :" + getValue("FormName13"));
        putValue("FieldName13", subjectListAuditTrailPage.getFieldName13());
        ExtentCucumberAdapter.addTestStepLog("The FieldName13 is :" + getValue("FieldName13"));
        putValue("ModificationDate13", subjectListAuditTrailPage.getModificationDate13());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate13 is :" + getValue("ModificationDate13"));
        putValue("NewValue13", subjectListAuditTrailPage.getNewValue13());
        ExtentCucumberAdapter.addTestStepLog("The NewValue13 is :" + getValue("NewValue13"));
        putValue("DiaryVersion13", subjectListAuditTrailPage.geteDiaryVersion13());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion13 is :" + getValue("DiaryVersion13"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName14", subjectListAuditTrailPage.getVisitName14());
        ExtentCucumberAdapter.addTestStepLog("The VisitName14 is :" + getValue("VisitName14"));
        putValue("FormName14", subjectListAuditTrailPage.getFormName14());
        ExtentCucumberAdapter.addTestStepLog("The FormName14 is :" + getValue("FormName14"));
        putValue("FieldName14", subjectListAuditTrailPage.getFieldName14());
        ExtentCucumberAdapter.addTestStepLog("The FieldName14 is :" + getValue("FieldName14"));
        putValue("ModificationDate14", subjectListAuditTrailPage.getModificationDate14());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate14 is :" + getValue("ModificationDate14"));
        putValue("NewValue14", subjectListAuditTrailPage.getNewValue14());
        ExtentCucumberAdapter.addTestStepLog("The NewValue14 is :" + getValue("NewValue14"));
        putValue("DiaryVersion14", subjectListAuditTrailPage.geteDiaryVersion14());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion14 is :" + getValue("DiaryVersion14"));

        takeScreenShotNew(this.scenario);
        putValue("VisitName15", subjectListAuditTrailPage.getVisitName15());
        ExtentCucumberAdapter.addTestStepLog("The VisitName15 is :" + getValue("VisitName15"));
        putValue("FormName15", subjectListAuditTrailPage.getFormName15());
        ExtentCucumberAdapter.addTestStepLog("The FormName15 is :" + getValue("FormName15"));
        putValue("FieldName15", subjectListAuditTrailPage.getFieldName15());
        ExtentCucumberAdapter.addTestStepLog("The FieldName15 is :" + getValue("FieldName15"));
        putValue("ModificationDate15", subjectListAuditTrailPage.getModificationDate15());
        ExtentCucumberAdapter.addTestStepLog("The ModificationDate15 is :" + getValue("ModificationDate15"));
        putValue("NewValue15", subjectListAuditTrailPage.getNewValue15());
        ExtentCucumberAdapter.addTestStepLog("The NewValue15 is :" + getValue("NewValue13"));
        putValue("DiaryVersion15", subjectListAuditTrailPage.geteDiaryVersion15());
        ExtentCucumberAdapter.addTestStepLog("The DiaryVersion15 is :" + getValue("DiaryVersion15"));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch Screening meeting")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchScreeningMeeting(String ScheduleCallsubject) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickScreeningMeetingJconnect", callSchedulePage.clickScreeningMeetingJconnect());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();


    }

    @And("I launch JConnect WebApp with {string}{string} password and join the Screening meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndJoinTheScreeningMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {

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
        Assert.assertTrue("unable to clickWebAppScreeningmeeting2", webAppLoginPage.clickWebAppScreeningmeeting2());
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


        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);


//        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
//
//        seleniumAdaptor.pauseFor(2);
//        takeScreenShotNew(this.scenario);
//        driver.close();
//        callSchedulePage.switchToTab0();
//
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
//        seleniumAdaptor.pauseFor(5);
//        driver.close();
//
//        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab0();


    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch WeekOneBaseline meeting")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchWeekOneBaselineMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        driver.close();

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickWeekOneBaseLineMeetingJconnect", callSchedulePage.clickWeekOneBaseLineMeetingJconnect());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();


    }

    @And("I launch JConnect WebApp with {string}{string} password and join the WeekOneBaseline meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndJoinTheWeekOneBaselineMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
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
        Assert.assertTrue("unable to clickWebAppWeekOneBaseLinemeeting", webAppLoginPage.clickWebAppWeekOneBaseLinemeeting1());
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


        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch WeekOne meeting")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchWeekOneMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabJconnectReal1();
        Assert.assertTrue("unable to clickJConnectBuild", jCollaborateWelcomePage.clickJConnectBuild());
        seleniumAdaptor.pauseFor(2);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();

        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickWeekOneMeetingJconnect", callSchedulePage.clickWeekOneMeetingJconnect());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();


    }

    @And("I launch JConnect WebApp with {string}{string} password and join the WeekOne meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndJoinTheWeekOneMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
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
        Assert.assertTrue("unable to clickWebAppWeekOnemeeting1", webAppLoginPage.clickWebAppWeekOnemeeting1());
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

        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);


//        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
//        seleniumAdaptor.pauseFor(2);
//        takeScreenShotNew(this.scenario);
//        driver.close();
//        callSchedulePage.switchToTab0();
//
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
//        seleniumAdaptor.pauseFor(5);
//        driver.close();
//
//        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab0();
////        callSchedulePage.switchToTab2();

    }

    @And("I launch JConnect and capture {string}{string} and must click Signin")
    public void iLaunchJConnectAndCaptureAndMustClickSignin(String username, String password) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        callSchedulePage = new CallSchedulePage(driver);

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
        seleniumAdaptor.pauseFor(2);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();


    }

    @And("I must navigate to ScheduleInfo section and must capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustNavigateToScheduleInfoSectionAndMustCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs1", callSchedulePage.captureTimeHrs1(timehours));
        Assert.assertTrue("unable to captureTimeMins1", callSchedulePage.captureTimeMins1(timemins));
        Assert.assertTrue("unable to captureTimetype1", callSchedulePage.captureTimetype1(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs2", callSchedulePage.captureCallDurationHrs2(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins2", callSchedulePage.captureCallDurationMins2(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert2", callSchedulePage.captureAlert2(alert));
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

    @And("I must be able to navigate to the ScheduleInfo section and should capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustBeAbleToNavigateToTheScheduleInfoSectionAndShouldCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs", callSchedulePage.captureTimeHrs(timehours));
        Assert.assertTrue("unable to captureTimeMins", callSchedulePage.captureTimeMins(timemins));
        Assert.assertTrue("unable to captureTimetype", callSchedulePage.captureTimetype(timetype));

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
        seleniumAdaptor.pauseFor(2);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//


    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch Unscheduled meeting")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchUnscheduledMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
//        driver.close();
//        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        amazonWebMailPage.opentabJconnectReal1();
        Assert.assertTrue("unable to clickJConnectBuild", jCollaborateWelcomePage.clickJConnectBuild());
        seleniumAdaptor.pauseFor(2);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();

        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickUnscheduledMeetingJconnect", callSchedulePage.clickUnscheduledMeetingJconnect());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();


    }

    @And("I launch JConnect WebApp with {string}{string} password and join the Unscheduled meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndJoinTheUnscheduledMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
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
        Assert.assertTrue("unable to clickWebAppUnscheduledmeeting1", webAppLoginPage.clickWebAppUnscheduledmeeting1());
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


        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);


//        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
//        seleniumAdaptor.pauseFor(2);
//        takeScreenShotNew(this.scenario);
//        driver.close();
//        callSchedulePage.switchToTab0();
//
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());
//        seleniumAdaptor.pauseFor(5);
//        driver.close();
//
//        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab2();

    }

    @And("I launch JConnect WebApp with {string}{string} password and must join the meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndMustJoinTheMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        callSchedulePage = new CallSchedulePage(driver);

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
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(3);
//        Assert.assertTrue("unable to clickEndCallWebApp1", webAppLoginPage.clickEndCallWebApp1());
        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);

//        callSchedulePage.switchToTab2();


    }

    @And("I launch JConnect WebApp with {string}{string} password and must join the Safer meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndMustJoinTheSaferMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
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


        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);


    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and click Action and Print PDF and check the records")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndClickActionAndPrintPDFAndCheckTheRecords(String firstname, String visit) throws IOException, InterruptedException {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        pDFReaderPage = new PDFReaderPage(driver);
        excelUtilTest = new ExcelUtilTest(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAUDIT());
//        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());
//        Assert.assertTrue("unable to clickExport", subjectListPage.clickExport());
//        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        Assert.assertTrue("unable to clickAction()", subjectListPage.clickAction());
        Assert.assertTrue("unable to clickPrint()", subjectListPage.clickPrint());
//        driver.close();
        callSchedulePage.switchToTab1();

//        putValue("udfURL", pDFReaderPage.getCurrentURL());
//        pDFReaderPage.launchURL(getValue("udfURL"));

        pDFReaderPage.readPDF();
        putValue("pdfcontent", pDFReaderPage.readPDF());
//        pDFReaderPage.ScrollPDF();
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        ExtentCucumberAdapter.addTestStepLog("The Full PDF Content is " + getValue("pdfcontent"));
        seleniumAdaptor.pauseFor(3);

        takeScreenShotNew(this.scenario);
//        pDFReaderPage.ScrollPDF();
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(3);

//        excelUtilTest.XLreal();
        putValue("xl", excelUtilTest.XLreal());
//        putValue("xl", excelUtilTest.Xl());
        ExtentCucumberAdapter.addTestStepLog("The Full Xl Content is " + getValue("xl"));


    }

    @And("I navigate to Subject List and enter {string} and fetch the record with {string}{string}")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordWith(String firstname, String subject1, String date) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        pDFReaderPage = new PDFReaderPage(driver);
        excelUtilTest = new ExcelUtilTest(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);

//        excelUtilTest.Xldata1(subject1, date);
//        excelUtilTest.Exceldatadate(subject1, date);
//        putValue("xl", excelUtilTest.Exceldatadate(subject1, date));
        ExtentCucumberAdapter.addTestStepLog("The Full Xl Content is " + getValue("xl"));
    }

    @And("I navigate to Subject List and enter {string} and fetch the record with {string}{string}{string}")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordWith(String firstname, String subject1, String date, String forms) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        pDFReaderPage = new PDFReaderPage(driver);
        excelUtilTest = new ExcelUtilTest(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);

//        excelUtilTest.Xldata1(subject1, date, forms);
//        putValue("xl", excelUtilTest.Xldata1(subject1, date, forms));
//        ExtentCucumberAdapter.addTestStepLog("The Full Xl Content is " + getValue("xl"));
//        excelUtilTest.Exceldatadate(subject1, date);


        putValue("xl", excelUtilTest.Exceldatadate5(subject1, date, forms));
        ExtentCucumberAdapter.addTestStepLog("The Full Xl Content is " + getValue("xl"));
    }

    @And("I launch CRIO website and capture {string}{string} and click Signin")
    public void iLaunchCRIOWebsiteAndCaptureAndClickSignin(String emailCRIO, String passwordCRIO) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);

        takeScreenShotNew(this.scenario);

        cRIOLoginPage.opentabCRIO();
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to captureEmailCRIO", cRIOLoginPage.captureEmailCRIO(emailCRIO));
        Assert.assertTrue("unable to clickNextCRIO", cRIOLoginPage.clickNextCRIO());
        Assert.assertTrue("unable to capturePasswordCRIO", cRIOLoginPage.capturePasswordCRIO(passwordCRIO));
        Assert.assertTrue("unable to clickSignInCRIO", cRIOLoginPage.clickSignInCRIO());

        takeScreenShotNew(this.scenario);


    }

    @And("I click on Subjects section and Add NewSubject and capture {string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnSubjectsSectionAndAddNewSubjectAndCapture(String study, String firstname, String gender, String dob, String lastname, String subID, String randomID) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        putValue("EDiaryVersionDesc", subjectCreatePage.getEDiaryVersion());
//        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Description in JConnect is " + getValue("EDiaryVersionDesc"));
//        putValue("EDiaryVersionNum", subjectCreatePage.getEDiaryVersionNum());
//        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Number in JConnect is " + getValue("EDiaryVersionNum"));

        Assert.assertTrue("unable to clickStudies", cRIOSubjectCreationPage.clickStudies());
        Assert.assertTrue("unable to clickALTOSafer", cRIOSubjectCreationPage.clickALTOSafer());
        Assert.assertTrue("unable to clickSubjects", cRIOSubjectCreationPage.clickSubjects());
        Assert.assertTrue("unable to clickAddNewSubject", cRIOSubjectCreationPage.clickAddNewSubject());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureStudyCRIO", cRIOSubjectCreationPage.captureStudyCRIO(study));
        Assert.assertTrue("unable to captureFirstNameCRIO", cRIOSubjectCreationPage.captureFirstNameCRIO(firstname));
        Assert.assertTrue("unable to captureGender", cRIOSubjectCreationPage.captureGender(gender));
        Assert.assertTrue("unable to captureDOBCRIO", cRIOSubjectCreationPage.captureDOBCRIO(dob));
        Assert.assertTrue("unable to captureLastNameCRIO", cRIOSubjectCreationPage.captureLastNameCRIO(lastname));
        Assert.assertTrue("unable to captureSubjectIDCRIO", cRIOSubjectCreationPage.captureSubjectIDCRIO(subID));
        Assert.assertTrue("unable to captureRandomisationCRIO", cRIOSubjectCreationPage.captureRandomisationCRIO(randomID));
        Assert.assertTrue("unable to captureUserName", cRIOSubjectCreationPage.clickSaveSubjectCRIO());

        seleniumAdaptor.pauseFor(4);
        takeScreenShotNew(this.scenario);
        putValue("subSuccessCRIO", cRIOSubjectCreationPage.getSubjectCreatedDescription());
        validate("Subject Added Successfully", cRIOSubjectCreationPage.getSubjectCreatedDescription());
        ExtentCucumberAdapter.addTestStepLog("The Subject Creation Description in CRIO is  " + getValue("subSuccessCRIO"));
        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab0();

//        Assert.assertTrue("unable to clickSubjects", cRIOSubjectCreationPage.clickSubjects());
//        Assert.assertTrue("unable to captureSubjectSearch", cRIOSubjectListPage.captureSubjectSearch("AA367"));
////        Assert.assertTrue("unable to clickSubjectListSearch", cRIOSubjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickNameListCRIO", cRIOSubjectListPage.clickNameListCRIO());
//
//        seleniumAdaptor.pauseFor(2);
//        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
//        seleniumAction.scrollBy("0", "1400");
//
//        Assert.assertTrue("unable to clickNameListCRIO", cRIOVisitSchedulePage.clickScheduleVisitWeek1Screening());
//        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
//        seleniumAction.scrollBy("0", "1400");
//
//        takeScreenShotNew(this.scenario);
////        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
////        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to clickTimeSelectCRIO", cRIOVisitSchedulePage.clickTimeSelectCRIO2());
//        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime("6:30PM"));
//        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime("6:45PM"));
//        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());
//        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
//        seleniumAction.scrollBy("0", "1400");
//        takeScreenShotNew(this.scenario);
    }

    @And("I navigate toJConnect and click on Subject and CreateSubject Option and capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iNavigateToJConnectAndClickOnSubjectAndCreateSubjectOptionAndCapture(String firstname, String lastname, String site, String subNum, String subExtID, String phoneCode, String phoneNum, String email, String role, String startDate, String language) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);

//        Assert.assertTrue("unable to clickJconnectWidget", subjectCreatePage.clickJconnectWidget());
        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab0();

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
        Assert.assertTrue("unable to captureSubjectNumMRN", subjectCreatePage.captureSubjectExtID(getValue("ExtID")));
//        Assert.assertTrue("unable to captureSubjectExtID", subjectCreatePage.captureSubjectExtID(subExtID));
        Assert.assertTrue("unable to capturePhoneNumCode", subjectCreatePage.capturePhoneNumCode(phoneCode));
        Assert.assertTrue("unable to captureUserName", subjectCreatePage.capturePhoneNum(phoneNum));
        Assert.assertTrue("unable to capturePhoneNum", subjectCreatePage.captureEmail(email));
        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole(role));
        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail(email));
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

    @And("I navigate to CRIO website and Subject List and must enter {string} and fetch the record")
    public void iNavigateToCRIOWebsiteAndSubjectListAndMustEnterAndFetchTheRecord(String subNum) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickSubjects", cRIOSubjectCreationPage.clickSubjects());
        Assert.assertTrue("unable to captureSubjectSearch", cRIOSubjectListPage.captureSubjectSearch(subNum));

        Assert.assertTrue("unable to clickNameListCRIO", cRIOSubjectListPage.clickNameListCRIO());

//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "300");

        takeScreenShotNew(this.scenario);
    }


    @And("I select ScheduleVisitWeekOneScreening and select the date and capture {string}{string}")
    public void iSelectScheduleVisitWeekOneScreeningAndSelectTheDateAndCapture(String visitFromTime, String visitToTime) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickNameListCRIO", cRIOVisitSchedulePage.clickScheduleVisitWeek1Screening());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "1400");

        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO", cRIOVisitSchedulePage.clickTimeSelectCRIO2());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
    }

    @And("I click on Subjects section and must Add NewSubject and capture {string}{string}{string}{string}{string}{string}")
    public void iClickOnSubjectsSectionAndMustAddNewSubjectAndCapture(String firstname, String gender, String dob, String lastname, String subID, String randomID) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        putValue("EDiaryVersionDesc", subjectCreatePage.getEDiaryVersion());
//        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Description in JConnect is " + getValue("EDiaryVersionDesc"));
//        putValue("EDiaryVersionNum", subjectCreatePage.getEDiaryVersionNum());
//        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Number in JConnect is " + getValue("EDiaryVersionNum"));

        Assert.assertTrue("unable to clickStudies", cRIOSubjectCreationPage.clickStudies());
        Assert.assertTrue("unable to clickALTOSafer", cRIOSubjectCreationPage.clickALTOSafer());
        Assert.assertTrue("unable to clickSubjects1", cRIOSubjectCreationPage.clickSubjects1());
        Assert.assertTrue("unable to clickAddNewSubject", cRIOSubjectCreationPage.clickAddNewSubject());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureStudyCRIO", cRIOSubjectCreationPage.captureStudyCRIO(study));
        Assert.assertTrue("unable to captureFirstNameCRIO", cRIOSubjectCreationPage.captureFirstNameCRIO(firstname));
        Assert.assertTrue("unable to captureGender", cRIOSubjectCreationPage.captureGender(gender));
        Assert.assertTrue("unable to captureDOBCRIO", cRIOSubjectCreationPage.captureDOBCRIO(dob));
        Assert.assertTrue("unable to captureLastNameCRIO", cRIOSubjectCreationPage.captureLastNameCRIO(lastname));
        Assert.assertTrue("unable to captureSubjectIDCRIO", cRIOSubjectCreationPage.captureSubjectIDCRIO(subID));
        Assert.assertTrue("unable to captureRandomisationCRIO", cRIOSubjectCreationPage.captureRandomisationCRIO(randomID));
        Assert.assertTrue("unable to captureUserName", cRIOSubjectCreationPage.clickSaveSubjectCRIO());

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
        putValue("subSuccessCRIO", cRIOSubjectCreationPage.getSubjectCreatedDescription());
        validate("Subject Added Successfully", cRIOSubjectCreationPage.getSubjectCreatedDescription());
        ExtentCucumberAdapter.addTestStepLog("The Subject Creation Description in CRIO is  " + getValue("subSuccessCRIO"));
        takeScreenShotNew(this.scenario);

//callSchedulePage.switchToTab0();


    }

    @And("I navigate to CRIO website and Subject List and must enter {string} and fetch the record and retrieve the External ID")
    public void iNavigateToCRIOWebsiteAndSubjectListAndMustEnterAndFetchTheRecordAndRetrieveTheExternalID(String subNum) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickSubjects", cRIOSubjectCreationPage.clickSubjects());
        Assert.assertTrue("unable to captureSubjectSearch", cRIOSubjectListPage.captureSubjectSearch(subNum));

        Assert.assertTrue("unable to clickNameListCRIO", cRIOSubjectListPage.clickNameListCRIO());

//        seleniumAdaptor.pauseFor(2);
//        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "200");
//        seleniumAction.scrollBy("0", "1400");

//        cRIOSubjectListPage.getRandomisationID2();


        putValue("ExtID", cRIOSubjectListPage.getRandomisationID4());
        ExtentCucumberAdapter.addTestStepLog("The RandomisationID in CRIO is " + getValue("ExtID"));
        takeScreenShotNew(this.scenario);
    }


    @And("I select ScheduleVisitICF and select the date and capture {string}{string}")
    public void iSelectScheduleVisitICFAndSelectTheDateAndCapture(String visitFromTime, String visitToTime) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickScheduleVisit", cRIOVisitSchedulePage.clickScheduleVisit());
        seleniumAdaptor.pauseFor(1);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
        Assert.assertTrue("unable to clickMore", cRIOVisitSchedulePage.clickMore());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickAdminUsha", cRIOVisitSchedulePage.clickAdminUsha());
//        Assert.assertTrue("unable to clickInvJoshna", cRIOVisitSchedulePage.clickInvJoshna());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO", cRIOVisitSchedulePage.clickTimeSelectCRIO2());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
    }

    @And("I launch the JConnect WebApp and must capture {string}{string}\"password and login and click Savebuton for TimeZone")
    public void iLaunchTheJConnectWebAppAndMustCapturePasswordAndLoginAndClickSavebutonForTimeZone(String phoneCode, String phoneNum) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//       webAppLoginPage.opentabJconnectWebApp();
        webAppLoginPage.opentabJconnectWebApp1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
//        seleniumAdaptor.pauseFor(10);

    }


    @And("I navigate to Jconnect CallSchedule and capture {string} and launch the ICF meeting")
    public void iNavigateToJconnectCallScheduleAndCaptureAndLaunchTheICFMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab2();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        driver.close();
//        driver.close();
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickCalendarICFmeeting", callSchedulePage.clickCalendarICFmeeting());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);


    }


    @And("I launch the JConnect WebApp and check the Login screen and capture {string}{string}\"password and login")
    public void iLaunchTheJConnectWebAppAndCheckTheLoginScreenAndCapturePasswordAndLogin(String phoneCode, String phoneNum) throws Throwable {

        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        webAppLoginPage.opentabJconnectWebApp();

        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(3);
        putValue("phonenumdesc", webAppLoginPage.getPhoneNumText());
        validate("", webAppLoginPage.getPhoneNumText());
        ExtentCucumberAdapter.addTestStepLog("The Phone Number field Description in WebApp is  " + getValue("phonenumdesc"));

        putValue("passworddesc", webAppLoginPage.getPasswordText());
        validate("", webAppLoginPage.getPasswordText());
        ExtentCucumberAdapter.addTestStepLog("The Password field Description in WebApp is  " + getValue("passworddesc"));


        putValue("logindesc", webAppLoginPage.getLoginText());
        validate("Login", webAppLoginPage.getLoginText());
        ExtentCucumberAdapter.addTestStepLog("The Login button Description in WebApp is  " + getValue("logindesc"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
//        seleniumAdaptor.pauseFor(10);

    }


    @And("I launch Webmail and must capture {string}{string}")
    public void iLaunchWebmailAndMustCapture(String mailusername, String mailpassword) {
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);

        amazonWebMailPage.opentabWebMail2();
        Assert.assertTrue("unable to captureWebMailUsername", amazonWebMailPage.captureWebMailUsername(mailusername));
        Assert.assertTrue("unable to captureWebMailPassword", amazonWebMailPage.captureWebMailPassword(mailpassword));
        Assert.assertTrue("unable to clickLogIn", amazonWebMailPage.clickLogIn());
        takeScreenShotNew(this.scenario);

    }

    @And("I check the different TimeZones and select {string} and save")
    public void iCheckTheDifferentTimeZonesAndSelectAndSave(String WebAppTimeZone) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);


        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSelectTimeZone());

        seleniumAdaptor.pauseFor(1);

        putValue("CentralTime", webAppLoginPage.getCentralTime());
        validate("(GMT-06:00) Central Time (US & Canada)", webAppLoginPage.getCentralTime());
        ExtentCucumberAdapter.addTestStepLog("The CentralTime in WebApp WebApp is  " + getValue("CentralTime"));

        putValue("pacificTime", webAppLoginPage.getpacificTime());
        validate("(GMT-08:00) Pacific Time (US & Canada)", webAppLoginPage.getpacificTime());
        ExtentCucumberAdapter.addTestStepLog("The pacificTime in WebApp is  " + getValue("pacificTime"));


        putValue("easternTime", webAppLoginPage.geteasternTime());
        validate("(GMT-05:00) Eastern Time (US & Canada)", webAppLoginPage.geteasternTime());
        ExtentCucumberAdapter.addTestStepLog("The easternTime in WebApp is  " + getValue("easternTime"));

        putValue("indianTime", webAppLoginPage.getindianTime());
        validate("(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi", webAppLoginPage.getindianTime());
        ExtentCucumberAdapter.addTestStepLog("The indianTime in WebApp is   " + getValue("indianTime"));

        putValue("MountainTime", webAppLoginPage.getMountainTime());
        validate("(GMT-07:00) Mountain Time (US & Canada)", webAppLoginPage.getMountainTime());
        ExtentCucumberAdapter.addTestStepLog("The MountainTime in WebApp is  " + getValue("MountainTime"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to captureTimeZoneWebApp", webAppLoginPage.captureTimeZoneWebApp(WebAppTimeZone));
        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
//        seleniumAdaptor.pauseFor(10);

    }

    @And("I navigate to JConnect")
    public void iNavigateToJConnect() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        callSchedulePage = new CallSchedulePage(driver);

        takeScreenShotNew(this.scenario);

        callSchedulePage.switchToTab0();
//        callSchedulePage.switchToTab1();
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
    }


    @And("I must check the available forms")
    public void iMustCheckTheAvailableForms() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);


        putValue("PHQ", webAppLoginPage.getFormNamePHQ());
        validate("PHQ-9", webAppLoginPage.getFormNamePHQ());
        ExtentCucumberAdapter.addTestStepLog("The form Name1 Description in WebApp is " + getValue("PHQ"));

        putValue("AUDIT", webAppLoginPage.getformNameAUDIT());
        validate("AUDIT", webAppLoginPage.getformNameAUDIT());
        ExtentCucumberAdapter.addTestStepLog("The form Name2 Description in WebApp is  " + getValue("AUDIT"));


        putValue("CHRTSR", webAppLoginPage.getFormNameCHRTSR());
        validate("CHRT-SR12", webAppLoginPage.getFormNameCHRTSR());
        ExtentCucumberAdapter.addTestStepLog("The form Name3 Description in WebApp is  " + getValue("CHRTSR"));

    }

    @And("I navigate to Calls Section and check the Upcoming and Past Calls")
    public void iNavigateToCallsSectionAndCheckTheUpcomingAndPastCalls() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(1);

        putValue("ICFtxt", webAppLoginPage.gettxtICF());
        validate("ICF", webAppLoginPage.gettxtICF());
        ExtentCucumberAdapter.addTestStepLog("The ICF call description in WebApp is  " + getValue("ICFtxt"));

        putValue("Screening", webAppLoginPage.gettxtScreening1());
        validate("Screening", webAppLoginPage.gettxtScreening1());
        ExtentCucumberAdapter.addTestStepLog("The ICF call description in WebApp is  " + getValue("Screening"));

        putValue("UpcomingCalls", webAppLoginPage.gettxtUpcomingCalls());
        validate("", webAppLoginPage.gettxtUpcomingCalls());
        ExtentCucumberAdapter.addTestStepLog("The UpcomingCalls description in WebApp is  " + getValue("UpcomingCalls"));

        Assert.assertTrue("unable to clickPastCalls", webAppLoginPage.clickPastCalls());
        putValue("PastCalls", webAppLoginPage.gettxtPastCalls());
        validate("Past Calls", webAppLoginPage.gettxtPastCalls());
        ExtentCucumberAdapter.addTestStepLog("The PastCalls description in WebApp is  " + getValue("PastCalls"));



        putValue("NoPastCalls", webAppLoginPage.gettxtNoPastCalls());
        validate("There are no past calls.", webAppLoginPage.gettxtNoPastCalls());
        ExtentCucumberAdapter.addTestStepLog("The PastCalls description in WebApp is  " + getValue("NoPastCalls"));

        takeScreenShotNew(this.scenario);
    }


    @And("I check the Chat Section")
    public void iCheckTheChatSection() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickChat", webAppLoginPage.clickChat());
        seleniumAdaptor.pauseFor(1);

        putValue("Chattxt", webAppLoginPage.gettxtChat());
        validate("No chats to display.", webAppLoginPage.gettxtChat());
        ExtentCucumberAdapter.addTestStepLog("The Chat description in WebApp is  " + getValue("Chattxt"));
        takeScreenShotNew(this.scenario);


    }

    @And("I click on AddParticipants Icon")
    public void iClickOnAddParticipantsIcon() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickChat", webAppLoginPage.clickChat());
//        Assert.assertTrue("unable to clickAddParticipants", webAppLoginPage.clickAddParticipants());
        Assert.assertTrue("unable to clickAddParticipants1", webAppLoginPage.clickAddParticipants1());
        seleniumAdaptor.pauseFor(1);

        putValue("SearchParticipantstxt", webAppLoginPage.gettxtSearchParticipants());
        validate("", webAppLoginPage.gettxtSearchParticipants());
        ExtentCucumberAdapter.addTestStepLog("The SearchParticipantstxt field text in WebApp is  " + getValue("SearchParticipantstxt"));
        takeScreenShotNew(this.scenario);

        putValue("DoneParticipants", webAppLoginPage.gettxtDoneParticipants());
        validate("Done", webAppLoginPage.gettxtDoneParticipants());
        ExtentCucumberAdapter.addTestStepLog("The DoneParticipants button text in WebApp is  " + getValue("Done"));
        takeScreenShotNew(this.scenario);


        putValue("ParticipantName", webAppLoginPage.gettxtParticipantName());
        validate("Dan nick", webAppLoginPage.gettxtParticipantName());
        ExtentCucumberAdapter.addTestStepLog("The ParticipantName in the ChatList in WebApp is  " + getValue("ParticipantName"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickBack3", webAppLoginPage.clickBack3());
        takeScreenShotNew(this.scenario);
    }

    @And("I click on More section and check the options")
    public void iClickOnMoreSectionAndCheckTheOptions() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);

        putValue("More", webAppLoginPage.gettxtMore1());
        validate("More", webAppLoginPage.gettxtMore1());
        ExtentCucumberAdapter.addTestStepLog("The More section text in WebApp is  " + getValue("More"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());
        seleniumAdaptor.pauseFor(1);

        putValue("Notifications", webAppLoginPage.gettxtNotifications());
        validate("Notifications", webAppLoginPage.gettxtNotifications());
        ExtentCucumberAdapter.addTestStepLog("The Notifications text in WebApp is  " + getValue("Notifications"));
        takeScreenShotNew(this.scenario);


        putValue("TimeZone", webAppLoginPage.gettxtTimeZone());
        validate("Timezone", webAppLoginPage.gettxtTimeZone());
        ExtentCucumberAdapter.addTestStepLog("The TimeZone Description in  WebApp is  " + getValue("Timezone"));
        takeScreenShotNew(this.scenario);


        putValue("Contact", webAppLoginPage.gettxtContact());
        validate("Contact", webAppLoginPage.gettxtContact());
        ExtentCucumberAdapter.addTestStepLog("The Contact Description in WebApp is  " + getValue("Contact"));
        takeScreenShotNew(this.scenario);


        putValue("MyProfile", webAppLoginPage.gettxtMyProfile());
        validate("My Profile", webAppLoginPage.gettxtMyProfile());
        ExtentCucumberAdapter.addTestStepLog("The MyProfile Description in WebApp is  " + getValue("MyProfile"));
        takeScreenShotNew(this.scenario);


        putValue("Logout", webAppLoginPage.gettxLogout());
        validate("Logout", webAppLoginPage.gettxLogout());
        ExtentCucumberAdapter.addTestStepLog("The Logout Description in WebApp is  " + getValue("Logout"));
        takeScreenShotNew(this.scenario);


//        Assert.assertTrue("unable to clickBack1", webAppLoginPage.clickBack1());
        takeScreenShotNew(this.scenario);
    }

    @And("I check the Notifications section")
    public void iCheckTheNotificationsSection() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);

        putValue("Notifications", webAppLoginPage.gettxtNotifications());
        validate("Notifications", webAppLoginPage.gettxtNotifications());
        ExtentCucumberAdapter.addTestStepLog("The Notifications text in WebApp is  " + getValue("Notifications"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickNotifications", webAppLoginPage.clickNotifications());
        seleniumAdaptor.pauseFor(3);

        putValue("CallScheduleNotifications", webAppLoginPage.gettxtCallScheduleNotifications());
        ExtentCucumberAdapter.addTestStepLog("The CallScheduleNotifications Notifications text in WebApp is  " + getValue("CallScheduleNotifications"));
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickBack1", webAppLoginPage.clickBack2());
        takeScreenShotNew(this.scenario);

    }

    @And("I click on TimeZone section and check the option")
    public void iClickOnTimeZoneSectionAndCheckTheOption() {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickTimeZone1", webAppLoginPage.clickTimeZone1());
        seleniumAdaptor.pauseFor(3);


        putValue("TimeZoneoption", webAppLoginPage.gettxtTimeZoneoption());
//        validate("Notifications", webAppLoginPage.gettxtTimeZoneoption());
        ExtentCucumberAdapter.addTestStepLog("The TimeZoneoption in WebApp is  " + getValue("TimeZoneoption"));
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickTimeZoneoption", webAppLoginPage.clickTimeZoneoption());

//        Assert.assertTrue("unable to clickTimeZoneoption", webAppLoginPage.captureTimeZoneWebApp());

        Assert.assertTrue("unable to clickBack1", webAppLoginPage.clickBack2());
        takeScreenShotNew(this.scenario);

    }


    @And("I click on TimeZone section and check the option and capture {string} and save")
    public void iClickOnTimeZoneSectionAndCheckTheOptionAndCaptureAndSave(String webAppTimeZone) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickTimeZone1", webAppLoginPage.clickTimeZone1());
        seleniumAdaptor.pauseFor(3);


        putValue("TimeZoneoption", webAppLoginPage.gettxtTimeZoneoption());
//        validate("Notifications", webAppLoginPage.gettxtTimeZoneoption());
        ExtentCucumberAdapter.addTestStepLog("The TimeZoneoption in WebApp is  " + getValue("TimeZoneoption"));
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickTimeZoneoption", webAppLoginPage.clickTimeZoneoption());

        Assert.assertTrue("unable to clickTimeZoneoption", webAppLoginPage.captureTimeZoneWebApp(webAppTimeZone));
        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickBack1", webAppLoginPage.clickBack2());
        takeScreenShotNew(this.scenario);


    }

    @And("I click on Contact section and check the site")
    public void iClickOnContactSectionAndCheckTheSite() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickTimeZone1", webAppLoginPage.clickContact1());

        seleniumAdaptor.pauseFor(3);


        putValue("site", webAppLoginPage.gettxtSite());
        validate("160 - The Bishop Center for Translational Neuroscience", webAppLoginPage.gettxtSite());
        ExtentCucumberAdapter.addTestStepLog("The SiteDescription in WebApp is  " + getValue("site"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickBack1", webAppLoginPage.clickBack2());
        takeScreenShotNew(this.scenario);

    }


    @And("I click on MyProfile section and check the details")
    public void iClickOnMyProfileSectionAndCheckTheDetails() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickMyProfile", webAppLoginPage.clickMyProfile1());

        seleniumAdaptor.pauseFor(1);


        putValue("getFirstName", webAppLoginPage.getFirstName());
        ExtentCucumberAdapter.addTestStepLog("The FirstName in WebApp is  " + getValue("getFirstName"));
        takeScreenShotNew(this.scenario);

        putValue("Email", webAppLoginPage.getEmail());
        ExtentCucumberAdapter.addTestStepLog("The Email in WebApp is  " + getValue("Email"));

        putValue("Study", webAppLoginPage.getStudy());
        ExtentCucumberAdapter.addTestStepLog("The Study in WebApp is  " + getValue("Study"));

        putValue("version", webAppLoginPage.getversion());
        ExtentCucumberAdapter.addTestStepLog("The SiteDescription in WebApp is  " + getValue("version"));


        Assert.assertTrue("unable to clickBack1", webAppLoginPage.clickBack2());
        takeScreenShotNew(this.scenario);
    }

    @And("I click on LogOut and check the pop up alert message")
    public void iClickOnLogOutAndCheckThePopUpAlertMessage() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickLogOut1", webAppLoginPage.clickLogOut1());

        putValue("LogOut", webAppLoginPage.getMsgLogOut());
        validate("You are logging out of jConnect. Do you want to continue?", webAppLoginPage.getMsgLogOut());
        ExtentCucumberAdapter.addTestStepLog("The LogOut Popup message Description in WebApp is  " + getValue("LogOut"));
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickNo", webAppLoginPage.clickLogOutNo());

        seleniumAdaptor.pauseFor(1);}

    @And("I should be able to switch between Menu screens and try to submit form without capturing all the details")
    public void iShouldBeAbleToSwitchBetweenMenuScreensAndTryToSubmitFormWithoutCapturingAllTheDetails() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickChat", webAppLoginPage.clickChat());

        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());

        Assert.assertTrue("unable to clickScreening", webAppLoginPage.clickScreening());
        Assert.assertTrue("unable to clickPHQForm", webAppLoginPage.clickPHQForm());
        Assert.assertTrue("unable to clickSubmitDepFform", webAppLoginPage.clickSubmitDepFform());


        putValue("FillAllDetails", webAppLoginPage.getMsgFormFillAllDetails());
        validate("Please fill all the required fields", webAppLoginPage.getMsgFormFillAllDetails());
        ExtentCucumberAdapter.addTestStepLog("The LogOut Popup message Description in WebApp is  " + getValue("FillAllDetails"));
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickSubmitformOK", webAppLoginPage.clickSubmitformOK());

        Assert.assertTrue("unable to clickBack", webAppLoginPage.clickBack());

        takeScreenShotNew(this.scenario);

    }

    @And("I logout of the WebApp application")
    public void iLogoutOfTheWebAppApplication() {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);


        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickMore", webAppLoginPage.clickMore());

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickWebAppLogOut", webAppLoginPage.clickWebAppLogOut());
        Assert.assertTrue("unable to clickWebAppLogOutYes", webAppLoginPage.clickWebAppLogOutYes());

        takeScreenShotNew(this.scenario);

    }

    @And("I should be able to navigate to ScheduleInfo section and should capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iShouldBeAbleToNavigateToScheduleInfoSectionAndShouldCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs", callSchedulePage.captureTimeHrs(timehours));
        Assert.assertTrue("unable to captureTimeMins", callSchedulePage.captureTimeMins(timemins));
        Assert.assertTrue("unable to captureTimetype", callSchedulePage.captureTimetype(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins1", callSchedulePage.captureCallDurationMins1(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert1", callSchedulePage.captureAlert1(alert));
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

    @And("I launch JConnect WebApp with {string}{string} password and must click on Screening")
    public void iLaunchJConnectWebAppWithPasswordAndMustClickOnScreening(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        callSchedulePage.switchToTab0();
//        driver.close();
        callSchedulePage.switchToTab0();
        amazonWebMailPage.opentabAmazonWebAppReal1();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
//        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePassword("4190"));
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

    @Given("I capture {string}{string} and must click Signin")
    public void iCaptureAndMustClickSignin(String username, String password) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);

        takeScreenShotNew(this.scenario);

        putValue("UserNameText", jCollaborateQALoginPage.getUserNameText());
        validate("", jCollaborateQALoginPage.getUserNameText());
        ExtentCucumberAdapter.addTestStepLog("The UserNameText field Description in JConnect is  " + getValue("UserNameText"));

        putValue("PasswordText", jCollaborateQALoginPage.getPasswordText());
        validate("", jCollaborateQALoginPage.getPasswordText());
        ExtentCucumberAdapter.addTestStepLog("The Password field Description in WebApp is  " + getValue("PasswordText"));


        putValue("logindesc", jCollaborateQALoginPage.getLoginText());
        validate("Sign In", jCollaborateQALoginPage.getLoginText());
        ExtentCucumberAdapter.addTestStepLog("The Login button Description in WebApp is  " + getValue("logindesc"));
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to captureUserName", jCollaborateQALoginPage.captureUserName(username));
        Assert.assertTrue("unable to capturePassword", jCollaborateQALoginPage.capturePassword(password));


        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickSignIn", jCollaborateQALoginPage.clickSignIn());
        ExtentCucumberAdapter.addTestStepLog("Loged into Jconnect Successfully");
        ReportResult.getCurrentTime();

//        takeScreenShotNew(this.scenario);

    }

    @When("I navigate to Welcome screen and select the JConnectBuild Option")
    public void iNavigateToWelcomeScreenAndSelectTheJConnectBuildOption() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);


//        seleniumAdaptor.pauseFor(4);
        takeScreenShotNew(this.scenario);

        putValue("WelcomeText", jCollaborateWelcomePage.getWelcomeText());
        ExtentCucumberAdapter.addTestStepLog("The WelcomeText Description in JConnect is  " + getValue("WelcomeText"));

        putValue("SelectProduct", jCollaborateWelcomePage.getSelectProductText());
        validate("Please select a product to continue...", jCollaborateWelcomePage.getSelectProductText());
        ExtentCucumberAdapter.addTestStepLog("The SelectProduct Description in JConnect is  " + getValue("SelectProduct"));

        putValue("JconnectBuildText", jCollaborateWelcomePage.getSelectProductJconnectBuildText());
        ExtentCucumberAdapter.addTestStepLog("The JconnectBuildText Description in JConnect is  " + getValue("JconnectBuildText"));

        putValue("JconfigureBuildText", jCollaborateWelcomePage.getSelectProductJconfigureBuildText());
        ExtentCucumberAdapter.addTestStepLog("The JconfigureBuildText Description in JConnect is  " + getValue("JconfigureBuildText"));

//        putValue("PItext", jCollaborateWelcomePage.getPItext());
//        validate(" PI", jCollaborateWelcomePage.getPItext());
//        ExtentCucumberAdapter.addTestStepLog("The PItext Description in JConnect is  " + getValue("PItext"));

        putValue("PItext", jCollaborateWelcomePage.getPrincipalInvestigatortext());
        validate("Principal Investigator", jCollaborateWelcomePage.getPrincipalInvestigatortext());
        ExtentCucumberAdapter.addTestStepLog("The PItext Description in JConnect is  " + getValue("PItext"));




//        putValue("PIName", jCollaborateWelcomePage.getPIName());
////        validate("   Garish P ", jCollaborateWelcomePage.getPIName());
//        ExtentCucumberAdapter.addTestStepLog("The PIName Description in JConnect is  " + getValue("PIName"));

        putValue("PIName", jCollaborateWelcomePage.getPIName());
//        validate("   Garish P ", jCollaborateWelcomePage.getPIName());
        ExtentCucumberAdapter.addTestStepLog("The PIName Description in JConnect is  " + getValue("PIName"));


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickJConnectBuild", jCollaborateWelcomePage.clickJConnectBuild());
        takeScreenShotNew(this.scenario);
    }


    @And("I check the Site and Study Information in the Page Header")
    public void iCheckTheSiteAndStudyInformationInThePageHeader() {
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

        putValue("StudyName", subjectCreatePage.getStudyName());
        validate("ALTO-100-005", subjectCreatePage.getStudyName());
        ExtentCucumberAdapter.addTestStepLog("The StudyName in JConnect is  " + getValue("StudyName"));


        putValue("SiteName", subjectCreatePage.getSiteName());
        validate("160 - The Bishop Center for Translational Neuroscience", subjectCreatePage.getSiteName());
        ExtentCucumberAdapter.addTestStepLog("The SiteName in JConnect is  " + getValue("SiteName"));


        putValue("EDiaryVersionDesc", subjectCreatePage.getEDiaryVersion());
        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Description in JConnect is " + getValue("EDiaryVersionDesc"));
        putValue("EDiaryVersionNum", subjectCreatePage.getEDiaryVersionNum());
        ExtentCucumberAdapter.addTestStepLog("The EDiary Version Number in JConnect is " + getValue("EDiaryVersionNum"));

        Assert.assertTrue("unable to clickEditSite", subjectCreatePage.clickEditSite());



        putValue("StudyName1", subjectCreatePage.getStudyName2());
        validate("ALTO-100-004", subjectCreatePage.getStudyName2());
        ExtentCucumberAdapter.addTestStepLog("The StudyName1 in JConnect is  " + getValue("StudyName1"));

        putValue("StudyName2", subjectCreatePage.getStudyName1());
        validate("ALTO-100-005", subjectCreatePage.getStudyName1());
        ExtentCucumberAdapter.addTestStepLog("The StudyName2 in JConnect is  " + getValue("StudyName2"));



//        putValue("StudyName2", subjectCreatePage.getStudyName2());
//        validate("ALTO-100-003", subjectCreatePage.getStudyName2());
//        ExtentCucumberAdapter.addTestStepLog("The StudyName2 in JConnect is  " + getValue("StudyName2"));

//        putValue("StudyName3", subjectCreatePage.getStudyName3());
//        validate("ALTO-100-005", subjectCreatePage.getStudyName3());
//        ExtentCucumberAdapter.addTestStepLog("The StudyName3 in JConnect is  " + getValue("StudyName3"));

//
//        putValue("SiteName1", subjectCreatePage.getSiteName1());
//        validate("CrioTestSite", subjectCreatePage.getSiteName1());
//        ExtentCucumberAdapter.addTestStepLog("The SiteName1 in JConnect is  " + getValue("SiteName1"));

        putValue("SiteName1", subjectCreatePage.getSiteName1());
        validate("160 - The Bishop Center for Translational Neuroscience", subjectCreatePage.getSiteName1());
        ExtentCucumberAdapter.addTestStepLog("The SiteName1 in JConnect is  " + getValue("SiteName1"));

        Assert.assertTrue("unable to clickEditSite", subjectCreatePage.clickEditSite());
        takeScreenShotNew(this.scenario);
    }

    @And("I change the Study by capturing {string} and check the same in the Page Header")
    public void iChangeTheStudyByCapturingAndCheckTheSameInThePageHeader(String study2) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickEditSite", subjectCreatePage.clickEditSite());

        Assert.assertTrue("unable to captureStudy", subjectCreatePage.captureStudy(study2));

        Assert.assertTrue("unable to clickSite", subjectCreatePage.clickSite());

        putValue("StudyName1", subjectCreatePage.getStudyName());
        validate("ALTO-100-004", subjectCreatePage.getStudyName());
        ExtentCucumberAdapter.addTestStepLog("The New StudyName in JConnect is  " + getValue("StudyName1"));


        putValue("SiteName", subjectCreatePage.getSiteName());
        validate("160 - The Bishop Center for Translational Neuroscience", subjectCreatePage.getSiteName());
        ExtentCucumberAdapter.addTestStepLog("The SiteName in JConnect is  " + getValue("SiteName"));


    }

    @And("I change the Study by capturing {string}")
    public void iChangeTheStudyByCapturing(String study2) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickEditSite", subjectCreatePage.clickEditSite());

        Assert.assertTrue("unable to captureStudy", subjectCreatePage.captureStudy(study2));

        Assert.assertTrue("unable to clickSite", subjectCreatePage.clickSite());

        putValue("StudyName2", subjectCreatePage.getStudyName());
        validate("ALTO-100-005", subjectCreatePage.getStudyName());
        ExtentCucumberAdapter.addTestStepLog("The Original StudyName in JConnect is  " + getValue("StudyName2"));


        putValue("SiteName", subjectCreatePage.getSiteName());
        validate("160 - The Bishop Center for Translational Neuroscience", subjectCreatePage.getSiteName());
        ExtentCucumberAdapter.addTestStepLog("The SiteName in JConnect is  " + getValue("SiteName"));

        takeScreenShotNew(this.scenario);
    }

    @And("I check the List of Menu Items in the LeftSide")
    public void iCheckTheListOfMenuItemsInTheLeftSide() {

                callSchedulePage = new CallSchedulePage(driver);
                seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickSite", studyListPage.clickStudy());


        putValue("Studytxt", menuItemsJconnectPage.getStudytxt());
        validate("Study", menuItemsJconnectPage.getStudytxt());
        ExtentCucumberAdapter.addTestStepLog("The Study Menu Description in JConnect is  " + getValue("Studytxt"));


        putValue("StudyList", menuItemsJconnectPage.getStudyListtxt());
        validate("List", menuItemsJconnectPage.getStudyListtxt());
        ExtentCucumberAdapter.addTestStepLog("The StudyList Menu Description in JConnect is  " + getValue("StudyList"));

        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());

        putValue("Subjecttxt", menuItemsJconnectPage.getSubjecttxt());
        validate("Subject", menuItemsJconnectPage.getSubjecttxt());
        ExtentCucumberAdapter.addTestStepLog("The Subjecttxt Description in JConnect is  " + getValue("Subjecttxt"));


        putValue("SubjectCreate", menuItemsJconnectPage.getSubjectCreatetxt());
        validate("Create", menuItemsJconnectPage.getSubjectCreatetxt());
        ExtentCucumberAdapter.addTestStepLog("The SubjectCreate Description in JConnect is  " + getValue("SubjectCreate"));


        putValue("SubjectList", menuItemsJconnectPage.getSubjectListtxt());
        validate("List", menuItemsJconnectPage.getSubjectListtxt());
        ExtentCucumberAdapter.addTestStepLog("The SubjectList Description in JConnect is  " + getValue("SubjectList"));


        putValue("SubjectMigration", menuItemsJconnectPage.getSubjectMigrationtxt());
        validate("Migration", menuItemsJconnectPage.getSubjectMigrationtxt());
        ExtentCucumberAdapter.addTestStepLog("The Subject Migration Description in JConnect is  " + getValue("SubjectMigration"));


        putValue("Download", menuItemsJconnectPage.getSubjectDownloadtxt());
        validate("Download", menuItemsJconnectPage.getSubjectDownloadtxt());
        ExtentCucumberAdapter.addTestStepLog("The Subject Download Description in JConnect is  " + getValue("Download"));

        Assert.assertTrue("unable to clickUserManagement", menuItemsJconnectPage.clickUserManagement());

//        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
//        seleniumAction.scrollBy("0", "1400");
        putValue("UserList", menuItemsJconnectPage.getUserManagementListtxt());
        validate("List", menuItemsJconnectPage.getUserManagementListtxt());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement Description in JConnect is  " + getValue("UserList"));

        Assert.assertTrue("unable to clickMyAccount", menuItemsJconnectPage.clickMyAccount());
        putValue("MyAccount", menuItemsJconnectPage.getMyAccounttxt());
        validate("My Account", menuItemsJconnectPage.getMyAccounttxt());
        ExtentCucumberAdapter.addTestStepLog("The MyAccount Description in JConnect is  " + getValue("MyAccount"));

//        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        putValue("Chat", menuItemsJconnectPage.getChattxt());
        validate("Chat", menuItemsJconnectPage.getChattxt());
        ExtentCucumberAdapter.addTestStepLog("The Chat Description in JConnect is  " + getValue("Chat"));

        Assert.assertTrue("unable to clickCallSchedule", menuItemsJconnectPage.clickCallSchedule());
        putValue("CallSchedule", menuItemsJconnectPage.getCallScheduletxt());
        validate("Call Schedule", menuItemsJconnectPage.getCallScheduletxt());
        ExtentCucumberAdapter.addTestStepLog("The CallSchedule Description in JConnect is  " + getValue("CallSchedule"));

        Assert.assertTrue("unable to clickAuditReports", menuItemsJconnectPage.clickAuditReports());
        putValue("AuditReports", menuItemsJconnectPage.getAuditReportstxt());
        validate("Audit Reports", menuItemsJconnectPage.getAuditReportstxt());
        ExtentCucumberAdapter.addTestStepLog("The MyAccount Description in JConnect is  " + getValue("AuditReports"));

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickCallHistory", menuItemsJconnectPage.clickCallHistory());
        putValue("CallHistory", menuItemsJconnectPage.getCallHistorytxt());
        validate("Call History", menuItemsJconnectPage.getCallHistorytxt());
        ExtentCucumberAdapter.addTestStepLog("The CallHistory Description in JConnect is  " + getValue("CallHistory"));

        Assert.assertTrue("unable to clickFormAudit1", menuItemsJconnectPage.clickFormAudit1());
        putValue("FormAudit", menuItemsJconnectPage.getFormAudittxt());
        validate("Form Audit", menuItemsJconnectPage.getFormAudittxt());
        ExtentCucumberAdapter.addTestStepLog("The FormAudit Description in JConnect is  " + getValue("FormAudit"));

        Assert.assertTrue("unable to clickESignatureLog", menuItemsJconnectPage.clickESignatureLog());
        putValue("ESignatureLog", menuItemsJconnectPage.getESignatureLogtxt());
        validate("eSignature Log", menuItemsJconnectPage.getESignatureLogtxt());
        ExtentCucumberAdapter.addTestStepLog("The ESignatureLog Description in JConnect is  " + getValue("ESignatureLog"));

        takeScreenShotNew(this.scenario);
    }

    @Given("I navigate to StudyList section and check the list of Studies available in the table")
    public void i_navigate_to_study_list_section_and_check_the_list_of_studies_available_in_the_table() {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSite", studyListPage.clickStudy());
        Assert.assertTrue("unable to clickStudyListMenu", studyListPage.clickStudyListMenu());

        putValue("StudyName1", studyListPage.getStudyName1());
        validate("ALTO-100-004", studyListPage.getStudyName1());
        ExtentCucumberAdapter.addTestStepLog("The StudyName1 Description in JConnect is  " + getValue("StudyName1"));


        putValue("StudyName2", studyListPage.getStudyName2());
        validate("ALTO-100-005", studyListPage.getStudyName2());
        ExtentCucumberAdapter.addTestStepLog("The StudyName1 Description in JConnect is  " + getValue("StudyName2"));

        takeScreenShotNew(this.scenario);

    }


    @And("I navigate to StudyList List and capture {string} and must fetch the record")
    public void iNavigateToStudyListListAndCaptureAndMustFetchTheRecord(String arg0) {
        
    }




    @And("I capture {string} and must fetch the record and click on the Study Link and check the Study and Mapped Organisations Tabs")
    public void iCaptureAndMustFetchTheRecordAndClickOnTheStudyLinkAndCheckTheStudyAndMappedOrganisationsTabs(String studyNum) {
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

        putValue("StudyDescr", studyListPage.getStudyDescr());
        validate("Study", studyListPage.getStudyDescr());
        ExtentCucumberAdapter.addTestStepLog("The Study Description in JConnect is  " + getValue("StudyDescr"));

        putValue("SponsorNameStudy", studyListPage.getSponsorNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The SponsorNameStudy in JConnect is :" + getValue("SponsorNameStudy"));
        validate("MedPlusInc", studyListPage.getSponsorNameStudy());
        putValue("VersionName", studyListPage.getVersionNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The VersionName Study in JConnect is :" + getValue("VersionName"));
        validate("Version 12.0", studyListPage.getVersionNameStudy());

        Assert.assertTrue("unable to clickStudyLanguage", studyListPage.clickStudyLanguage());
        studyListPage.CheckingChkboxLanguageSource();
        studyListPage.CheckingChkboxLanguageSourceSpanish();
        studyListPage.CheckingChkboxLanguageTarget();
        studyListPage.CheckingChkboxLanguageTarget1();

        putValue("MappedOrg", studyListPage.getMappedOrganisationsDescr());
        validate("Mapped Organizations", studyListPage.getMappedOrganisationsDescr());
        ExtentCucumberAdapter.addTestStepLog("The Mapped Organizations Description in JConnect is  " + getValue("MappedOrg"));

        Assert.assertTrue("unable to clickMappedOrg", studyListPage.clickMappedOrg());
        seleniumAdaptor.pauseFor(1);
        putValue("StudyOrgName", studyListPage.getStudyOrgName());
        ExtentCucumberAdapter.addTestStepLog("The StudyOrganisation Name in JConnect is :" + getValue("StudyOrgName"));
        validate("160 - The Bishop Center for Translational Neuroscience", studyListPage.getStudyOrgName());


    }


    @And("I must be able to navigate between the Tabs in Create Subject")
    public void iMustBeAbleToNavigateBetweenTheTabsInCreateSubject() {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);


        putValue("SubjectDetails", subjectCreatePage.getSubjectDetailsTab());
        validate("Subject Details", subjectCreatePage.getSubjectDetailsTab());
        ExtentCucumberAdapter.addTestStepLog("The SubjectDetails Description in JConnect is  " + getValue("SubjectDetails"));

        putValue("Visits", subjectCreatePage.getVisitsTab());
        validate("Visits", subjectCreatePage.getVisitsTab());
        ExtentCucumberAdapter.addTestStepLog("The Visits Tab Description in JConnect is  " + getValue("Visits"));

        putValue("Summary", subjectCreatePage.getSummaryTab());
        validate("Summary", subjectCreatePage.getSummaryTab());
        ExtentCucumberAdapter.addTestStepLog("The Summary Tab Description in JConnect is  " + getValue("Summary"));

        Assert.assertTrue("unable to clickSubjectDetails1", subjectCreatePage.clickSubjectDetails1());
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to StudyList section and click on the FirstSubjectNumber HyperLink and land on Visits section by default")
    public void iNavigateToStudyListSectionAndClickOnTheFirstSubjectNumberHyperLinkAndLandOnVisitsSectionByDefault() {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStudy", studyListPage.clickStudy());
        Assert.assertTrue("unable to clickStudyListMenu", studyListPage.clickStudyListMenu());
        Assert.assertTrue("unable to firstSubNumList", subjectListPage.firstSubNumList());

//        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));


        putValue("SubVisitStatus", subjectCreatePage.getSubVisitStatus());
        validate("Subject Visit Status", subjectCreatePage.getSubVisitStatus());
        ExtentCucumberAdapter.addTestStepLog("The SubVisitStatus Description in JConnect is  " + getValue("SubVisitStatus"));

    }

    @And("I click on previous button in Visits Tab and land on SubjectDetails Section and go back to Visits section and then directly click on SubjectDetails Tab")
    public void iClickOnPreviousButtonInVisitsTabAndLandOnSubjectDetailsSectionAndGoBackToVisitsSectionAndThenDirectlyClickOnSubjectDetailsTab() {

        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickPreviousVisitsTab", studyListPage.clickPreviousVisitsTab());
        seleniumAdaptor.pauseFor(1);
        putValue("SubViewEncriptedData", subjectCreatePage.getSubViewEncriptedData());
        validate("View Encrypted Data", subjectCreatePage.getSubViewEncriptedData());
        ExtentCucumberAdapter.addTestStepLog("The SubViewEncriptedData Description in JConnect is  " + getValue("SubViewEncriptedData"));

        Assert.assertTrue("unable to clickNext", studyListPage.clickNext());

        Assert.assertTrue("unable to clickSubjectDetails1", subjectCreatePage.clickSubjectDetails1());
        putValue("SubViewEncriptedData", subjectCreatePage.getSubViewEncriptedData());
        validate("View Encrypted Data", subjectCreatePage.getSubViewEncriptedData());
        ExtentCucumberAdapter.addTestStepLog("The SubViewEncriptedData Description in JConnect is  " + getValue("SubViewEncriptedData"));

        takeScreenShotNew(this.scenario);



    }

    @And("I navigate to SummarySection and retrieve the SubjectNumber")
    public void iNavigateToSummarySectionAndRetrieveTheSubjectNumber() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);



        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        takeScreenShotNew(this.scenario);

        putValue("SubNumberSummary", subjectCreatePage.getSubNumberSummary());
        ExtentCucumberAdapter.addTestStepLog("The SubNumber in Summary section in JConnect is  " + getValue("SubNumberSummary"));

        takeScreenShotNew(this.scenario);
        takeScreenShotNew(this.scenario);



    }

    @And("I click on Subject and CreateSubject Option and must capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnSubjectAndCreateSubjectOptionAndMustCapture(String firstname, String lastname, String site, String subNum, String subExtID, String phoneCode, String phoneNum, String email, String role, String startDate, String language) {
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
        Assert.assertTrue("unable to captureSelectSite1", subjectCreatePage.captureSelectSite1(site));
        Assert.assertTrue("unable to captureSubjectNumMRN", subjectCreatePage.captureSubjectNumMRN(subNum));
        Assert.assertTrue("unable to captureSubjectExtID", subjectCreatePage.captureSubjectExtID(subExtID));
        Assert.assertTrue("unable to capturePhoneNumCode", subjectCreatePage.capturePhoneNumCode(phoneCode));
        Assert.assertTrue("unable to captureUserName", subjectCreatePage.capturePhoneNum(phoneNum));
        Assert.assertTrue("unable to capturePhoneNum", subjectCreatePage.captureEmail(email));
        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole(role));
        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail(email));
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

    @And("I navigate to SubjectList section and click on the FirstSubjectNumber HyperLink and land on Visits section by default")
    public void iNavigateToSubjectListSectionAndClickOnTheFirstSubjectNumberHyperLinkAndLandOnVisitsSectionByDefault() {

        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to firstSubNumList", subjectListPage.firstSubNumList());

//        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));


        putValue("SubVisitStatus", subjectCreatePage.getSubVisitStatus());
        validate("Subject Visit Status", subjectCreatePage.getSubVisitStatus());
        ExtentCucumberAdapter.addTestStepLog("The SubVisitStatus Description in JConnect is  " + getValue("SubVisitStatus"));

    }

    @And("I should be able to switch between tabs by clicking on Next and Previuos buttons")
    public void iShouldBeAbleToSwitchBetweenTabsByClickingOnNextAndPreviuosButtons() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);



        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickPreviousVisitsTab", studyListPage.clickPreviousVisitsTab());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickPreviousVisitsTab", studyListPage.clickPreviousVisitsTab());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickNext", studyListPage.clickNext());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickNext", studyListPage.clickNext());
        seleniumAdaptor.pauseFor(1);
        putValue("SubNumberSummary", subjectCreatePage.getSubNumberSummary());
        ExtentCucumberAdapter.addTestStepLog("The SubNumber in Summary section in JConnect is  " + getValue("SubNumberSummary"));

        takeScreenShotNew(this.scenario);
    }

    @And("I click on CallSchedule and must capture {string}{string}{string}{string}{string} and click on Schedule Visit")
    public void iClickOnCallScheduleAndMustCaptureAndClickOnScheduleVisit(String time, String study, String site, String subject, String sitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureStudy(study));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureSite(site));
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(subject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(subject));
        Assert.assertTrue("unable to captureSiteStaff", callSchedulePage.captureSiteStaff1(sitestaff));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);


      }

    @And("I logout of current Jconnect and login again by capturing {string}{string} and must click Signin")
    public void iLogoutOfCurrentJconnectAndLoginAgainByCapturingAndMustClickSignin(String username, String password) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        studyListPage = new StudyListPage(driver);
        seleniumAction = new SeleniumAction(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStudy",studyListPage.clickStudy());
        seleniumAction.scrollBy("1400", "0");
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickJconnectLogout1", subjectCreatePage.clickJconnectLogout1());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickLogout1", subjectCreatePage.clickLogout1());
        seleniumAdaptor.pauseFor(3);

        Assert.assertTrue("unable to captureUserName", jCollaborateQALoginPage.captureUserName(username));
        Assert.assertTrue("unable to capturePassword", jCollaborateQALoginPage.capturePassword(password));


        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickSignIn", jCollaborateQALoginPage.clickSignIn());
        ExtentCucumberAdapter.addTestStepLog("Loged into Jconnect Successfully");
    }



    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and click AUDIT form and click AuditFormTrial and click on Export and click Backbutton and Action and RecordAuditTrial and again backbutton")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndClickAUDITFormAndClickAuditFormTrialAndClickOnExportAndClickBackbuttonAndActionAndRecordAuditTrialAndAgainBackbutton(String firstname, String visit) {
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
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu", subjectListPage.clickSubjectListMenu());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit", subjectListPage.SelectVisit(visit));
        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAUDIT());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());
        Assert.assertTrue("unable to clickExport", subjectListPage.clickExport());
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        Assert.assertTrue("unable to clickAction()", subjectListPage.clickAction());
        Assert.assertTrue("unable to clickRecordAuditTrial", subjectListPage.clickRecordAuditTrial());
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        callSchedulePage.switchToTab0();


        subjectListPage.getFormsPHQ();
        subjectListPage.getFormsAUDIT();
        subjectListPage.getFormsCHRTSR();
        takeScreenShotNew(this.scenario);

    }

    @And("I should be able to navigate to Migration section under Subject Tab")
    public void iShouldBeAbleToNavigateToMigrationSectionUnderSubjectTab() {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);


//        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());

        putValue("Subjecttxt", menuItemsJconnectPage.getSubjecttxt());
        validate("Subject", menuItemsJconnectPage.getSubjecttxt());
        ExtentCucumberAdapter.addTestStepLog("The Subjecttxt Description in JConnect is  " + getValue("Subjecttxt"));

        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());

        putValue("SubjectMigration", menuItemsJconnectPage.getSubjectMigrationtxt());
        validate("Migration", menuItemsJconnectPage.getSubjectMigrationtxt());
        ExtentCucumberAdapter.addTestStepLog("The Subject Migration Description in JConnect is  " + getValue("SubjectMigration"));



        takeScreenShotNew(this.scenario);



}

    @And("I should be able to navigate to Download section under Subject Tab")
    public void iShouldBeAbleToNavigateToDownloadSectionUnderSubjectTab() {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);


        putValue("Download", menuItemsJconnectPage.getSubjectDownloadtxt());
        validate("Download", menuItemsJconnectPage.getSubjectDownloadtxt());
        ExtentCucumberAdapter.addTestStepLog("The Subject Download Description in JConnect is  " + getValue("Download"));



        takeScreenShotNew(this.scenario);


    }

    @And("I navigate to UserManagement List Tab and capture {string} and click Next and Next and Previous buttons")
    public void iNavigateToUserManagementListTabAndCaptureAndClickNextAndNextAndPreviousButtons(String name) {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);
        jconnectUserManagementPage = new JconnectUserManagementPage(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickUserManagement", menuItemsJconnectPage.clickUserManagement());

        putValue("UserList", menuItemsJconnectPage.getUserManagementListtxt2());
        validate("List", menuItemsJconnectPage.getUserManagementListtxt2());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement Description in JConnect is  " + getValue("UserList"));

        Assert.assertTrue("unable to clickUserManagementList2", menuItemsJconnectPage.clickUserManagementList2());

        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(name));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());

        Assert.assertTrue("unable to clickUserManageListName", jconnectUserManagementPage.captureUserManageListName(name));

        putValue("UserDetailsTitle", jconnectUserManagementPage.getUserDetailsTitle());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement UserDetailsTitle in JConnect is  " + getValue("UserDetailsTitle"));

        putValue("UserDetailsEmail", jconnectUserManagementPage.getUserDetailsEmail());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement UserDetailsEmail in JConnect is  " + getValue("UserDetailsEmail"));

        putValue("UserLogin", jconnectUserManagementPage.getUserLoginDetailstxt());
        validate("Login Details", jconnectUserManagementPage.getUserLoginDetailstxt());
        ExtentCucumberAdapter.addTestStepLog("The UserLoginDetails Tab Description in JConnect is  " + getValue("UserLogin"));


        putValue("UserDetails", jconnectUserManagementPage.getUserDetailstxt());
        validate("User Details", jconnectUserManagementPage.getUserDetailstxt());
        ExtentCucumberAdapter.addTestStepLog("The UserLogin Tab Description in JConnect is  " + getValue("UserDetails"));

        putValue("AddPrivillages", jconnectUserManagementPage.getUserAddPrivillagestxt());
        validate("Add Privileges", jconnectUserManagementPage.getUserAddPrivillagestxt());
        ExtentCucumberAdapter.addTestStepLog("The AddPrivillages Tab Description in JConnect is  " + getValue("AddPrivillages"));


        Assert.assertTrue("unable to clickNext", jconnectUserManagementPage.clickNext());
        Assert.assertTrue("unable to clickNext", jconnectUserManagementPage.clickNext());
        Assert.assertTrue("unable to clickPrevious", jconnectUserManagementPage.clickPrevious());
        Assert.assertTrue("unable to clickPrevious", jconnectUserManagementPage.clickPrevious());

        putValue("UserDetailsTitle", jconnectUserManagementPage.getUserDetailsTitle());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement UserDetailsTitle in JConnect is  " + getValue("UserDetailsTitle"));

        takeScreenShotNew(this.scenario);


    }

    @And("I navigate to MyAccount section and check the Title and Email")
    public void iNavigateToMyAccountSectionAndCheckTheTitleAndEmail() {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);
        jconnectUserManagementPage = new JconnectUserManagementPage(driver);
        myAccountPage = new MyAccountPage(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickMyAccount", myAccountPage.clickMyAccount());
        putValue("MyAccount", menuItemsJconnectPage.getMyAccounttxt());
        validate("My Account", menuItemsJconnectPage.getMyAccounttxt());
        ExtentCucumberAdapter.addTestStepLog("The MyAccount Description in JConnect is  " + getValue("MyAccount"));


        putValue("UserDetailsTitle", myAccountPage.getUserDetailsTitle());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement UserDetailsTitle in JConnect is  " + getValue("UserDetailsTitle"));

        putValue("UserDetailsEmail", myAccountPage.getUserDetailsEmail());
        ExtentCucumberAdapter.addTestStepLog("The UserManagement UserDetailsEmail in JConnect is  " + getValue("UserDetailsEmail"));


        takeScreenShotNew(this.scenario);


    }

    @And("I navigate to CallSchedule Section and click on ScheduleTelevisit button and check the Schedule a Call PopUp screen")
    public void iNavigateToCallScheduleSectionAndClickOnScheduleTelevisitButtonAndCheckTheScheduleACallPopUpScreen() {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);
        jconnectUserManagementPage = new JconnectUserManagementPage(driver);
        myAccountPage = new MyAccountPage(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
        takeScreenShotNew(this.scenario);

        putValue("ScheduleACall", callSchedulePage.getScheduleACalltxt());
        validate("Schedule a Call", callSchedulePage.getScheduleACalltxt());
        ExtentCucumberAdapter.addTestStepLog("The UserLoginDetails Tab Description in JConnect is  " + getValue("ScheduleACall"));

        Assert.assertTrue("unable to clickCloseScheduleCall", callSchedulePage.clickCloseScheduleCall());

        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to CallSchedule Section and capture {string} and check the meeting")
    public void iNavigateToCallScheduleSectionAndCaptureAndCheckTheMeeting(String time) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));


        putValue("ScheduleACall", callSchedulePage.getScheduleACalltxt());
        ExtentCucumberAdapter.addTestStepLog("The UserLoginDetails Tab Description in JConnect is  " + getValue("ScheduleACall"));


        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);


    }


    @And("I navigate to CallSchedule Section and capture {string} and check the meetingcall and click on the meetingcall and check the Schedule a Call PopUp screen")
    public void iNavigateToCallScheduleSectionAndCaptureAndCheckTheMeetingcallAndClickOnTheMeetingcallAndCheckTheScheduleACallPopUpScreen(String time) {
        callSchedulePage = new CallSchedulePage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        menuItemsJconnectPage  = new MenuItemsJconnectPage(driver);
        studyListPage = new StudyListPage(driver);
        jConnectChatPage = new JConnectChatPage(driver);
        jconnectUserManagementPage = new JconnectUserManagementPage(driver);
        myAccountPage = new MyAccountPage(driver);

        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());

        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime("day"));
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));

//        putValue("ScheduleACall", callSchedulePage.getScheduleACalltxt());
//        validate("Schedule a Call", callSchedulePage.getScheduleACalltxt());
//        ExtentCucumberAdapter.addTestStepLog("The UserLoginDetails Tab Description in JConnect is  " + getValue("ScheduleACall"));

        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickCalendarICFmeeting1", callSchedulePage.clickCalendarICFmeeting1());


        putValue("ScheduleACall", callSchedulePage.getScheduleACalltxt());
        validate("Schedule a Call", callSchedulePage.getScheduleACalltxt());
        ExtentCucumberAdapter.addTestStepLog("The UserLoginDetails Tab Description in JConnect is  " + getValue("ScheduleACall"));

        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to JConnect Chat section and click NewChat and capture {string}{string}{string}")
    public void iNavigateToJConnectChatSectionAndClickNewChatAndCapture(String users, String subject, String message) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jConnectChatPage = new JConnectChatPage(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        putValue("Chat", menuItemsJconnectPage.getChattxt());
        validate("Chat", menuItemsJconnectPage.getChattxt());
        ExtentCucumberAdapter.addTestStepLog("The Chat Description in JConnect is  " + getValue("Chat"));

        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickNewChat", jConnectChatPage.clickNewChat());
//        Assert.assertTrue("unable to captureUsers", jConnectChatPage.captureUsers(users));
        Assert.assertTrue("unable to captureUsers1", jConnectChatPage.captureUsers1(users));
        Assert.assertTrue("unable to captureSubjectChat", jConnectChatPage.captureSubjectChat(subject));
        Assert.assertTrue("unable to clickCheckCircle", jConnectChatPage.clickCheckCircle());
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to clickChat", jConnectChatPage.clickChat());
        Assert.assertTrue("unable to clickChatParticipants1", jConnectChatPage.clickChatParticipants2());
        Assert.assertTrue("unable to captureMessage", jConnectChatPage.captureMessage(message));
//        Assert.assertTrue("unable to clickSendMessage", jConnectChatPage.clickSendMessage());

        Assert.assertTrue("unable to UploadFileMessageJconnect", jConnectChatPage.UploadFileMessageJconnect());
        Assert.assertTrue("unable to clickSendMessage", jConnectChatPage.clickSendMessage());
        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Audit Reports section and click Call History and capture {string}{string} and search")
    public void iNavigateToAuditReportsSectionAndClickCallHistoryAndCaptureAndSearch(String study, String site) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jConnectChatPage = new JConnectChatPage(driver);
        jconnectAuditReportsPage = new JconnectAuditReportsPage(driver);

        takeScreenShotNew(this.scenario);

        Assert.assertTrue("unable to jconnectAuditReportsPage", jconnectAuditReportsPage.clickAuditReports());
        Assert.assertTrue("unable to clickCallHistory", jconnectAuditReportsPage.clickCallHistory());

        Assert.assertTrue("unable to captureStudy", jconnectAuditReportsPage.captureStudy(study));
        Assert.assertTrue("unable to captureSite", jconnectAuditReportsPage.captureSite(site));
        Assert.assertTrue("unable to clickSearch", jconnectAuditReportsPage.clickSearch());

        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickActions3", jconnectAuditReportsPage.clickActions3());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickParticipantHistory", jconnectAuditReportsPage.clickParticipantHistory());

        putValue("Participant1Name", jconnectAuditReportsPage.getParticipant1Name());
        ExtentCucumberAdapter.addTestStepLog("The Participant1Name Description in JConnect is  " + getValue("Participant1Name"));

        putValue("Participant1Status1", jconnectAuditReportsPage.getParticipant1Status1());
        ExtentCucumberAdapter.addTestStepLog("The Participant1Status1 Description in JConnect is  " + getValue("Participant1Status1"));

        putValue("Participant2Name", jconnectAuditReportsPage.getParticipant2Name());
        ExtentCucumberAdapter.addTestStepLog("The  Participant2Name in JConnect is  " + getValue("Participant2Name"));

        putValue("Participant2Status2", jconnectAuditReportsPage.getParticipant2Status2());
        ExtentCucumberAdapter.addTestStepLog("The  Participant2Status2 in JConnect is  " + getValue("Participant2Status2"));

        putValue("Title", jconnectAuditReportsPage.getParticipantHistoryTitle());
        ExtentCucumberAdapter.addTestStepLog("The ParticipantHistoryTitle Description in JConnect is  " + getValue("Title"));

        putValue("ScheduledDate", jconnectAuditReportsPage.getParticipantHistoryScheduledDate());
        ExtentCucumberAdapter.addTestStepLog("The ParticipantHistoryScheduledDate in JConnect is  " + getValue("ScheduledDate"));

        putValue("ScheduledTime", jconnectAuditReportsPage.getParticipantHistoryScheduledTime());
        ExtentCucumberAdapter.addTestStepLog("The ParticipantHistoryScheduledTime in JConnect is  " + getValue("ScheduledTime"));

        putValue("ScheduledTimeZone", jconnectAuditReportsPage.getParticipantHistoryScheduledTimeZone());
        ExtentCucumberAdapter.addTestStepLog("The Chat ParticipantHistoryScheduledTimeZone in JConnect is  " + getValue("ScheduledTimeZone"));

        Assert.assertTrue("unable to clickOK", jconnectAuditReportsPage.clickOK());

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);

    }

    @And("I must be able to LogOut of Jconnect Application")
    public void iMustBeAbleToLogOutOfJconnectApplication() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        subjectCreatePage = new SubjectCreatePage(driver);

        takeScreenShotNew(this.scenario);

//        Assert.assertTrue("unable to clickJconnectLogout", subjectCreatePage.clickJconnectLogout());
//        Assert.assertTrue("unable to clickLogout", subjectCreatePage.clickLogout());

        Assert.assertTrue("unable to clickJconnectLogout1", subjectCreatePage.clickJconnectLogout1());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickLogout1", subjectCreatePage.clickLogout1());
//        seleniumAdaptor.pauseFor(3);

        takeScreenShotNew(this.scenario);

    }

    @And("I must navigate to ScheduleInfo section and should capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustNavigateToScheduleInfoSectionAndShouldCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs10", callSchedulePage.captureTimeHrs10(timehours));
        Assert.assertTrue("unable to captureTimeMins10", callSchedulePage.captureTimeMins10(timemins));
        Assert.assertTrue("unable to captureTimetype10", callSchedulePage.captureTimetype10(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs10", callSchedulePage.captureCallDurationHrs10(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins10(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert10(alert));
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

    @And("I select ScheduleVisitICF and must select the date and capture {string}{string}")
    public void iSelectScheduleVisitICFAndMustSelectTheDateAndCapture(String visitFromTime, String visitToTime) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickScheduleVisit", cRIOVisitSchedulePage.clickScheduleVisit());
        seleniumAdaptor.pauseFor(1);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
        Assert.assertTrue("unable to clickMore", cRIOVisitSchedulePage.clickMore());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickAdminUsha", cRIOVisitSchedulePage.clickAdminUsha());
//        Assert.assertTrue("unable to clickInvJoshna", cRIOVisitSchedulePage.clickInvJoshna());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO4", cRIOVisitSchedulePage.clickTimeSelectCRIO4());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
    }

    @And("I select ScheduleVisitScreening and must select the date and capture {string}{string}")
    public void iSelectScheduleVisitScreeningAndMustSelectTheDateAndCapture(String visitFromTime, String visitToTime) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickScheduleVisit", cRIOVisitSchedulePage.clickScheduleVisit());
        seleniumAdaptor.pauseFor(1);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
        Assert.assertTrue("unable to clickMore", cRIOVisitSchedulePage.clickMore());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickAdminUsha", cRIOVisitSchedulePage.clickAdminUsha());
//        Assert.assertTrue("unable to clickInvJoshna", cRIOVisitSchedulePage.clickInvJoshna());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO8", cRIOVisitSchedulePage.clickTimeSelectCRIO8());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
     }

    @And("I must navigate to Subject List and must enter {string} and fetch the record")
    public void iMustNavigateToSubjectListAndMustEnterAndFetchTheRecord(String subNum) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();
        Assert.assertTrue("unable to clickSubjects", cRIOSubjectCreationPage.clickSubjects());
        Assert.assertTrue("unable to captureSubjectSearch", cRIOSubjectListPage.captureSubjectSearch(subNum));

        Assert.assertTrue("unable to clickNameListCRIO", cRIOSubjectListPage.clickNameListCRIO());

//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
//        seleniumAction.scrollBy("0", "1400");
        seleniumAction.scrollBy("0", "300");

        takeScreenShotNew(this.scenario);
     }

    @And("I launch JConnect and must capture {string}{string} and click Signin")
    public void iLaunchJConnectAndMustCaptureAndClickSignin(String arg0, String arg1) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);

        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);

        webAppLoginPage.opentabJconnect2();


        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Jconnect CallSchedule must capture {string} and launch Screening meeting")
    public void iNavigateToJconnectCallScheduleMustCaptureAndLaunchScreeningMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickScreeningMeetingJconnect", callSchedulePage.clickScreeningMeetingJconnect());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();


    }

    @And("I launch the CRIO website")
    public void iLaunchTheCRIOWebsite() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);

        takeScreenShotNew(this.scenario);

        cRIOLoginPage.opentabCRIO();
        seleniumAdaptor.pauseFor(1);

        takeScreenShotNew(this.scenario);


     }

    @And("I select UnScheduleVisit and must select the date and capture {string}{string} and select the procuderes {string}{string}")
    public void iSelectUnScheduleVisitAndMustSelectTheDateAndCaptureAndSelectTheProcuderes(String visitFromTime, String visitToTime, String procedure1, String procedure2) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickCreateUnScheduleVisit", cRIOVisitSchedulePage.clickCreateUnScheduleVisit());
        seleniumAdaptor.pauseFor(1);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
        Assert.assertTrue("unable to clickMore", cRIOVisitSchedulePage.clickMore());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickAdminUsha", cRIOVisitSchedulePage.clickAdminUsha());
//        Assert.assertTrue("unable to clickInvJoshna", cRIOVisitSchedulePage.clickInvJoshna());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO9", cRIOVisitSchedulePage.clickTimeSelectCRIO9());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));


        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureprocedure1(procedure1));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureprocedure2(procedure2));

        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Jconnect CallSchedule must capture {string} and launch UnScheduled meeting")
    public void iNavigateToJconnectCallScheduleMustCaptureAndLaunchUnScheduledMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickUnscheduledMeetingJconnect", callSchedulePage.clickUnscheduledMeetingJconnect());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickStartJoinCall", callSchedulePage.clickStartJoinCall());
        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();


    }

    @And("I must navigate to WebApp and select the Unscheduled option")
    public void iMustNavigateToWebAppAndSelectTheUnscheduledOption() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        callSchedulePage.switchToTab0();

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());


        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickUnscheduled2", webAppLoginPage.clickUnscheduled1());
        seleniumAdaptor.pauseFor(2);


    }

    @And("I launch JConnect WebApp with {string}{string} password and select the Unscheduled option under Diary section")
    public void iLaunchJConnectWebAppWithPasswordAndSelectTheUnscheduledOptionUnderDiarySection(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();

        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        takeScreenShotNew(this.scenario);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());


        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickUnscheduled2", webAppLoginPage.clickUnscheduled1());
        seleniumAdaptor.pauseFor(2);





    }

    @And("I launch JConnect WebApp with {string}{string} password and select Screening in Diary section")
    public void iLaunchJConnectWebAppWithPasswordAndSelectScreeningInDiarySection(String phoneCode, String phoneNum) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
//        webAppLoginPage.opentabJconnectWebApp();

        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode2(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());


        takeScreenShotNew(this.scenario);


        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());


        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        seleniumAdaptor.pauseFor(4);
        Assert.assertTrue("unable to clickDiary", webAppLoginPage.clickDiary());
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickScreening", webAppLoginPage.clickScreening());
        seleniumAdaptor.pauseFor(2);

    }

    @And("I select SaferVisit and must select the date and capture {string}{string}")
    public void iSelectSaferVisitAndMustSelectTheDateAndCapture(String visitFromTime, String visitToTime) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickScheduleVisit", cRIOVisitSchedulePage.clickScheduleVisit());
        seleniumAdaptor.pauseFor(1);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
        Assert.assertTrue("unable to clickMore", cRIOVisitSchedulePage.clickMore());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickAdminUsha", cRIOVisitSchedulePage.clickAdminUsha());
//        Assert.assertTrue("unable to clickInvJoshna", cRIOVisitSchedulePage.clickInvJoshna());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO5", cRIOVisitSchedulePage.clickTimeSelectCRIO5());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));


        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
    }


    @And("I select WeekOne Baseline and must select the date and capture {string}{string}")
    public void iSelectWeekOneBaselineAndMustSelectTheDateAndCapture(String visitFromTime, String visitToTime) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        cRIOLoginPage = new CRIOLoginPage(driver);
        cRIOSubjectCreationPage = new CRIOSubjectCreationPage(driver);
        cRIOSubjectListPage = new CRIOSubjectListPage(driver);
        cRIOVisitSchedulePage = new CRIOVisitSchedulePage(driver);

        takeScreenShotNew(this.scenario);


//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
//        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickScheduleVisit", cRIOVisitSchedulePage.clickScheduleVisit());
        seleniumAdaptor.pauseFor(1);
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");
        Assert.assertTrue("unable to clickMore", cRIOVisitSchedulePage.clickMore());
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickAdminUsha", cRIOVisitSchedulePage.clickAdminUsha());
//        Assert.assertTrue("unable to clickInvJoshna", cRIOVisitSchedulePage.clickInvJoshna());
        seleniumAdaptor.scrollDown();
        seleniumAction.scrollBy("0", "300");


        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickCalendarToday());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeSelectCRIO7", cRIOVisitSchedulePage.clickTimeSelectCRIO7());
        Assert.assertTrue("unable to captureVisitFromTime", cRIOVisitSchedulePage.captureVisitFromTime(visitFromTime));
        Assert.assertTrue("unable to captureVisitToTime", cRIOVisitSchedulePage.captureVisitToTime(visitToTime));


        Assert.assertTrue("unable to clickCalendarToday", cRIOVisitSchedulePage.clickSaveTimeCRIO());

        takeScreenShotNew(this.scenario);
    }

    @And("I launch JConnect WebApp with {string}{string} password and should join the Safer meeting from WebApp and conclude")
    public void iLaunchJConnectWebAppWithPasswordAndShouldJoinTheSaferMeetingFromWebAppAndConclude(String phoneCode, String phoneNum) {
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

        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab2();
        driver.close();
        callSchedulePage.switchToTab0();
        callSchedulePage.switchToTab1();

        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
//        Assert.assertTrue("unable to clickICF", webAppLoginPage.clickICF());
        Assert.assertTrue("unable to clickWebAppSafermeeting1", webAppLoginPage.clickWebAppSafermeeting1());
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


        Assert.assertTrue("unable to clickEndCallWebApp2", webAppLoginPage.clickEndCallWebApp2());
        //        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();
        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        seleniumAdaptor.pauseFor(1);
//        Assert.assertTrue("unable to clickEndCallJconnect1", callSchedulePage.clickEndCallJconnect1());

        Assert.assertTrue("unable to clickEndCallJconnect2", callSchedulePage.clickEndCallJconnect2());
//        seleniumAdaptor.pauseFor(30);
        takeScreenShotNew(this.scenario);
//        driver.close();

        callSchedulePage.switchToTab0();
        takeScreenShotNew(this.scenario);

        driver.close();

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab0();
        seleniumAdaptor.pauseFor(1);


    }

    @And("I launch JConnect and must capture {string}{string} and should click Signin")
    public void iLaunchJConnectAndMustCaptureAndShouldClickSignin(String arg0, String arg1) {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);

        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);

        webAppLoginPage.opentabJconnect3();


        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Jconnect CallSchedule and must capture {string} and launch SAFER Interview meeting")
    public void iNavigateToJconnectCallScheduleAndMustCaptureAndLaunchSAFERInterviewMeeting(String ScheduleCallsubject) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        driver.close();
        callSchedulePage.switchToTab1();
        callSchedulePage.switchToTab0();
        driver.close();
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


    @And("I navigate to StudyList List and must capture {string} and fetch the record")
    public void iNavigateToStudyListListAndMustCaptureAndFetchTheRecord(String studyNum) {
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
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickStudyListSearch", studyListPage.clickStudyListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", studyListPage.clickStudyNumberMRN(studyNum));
        seleniumAdaptor.pauseFor(2);

        takeScreenShotNew(this.scenario);

        putValue("SponsorNameStudy", studyListPage.getSponsorNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The SponsorNameStudy in JConnect is :" + getValue("SponsorNameStudy"));
        validate("MedPlusInc", studyListPage.getSponsorNameStudy());
        putValue("VersionName", studyListPage.getVersionNameStudy());
        ExtentCucumberAdapter.addTestStepLog("The VersionName Study in JConnect is :" + getValue("VersionName"));
        validate("Version 13.0", studyListPage.getVersionNameStudy());

        Assert.assertTrue("unable to clickStudyLanguage", studyListPage.clickStudyLanguage());
        studyListPage.CheckingChkboxLanguageSource();
        studyListPage.CheckingChkboxLanguageTarget();

        Assert.assertTrue("unable to clickMappedOrg", studyListPage.clickMappedOrg());
        seleniumAdaptor.pauseFor(2);
        putValue("StudyOrgName", studyListPage.getStudyOrgName());
        ExtentCucumberAdapter.addTestStepLog("The StudyOrganisation Name in JConnect is :" + getValue("StudyOrgName"));
        validate("160 - The Bishop Center for Translational Neuroscience", studyListPage.getStudyOrgName());


    }

    @And("I capture {string} and check the same in the Page Header")
    public void iCaptureAndCheckTheSameInThePageHeader(String study2) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickEditSite", subjectCreatePage.clickEditSite());

        Assert.assertTrue("unable to captureStudy", subjectCreatePage.captureStudy(study2));

        Assert.assertTrue("unable to clickSite", subjectCreatePage.clickSite());

        putValue("StudyName1", subjectCreatePage.getStudyName());
        ExtentCucumberAdapter.addTestStepLog("The New StudyName in JConnect is  " + getValue("StudyName1"));


        putValue("SiteName", subjectCreatePage.getSiteName());
        validate("160 - The Bishop Center for Translational Neuroscience", subjectCreatePage.getSiteName());
        ExtentCucumberAdapter.addTestStepLog("The SiteName in JConnect is  " + getValue("SiteName"));


    }

    @And("I click on Subject and CreateSubject Option and should capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnSubjectAndCreateSubjectOptionAndShouldCapture(String firstname, String lastname, String site, String subNum, String subExtID, String phoneCode, String phoneNum, String email, String role, String startDate, String language) {
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
        Assert.assertTrue("unable to clickCreate1", subjectCreatePage.clickCreate1());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureFirstName", subjectCreatePage.captureFirstName(firstname));
        Assert.assertTrue("unable to captureLastName", subjectCreatePage.captureLastName(lastname));
        Assert.assertTrue("unable to captureSelectSite2", subjectCreatePage.captureSelectSite2(site));
        Assert.assertTrue("unable to captureSubjectNumMRN", subjectCreatePage.captureSubjectNumMRN(subNum));
        Assert.assertTrue("unable to captureSubjectExtID", subjectCreatePage.captureSubjectExtID(subExtID));
        Assert.assertTrue("unable to capturePhoneNumCode", subjectCreatePage.capturePhoneNumCode(phoneCode));
        Assert.assertTrue("unable to captureUserName", subjectCreatePage.capturePhoneNum(phoneNum));
        Assert.assertTrue("unable to capturePhoneNum", subjectCreatePage.captureEmail(email));
        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole(role));
        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail(email));
//        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole1(role));

//        Assert.assertTrue("unable to clickCustomDate", subjectCreatePage.clickCustomDate());

//        Assert.assertTrue("unable to clickCustomDateIfAvailable", subjectCreatePage.clickCustomDateIfAvailable());
//        Assert.assertTrue("unable to clickCalenderIconSubjectCreate", subjectCreatePage.clickCalenderIconSubjectCreate());
//        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(startDate));
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

        Assert.assertTrue("unable to clickSubCreationOK", subjectCreatePage.clickSubCreationOK());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(4);
        amazonWebMailPage.CheckingChkboxScreening();
        putValue("Chktxt", amazonWebMailPage.getCheckingChkboxScreening());
        validate("", amazonWebMailPage.getCheckingChkboxScreening());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
     }

    @And("I navigate to StudyList List and should capture {string} and fetch the record")
    public void iNavigateToStudyListListAndShouldCaptureAndFetchTheRecord(String studyNum) {
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
//        seleniumAdaptor.pauseFor(2);
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

        Assert.assertTrue("unable to clickStudyLanguage", studyListPage.clickStudyLanguage());
        studyListPage.CheckingChkboxLanguageSource();
        studyListPage.CheckingChkboxLanguageTarget();

        Assert.assertTrue("unable to clickMappedOrg", studyListPage.clickMappedOrg());
        seleniumAdaptor.pauseFor(2);
        putValue("StudyOrgName", studyListPage.getStudyOrgName());
        ExtentCucumberAdapter.addTestStepLog("The StudyOrganisation Name in JConnect is :" + getValue("StudyOrgName"));
        validate("160 - The Bishop Center for Translational Neuroscience", studyListPage.getStudyOrgName());


    }

    @And("I click on Subject and CreateSubject Option and should be able to capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
    public void iClickOnSubjectAndCreateSubjectOptionAndShouldBeAbleToCapture(String firstname, String lastname, String site, String subNum, String subExtID, String phoneCode, String phoneNum, String email, String role, String startDate, String language) {
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
        Assert.assertTrue("unable to captureSelectSite2", subjectCreatePage.captureSelectSite2(site));
        Assert.assertTrue("unable to captureSubjectNumMRN", subjectCreatePage.captureSubjectNumMRN(subNum));
        Assert.assertTrue("unable to captureSubjectExtID", subjectCreatePage.captureSubjectExtID(subExtID));
        Assert.assertTrue("unable to capturePhoneNumCode", subjectCreatePage.capturePhoneNumCode(phoneCode));
        Assert.assertTrue("unable to captureUserName", subjectCreatePage.capturePhoneNum(phoneNum));
        Assert.assertTrue("unable to capturePhoneNum", subjectCreatePage.captureEmail(email));
        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole(role));
        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail(email));
//        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole1(role));

//        Assert.assertTrue("unable to clickCustomDate", subjectCreatePage.clickCustomDate());

//        Assert.assertTrue("unable to clickCustomDateIfAvailable", subjectCreatePage.clickCustomDateIfAvailable());
//        Assert.assertTrue("unable to clickCalenderIconSubjectCreate", subjectCreatePage.clickCalenderIconSubjectCreate());
//        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(startDate));
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

        Assert.assertTrue("unable to clickSubCreationOK", subjectCreatePage.clickSubCreationOK());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(4);
        amazonWebMailPage.CheckingChkboxScreening();
        putValue("Chktxt", amazonWebMailPage.getCheckingChkboxScreening());
        validate("", amazonWebMailPage.getCheckingChkboxScreening());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
    }

    @And("I must navigate to ScheduleInfo section and must be able to capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustNavigateToScheduleInfoSectionAndMustBeAbleToCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs3", callSchedulePage.captureTimeHrs3(timehours));
        Assert.assertTrue("unable to captureTimeMins4", callSchedulePage.captureTimeMins4(timemins));
        Assert.assertTrue("unable to captureTimetype3", callSchedulePage.captureTimetype3(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs4", callSchedulePage.captureCallDurationHrs4(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins4", callSchedulePage.captureCallDurationMins4(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert4", callSchedulePage.captureAlert4(alert));
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

    @And("I navigate to Schedule a Call screen and should capture {string} {string}{string}")
    public void iNavigateToScheduleACallScreenAndShouldCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject5", callSchedulePage.captureScheduleTeleVisitSubject5(ScheduleCallsubject));

//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }

    @And("I must navigate to ScheduleInfo section and should be able to capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustNavigateToScheduleInfoSectionAndShouldBeAbleToCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs3", callSchedulePage.captureTimeHrs3(timehours));
        Assert.assertTrue("unable to captureTimeMins4", callSchedulePage.captureTimeMins4(timemins));
        Assert.assertTrue("unable to captureTimetype3", callSchedulePage.captureTimetype3(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs4", callSchedulePage.captureCallDurationHrs4(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins4", callSchedulePage.captureCallDurationMins4(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert4", callSchedulePage.captureAlert4(alert));
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

    @And("I capture {string} and check same in the Page Header")
    public void iCaptureAndCheckSameInThePageHeader(String study2) {
        callSchedulePage = new CallSchedulePage(driver);

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);


        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);


        Assert.assertTrue("unable to clickEditSite", subjectCreatePage.clickEditSite());

        Assert.assertTrue("unable to captureStudy", subjectCreatePage.captureStudy(study2));

        Assert.assertTrue("unable to clickSite1", subjectCreatePage.clickSite1());

        putValue("StudyName1", subjectCreatePage.getStudyName());
        ExtentCucumberAdapter.addTestStepLog("The New StudyName in JConnect is  " + getValue("StudyName1"));


        putValue("SiteName", subjectCreatePage.getSiteName());
        validate("CrioTestSite", subjectCreatePage.getSiteName());
        ExtentCucumberAdapter.addTestStepLog("The SiteName in JConnect is  " + getValue("SiteName"));


    }

    @And("I should be able to navigate to the ScheduleInfo section and must capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iShouldBeAbleToNavigateToTheScheduleInfoSectionAndMustCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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

    @And("I should navigate to ScheduleInfo section and should be able to capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iShouldNavigateToScheduleInfoSectionAndShouldBeAbleToCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrs10", callSchedulePage.captureTimeHrs10(timehours));
        Assert.assertTrue("unable to captureTimeMins10", callSchedulePage.captureTimeMins10(timemins));
        Assert.assertTrue("unable to captureTimetype10", callSchedulePage.captureTimetype10(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrs10", callSchedulePage.captureCallDurationHrs10(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins10(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert10(alert));
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

    @And("I must be able to navigate to the ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustBeAbleToNavigateToTheScheduleInfoSectionAndCapture(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureCallDurationHrs6", callSchedulePage.captureCallDurationHrs6(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMins7", callSchedulePage.captureCallDurationMins7(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert11", callSchedulePage.captureAlert11(alert));
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

    @And("I navigate to CallSchedule and ScheduleTelevisit for SaferVisit and must capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForSaferVisitAndMustCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
     }

    @And("I navigate to CallSchedule and ScheduleTelevisit for WeekOneBaseLine and must capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForWeekOneBaseLineAndMustCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
    }

    @And("I navigate to CallSchedule and ScheduleTelevisit for WeekOne and must capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForWeekOneAndMustCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {

        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
     }

    @And("I navigate to Schedule a Call screen and capture {string} click AddGuest and should capture {string}{string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndCaptureClickAddGuestAndShouldCapture(String title, String guestname, String guestemail, String ScheduleCallsubject, String ScheduleCallsitestaff) {
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
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


      }

    @And("I navigate to Schedule a Call screen and should be able to capture {string}{string}{string}")
    public void iNavigateToScheduleACallScreenAndShouldBeAbleToCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);

      }

    @And("I click on SaveandNext and click Validate Credentials")
    public void iClickOnSaveandNextAndClickValidateCredentials() {
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
        Assert.assertTrue("unable to clickValidateCredentials", subjectListPage.clickValidateCredentials());
        seleniumAdaptor.pauseFor(5);
        Assert.assertTrue("unable to clickAuthorVisitSave", subjectListPage.clickAuthorVisitSave());
        seleniumAdaptor.pauseFor(2);
     }



    @And("I click on SaveandNext and click Validate Credentials with {string}{string} and click Signin")
    public void iClickOnSaveandNextAndClickValidateCredentialsWithAndClickSignin(String username, String password) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);




        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        seleniumAction.scrollBy("0", "1400");

        Assert.assertTrue("unable to clickSaveandNext", subjectListPage.clickSaveandNext());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickValidateCredentials", subjectListPage.clickValidateCredentials());
        seleniumAdaptor.pauseFor(6);


        Assert.assertTrue("unable to captureUserName", jCollaborateQALoginPage.captureUserName(username));
        Assert.assertTrue("unable to capturePassword", jCollaborateQALoginPage.capturePassword(password));

        Assert.assertTrue("unable to clickValidateCredentials1", jCollaborateQALoginPage.clickValidateCredentials1());
        seleniumAdaptor.pauseFor(4);
        ExtentCucumberAdapter.addTestStepLog("Loged into Jconnect Successfully");
        takeScreenShotNew(this.scenario);
    }

    @And("I capture {string} and save")
    public void iCaptureAndSave(String SelectAuthorVisitStatementTestementType) {
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

        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.SelectAuthorVisitStatementTestementType(SelectAuthorVisitStatementTestementType));
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickAuthorVisitSave", subjectListPage.clickAuthorVisitSave());
        seleniumAdaptor.pauseFor(2);
    }

    @And("I must be able to navigate to ScheduleInfo section and must capture the {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustBeAbleToNavigateToScheduleInfoSectionAndMustCaptureThe(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        seleniumAdaptor.pauseFor(3);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.clickCalenderIcon());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureDateCalendar", callSchedulePage.captureDateCalendar(date));
        seleniumAdaptor.pauseFor(2);

        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        //        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
        Assert.assertTrue("unable to captureTimeHrs1", callSchedulePage.captureTimeHrs1(timehours));
        Assert.assertTrue("unable to captureTimeMins1", callSchedulePage.captureTimeMins1(timemins));
        Assert.assertTrue("unable to captureTimetype1", callSchedulePage.captureTimetype1(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
//        Assert.assertTrue("unable to captureCallDurationHrs3", callSchedulePage.captureCallDurationHrs3(calldurationHrs));
//        Assert.assertTrue("unable to captureCallDurationMins3", callSchedulePage.captureCallDurationMins3(calldurationMins));
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureCallDurationHrs9", callSchedulePage.captureCallDurationHrs9(calldurationHrs));

        Assert.assertTrue("unable to captureCallDurationHrs7", callSchedulePage.captureCallDurationHrs7(calldurationHrs));
        seleniumAdaptor.pauseFor(1);
        Assert.assertTrue("unable to captureCallDurationMins11", callSchedulePage.captureCallDurationMins11(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlert12", callSchedulePage.captureAlert12(alert));

//        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureCallDurationMins9", callSchedulePage.captureCallDurationMins3(calldurationMins));
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureAlert9", callSchedulePage.captureAlert3(alert));

        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(2);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//


    }

    @And("I launch the JConnect WebApp and capture {string}{string}\"password and click login")
    public void iLaunchTheJConnectWebAppAndCapturePasswordAndClickLogin(String phoneCode, String phoneNum) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
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

//        seleniumAdaptor.pauseFor(10);

    }


    @And("I must capture {string} and save")
    public void iMustCaptureAndSave(String WebAppTimeZone) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);


        takeScreenShotNew(this.scenario);

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSelectTimeZone());

        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to captureTimeZoneWebApp", webAppLoginPage.captureTimeZoneWebApp(WebAppTimeZone));
        seleniumAdaptor.pauseFor(1);

        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());
//        seleniumAdaptor.pauseFor(10);

    }

    @And("I navigate to Subject List and enter {string} and should fetch the record")
    public void iNavigateToSubjectListAndEnterAndShouldFetchTheRecord(String firstname) {
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
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

    }

    @And("I navigate to Subject List and enter {string} and must fetch the record and capture {string} check the forms for AUDIT CHRTSR PHQ")
    public void iNavigateToSubjectListAndEnterAndMustFetchTheRecordAndCaptureCheckTheFormsForAUDITCHRTSRPHQ(String firstname, String visit) {
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
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit1", subjectListPage.SelectVisit1(visit));
        seleniumAdaptor.pauseFor(1);

        subjectListPage.getFormsPHQ();
        subjectListPage.getFormsAUDIT();
        subjectListPage.getFormsCHRTSR();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Subject List and enter {string} and fetch the record and capture {string} and must click AUDIT form and click AuditFormTrial and click on Export")
    public void iNavigateToSubjectListAndEnterAndFetchTheRecordAndCaptureAndMustClickAUDITFormAndClickAuditFormTrialAndClickOnExport(String firstname, String visit) {
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
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickDiarySubjectList", subjectListPage.clickDiarySubjectList());
        Assert.assertTrue("unable to SelectVisit1", subjectListPage.SelectVisit1(visit));
        seleniumAdaptor.pauseFor(1);


        Assert.assertTrue("unable to clickFormsAUDIT", subjectListPage.clickFormsAUDIT());
        Assert.assertTrue("unable to clickFormAuditTrial", subjectListPage.clickFormAuditTrial());
        Assert.assertTrue("unable to clickExport", subjectListPage.clickExport());
        Assert.assertTrue("unable to clickBack()", subjectListPage.clickBack());
        Assert.assertTrue("unable to clickAction()", subjectListPage.clickAction());
        Assert.assertTrue("unable to clickPrint()", subjectListPage.clickPrint());
//        driver.close();
        callSchedulePage.switchToTab0();


        subjectListPage.getFormsPHQ();
        subjectListPage.getFormsAUDIT();
        subjectListPage.getFormsCHRTSR();
        takeScreenShotNew(this.scenario);

    }

    @And("I navigate to Subject List and enter {string} and must fetch the record and click on send notification and capture {string} and send")
    public void iNavigateToSubjectListAndEnterAndMustFetchTheRecordAndClickOnSendNotificationAndCaptureAndSend(String firstname, String message) {
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
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickActionSubjectList()", subjectListPage.clickActionSubjectList());
        Assert.assertTrue("unable to captureMessageToSubject", subjectListPage.captureMessageToSubject(message));
        Assert.assertTrue("unable to clickSendMsg", subjectListPage.clickSendMsg());
        seleniumAdaptor.pauseFor(1);

        callSchedulePage.switchToTab0();

    }

    @And("I navigate to Subject List and enter {string} and must fetch the record and visit SubjectDetails and change the status by capturing {string}and save")
    public void iNavigateToSubjectListAndEnterAndMustFetchTheRecordAndVisitSubjectDetailsAndChangeTheStatusByCapturingAndSave(String firstname, String reasonForChange) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSubjectDetails()", subjectCreatePage.clickSubjectDetails());
        Assert.assertTrue("unable to clickSubViewEncryptedData", subjectCreatePage.clickSubViewEncryptedData());
        Assert.assertTrue("unable to clickStatusChange1", subjectCreatePage.clickStatusChange1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectCreatePage.captureReasonForChange(reasonForChange));
        Assert.assertTrue("unable to click OK button", subjectCreatePage.clickSubCreationOK());
        Assert.assertTrue("unable to clickSaveandNext", subjectCreatePage.clickSaveandNext());
        Assert.assertTrue("unable to click OK button", subjectCreatePage.clickSubCreationOK());
        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
     }

    @And("I navigate to Subject List and enter {string} and should fetch the record and check the Status")
    public void iNavigateToSubjectListAndEnterAndShouldFetchTheRecordAndCheckTheStatus(String firstname) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        subjectListPage.getStatus1();
        putValue("Status", subjectListPage.getStatus1());
        validate("Inactive", subjectListPage.getStatus1());
        ExtentCucumberAdapter.addTestStepLog("The Subject Status is :" + getValue("Status"));
        takeScreenShotNew(this.scenario);


      }

    @And("I navigate to Subject List and must enter {string} and must be able to fetch the record")
    public void iNavigateToSubjectListAndMustEnterAndMustBeAbleToFetchTheRecord(String firstname) {
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

    }

    @And("I click on SubjectDetails section and must click View Encrypted Data and retrieve the PhoneNum and Email")
    public void iClickOnSubjectDetailsSectionAndMustClickViewEncryptedDataAndRetrieveThePhoneNumAndEmail() {
        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);



        seleniumAdaptor.pauseFor(2);
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectDetails", subjectCreatePage.clickSubjectDetails());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectDetails", subjectCreatePage.clickSubViewEncryptedData());
        subjectCreatePage.getPhoneNum();
        subjectCreatePage.getSubEmail();
        takeScreenShotNew(this.scenario);
    }

    @And("I navigate to Jconnect CallSchedule capture {string} and launch Screening meeting and should amend {string}{string}{string} and reschedule call")
    public void iNavigateToJconnectCallScheduleCaptureAndLaunchScreeningMeetingAndShouldAmendAndRescheduleCall(String ScheduleCallsubject, String timehours, String timemins, String timetype) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(ScheduleCallsubject));
        Assert.assertTrue("unable to clickScreeningMeetingJconnect", callSchedulePage.clickScreeningMeetingJconnect());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickTimeIcon", callSchedulePage.clickTimeIcon());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to captureTimeHrs5", callSchedulePage.captureTimeHrs5(timehours));
        Assert.assertTrue("unable to captureTimeMins6", callSchedulePage.captureTimeMins6(timemins));
        Assert.assertTrue("unable to captureTimetype7", callSchedulePage.captureTimetype7(timetype));

        Assert.assertTrue("unable to clickRescheduleCall", callSchedulePage.clickRescheduleCall());

        seleniumAdaptor.pauseFor(1);
        callSchedulePage.switchToTab1();

     }

    @And("I navigate to Subject List and enter {string} and must fetch the record and must check the Status")
    public void iNavigateToSubjectListAndEnterAndMustFetchTheRecordAndMustCheckTheStatus(String firstname) {
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
        callSchedulePage.switchToTab0();
        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSubjectListMenu1", subjectListPage.clickSubjectListMenu1());
        Assert.assertTrue("unable to captureSubjectListSearch", subjectListPage.captureSubjectListSearch(firstname));
        Assert.assertTrue("unable to clickSubjectListSearch", subjectListPage.clickSubjectListSearch());
//        Assert.assertTrue("unable to clickSubNumberMRN", subjectListPage.clickSubNumberMRN(firstname));

        seleniumAdaptor.pauseFor(2);
        subjectListPage.getStatus2();
        putValue("Status", subjectListPage.getStatus2());
        validate("Not Started", subjectListPage.getStatus2());
        ExtentCucumberAdapter.addTestStepLog("The Subject Status is :" + getValue("Status"));
        takeScreenShotNew(this.scenario);


     }

    @And("I click on CallSchedule and capture {string}{string}{string}{string}{string} and must click on Schedule Visit")
    public void iClickOnCallScheduleAndCaptureAndMustClickOnScheduleVisit(String time, String study, String site, String subject, String sitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));
//        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureStudyMain(study));
//        Assert.assertTrue("unable to captureSiteMain", callSchedulePage.captureSiteMain(site));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureStudy(study));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureSite(site));
        Assert.assertTrue("unable to captureSubject11", callSchedulePage.captureSubject11(subject));
        Assert.assertTrue("unable to captureSiteStaffMain", callSchedulePage.captureSiteStaffMain(sitestaff));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
        seleniumAdaptor.pauseFor(1);


     }

    @And("I must navigate to ScheduleInfo section and must be able to capture the {string}{string}{string}{string}{string}{string}{string}{string}")
    public void iMustNavigateToScheduleInfoSectionAndMustBeAbleToCaptureThe(String date, String timehours, String timemins, String timetype, String timeZone, String calldurationHrs, String calldurationMins, String alert) {
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
        Assert.assertTrue("unable to captureTimeHrsSchedInfo", callSchedulePage.captureTimeHrsSchedInfo(timehours));
        Assert.assertTrue("unable to captureTimeMinsSchedInfo", callSchedulePage.captureTimeMinsSchedInfo(timemins));
        Assert.assertTrue("unable to captureTimetypeSchedInfo", callSchedulePage.captureTimetypeSchedInfo(timetype));

        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
        Assert.assertTrue("unable to captureCallDurationHrsSchedInfo", callSchedulePage.captureCallDurationHrsSchedInfo(calldurationHrs));
        Assert.assertTrue("unable to captureCallDurationMinsSchedInfo", callSchedulePage.captureCallDurationMinsSchedInfo(calldurationMins));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to captureAlertSchedInfo", callSchedulePage.captureAlertSchedInfo(alert));
        seleniumAdaptor.pauseFor(1);
        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate1(date));
//        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime1(time));
//        Assert.assertTrue("unable to captureHost", callSchedulePage.captureHost(host));
//        seleniumAdaptor.pauseFor(5);


        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
        seleniumAdaptor.pauseFor(4);

//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to clickScheduleCall", callSchedulePage.clickScheduleCall());
//


    }

    @And("I must navigate to CallSchedule and ScheduleTelevisit for Screening and must capture {string} {string}{string}")
    public void iMustNavigateToCallScheduleAndScheduleTelevisitForScreeningAndMustCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject5", callSchedulePage.captureScheduleTeleVisitSubject5(ScheduleCallsubject));

//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff3", callSchedulePage.captureScheduleTeleVisitSiteStaff3(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }
}
