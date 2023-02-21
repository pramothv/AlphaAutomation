package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import com.cucumber.listener.ExtentCucumberFormatter;
//import com.cucumber.listener.ExtentCucumberFormatter;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features"},
        tags = "@testinsamwer1234",
        glue= {"stepdefinition"},
        dryRun = false,
//       plugin ={ "pretty","json:target/cucumber-reports/AutoumationReport/priscillareports.json"
        plugin ={ "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty","html:target/cucumber","summary","json:target/cucumber1/report.json",
//                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "pretty","json:target/cucumber-reports/AutoumationReport/automationreports.json",
                "html:target/cucumber-reports/reports.html"
                //"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/AutomationReports/EDBCreditCards.html"
               },

        monochrome = true,
        publish = true

)


public class TestRunner {}
