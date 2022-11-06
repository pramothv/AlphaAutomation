package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.Scenario;
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
    SearchPageObject searchPageObject;
    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;
    public IlabPageObjects ilabPageObjects;
    public JCollaborateQALoginPage jCollaborateQALoginPage;

    public AmazonWebMailPage amazonWebMailPage;
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




}




