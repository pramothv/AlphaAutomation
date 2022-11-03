package stepdefinition;

import Utility.PropertiesFileReader;
import base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObject.IlabPageObjects;
import pageObject.SearchPageObject;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class JCollaborate extends BaseClass {

    PropertiesFileReader obj=new PropertiesFileReader();
    SearchPageObject searchPageObject;
    SeleniumAction seleniumAction;
    SeleniumAdaptor seleniumAdaptor;
    public IlabPageObjects ilabPageObjects;
    private Scenario scenario;
    public static ExtentTest extentTest;

    private static Logger logger = LogManager.getLogger(JCollaborate.class);

    public JCollaborate() {
    }

    public JCollaborate(WebDriver driver) {
        super(driver);
    }








}
