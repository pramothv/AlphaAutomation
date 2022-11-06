//package stepdefinition;
//
//import Utility.PropertiesFileReader;
//import base.BaseClass;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import pageObject.*;
//import seleniumaction.SeleniumAction;
//import seleniumadaptor.SeleniumAdaptor;
//
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//public class ILABFlow extends BaseClass {
//
//    PropertiesFileReader obj = new PropertiesFileReader();
//    SearchPageObject searchPageObject;
//    SeleniumAction seleniumAction;
//    SeleniumAdaptor seleniumAdaptor;
//    public IlabPageObjects ilabPageObjects;
//    public JCollaborateQALoginPage jCollaborateQALoginPage;
//
//    public AmazonWebMailPage amazonWebMailPage;
//    public WebAppLoginPage webAppLoginPage;
//    public CallSchedulePage callSchedulePage;
//    public JCollaborateWelcomePage jCollaborateWelcomePage;
//
//    public SubjectCreatePage subjectCreatePage;
//    private Scenario scenario;
//    public static ExtentTest extentTest;
//    //    private final Logger logger = Logger.getLogger(ILABFlow.class);
////  private static final Logger logger = logger.getLogger(ILABFlow.class);
//    private static Logger logger = LogManager.getLogger(ILABFlow.class);
//
//    public ILABFlow() {
//    }
//
//    public ILABFlow(WebDriver driver) {
//        super(driver);
//    }
//
//    @Before
//    public void initializeScenario(Scenario scenario) throws Exception {
//        this.scenario = scenario;
//        Properties properties = obj.getProperty();
//        System.out.println(properties);
//        openBrowser(properties.getProperty("browser.baseURL"));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
////            takeScreenShot(scenario);
//
////            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
////            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshotTaken,"image/png", "error screen");
//
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(src, "image/png", "screenshot");
//        }
//
//        try {
//            driver.quit();
//        } catch (Exception e) {
//            System.out.println(String.valueOf(e));
//        }
//    }
//
//
////
////    @Before
////    public void Setup() {
////        ExtentHtmlReporter reporter  = new ExtentHtmlReporter();
////        this.scenario = scenario;
////        Properties properties=obj.getProperty();
////        System.out.println(properties);
////        openBrowser( properties.getProperty("browser.baseURL"));
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////    }
//
////    @After
////    public void tearDown(Scenario scenario) {
////        if(scenario.isFailed()) {
////            takeScreenShot(scenario);
//////            byte [] screenshotTaken=  ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
//////            byte [] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
//////            scenario.attach(screenshotTaken,"image/png", "error screen");
////        }
////
////        try {
////            driver.quit();
////        }
////        catch(Exception e) {
////            System.out.println(String.valueOf(e));
////        }
////    }
//
//
////    @AfterStep
////    public void attachScreenshot(Scenario scenario){
////
////        if(scenario.isFailed()) {
////
////            byte[] screenshotTaken = ((TakesScreenshot) getDrivers()).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshotTaken, "image/png", "error screen");
////        }
////            try {
////            driver.quit();
////        }
////        catch(Exception e) {
////            System.out.println(String.valueOf(e));
////        }
////    }
//
//
//    @Given("I want to apply from ILab side")
//    public void iWantToApplyFromILabSide() throws InterruptedException {
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//        takeScreenShotNew(this.scenario);
//        takeScreenShotNew(this.scenario);
////        putValue("EPN",ilabPageObjects.getclickCareeLinkTxt1());
////        ExtentCucumberAdapter.addTestStepLog("This is good" + getValue("EPN"));
////        validate("", ilabPageObjects.getclickCareeLinkTxt1());
//
//        seleniumAdaptor.pauseFor(2);
////       Assert.assertTrue("unable to click the careerLink",ilabPageObjects.clickCareeLink());
//
////        ilabPageObjects.click();
//
//        ilabPageObjects.GetInTouch();
////       ilabPageObjects.clickcareermouseover();
//        logger.info("career link clicked");
//        takeScreenShotNew(this.scenario);
////        Reporter.addStepLog("The EPN");
//
//
//    }
//
//
//    @And("select south Africa link")
//    public void selectSouthAfricaLink() throws InterruptedException {
//        ilabPageObjects = new IlabPageObjects(driver);
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
//        Assert.assertTrue("unable to click the careerLink", ilabPageObjects.clickSouthAfrica());
//        logger.info("south Africa has been cicked");
////        Reporter.addStepLog("The nedlock id is");
//
//    }
//
//    @And("select the the advertised Jobs")
//    public void selectTheTheAdvertisedJobs() throws InterruptedException {
//        ilabPageObjects = new IlabPageObjects(driver);
//        Assert.assertTrue("unable to click on the job application", ilabPageObjects.clickFirstJob());
//        //ilabPageObjects.clickFirstPost();
//        logger.info("first job has been clicked");
//    }
//
//    @And("click on the apply online link")
//    public void clickOnTheApplyOnlineLink() {
//
//    }
//
//    @Then("i should be able to submit the application and quite the browser")
//    public void iShouldBeAbleToSubmitTheApplicationAndQuiteTheBrowser() throws InterruptedException {
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//        seleniumAction.scrollBy("0", "1400");
//
//        Assert.assertTrue("unable to type in email address", ilabPageObjects.clickAndValidateMsg());
//        validate("Please complete all required fields.", ilabPageObjects.getValidateMsg());
//        seleniumAdaptor.pauseFor(2);
//        putValue("MSG", ilabPageObjects.getValidateMsg());
//        seleniumAdaptor.pauseFor(2);
//        takeScreenShotNew(this.scenario);
//        ExtentCucumberAdapter.addTestStepLog("The message is " + getValue("MSG"));
//        takeScreenShotNew(this.scenario);
//
//    }
//
//    @And("I type in my personal details {string} and {string} {string} {string}")
//    public void iTypeInMyPersonalDetailsAnd(String name, String surname, String email, String msg) {
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//
//        Assert.assertTrue("unable to switch to frame", ilabPageObjects.swichToFrame());
//        seleniumAction.scrollBy("0", "1000");
//        Assert.assertTrue("unable to type in the name", ilabPageObjects.CaptureName(name));
//
//        Assert.assertTrue("unable to type in the name", ilabPageObjects.CaptureSurname(surname));
//        Assert.assertTrue("unable to type in email address", ilabPageObjects.TypeEmail(email));
//        Assert.assertTrue("unable to type in email address", ilabPageObjects.CaptureMsg(msg));
//        Assert.assertTrue("unable to type in cell number", ilabPageObjects.TypeCellNum());
//    }
//
//    @Given("I want to click training")
//    public void iWantToClickTraining() throws InterruptedException {
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//        takeScreenShotNew(this.scenario);
//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(2);
//
////        Assert.assertTrue("unable to click on the training",  ilabPageObjects.clicktraining1());
////                ilabPageObjects.clicktraining1();
//        Assert.assertTrue("unable to click on the training", ilabPageObjects.clicktraining2());
//        ExtentCucumberAdapter.addTestStepLog("The message is  Clicked");
//
//
//    }
//
//    @And("I click on contact us")
//    public void iClickOnContactUs() throws InterruptedException {
//
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//        Assert.assertTrue("unable to click on the job application", ilabPageObjects.clickcontactus());
//
//    }
//
//    @And("I type in my details {string} and {string} {string} {string}")
//    public void iTypeInMyDetailsAnd(String name, String surname, String email, String msg) {
//
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to switch to frame", ilabPageObjects.swichToFrame());
//        seleniumAction.scrollBy("0", "1000");
//
////        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureName(name));
//        Assert.assertTrue("unable to type in the name", ilabPageObjects.CaptureName1(name));
////        Assert.assertTrue("unable to type in the name",ilabPageObjects.CaptureSurname(surname));
//        Assert.assertTrue("unable to type in the name", ilabPageObjects.CaptureSurname1(surname));
////        Assert.assertTrue("unable to type in email address",ilabPageObjects.TypeEmail(email));
//        Assert.assertTrue("unable to type in email address", ilabPageObjects.TypeEmail1(email));
////        Assert.assertTrue("unable to type in email address",ilabPageObjects.CaptureMsg(msg));
//        Assert.assertTrue("unable to type in email address", ilabPageObjects.CaptureMsg1(msg));
////        Assert.assertTrue("unable to type in cell number",ilabPageObjects.TypeCellNum());
//        Assert.assertTrue("unable to type in cell number", ilabPageObjects.TypeCellNum1());
//        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(4);
//
//    }
//
//
//    @Given("I capture {string}{string} and click Signin")
//    public void iCaptureAndClickSignin(String username, String password) {
//
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
//
//        takeScreenShotNew(this.scenario);
//
//
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
//
//    }
//
//    @When("I click on JConnectBuild Option")
//    public void iClickOnJConnectBuildOption() {
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
//        subjectCreatePage = new SubjectCreatePage(driver);
//        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
//
//
////        seleniumAdaptor.pauseFor(4);
//        takeScreenShotNew(this.scenario);
//
//        Assert.assertTrue("unable to clickJConnectBuild", jCollaborateWelcomePage.clickJConnectBuild());
//    }
//
//
//    @And("I click on Subject and CreateSubject Option and capture {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
//    public void iClickOnSubjectAndCreateSubjectOptionAndCapture(String firstname, String lastname, String site, String subNum, String subExtID, String phoneCode, String phoneNum, String email, String role, String startDate, String language) {
//
//
//        ilabPageObjects = new IlabPageObjects(driver);
//        seleniumAction = new SeleniumAction(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
//        subjectCreatePage = new SubjectCreatePage(driver);
//        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
//
//
//        seleniumAdaptor.pauseFor(2);
//        takeScreenShotNew(this.scenario);
//
//        Assert.assertTrue("unable to clickSubject", subjectCreatePage.clickSubject());
//        Assert.assertTrue("unable to clickCreate", subjectCreatePage.clickCreate());
////        seleniumAdaptor.pauseFor(2);
//        Assert.assertTrue("unable to captureFirstName", subjectCreatePage.captureFirstName(firstname));
//        Assert.assertTrue("unable to captureLastName", subjectCreatePage.captureLastName(lastname));
//        Assert.assertTrue("unable to captureSelectSite", subjectCreatePage.captureSelectSite(site));
//        Assert.assertTrue("unable to captureSubjectNumMRN", subjectCreatePage.captureSubjectNumMRN(subNum));
//        Assert.assertTrue("unable to captureSubjectExtID", subjectCreatePage.captureSubjectExtID(subExtID));
//        Assert.assertTrue("unable to capturePhoneNumCode", subjectCreatePage.capturePhoneNumCode(phoneCode));
//        Assert.assertTrue("unable to captureUserName", subjectCreatePage.capturePhoneNum(phoneNum));
//        Assert.assertTrue("unable to capturePhoneNum", subjectCreatePage.captureEmail(email));
//        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole(role));
//        Assert.assertTrue("unable to captureEmail", subjectCreatePage.captureEmail("pramoth.vm@jivascience.com"));
////        Assert.assertTrue("unable to captureRole", subjectCreatePage.captureRole1(role));
//
////        Assert.assertTrue("unable to clickCustomDate", subjectCreatePage.clickCustomDate());
//
////        Assert.assertTrue("unable to clickCustomDateIfAvailable", subjectCreatePage.clickCustomDateIfAvailable());
////        Assert.assertTrue("unable to captureSubjectStartDate", subjectCreatePage.captureSubjectStartDate(startDate));
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureLanguage", subjectCreatePage.captureLanguage(language));
//        takeScreenShotNew(this.scenario);
////        seleniumAdaptor.pauseFor(10);
//        Assert.assertTrue("unable to captureUserName", subjectCreatePage.clickSaveandNext());
//        Assert.assertTrue("unable to captureUserName", subjectCreatePage.clickSubCreationOK());
//        seleniumAdaptor.pauseFor(10);
//    }
//
//
//    @And("I launch AmazonWebmail and capture {string}{string}")
//    public void iLaunchAmazonWebmailAndCapture(String mailusername, String mailpassword) {
//        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
//        amazonWebMailPage = new AmazonWebMailPage(driver);
//
//        amazonWebMailPage.opentabAmazonWebMail();
//        Assert.assertTrue("unable to captureAmazonWebMailUsername", amazonWebMailPage.captureAmazonWebMailUsername(mailusername));
//        Assert.assertTrue("unable to captureAmazonWebMailPassword", amazonWebMailPage.captureAmazonWebMailPassword(mailpassword));
//        Assert.assertTrue("unable to clickSignIn", amazonWebMailPage.clickSignIn());
//
//    }
//
//
//    @And("I capture {string} in searchbox and retrieve the credentials")
//    public void iCaptureInSearchboxAndRetrieveTheCredentials(String eDiaryLogin) {
//        amazonWebMailPage = new AmazonWebMailPage(driver);
//
//        Assert.assertTrue("unable to captureWebmailSearch", amazonWebMailPage.captureWebmailSearch(eDiaryLogin));
//        Assert.assertTrue("unable to captureWebmailSearchBtn", amazonWebMailPage.captureWebmailSearchBtn());
//        seleniumAdaptor.pauseFor(2);
////        Assert.assertTrue("unable to switchtoWebMailIFrame2", amazonWebMailPage.switchtoWebMailIFrame2());
////        Assert.assertTrue("unable to clickEdiaryLoginInfo", amazonWebMailPage.clickEdiaryLoginInfo());
//        Assert.assertTrue("unable to clickNoReply", amazonWebMailPage.clickNoReply());
//        Assert.assertTrue("unable to switchtoWebMailIFrame2", amazonWebMailPage.switchtoWebMailIFrame2());
//
//        putValue("password", amazonWebMailPage.getPassword());
//        Assert.assertTrue("unable to amazonWebMailPage", amazonWebMailPage.clickLogOut());
//        seleniumAdaptor.pauseFor(10);
//
//
//    }
//
//    @And("I launch the JConnect WebApp and capture {string}{string}\"password and login")
//    public void iLaunchTheJConnectWebAppAndCapturePasswordAndLogin(String phoneCode, String phoneNum) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
//        amazonWebMailPage = new AmazonWebMailPage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//        webAppLoginPage.opentabJconnectWebApp();
//        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode(phoneCode));
//        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
//         webAppLoginPage.capturePassword(getValue("password"));
//        Assert.assertTrue("unable to clickNoReply", webAppLoginPage.clickLogin());
//        seleniumAdaptor.pauseFor(10);
//
//    }
//
//
//    @And("I click on CallSchedule and capture {string}{string}{string}{string}{string} and click on Schedule Visit")
//    public void iClickOnCallScheduleAndCaptureAndClickOnScheduleVisit(String time, String study, String site, String subject, String sitestaff) {
//
//        callSchedulePage = new CallSchedulePage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//        Assert.assertTrue("unable to clickCallScheduleMenu", callSchedulePage.clickCallScheduleMenu());
//        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTime(time));
//        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureStudy(study));
//        Assert.assertTrue("unable to captureSite", callSchedulePage.captureSite(site));
//        Assert.assertTrue("unable to captureSubject", callSchedulePage.captureSubject(subject));
//        Assert.assertTrue("unable to captureSiteStaff", callSchedulePage.captureSiteStaff(sitestaff));
//
//        Assert.assertTrue("unable to clickScheduledVisit", callSchedulePage.clickScheduleTeleVisit());
//        seleniumAdaptor.pauseFor(1);
//
//
//
//
//
//
//    }
//
//    @And("I navigate to Schedule a Call screen and capture {string} click AddGuest and capture {string}{string}{string}{string}")
//    public void iNavigateToScheduleACallScreenAndCaptureClickAddGuestAndCapture(String title, String guestname, String guestemail, String ScheduleCallsubject, String ScheduleCallsitestaff) {
//
//
//        callSchedulePage = new CallSchedulePage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//
//        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureTime", callSchedulePage.clickAddGuest());
//        Assert.assertTrue("unable to captureTime", callSchedulePage.captureGuestName(guestname));
//        Assert.assertTrue("unable to captureTime", callSchedulePage.captureGuestEmail(guestemail));
//        Assert.assertTrue("unable to captureTime", callSchedulePage.clickAddGuestOK());
//        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject(ScheduleCallsubject));
//        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff(ScheduleCallsitestaff));
//
//        seleniumAdaptor.pauseFor(1);
//
//
//    }
//
//    @And("I navigate to VisitDetails section and select ScheduleVisit and capture {string}{string}")
//    public void iNavigateToVisitDetailsSectionAndSelectScheduleVisitAndCapture(String visit, String batterylink) {
//
//        callSchedulePage = new CallSchedulePage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
//        Assert.assertTrue("unable to clickVisitTypeScheduledVisit", callSchedulePage.clickVisitTypeScheduledVisit());
////        Assert.assertTrue("unable to clickVisitTypeUnScheduledVisit", callSchedulePage.clickVisitTypeUnScheduledVisit());
////        Assert.assertTrue("unable to clickVisitTypeScheduledVisit", callSchedulePage.clickVisitTypeScheduledVisit());
//
////        Assert.assertTrue("unable to captureTime", callSchedulePage.clickVisit());
//        Assert.assertTrue("unable to captureVisit", callSchedulePage.captureVisit(visit));
//
//        Assert.assertTrue("unable to captureBatteryLink", callSchedulePage.captureBatteryLink(batterylink));
//
//        seleniumAdaptor.pauseFor(1);
//
//
//    }
//
//
//    @And("I navigate to ScheduleInfo section and capture {string}{string}{string}{string}{string}{string}{string}")
//    public void iNavigateToScheduleInfoSectionAndCapture(String date, String time, String timeZone, String calldurationHrs, String calldurationMins, String alert, String batterylink) {
//
//
//        callSchedulePage = new CallSchedulePage(driver);
//        webAppLoginPage = new WebAppLoginPage(driver);
//        seleniumAdaptor = new SeleniumAdaptor(driver);
//
////        Assert.assertTrue("unable to captureScheduleDate", callSchedulePage.captureScheduleDate(date));
////        Assert.assertTrue("unable to captureScheduleTime", callSchedulePage.captureScheduleTime(time));
//        Assert.assertTrue("unable to captureScheduleInfoTimeZone", callSchedulePage.captureScheduleInfoTimeZone(timeZone));
//        Assert.assertTrue("unable to captureCallDurationHrs", callSchedulePage.captureCallDurationHrs(calldurationHrs));
//        Assert.assertTrue("unable to captureCallDurationMins", callSchedulePage.captureCallDurationMins(calldurationMins));
//        takeScreenShotNew(this.scenario);
//        Assert.assertTrue("unable to captureAlert", callSchedulePage.captureAlert(alert));
////        Assert.assertTrue("unable to captureTime", callSchedulePage.captureScheduleInfoTimeZone(batterylink));
//        seleniumAdaptor.pauseFor(1);
//        takeScreenShotNew(this.scenario);
//
//
//
//    }
//}