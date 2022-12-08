package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class CRIOSubjectListPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(CRIOSubjectListPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public CRIOSubjectListPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//span[text()='Call Schedule'])[1]")
    private WebElement btn_CallSchedule;

    @FindBy(xpath="//table[@id='dataTable']/tbody[1]/tr[1]/td[1]/a/span")
    private WebElement list_Name;

    private By randomisationID = By.xpath("//*[contains(text(), 'External ID')]");

    private By randomisationID2 = By.xpath("(//dt[text()='External ID:'])[1]");

    private By randomisationID1 = By.xpath("((//dd[@style='display: inline-block; margin: 0; padding: 0; font-size: .8em;'])[1]/text())[1]");


    private By btn_TimeSelectIcon = By.xpath("(//div[@class='toolbox-icon   hangup-button'])[1]");


    @FindBy(xpath="//span[@class='fc-grid-hover']/span")
    private WebElement btn_TimeSelectIcon1;

    @FindBy(xpath="(//td[@class='fc-widget-content'])[3]")
    private WebElement btn_TimeSelectIcon2;

    @FindBy(xpath="(//input[@type='search'])[1]")
    private WebElement input_SubjectSearch;

    @FindBy(xpath="(//div[@id='dataTable_filter'])[1]")
    private WebElement inout_SubjectSearch1;



    private By randomisationID4 = By.xpath("(//dl[@class='dt-150 short'])[1]/dd[3]");

    private By randomisationID5 = By.xpath("(//dl[@class='dt-150 short'])[1]/dd[3]/text()[1]");

    @FindBy(xpath="(//input[@type='search'])[1]")
    private WebElement btn_SubjectListSearch;



    public boolean captureSubjectSearch(String studyListSearch){
        try{

            loggerObj.info("The inout_StudyListSearch is not captured");
            seleniumAdaptor.JavaScriptClick(input_SubjectSearch);
            seleniumAction.clearText(input_SubjectSearch);
            seleniumAction.typeText(input_SubjectSearch,studyListSearch);
            seleniumAdaptor.pauseFor(2);
            input_SubjectSearch.sendKeys(new CharSequence[] {Keys.ENTER});
            seleniumAdaptor.pauseFor(1);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubjectSearch1(String studyListSearch){
        try{

            loggerObj.info("The inout_StudyListSearch1 is not captured");
            seleniumAdaptor.JavaScriptClick(inout_SubjectSearch1);
            seleniumAction.clearText(inout_SubjectSearch1);
            seleniumAction.typeText(inout_SubjectSearch1,studyListSearch);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSubjectListSearch(){
        try{
//            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_SubjectListSearch);
            loggerObj.info("The btn_SubjectListSearch is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickNameListCRIO(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The list_Name is not clicked");
            seleniumAdaptor.JavaScriptClick(list_Name);
            loggerObj.info("The list_Name is clicked");
//            seleniumAdaptor.pauseFor(2);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public String getRandomisationID() {

        seleniumAction.clickElement(randomisationID);
        loggerObj.info("The Password is clicked");
        String id = driver.findElement(randomisationID).getText();
        String number = id.split(":")[1].trim();
        loggerObj.info("The RandomisationID is :" + number);


        return number;
    }

    public String getRandomisationID1() {

        seleniumAction.clickElement(randomisationID1);
        loggerObj.info("The Password is clicked");
        String id = driver.findElement(randomisationID1).getText();
        String number = id.split(":")[1].trim();
        loggerObj.info("The RandomisationID is :" + number);


        return number;
    }

    public String getRandomisationID2() {

        seleniumAction.clickElement(randomisationID2);
        loggerObj.info("The Password is clicked");
        String id = driver.findElement(randomisationID2).getText();
        String number = id.split(":")[1].trim();
        loggerObj.info("The RandomisationID is :" + number);


        return number;
    }

    public String getRandomisationID4() {

        seleniumAction.clickElement(randomisationID4);
        loggerObj.info("The Password is clicked");
        String id = driver.findElement(randomisationID4).getText();
//        String number = id.split(":")[1].trim();
        loggerObj.info("The RandomisationID is :" + id);


        return id;
    }


    public boolean clickEndCallWebApp2() {
        try {

            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon);
            seleniumAction.hoverMouseOverElement(btn_TimeSelectIcon);
            seleniumAdaptor.JavaScriptClick(btn_TimeSelectIcon1);
            loggerObj.info("The btn_EndCall4 is clicked");
//            seleniumAction.clickElement(btn_EndCall2);
//            loggerObj.info("The 1btn_EndCall2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}



}
