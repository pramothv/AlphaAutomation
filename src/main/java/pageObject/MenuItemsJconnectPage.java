package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class MenuItemsJconnectPage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(MenuItemsJconnectPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public MenuItemsJconnectPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//span[text()='Subject'])[1]")
    private WebElement lnk_Subject1;

    private By lnk_Subject = By.xpath("(//span[text()='Subject'])[1]");


    private By lnk_Study = By.xpath("(//span[text()='Study'])[1]");

    private By lnk_StudyList = By.xpath("(//span[text()='List'])[1]");

    @FindBy(xpath="(//span[text()='User Management'])[1]")
    private WebElement lnk_UserManagement;

    @FindBy(xpath="(//span[text()='My Account'])[1]")
    private WebElement lnk_MyAccount;

    @FindBy(xpath="(//span[text()='Call Schedule'])[1]")
    private WebElement lnk_CallSchedule;


    @FindBy(xpath="(//span[text()='Audit Reports'])[1]")
    private WebElement btn_AuditReports;

    @FindBy(xpath="(//span[text()='Call History'])[1]")
    private WebElement btn_CallHistory;

    @FindBy(xpath="(//span[text()='Form Audit'])[1]")
    private WebElement lnk_FormAudit;

    @FindBy(xpath="(//span[text()='List'])[3]")
    private WebElement lnk_UserManagementList1;

    @FindBy(xpath="(//span[text()='List'])[2]")
    private WebElement lnk_UserManagementList2;

    @FindBy(xpath="(//span[text()='eSignature Log'])[1]")
    private WebElement lnk_ESignatureLog;

    private By lnk_SubjectCreate = By.xpath("(//span[text()='Create'])[1]");

    private By lnk_SubjectList = By.xpath("(//span[text()='List'])[2]");

    private By lnk_UserManagementList = By.xpath("(//span[text()='List'])[3]");

    private By lnk_UserManagementList3 = By.xpath("(//span[text()='List'])[2]");

    private By lnk_MyAccounttxt = By.xpath("(//span[text()='My Account'])[1]");

    private By lnk_Chat = By.xpath("(//span[text()='Chat'])[1]");

    private By lnk_CallScheduletxt1 = By.xpath("(//span[text()='Call Schedule'])[1]");

    private By lnk_AuditReportstxt = By.xpath("(//span[text()='Audit Reports'])[1]");

    private By lnk_CallHistorytxt = By.xpath("(//span[text()='Call History'])[1]");

    private By lnk_FormAudittxt = By.xpath("(//span[text()='Form Audit'])[1]");

    private By lnk_ESignatureLogtxt = By.xpath("(//span[text()='eSignature Log'])[1]");

    private By lnk_SubjectMigration = By.xpath("(//span[text()='Migration'])[1]");

    private By lnk_SubjectDownload = By.xpath("(//span[text()='Download'])[1]");


    public String getSubjecttxt() {


//        seleniumAdaptor.pauseFor(1);
//        seleniumAction.clickElement(txt_PIname);
//        loggerObj.info("The txt_PIname is clicked");
        String txt = driver.findElement(lnk_Subject).getText();
        loggerObj.info("The Subject Menu Description in JConnect is :" + txt);
        return txt;
    }


    public String getStudytxt() {


//        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(lnk_Study).getText();
        loggerObj.info("The Study Menu Description in JConnect is :" + txt);
        return txt;
    }



    public String getStudyListtxt() {


//        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(lnk_StudyList).getText();
        loggerObj.info("The StudyList Menu Description in JConnect is :" + txt);
        return txt;
    }



    public String getSubjectCreatetxt() {


//        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(lnk_SubjectCreate).getText();
        loggerObj.info("The SubjectCreate Description in JConnect is :" + txt);
        return txt;
    }


    public String getSubjectListtxt() {


//        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(lnk_SubjectList).getText();
        loggerObj.info("The SubjectList Description in JConnect is :" + txt);
        return txt;
    }

    public String getUserManagementListtxt() {

        String txt = driver.findElement(lnk_UserManagementList).getText();
        loggerObj.info("The lnk_UserManagementList Description in JConnect is :" + txt);
        return txt;
    }


    public String getUserManagementListtxt2() {

        String txt = driver.findElement(lnk_UserManagementList3).getText();
        loggerObj.info("The lnk_UserManagementList Description in JConnect is :" + txt);
        return txt;
    }



    public String getMyAccounttxt() {

        String txt = driver.findElement(lnk_MyAccounttxt).getText();
        loggerObj.info("The lnk_MyAccounttxt Description in JConnect is :" + txt);
        return txt;
    }

    public String getChattxt() {

        String txt = driver.findElement(lnk_Chat).getText();
        loggerObj.info("The lnk_Chat Description in JConnect is :" + txt);
        return txt;
    }

    public String getCallScheduletxt() {

        String txt = driver.findElement(lnk_CallScheduletxt1).getText();
        loggerObj.info("The CallScheduletxt Description in JConnect is :" + txt);
        return txt;
    }

    public String getAuditReportstxt() {

        String txt = driver.findElement(lnk_AuditReportstxt).getText();
        loggerObj.info("The AuditReports Description in JConnect is :" + txt);
        return txt;
    }

    public String getCallHistorytxt() {

        String txt = driver.findElement(lnk_CallHistorytxt).getText();
        loggerObj.info("The CallHistory Description in JConnect is :" + txt);
        return txt;
    }

    public String getFormAudittxt() {

        String txt = driver.findElement(lnk_FormAudittxt).getText();
        loggerObj.info("The FormAudit Description in JConnect is :" + txt);
        return txt;
    }

    public String getESignatureLogtxt() {

        String txt = driver.findElement(lnk_ESignatureLogtxt).getText();
        loggerObj.info("The ESignatureLog Description in JConnect is :" + txt);
        return txt;
    }


    public String getSubjectMigrationtxt() {
       seleniumAction.clickElement(lnk_SubjectMigration);
        seleniumAdaptor.pauseFor(2);
        String txt = driver.findElement(lnk_SubjectMigration).getText();
        loggerObj.info("The SubjectMigration Description in JConnect is :" + txt);
        return txt;
    }


    public boolean clickUserManagementList(){
        try{

            loggerObj.info("The lnk_UserManagementList1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_UserManagementList1);
            loggerObj.info("The lnk_UserManagementList1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickUserManagementList2(){
        try{

            loggerObj.info("The lnk_UserManagementList2 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_UserManagementList2);
            loggerObj.info("The lnk_UserManagementList2 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getSubjectDownloadtxt() {


        String txt = driver.findElement(lnk_SubjectDownload).getText();
        loggerObj.info("The SubjectDownload Description in JConnect is :" + txt);
        return txt;
    }


    public boolean clickUserManagement(){
        try{

            loggerObj.info("The lnk_UserManagement is not clicked");
            seleniumAction.clickElement(lnk_UserManagement);
            loggerObj.info("The lnk_UserManagement is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

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


    public boolean clickCallSchedule(){
        try{

            loggerObj.info("The lnk_CallSchedule is not clicked");
            seleniumAction.clickElement(lnk_CallSchedule);
            loggerObj.info("The lnk_CallSchedule is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAuditReports(){
        try{

            loggerObj.info("The btn_AuditReports is not clicked");
            seleniumAction.clickElement(btn_AuditReports);
            loggerObj.info("The btn_AuditReports is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickCallHistory(){
        try{

            loggerObj.info("The btn_CallHistory is not clicked");
            seleniumAction.clickElement(btn_CallHistory);
            loggerObj.info("The btn_CallHistory is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickFormAudit1(){
        try{

            loggerObj.info("The btn_FormAudit is not clicked");
            seleniumAction.clickElement(lnk_FormAudit);
            loggerObj.info("The btn_FormAudit is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickESignatureLog(){
        try{

            loggerObj.info("The lnk_ESignatureLog is not clicked");
            seleniumAction.clickElement(lnk_ESignatureLog);
            loggerObj.info("The lnk_ESignatureLog is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }




}