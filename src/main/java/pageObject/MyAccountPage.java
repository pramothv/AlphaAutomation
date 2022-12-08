package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class MyAccountPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(MyAccountPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public MyAccountPage(WebDriver driver)
    {
        super(driver);

    }

    @FindBy(xpath="(//span[text()='My Account'])[1]")
    private WebElement lnk_MyAccount;

    private By userDetailsTitle = By.xpath("(//input[@id='user.title'])[1]");

    private By userDetailsEmail = By.xpath("(//input[@id='user.email'])[1]");


    @FindBy(xpath="(//span[text()='Call Schedule'])[1]")
    private WebElement btn_CallSchedule;


    public boolean clickMyAccount(){
        try{

            loggerObj.info("The lnk_MyAccount is not clicked");
            seleniumAction.clickElement(lnk_MyAccount);
            loggerObj.info("The lnk_MyAccount is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getUserDetailsTitle() {

        seleniumAction.clickElement(userDetailsTitle);
        seleniumAdaptor.pauseFor(1);

        loggerObj.info("The StartDate for subEmail is clicked");
        String email = driver.findElement(userDetailsTitle).getAttribute("value");
        loggerObj.info("The userDetailsTitle is :" + email);

        return email;
    }


    public String getUserDetailsEmail() {

        seleniumAction.clickElement(userDetailsEmail);
        seleniumAdaptor.pauseFor(1);

        loggerObj.info("The StartDate for subEmail is clicked");
        String email = driver.findElement(userDetailsEmail).getAttribute("value");
        loggerObj.info("The userDetailsEmail is :" + email);

        return email;
    }


}
