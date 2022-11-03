//package stepdefinition;
//
//import Utility.PropertiesFileReader;
//import base.BaseClass;
//import com.aventstack.extentreports.ExtentTest;
//import io.cucumber.java.Scenario;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import pageObject.IlabPageObjects;
//import pageObject.SearchPageObject;
//import seleniumaction.SeleniumAction;
//import seleniumadaptor.SeleniumAdaptor;
//
//public class Jcollab extends BaseClass {
//
//    PropertiesFileReader obj=new PropertiesFileReader();
//    SearchPageObject searchPageObject;
//    SeleniumAction seleniumAction;
//    SeleniumAdaptor seleniumAdaptor;
//    public IlabPageObjects ilabPageObjects;
//    private Scenario scenario;
//    public static ExtentTest extentTest;
//
//    private static Logger logger = LogManager.getLogger(JCollaborate.class);
//
//    public Jcollab() {
//    }
//
//    public Jcollab(WebDriver driver) {
//        super(driver);}
//
//
//
//
//
////        Given("^I capture \"([^\"]*)\"\"([^\"]*)\" and click Signin$", (String arg0, String arg1) -> {
////        });
////    }
////}
