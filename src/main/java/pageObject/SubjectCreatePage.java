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

import static org.openqa.selenium.Keys.TAB;

public class SubjectCreatePage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(SubjectCreatePage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public SubjectCreatePage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//span[text()='Subject'])[1]")
    private WebElement btn_Subject;

    @FindBy(xpath="(//span[text()='Study'])[1]")
    private WebElement btn_Study;

    @FindBy(xpath="(//i[@class='anticon anticon-menu-unfold trigger'])[1]")
    private WebElement btn_JconnectWidget;

    @FindBy(xpath="(//span[text()='Create'])[1]")
    private WebElement btn_Create;

    @FindBy(xpath="(//i[@class='anticon anticon-edit app-menu side-menu-icon'])[1]")
    private WebElement btn_Create1;

    @FindBy(xpath="(//input[@id='firstName'])[1]")
    private WebElement txt_FirstName;

    @FindBy(xpath="(//input[@id='lastName'])[1]")
    private WebElement txt_LastName;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[1]")
    private WebElement btn_drpSelectSite;

    @FindBy(xpath="(//input[@id='subjectNumber'])[1]")
    private WebElement input_SubjectNumMRN;
    @FindBy(xpath="(//input[@id='externalId'])[1]")
    private WebElement input_SubjectExtID;

    @FindBy(xpath="(//input[@id='phone'])[1]")
    private WebElement input_PhoneNum;

    @FindBy(xpath="(//input[@id='email'])[1]")
    private WebElement input_Email;

    @FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[3]")
    private WebElement input_Role1;

    @FindBy(xpath="(//div[text()='Please select'])[1]")
    private WebElement input_Role2;
    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[2]")
    private WebElement btn_drpPhoeNum;

    @FindBy(xpath="(//div[@id='roles'])[1]")
    private WebElement btn_drpRole;

    @FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[3]")
    private WebElement input_Role;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[3]")
    private WebElement btn_drpLanguage;

    @FindBy(xpath="(//button[@class='ant-switch ant-switch-checked'])[1]")
    private WebElement btn_ReceiveSMS;

    @FindBy(xpath="(//button[@class='ant-switch ant-switch-checked'])[2]")
    private WebElement btn_Status;

    @FindBy(xpath="(//span[text()='Save & Next'])[1]")
    private WebElement btn_SaveandNext;

    @FindBy(xpath="(//span[text()='OK'])[1]")
    private WebElement btn_SubCreationOK;

    @FindBy(xpath="(//span[text()='Cancel'])[1]")
    private WebElement btn_SubCreationCancel;

    @FindBy(xpath="(//textarea[@id='comments'])[1]")
    private WebElement input_SubVisitStatusComments;
    @FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[1]")
    private WebElement btn_VisitNext;

    @FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
    private WebElement btn_VisitPrevious;

    private By txt_EDiaryVersionNum = By.xpath("//*[contains(text(),'91')]");

    private By txt_SubCreationAlertMsg = By.xpath("//*[contains(text(),'Proceed with the entered details ?')]");

    private By txt_SubCreationCancelBtnMsg = By.xpath("//*[contains(text(),'Cancel')]");

    private By txt_EDiaryVersionNum1 = By.xpath("(//span[@class='ant-typography headerData headerData-version-number ant-typography-ellipsis ant-typography-ellipsis-single-line'])[1]");

    private By txt_EDiaryVersionDesc = By.xpath("(//span[@class='infoLabel'])[3]");

    @FindBy(xpath="(//i[@title='Custom date'])[1]")
    private WebElement lnk_CustomDate;

    @FindBy(xpath="//span[@class='ant-calendar-picker']/div/input")
    private WebElement btn_CalenderIconSubjectCreate;

    @FindBy(xpath="(//input[@placeholder='Select date'])[1]")
    private WebElement input_SubjectStartDate;

    @FindBy(xpath="(//input[@class='ant-calendar-input '])[1]")
    private WebElement input_SubjectStartDate1;

    @FindBy(xpath="(//div[@class='ant-calendar-input-wrap'])[1]")
    private WebElement input_SubjectStartDate2;

    @FindBy(xpath="(//input[@class='ant-calendar-picker-input ant-input'])[1]")
    private WebElement input_SubjectStartDate3;

    @FindBy(xpath="(//i[@class='anticon anticon-calendar ant-calendar-picker-icon'])[1]")
    private WebElement btn_DatePicker;

    public boolean clickSubject(){
        try{
            seleniumAdaptor.pauseFor(2);
//            seleniumAction.WaitFoElementToBeVisible(btn_Subject);
            loggerObj.info("The btn_Subject is not clicked");
//            seleniumAdaptor.JavaScriptClick(btn_Subject);
            seleniumAction.clickElement(btn_Subject);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Subject is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
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

    public boolean clickJconnectWidget(){
        try{
            seleniumAdaptor.pauseFor(2);

            loggerObj.info("The btn_JconnectWidget is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_JconnectWidget);
            loggerObj.info("The btn_JconnectWidget is clicked");
            seleniumAdaptor.pauseFor(5);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickJconnectWidget1(){
        try{
            seleniumAdaptor.pauseFor(2);

            loggerObj.info("The btn_JconnectWidget is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_JconnectWidget);
            loggerObj.info("The btn_JconnectWidget is clicked");
            seleniumAdaptor.pauseFor(5);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickCreate(){
        try{
            seleniumAdaptor.pauseFor(0);
//            seleniumAction.WaitFoElementToBeVisible(btn_Create);
            loggerObj.info("The btn_Create is not clicked");
//            seleniumAdaptor.JavaScriptClick(btn_Create1);
            seleniumAction.clickElement(btn_Create1);
            seleniumAdaptor.JavaScriptClick(btn_Create1);
            seleniumAdaptor.JavaScriptClick(btn_Create1);
            seleniumAdaptor.JavaScriptClick(btn_Create1);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Create is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureFirstName(String firstname){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_FirstName is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_FirstName);
            seleniumAction.clearText(txt_FirstName);

            seleniumAction.typeText(txt_FirstName,firstname);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureLastName(String lastname){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_LastName is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_LastName);
            seleniumAction.clearText(txt_LastName);
            seleniumAction.typeText(txt_LastName,lastname);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }




    public boolean captureSelectSite(String site){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The inputname is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_drpSelectSite);
//            seleniumAction.clearText(txt_UserName);
//            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + site + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubjectNumMRN(String subNum){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_SubjectNumMRN is not clicked");
            seleniumAdaptor.JavaScriptClick(input_SubjectNumMRN);
            seleniumAction.clearText(input_SubjectNumMRN);
            seleniumAction.typeText(input_SubjectNumMRN,subNum);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubjectExtID(String subExtID){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_SubjectExtID is not clicked");
            seleniumAdaptor.JavaScriptClick(input_SubjectExtID);
            seleniumAction.clearText(input_SubjectExtID);
            seleniumAction.typeText(input_SubjectExtID,subExtID);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePhoneNumCode(String phoneCode){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The inputname is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_drpPhoeNum);
//            seleniumAction.clearText(txt_UserName);
//            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + phoneCode + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean capturePhoneNum(String phoneNum){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_PhoneNum is not clicked");
            seleniumAdaptor.JavaScriptClick(input_PhoneNum);
            seleniumAction.clearText(input_PhoneNum);
            seleniumAction.typeText(input_PhoneNum,phoneNum);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureEmail(String email){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_Email is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Email);
            seleniumAction.clearText(input_Email);
            seleniumAction.typeText(input_Email,email);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureRole(String role){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The inputname is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_drpRole);
//            seleniumAction.clearText(txt_UserName);
//            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + role + "']")));

//            seleniumAdaptor.pauseFor(10);
//            seleniumAdaptor.JavaScriptClick(input_SubjectNumMRN);
//            seleniumAdaptor.JavaScriptClick(input_SubjectNumMRN);
//            System.out.println("The input_SubjectNumMRN is clicked");
//            seleniumAdaptor.JavaScriptClick(input_Email);
//            seleniumAction.clearText(input_Email);
//            seleniumAction.clearText(input_Email);


//            input_Role.sendKeys(new CharSequence[]{Keys.TAB});
//            input_Role1.sendKeys(TAB);
//            seleniumAdaptor.pauseFor(10);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureRole1(String role){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The role is not clicked");
//            seleniumAdaptor.JavaScriptClick(input_Role1);
//            seleniumAction.clearText(input_Email);
            seleniumAction.typeText(input_Role1,role);
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(input_SubjectNumMRN);
            seleniumAction.clearText(input_SubjectNumMRN);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickCustomDate(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The CustomDate is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CustomDate);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_CustomDate is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickCustomDateIfAvailable(){
            seleniumAdaptor.pauseFor(2);

//            loggerObj.info("The lnk_CustomDate is clicked");

            if(seleniumAction.isElementDisplayed(lnk_CustomDate)){
                seleniumAdaptor.JavaScriptClick(lnk_CustomDate);
                loggerObj.info("The lnk_CustomDate is clicked");
                return true;
            }
            else{
                seleniumAdaptor.JavaScriptClick(input_SubjectStartDate);
                loggerObj.info("The input_SubjectStartDate is clicked");

            return  false;

        }
    }

    public boolean clickCalenderIconSubjectCreate() {
        try {

            loggerObj.info("The btn_CalenderIconSubjectCreate is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_CalenderIconSubjectCreate);
            loggerObj.info("The btn_CalenderIconSubjectCreate is clicked");


            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubjectStartDate(String startDate){
        try{
			seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(input_SubjectStartDate3);
//            seleniumAction.clearText(input_SubjectStartDate3);
//            loggerObj.info("The input_SubjectStartDate3 is cleared");
//            seleniumAction.typeText(input_SubjectStartDate3, startDate);
            seleniumAdaptor.JavaScriptClick(input_SubjectStartDate3);
//            seleniumAdaptor.JavaScriptClick(input_SubjectStartDate3);
//            seleniumAdaptor.JavaScriptClick(btn_DatePicker);
            seleniumAction.clickElement(btn_DatePicker);

            seleniumAdaptor.pauseFor(3);
            seleniumAction.typeText(input_SubjectStartDate3, startDate);

//            seleniumAction.clearText(input_SubjectStartDate2);
//            loggerObj.info("The input_SubjectStartDate3 is cleared");
//            seleniumAction.typeText(input_SubjectStartDate2, startDate);

//            input_SubjectStartDate3.sendKeys(startDate);
             return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean captureSubjectStartDate1(String startDate){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The input_Date is not clicked");
//            seleniumAdaptor.JavaScriptClick(input_Date);
//            seleniumAction.clearText(input_Date);
            seleniumAdaptor.JavaScriptSetValue(input_SubjectStartDate3,startDate);
            loggerObj.info("The input_SubjectStartDate3 is captured");
//            seleniumAdaptor.pauseFor(4);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

//    public boolean captureSubjectStartDate1(String month, String day) {
//
//        seleniumAdaptor.pauseFor(2);
//
//        seleniumAction.clickElement(btn_DatePicker);
//
//        while (true) {
//
//            String text = driver.findElement(By.xpath("(//a[@class='ant-calendar-month-select'])[1]")).getText();
//
//            if (text.equals(month)) {
//                break;
//            } else {
//
//                driver.findElement(By.xpath("(//a[@class='ant-calendar-next-month-btn'])[1]")).click();
//            }
//
//            driver.findElement(By.xpath("(//div[9]//div[1]/table[1]/tbody[1]//tr//td[contains(text(),'15')])")).click();
//
//
//        }
//
//
//    }

    public boolean captureLanguage(String language){

        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The inputname is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_drpLanguage);
//            seleniumAction.clearText(txt_UserName);
//            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("//ul//li[text()='" + language + "']")));
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickReceiveSMS(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_ReceiveSMS is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ReceiveSMS);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_ReceiveSMS is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickStatus(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The btn_Status is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Status);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Status is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickSaveandNext(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SaveandNext is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SaveandNext);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_SaveandNext is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickSubCreationOK(){
        try{
            seleniumAdaptor.pauseFor(1);
            loggerObj.info("The SubCreationOK is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SubCreationOK);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The SubCreationOK is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSubCreationCancel(){
        try{
            seleniumAdaptor.pauseFor(2);
            System.out.println("The SubCreationCancel is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SubCreationCancel);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The SubCreationCancel is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean captureSubVisitStatusComments(String lastname){
        try{
//			seleniumAdaptor.pauseFor(2);
            System.out.println("The SubVisitStatusComments is not clicked");
            seleniumAdaptor.JavaScriptClick(input_SubVisitStatusComments);
            seleniumAction.clearText(input_SubVisitStatusComments);
            seleniumAction.typeText(input_SubVisitStatusComments,lastname);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickVisitNext(){
        try{

            System.out.println("The btn_VisitNext is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_VisitNext);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_VisitNext is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickVisitPrevious(){
        try{

            System.out.println("The btn_VisitPrevious is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_VisitPrevious);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_VisitPrevious is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }
    public String getSubCreationAlertMsg() {

        seleniumAction.clickElement(txt_SubCreationAlertMsg);
        loggerObj.info("The txt_SubCreationAlertMsg is clicked");
        String alertmsg = driver.findElement(txt_SubCreationAlertMsg).getText();
        loggerObj.info("The SubjectCreation Alert Message is :" + alertmsg);
        return alertmsg;
    }

    public String getSubCreationCancelBtnMsg() {

        seleniumAction.clickElement(txt_SubCreationCancelBtnMsg);
        String cancelbtnmsg = driver.findElement(txt_SubCreationCancelBtnMsg).getText();
        loggerObj.info("The SubjectCreation Cancel button text is :" + cancelbtnmsg);
        return cancelbtnmsg;
    }



    public String getEDiaryVersionNum() {

        seleniumAction.clickElement(txt_EDiaryVersionNum1);
        loggerObj.info("The txt_EDiaryVersionNum is clicked");
        String versionnum = driver.findElement(txt_EDiaryVersionNum1).getText();
        loggerObj.info("The EDiaryVersion Number is :" + versionnum);
        return versionnum;
    }

    public String getEDiaryVersion() {

        seleniumAction.clickElement(txt_EDiaryVersionDesc);
        loggerObj.info("The txt_EDiaryVersionDesc is clicked");
        String EDiary = driver.findElement(txt_EDiaryVersionDesc).getText();
        loggerObj.info("The EDiaryVersion Description in JConnect is :" + EDiary);
        return EDiary;
    }






}

