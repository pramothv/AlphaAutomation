package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class CRIOSubjectCreationPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(CRIOSubjectCreationPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public CRIOSubjectCreationPage(WebDriver driver) {
        super(driver);

    }


    @FindBy(xpath = "(//input[@value='Add New Subject'])[1]")
    private WebElement btn_AddNewSubject;

    @FindBy(xpath = "(//input[@value='Save Subject'])[1]")
    private WebElement btn_SaveSubjectCRIO;

    private By txt_SubjectCreatedDesc = By.xpath("//*[contains(text(), 'Subject Added Successfully')]");

    @FindBy(xpath = "(//select[@name='study_key'])[1]")
    private WebElement btn_StudyCRIO;

    @FindBy(xpath = "(//select[@name='sex'])[1]")
    private WebElement btn_GenderCRIO;

    @FindBy(xpath = "(//input[@name='first_name'])[1]")
    private WebElement txt_FirstNameCRIO;

    @FindBy(xpath = "(//input[@name='last_name'])[1]")
    private WebElement txt_LastNameCRIO;

    @FindBy(xpath = "(//input[@name='birth_date'])[1]")
    private WebElement txt_DOBCRIO;


    @FindBy(xpath = "(//input[@name='email'])[1]")
    private WebElement txt_EmailCRIO;

    @FindBy(xpath = "(//input[@name='patient_id'])[1]")
    private WebElement txt_SubjectIDCRIO;

    @FindBy(xpath = "(//input[@name='randomization_id'])[1]")
    private WebElement txt_RandomisationCRIO;

    @FindBy(xpath = "(//select[@name='status'])[1]")
    private WebElement btn_InterestCRIO;

    @FindBy(xpath = "(//a[text()='Subjects'])[1]")
    private WebElement lnk_Subjects;

    @FindBy(xpath = "(//a[text()='Subjects'])[2]")
    private WebElement lnk_Subjects1;

    @FindBy(xpath = "(//a[text()='Studies'])[1]")
    private WebElement lnk_Studies;

    @FindBy(xpath="(//span[@class='template-version'])[3]")
    private WebElement btn_ALTOSafer;



    public boolean clickSubjects(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_Subjects is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Subjects);
            loggerObj.info("The lnk_Subjects is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSubjects1(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_Subjects1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Subjects1);
            loggerObj.info("The lnk_Subjects1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickStudies(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_Studies is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Studies);
            loggerObj.info("The lnk_Studies is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickALTOSafer(){
        try{
            seleniumAdaptor.pauseFor(1);
            loggerObj.info("The btn_ALTOSafer is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_ALTOSafer);
            loggerObj.info("The btn_ALTOSafer is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAddNewSubject(){
        try{

            loggerObj.info("The btn_AddNewSubject is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddNewSubject);
            loggerObj.info("The btn_AddNewSubject is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureStudyCRIO(String studyCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The inputname is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_StudyCRIO);
//            seleniumAction.clearText(txt_UserName);
//            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("(//select//option[text()='" + studyCRIO + "'])[1]")));



            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureGender(String genderCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
//            System.out.println("The inputname is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_GenderCRIO);
//            seleniumAction.clearText(txt_UserName);
//            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("(//select//option[text()='" + genderCRIO + "'])[1]")));



            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureInterestCRIO(String interestCRIO){
        try{

            seleniumAdaptor.JavaScriptClick(btn_InterestCRIO);

            seleniumAction.clickElement(driver.findElement(By.xpath("(//select//option[text()='" + interestCRIO + "'])[1]")));



            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureFirstNameCRIO(String firstNameCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_FirstNameCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_FirstNameCRIO);
            seleniumAction.clearText(txt_FirstNameCRIO);
            seleniumAction.typeText(txt_FirstNameCRIO,firstNameCRIO);
            loggerObj.info("The txt_FirstNameCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureLastNameCRIO(String lastNameCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_LastNameCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_LastNameCRIO);
            seleniumAction.clearText(txt_LastNameCRIO);
            seleniumAction.typeText(txt_LastNameCRIO,lastNameCRIO);
            loggerObj.info("The txt_LastNameCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureDOBCRIO(String dOBCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_DOBCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_DOBCRIO);
            seleniumAction.clearText(txt_DOBCRIO);
            seleniumAction.typeText(txt_DOBCRIO,dOBCRIO);
            loggerObj.info("The txt_DOBCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureDOBCRIO1(String dOBCRIO){
        try{
            loggerObj.info("The btn_drpSubject is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_DOBCRIO);
            loggerObj.info("The btn_drpSubject is clicked");
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptSetValue(txt_DOBCRIO,dOBCRIO);
            loggerObj.info("The Subject is captured");

            driver.findElement(By.xpath("(//div[@class='ant-col ant-form-item-control-wrapper ant-col-xs-16 ant-col-sm-16 ant-col-md-16'])[2]")).sendKeys(dOBCRIO);
//            loggerObj.info("The Subject is not captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }





    public boolean captureEmailCRIO(String emailCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_EmailCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_EmailCRIO);
            seleniumAction.clearText(txt_EmailCRIO);
            seleniumAction.typeText(txt_EmailCRIO,emailCRIO);
            loggerObj.info("The txt_PasswordCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSubjectIDCRIO(String subjectIDCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_SubjectIDCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_SubjectIDCRIO);
            seleniumAction.clearText(txt_SubjectIDCRIO);
            seleniumAction.typeText(txt_SubjectIDCRIO,subjectIDCRIO);
            loggerObj.info("The txt_SubjectIDCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureRandomisationCRIO(String randomisationCRIO){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The txt_RandomisationCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_RandomisationCRIO);
            seleniumAction.clearText(txt_RandomisationCRIO);
            seleniumAction.typeText(txt_RandomisationCRIO,randomisationCRIO);
            loggerObj.info("The txt_PasswordCRIO is captured successfully");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickSaveSubjectCRIO(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SaveSubjectCRIO is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SaveSubjectCRIO);
            loggerObj.info("The btn_SaveSubjectCRIO is clicked");
//            seleniumAdaptor.pauseFor(5);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getSubjectCreatedDescription() {

        seleniumAction.clickElement(txt_SubjectCreatedDesc);
        loggerObj.info("The txt_SubjectCreatedDesc is clicked");
        String msg = driver.findElement(txt_SubjectCreatedDesc).getText();
        loggerObj.info("The Subject Creation Description in CRIO is :" + msg);
        return msg;
    }

}
