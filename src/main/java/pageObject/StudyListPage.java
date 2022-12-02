package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class StudyListPage extends BaseClass {
    private static Logger loggerObj = LogManager.getLogger(StudyListPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public StudyListPage(WebDriver driver)
    {
        super(driver);

    }

    private By txt_StudyName1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[1]");

    private By txt_StudyName2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[1]");

    private By txt_StudyDescr = By.xpath("(//div[text()='Study'])[1]");

    private By txt_MappedOrgDescr = By.xpath("(//div[text()='Mapped Organizations'])[1]");

    @FindBy(xpath="(//input[@class='ant-input'])[1]")
    private WebElement inout_SubjectListSearch;
    @FindBy(xpath="(//span[text()='Study'])[1]")
    private WebElement btn_Study;

    @FindBy(xpath="(//span[text()='Previous'])[1]")
    private WebElement btn_PreviousVisitsTab;

    @FindBy(xpath="(//span[text()='Next'])[1]")
    private WebElement btn_Next;

    @FindBy(xpath="(//span[text()='List'])[1]")
    private WebElement lnk_StudyListMenu;
    @FindBy(xpath="(//input[@class='ant-input'])[1]")
    private WebElement inout_StudyListSearch;

    @FindBy(xpath="(//button[@class='ant-btn ant-input-search-button ant-btn-primary'])[1]")
    private WebElement btn_StudyListSearch;

    private By sponsorNameStudy = By.xpath("(//input[@id='study.sponsorName'])[1]");

    private By versionNameStudy = By.xpath("(//input[@id='crfVersion.versionName'])[1]");

    private By txt_StudyOrgName = By.xpath("(//div[text()='160 - The Bishop Center for Translational Neuroscience'])[1]");


    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[1]")
    private WebElement chkbox_LanguageSource;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[7]")
    private WebElement chkbox_LanguageSourceSpanish;

    @FindBy(xpath = "(//span[text()='Spanish'])[1]")
    private WebElement chkbox_LanguageSourceSpanish1;


    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[11]")
    private WebElement chkbox_LanguageTarget;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[8]")
    private WebElement chkbox_LanguageTarget1;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[9]")
    private WebElement chkbox_LanguageTargetChinese;

    @FindBy(xpath="//*[contains(text(),'Mapped Organizations')]")
    private WebElement lnk_MappedOrg;





    public String getStudyName1() {

        String txt = driver.findElement(txt_StudyName1).getText();
        loggerObj.info("The StudyName1 Description in JConnect is :" + txt);
        return txt;
    }

    public String getStudyDescr() {

        String txt = driver.findElement(txt_StudyDescr).getText();
        loggerObj.info("The Study Description in JConnect is :" + txt);
        return txt;
    }

    public String getMappedOrganisationsDescr() {

        String txt = driver.findElement(txt_MappedOrgDescr).getText();
        loggerObj.info("The MappedOrganisations Description in JConnect is :" + txt);
        return txt;
    }

    public String getStudyName2() {

        String txt = driver.findElement(txt_StudyName2).getText();
        loggerObj.info("The StudyName2 Description in JConnect is :" + txt);
        return txt;
    }


    public boolean clickStudy(){
        try{
            seleniumAdaptor.pauseFor(2);

            loggerObj.info("The btn_Study is not clicked");
            seleniumAction.clickElement(btn_Study);
            loggerObj.info("The btn_Study is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPreviousVisitsTab(){
        try{


            loggerObj.info("The btn_PreviousVisitsTab is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_PreviousVisitsTab);
//            seleniumAction.clickElement(btn_PreviousVisitsTab);
            loggerObj.info("The btn_PreviousVisitsTab is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNext(){
        try{


            loggerObj.info("The btn_Next is not clicked");
            seleniumAction.clickElement(btn_Next);
            loggerObj.info("The btn_Next is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickStudyListMenu(){
        try{

            seleniumAdaptor.JavaScriptClick(lnk_StudyListMenu);
            loggerObj.info("The lnk_StudyListMenu is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureStudyListSearch(String studyListSearch){
        try{

            loggerObj.info("The inout_StudyListSearch is not captured");
            seleniumAdaptor.JavaScriptClick(inout_StudyListSearch);
            seleniumAction.clearText(inout_StudyListSearch);
            seleniumAction.typeText(inout_StudyListSearch,studyListSearch);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickStudyListSearch(){
        try{
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_StudyListSearch);
            loggerObj.info("The btn_SubjectListSearch is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickStudyNumberMRN(String studyNum){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//td)[1]//a[starts-with(text(),'"+studyNum+"')]")));
            loggerObj.info("The StudyNumberMRN is captured");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getSponsorNameStudy() {

        seleniumAction.clickElement(sponsorNameStudy);
        loggerObj.info("The sponsorNameStudy is clicked");
        String name = driver.findElement(sponsorNameStudy).getAttribute("value");
        loggerObj.info("The sponsorNameStudy is :" + name);


        return name;
    }

    public String getVersionNameStudy() {

        seleniumAction.clickElement(versionNameStudy);
        loggerObj.info("The versionNameStudy is clicked");
        String name = driver.findElement(versionNameStudy).getAttribute("value");
        loggerObj.info("The VersionNameStudy is :" + name);


        return name;
    }


    public void CheckingChkboxLanguageSource(){
        String val=chkbox_LanguageSource.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_LanguageSource.isSelected();
        if (checkstatus==true){
            loggerObj.info("LanguageSource Checkbox is already checked");
        }
        else
        {

            loggerObj.info("LanguageSource Checkbox is not selected");
        }
    }

    public void CheckingChkboxLanguageSourceSpanish(){
        String val=chkbox_LanguageSourceSpanish.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_LanguageSourceSpanish.isSelected();
        if (checkstatus==true){
            loggerObj.info("LanguageSourceSpanish Checkbox is already checked");
        }
        else
        {

            loggerObj.info("LanguageSourceSpanish Checkbox is not selected");
            seleniumAction.clickElement(chkbox_LanguageSourceSpanish1);
            loggerObj.info("chkbox_LanguageSourceSpanish1 is not selected");
        }
    }

    public void CheckingChkboxLanguageTarget(){
        String val=chkbox_LanguageTarget.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_LanguageTarget.isSelected();
        if (checkstatus==true){
            loggerObj.info("LanguageTarget Checkbox is already checked");
        }
        else
        {

            loggerObj.info("LanguageTarget Checkbox is not selected");
        }
    }

    public void CheckingChkboxLanguageTarget1(){
        String val=chkbox_LanguageTarget1.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_LanguageTarget1.isSelected();
        if (checkstatus==true){
            loggerObj.info("LanguageTarget Checkbox is already checked");
        }
        else
        {

            loggerObj.info("LanguageTarget Checkbox is not selected");
            seleniumAction.clickElement(chkbox_LanguageTargetChinese);
            loggerObj.info("chkbox_LanguageTargetChinese is not selected");
        }
    }


    public boolean clickMappedOrg(){
        try{
            loggerObj.info("The lnk_MappedOrg is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_MappedOrg);
            loggerObj.info("The lnk_MappedOrg is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public String getStudyOrgName() {

        seleniumAction.clickElement(txt_StudyOrgName);
        loggerObj.info("The txt_StudyOrgName is clicked");
        String orgname = driver.findElement(txt_StudyOrgName).getText();
        loggerObj.info("The Organisation Name is :" + orgname);
        return orgname;
    }

















}
