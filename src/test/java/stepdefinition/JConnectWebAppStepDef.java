package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.*;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

public class JConnectWebAppStepDef extends BaseClass {


    PropertiesFileReader obj = new PropertiesFileReader();

    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;

    public JCollaborateQALoginPage jCollaborateQALoginPage;

    public AmazonWebMailPage amazonWebMailPage;

    public SubjectListPage subjectListPage;
    public WebAppLoginPage webAppLoginPage;
    public CallSchedulePage callSchedulePage;
    public JCollaborateWelcomePage jCollaborateWelcomePage;

    public SubjectCreatePage subjectCreatePage;
    private Scenario scenario;
    public static ExtentTest extentTest;

    private static Logger logger = LogManager.getLogger(JConnectWebAppStepDef.class);

    public JConnectWebAppStepDef() {
    }

    public JConnectWebAppStepDef(WebDriver driver) {
        super(driver);
    }

    @Given("I must launch the JConnect WebApp and capture {string}{string}\"password and login")
    public void i_must_launch_the_j_connect_web_app_and_capture_password_and_login(String phoneCode, String phoneNum) {
        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode(phoneCode));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        takeScreenShotNew(this.scenario);
        webAppLoginPage.capturePassword(getValue("password"));
        Assert.assertTrue("unable to clickNoReply", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);
//        seleniumAdaptor.pauseFor(10);

    }


    @And("I launch the JConnect WebApp and capture {string}{string}\"password and login and click save")
    public void iLaunchTheJConnectWebAppAndCapturePasswordAndLoginAndClickSave(String phoneCode, String phoneNum) throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}

        amazonWebMailPage = new AmazonWebMailPage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        takeScreenShotNew(this.scenario);
        webAppLoginPage.opentabJconnectWebApp();
        Assert.assertTrue("unable to capturePhoneCode", webAppLoginPage.capturePhoneCode(phoneCode));
        Assert.assertTrue("unable to capturePhoneNum", webAppLoginPage.capturePhoneNum(phoneNum));
        webAppLoginPage.capturePassword(getValue("password"));
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickLogin", webAppLoginPage.clickLogin());
        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSaveTimeZone", webAppLoginPage.clickSaveTimeZone());

    }


    @And("I validate the Screening checkbox and click summary and check ICF Visit Status")
    public void iValidateTheScreeningCheckboxAndClickSummaryAndCheckICFVisitStatus() {

        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);

        amazonWebMailPage.CheckingChkboxScreening();
        putValue("Chktxt", amazonWebMailPage.getCheckingChkboxScreening());
        validate("", amazonWebMailPage.getCheckingChkboxScreening());
        takeScreenShotNew(this.scenario);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickVisits", subjectListPage.clickVisits());
        seleniumAdaptor.pauseFor(2);
        Assert.assertTrue("unable to clickSummary", subjectListPage.clickSummary());
        putValue("ICFtxt", subjectListPage.getICFDesc());
        validate("ICF", subjectListPage.getICFDesc());

        putValue("ICFStatus", subjectListPage.getICFStatus());
//        validate("In Progress", subjectListPage.getICFStatus());
    }



    @And("I validate the Screening checkbox in the PrepaymentVisit section")
    public void iValidateTheScreeningCheckboxInThePrepaymentVisitSection() {


        seleniumAction = new SeleniumAction(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);
        jCollaborateQALoginPage = new JCollaborateQALoginPage(driver);
        subjectCreatePage = new SubjectCreatePage(driver);
        jCollaborateWelcomePage = new JCollaborateWelcomePage(driver);
        amazonWebMailPage = new AmazonWebMailPage(driver);
        subjectListPage = new SubjectListPage(driver);


        takeScreenShotNew(this.scenario);

        amazonWebMailPage.CheckingChkboxScreening();
        putValue("Chktxt", amazonWebMailPage.getCheckingChkboxScreening());
        validate("", amazonWebMailPage.getCheckingChkboxScreening());

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


    @And("I join the meeting and join the meeting from Webapp")
    public void iJoinTheMeetingAndJoinTheMeetingFromWebapp() {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        takeScreenShotNew(this.scenario);
        seleniumAdaptor.pauseFor(50);
        Assert.assertTrue("unable to clickJoinCall", callSchedulePage.clickJoinCall());
        callSchedulePage.switchToTab2();
        Assert.assertTrue("unable to clickCalls", webAppLoginPage.clickCalls());
        Assert.assertTrue("unable to clickWebAppSafermeeting", webAppLoginPage.clickWebAppSafermeeting());
        Assert.assertTrue("unable to clickJoinICFCall", webAppLoginPage.clickJoinICFCall());
        callSchedulePage.switchToTab4();
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


    @And("I navigate to CallSchedule and ScheduleTelevisit for Screening and capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForScreeningAndCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);


        Assert.assertTrue("unable to captureTime", callSchedulePage.captureTitle(title));
        Assert.assertTrue("unable to captureStudy", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureSite", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);


    }


    @And("I navigate to CallSchedule and ScheduleTelevisit for SaferVisit and should capture {string} {string}{string}")
    public void iNavigateToCallScheduleAndScheduleTelevisitForSaferVisitAndShouldCapture(String title, String ScheduleCallsubject, String ScheduleCallsitestaff) {
        callSchedulePage = new CallSchedulePage(driver);
        webAppLoginPage = new WebAppLoginPage(driver);
        seleniumAdaptor = new SeleniumAdaptor(driver);

        Assert.assertTrue("unable to captureTitle", callSchedulePage.captureTitle(title));
//        Assert.assertTrue("unable to captureScheduleTeleVisitSubject2", callSchedulePage.captureScheduleTeleVisitSubject2(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSubject12", callSchedulePage.captureScheduleTeleVisitSubject12(ScheduleCallsubject));
        Assert.assertTrue("unable to captureScheduleTeleVisitSiteStaff2", callSchedulePage.captureScheduleTeleVisitSiteStaff2(ScheduleCallsitestaff));

        seleniumAdaptor.pauseFor(1);
    }



}






