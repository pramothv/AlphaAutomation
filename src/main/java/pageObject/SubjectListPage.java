package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class SubjectListPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(SubjectListPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public SubjectListPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//input[@class='ant-input'])[1]")
    private WebElement inout_SubjectListSearch;

    @FindBy(xpath="(//input[@class='ant-input'])[1]")
    private WebElement inout_ListSearch;

    private By txt_IcfDescr = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[1]");

    private By txt_SAFERInterviewDescr = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[1]");
    private By txt_ArmAssignDescr = By.xpath("//*[contains(text(), 'ARM1 ARM1')]");

    private By txt_DiaryWindowWeek1 = By.xpath("(//input[@class='ant-calendar-picker-input ant-input'])[1]");

    private By txt_DiaryWindowWeek3 = By.xpath("(//input[@class='ant-calendar-picker-input ant-input'])[3]");

    private By txt_DiaryWindowWeek5 = By.xpath("(//input[@class='ant-calendar-picker-input ant-input'])[5]");

    private By txt_DiaryWindowWeek7 = By.xpath("(//input[@class='ant-calendar-picker-input ant-input'])[7]");

    private By txt_DiaryWindowWeek9 = By.xpath("(//input[@class='ant-calendar-picker-input ant-input'])[9]");
    private By txt_VisitDatesOutOfWindowPopup = By.xpath("(//p[text()='The updated Visit Date(s) are out of window. Are you sure you want to continue?'])[1]");

    @FindBy(xpath="//*[contains(text(),'OK')]")
    private WebElement clickOK;

    @FindBy(xpath="(//td)[1]//a[starts-with(text(),'')]")
    private WebElement firstSubNumList;

    private By txt_WeekOneBaseLineDesc = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[1]");
    private By txt_Week1Desc = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[1]");
    private By txt_DiaryWindow = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[2]");

    private By txt_ScreeningDesc = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[1]");
    private By txt_ICFstatus = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[4]");


    private By txt_SAFERInterview = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[4]");
    private By txt_Screening = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[4]");

    private By txt_WeekOneBaseLine = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[4]");

    private By txt_Week1Status = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[4]");


    private By txt_ICFDiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[2]");

    private By txt_ScreeningDiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[2]");

    private By txt_SaferInterviewDiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[2]");

    private By txt_Week1BaseLineDiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[2]");

    private By txt_UnscheduledDiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[2]");

    private By txt_UnscheduledDiaryWindowJconnect1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[2]");

    private By txt_Week1DiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[2]");


    private By txt_Week1DiaryWindowJconnect1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[2]");

    private By txt_Week3DiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[2]");

    private By txt_Week5DiaryWindowJconnect = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[2]");

    private By txt_WeekOneBaseLine1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[4]");

    private By txt_UnscheduledVisit = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[4]");


    private By txt_UnscheduledVisit1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[4]");

    private By txt_Week1Status2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[4]");

    private By txt_Week1Status1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[4]");

    private By txt_Week3Status = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[4]");


    private By txt_Week5Status = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[4]");





    @FindBy(xpath="(//div[text()='Summary'])[1]")
    private WebElement lnk_Summary;

    @FindBy(xpath="(//div[text()='Visits'])[1]")
    private WebElement lnk_Visits;

    @FindBy(xpath="(//span[@class='fa fa-undefined fa-solid fa-book'])[1]")
    private WebElement btn_DiarySubjectList;


    @FindBy(xpath="(//li[text()='PHQ-9'])[1]")
    private WebElement lnk_PHQ;

    @FindBy(xpath="(//li[text()='Q-LES-Q-SF'])[1]")
    private WebElement lnk_QLESQSF;

    @FindBy(xpath="(//li[text()='QIDS-SR'])[1]")
    private WebElement lnk_QIDSSR;

    @FindBy(xpath="(//li[text()='SHAPS'])[1]")
    private WebElement lnk_SHAPS;


    @FindBy(xpath="(//li[text()='CPFQ'])[1]")
    private WebElement lnk_CPFQ;

    @FindBy(xpath="(//li[text()='GAD-7'])[1]")
    private WebElement lnk_GAD7;

    @FindBy(xpath="(//li[text()='Insomnia Severity Index (ISI)'])[1]")
    private WebElement lnk_InsomniaSeverity;

   @FindBy(xpath="(//li[text()='AUDIT'])[1]")
    private WebElement lnk_AUDIT;

    @FindBy(xpath="//*[contains(text(), 'Form Audit Trail')]")
    private WebElement lnk_FormAuditTrial;

    @FindBy(xpath="//*[contains(text(), 'Record Audit Trail')]")
    private WebElement lnk_RecordAuditTrial;

    @FindBy(xpath="//*[contains(text(), 'Export')]")
    private WebElement btn_Export;

    @FindBy(xpath="//*[contains(text(), 'Back')]")
    private WebElement btn_Back;

    @FindBy(xpath="(//span[@class='fa fa-external-link'])[1]")
    private WebElement lnk_Action;

    @FindBy(xpath="(//span[@class='fa fa-paper-plane'])[2]")
    private WebElement lnk_ActionSubjectList;

    @FindBy(xpath="(//textarea[@id='message'])[1]")
    private WebElement txt_MessageToSubject;

    @FindBy(xpath="(//span[text()='Send'])[1]")
    private WebElement btn_SendMsg;

    @FindBy(xpath="(//span[text()='Print'])[1]")
    private WebElement btn_Print;

    private By txt_FormsPHQ = By.xpath("(//li[text()='PHQ-9'])[1]");

    private By txt_FormsAUDIT = By.xpath("(//li[text()='AUDIT'])[1]");

    private By txt_FormsCHRTSR = By.xpath("(//li[text()='CHRT-SR12'])[1]");

    @FindBy(xpath="(//li[text()='CHRT-SR12'])[1]")
    private WebElement lnk_CHRTSR;
    @FindBy(xpath="(//span[text()='Completed Forms'])[1]")
    private WebElement btn_VisitCompletedForms;

    @FindBy(xpath="(//span[text()='Partially Submitted'])[1]")
    private WebElement btn_VisitPartiallSubmittedForms;


    private By SubFormsStartDate = By.xpath("((//div[@class='ant-table-body'])[1]//table[1]/tbody[1])/tr[1]/td[1]");

    private By SubFormsEndDate = By.xpath("((//div[@class='ant-table-body'])[1]//table[1]/tbody[1])/tr[1]/td[2]");

    private By actualSubmissionDate = By.xpath("((//div[@class='ant-table-body'])[1]//table[1]/tbody[1])/tr[1]/td[3]");

    private By withDrawenStatusSubjectList = By.xpath("(//span[text()='Withdrawn'])[1]");

    @FindBy(xpath="(//textarea[@id='comments'])[1]")
    private WebElement input_WithdrawnComments;

    @FindBy(xpath="(//span[text()='Save'])[1]")
    private WebElement btn_SaveComments;

    @FindBy(xpath="(//span[text()='Withdrawn'])[1]")
    private WebElement btn_WithDrawn;



    @FindBy(xpath="(//li[text()='AAA'])[1]")
    private WebElement lnk_FormsAAA;

    @FindBy(xpath="(//span[text()='Save'])[1]")
    private WebElement btn_AuthorVisitSave;


    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[1]")
    private WebElement btn_visittype;

    @FindBy(xpath="(//i[@class='anticon anticon-down ant-select-arrow-icon'])[2]")
    private WebElement btn_drpStatementTestementType;

    @FindBy(xpath="(//button[@class='ant-btn ant-input-search-button ant-btn-primary'])[1]")
    private WebElement btn_SubjectListSearch;

    @FindBy(xpath="(//button[@class='ant-btn ant-input-search-button ant-btn-primary'])[1]")
    private WebElement btn_ListSearch;

    private By txt_Status =  By.xpath("(//span[@class='ant-tag ant-tag-green'])[1]");

    private By txt_Status2 =  By.xpath("(//span[@class='ant-tag ant-tag-blue'])[1]");

    private By txt_Status1 =  By.xpath("(//span[@class='ant-tag ant-tag-red'])[1]");

    @FindBy(xpath="(//span[text()='List'])[2]")
    private WebElement lnk_SubjectListMenu;

    @FindBy(xpath="(//span[text()='List'])[1]")
    private WebElement lnk_StudyListMenu;

    @FindBy(xpath="(//span[text()='List'])[1]")
    private WebElement lnk_SubjectListMenu1;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[3]")
    private WebElement chkbox_Week1Baseline;

    @FindBy(xpath="//*[contains(text(),'Screening Pass')]")
    private WebElement btn_ScreeningPass;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[3]")
    private WebElement chkbox_Week1BaseLineCheckbox;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[5]")
    private WebElement chkbox_SafetyFollowUpCheckbox;

    @FindBy(xpath = "(//span[text()='Save & Next'])[1]")
    private WebElement btn_SaveandNext;

    @FindBy(xpath = "(//span[text()='Validate Credentials'])[1]")
    private WebElement btn_ValidateCredentials;

    @FindBy(xpath="//*[contains(text(),'OK')]")
    private WebElement btn_ScreeningPassOK;

    @FindBy(xpath="(//span[text()='My Account'])[1]")
    private WebElement lnk_MyAccount;

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


    public boolean clickSubjectListSearch(){
        try{
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_SubjectListSearch);
            loggerObj.info("The btn_SubjectListSearch is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickListSearch(){
        try{
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptClick(btn_ListSearch);
            loggerObj.info("The btn_ListSearch is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getStatus() {

        seleniumAction.clickElement(txt_Status);
        loggerObj.info("The txt_Status is clicked");
        String alert = driver.findElement(txt_Status).getText();
        loggerObj.info("The Subject Status is :" + alert);
        return alert;
    }
    public String getStatus2() {

        seleniumAction.clickElement(txt_Status2);
        loggerObj.info("The txt_Status2 is clicked");
        String alert = driver.findElement(txt_Status2).getText();
        loggerObj.info("The Subject Status is :" + alert);
        return alert;
    }


    public String getStatus1() {

        seleniumAction.clickElement(txt_Status1);
        loggerObj.info("The txt_Status is clicked");
        String alert = driver.findElement(txt_Status1).getText();
        loggerObj.info("The Subject Status is :" + alert);
        return alert;
    }

    public boolean clickSubjectListMenu(){
        try{

            seleniumAdaptor.JavaScriptClick(lnk_SubjectListMenu);
            loggerObj.info("The lnk_SubjectListMenu is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSubjectListMenu1(){
        try{

            seleniumAdaptor.JavaScriptClick(lnk_SubjectListMenu1);
            loggerObj.info("The lnk_SubjectListMenu1 is clicked");

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

    public void CheckingChkboxWeek1Baseline(){
        String val=chkbox_Week1Baseline.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_Week1Baseline.isSelected();
        if (checkstatus==true){
            System.out.println("chkbox_Week1Baseline is already checked");
        }
        else
        {

            System.out.println("chkbox_Week1Baseline is not selected");
        }
    }

    public void CheckingChkboxSafetyFollowUp(){
        String val=chkbox_SafetyFollowUpCheckbox.getText();
        loggerObj.info("The text is :" + val);
        boolean checkstatus;
        checkstatus=chkbox_SafetyFollowUpCheckbox.isSelected();
        if (checkstatus==true){
            System.out.println("SafetyFollowUpCheckbox is already checked");
        }
        else
        {

            System.out.println("SafetyFollowUpCheckbox is not selected");
        }
    }
    public boolean clickScreeningPass(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_ScreeningPass);
            loggerObj.info("The btn_ScreeningPass is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickWeek1BaseLineCheckbox(){
        try{

            seleniumAdaptor.JavaScriptClick(chkbox_Week1BaseLineCheckbox);
            loggerObj.info("The chkbox_Week1BaseLineCheckbox is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}


    public boolean clickSafetyFollowUpCheckbox(){
        try{

            seleniumAdaptor.JavaScriptClick(chkbox_SafetyFollowUpCheckbox);
            loggerObj.info("The chkbox_SafetyFollowUpCheckbox is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickSaveandNext(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_SaveandNext);
            loggerObj.info("The btn_SaveandNext is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickValidateCredentials(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_ValidateCredentials);
            loggerObj.info("The btn_ValidateCredentials is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}


    public boolean clickScreeningPassOK(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_ScreeningPassOK);
            loggerObj.info("The btn_ScreeningPassOK is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}
    public boolean clickMyAccount(){
        try{

            seleniumAdaptor.JavaScriptClick(lnk_MyAccount);
            loggerObj.info("The lnk_MyAccount is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}
    public boolean captureSubjectListSearch(String subjectListSearch){
        try{

            loggerObj.info("The inout_SubjectListSearch is not captured");
            seleniumAdaptor.JavaScriptClick(inout_SubjectListSearch);
            seleniumAction.clearText(inout_SubjectListSearch);
            seleniumAction.typeText(inout_SubjectListSearch,subjectListSearch);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureListSearch(String subjectListSearch){
        try{

            loggerObj.info("The inout_ListSearch is not captured");
            seleniumAdaptor.JavaScriptClick(inout_ListSearch);
            seleniumAction.clearText(inout_ListSearch);
            seleniumAction.typeText(inout_ListSearch,subjectListSearch);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getICFDesc() {

        seleniumAction.clickElement(txt_IcfDescr);
        loggerObj.info("The txt_IcfDescr is clicked");
        String desc = driver.findElement(txt_IcfDescr).getText();
        loggerObj.info("The ICF description is :" + desc);
        return desc;
    }

    public String geSAFERInterviewDesc() {

        seleniumAction.clickElement(txt_SAFERInterviewDescr);
        loggerObj.info("The txt_SAFERInterviewDescr is clicked");
        String desc = driver.findElement(txt_SAFERInterviewDescr).getText();
        loggerObj.info("The txt_SAFERInterviewDescr is :" + desc);
        return desc;
    }

    public String getArmAssignDesc() {

        seleniumAction.clickElement(txt_ArmAssignDescr);
        loggerObj.info("The txt_SAFERInterviewDescr is clicked");
        String desc = driver.findElement(txt_ArmAssignDescr).getText();
        loggerObj.info("The ArmAssignment Descr is :" + desc);
        return desc;
    }

    public String getTreatmentVisitDiaryWindowWeek1() {

        String notification=driver.findElement(txt_DiaryWindowWeek1).getText();
        loggerObj.info("The TreatmentVisitDiaryWindowWeek1 is :" + notification);
        return notification;
    }

    public String getTreatmentVisitDiaryWindowWeek3() {

        String notification=driver.findElement(txt_DiaryWindowWeek3).getText();
        loggerObj.info("The TreatmentVisitDiaryWindowWeek3 Description is :" + notification);
        return notification;
    }

    public String getTreatmentVisitDiaryWindowWeek5() {

        String notification=driver.findElement(txt_DiaryWindowWeek5).getText();
        loggerObj.info("The TreatmentVisitDiaryWindowWeek5 Description is :" + notification);
        return notification;
    }

    public String getTreatmentVisitDiaryWindowWeek7() {

        String notification=driver.findElement(txt_DiaryWindowWeek7).getText();
        loggerObj.info("The TreatmentVisitDiaryWindowWeek7 Description is :" + notification);
        return notification;
    }

    public String getTreatmentVisitDiaryWindowWeek9() {
        String notification=driver.findElement(txt_DiaryWindowWeek9).getText();
        loggerObj.info("The TreatmentVisitDiaryWindowWeek7 Description is is :" + notification);
        return notification;
    }

    public String getVisitDatesOutOfWindowPopup() {
        String notification=driver.findElement(txt_VisitDatesOutOfWindowPopup).getText();
        loggerObj.info("The VisitDatesOutOfWindowPopup Description is is :" + notification);
        return notification;
    }

    public boolean clickOK(){
        try{

            seleniumAdaptor.JavaScriptClick(clickOK);
            loggerObj.info("The btn_OK is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean firstSubNumList(){
        try{

            seleniumAdaptor.JavaScriptClick(firstSubNumList);
            loggerObj.info("The firstSubNumList is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public String getWeekOneBaseLineDesc() {

        seleniumAction.clickElement(txt_WeekOneBaseLineDesc);
        loggerObj.info("The txt_WeekOneBaseLineDesc is clicked");
        String desc = driver.findElement(txt_WeekOneBaseLineDesc).getText();
        loggerObj.info("The txt_WeekOneBaseLineDesc is :" + desc);
        return desc;
    }

    public String getWeek1Desc() {

        seleniumAction.clickElement(txt_Week1Desc);
        loggerObj.info("The txt_Week1Desc is clicked");
        String desc = driver.findElement(txt_Week1Desc).getText();
        loggerObj.info("The txt_Week1Desc is :" + desc);
        return desc;
    }

    public String getScreeningDesc() {

        seleniumAction.clickElement(txt_ScreeningDesc);
        loggerObj.info("The txt_ScreeningDesc is clicked");
        String desc = driver.findElement(txt_ScreeningDesc).getText();
        loggerObj.info("The txt_ScreeningDesc is :" + desc);
        return desc;
    }

    public String getICFDiaryWindow() {

        seleniumAction.clickElement(txt_DiaryWindow);
        loggerObj.info("The txt_DiaryWindow is clicked");
        String diaryWindow = driver.findElement(txt_DiaryWindow).getText();
        loggerObj.info("The DiaryWindow is :" + diaryWindow);
        return diaryWindow;
    }

    public String getICFStatus() {

        seleniumAction.clickElement(txt_ICFstatus);
        loggerObj.info("The txt_ICFstatus is clicked");
        String iCFstatus = driver.findElement(txt_ICFstatus).getText();
        loggerObj.info("The ICF Status is :" + iCFstatus);
        return iCFstatus;
    }

    public String getSAFERInterviewStatus() {

        seleniumAction.clickElement(txt_SAFERInterview);
        loggerObj.info("The txt_ICFstatus is clicked");
        String SAFERstatus = driver.findElement(txt_SAFERInterview).getText();
        loggerObj.info("The SAFERInterview Status is :" + SAFERstatus);
        return SAFERstatus;
    }




    public String getScreeningStatus() {

        seleniumAction.clickElement(txt_Screening);
        loggerObj.info("The txt_Screening is clicked");
        String Screeningstatus = driver.findElement(txt_Screening).getText();
        loggerObj.info("The Screening Status is :" + Screeningstatus);
        return Screeningstatus;
    }

    public String getWeek1BaseLineStatus1() {

        seleniumAction.clickElement(txt_WeekOneBaseLine1);
        loggerObj.info("The txt_WeekOneBaseLine1 is clicked");
        String WeekOneBaseLine = driver.findElement(txt_WeekOneBaseLine1).getText();
        loggerObj.info("The WeekOneBaseLine Status is :" + WeekOneBaseLine);
        return WeekOneBaseLine;
    }

    public String getUnscheduledVisitStatus() {

        seleniumAction.clickElement(txt_UnscheduledVisit);
        loggerObj.info("The txt_Screening is clicked");
        String UnscheduledVisit = driver.findElement(txt_UnscheduledVisit).getText();
        loggerObj.info("The UnscheduledVisit Status is :" + UnscheduledVisit);
        return UnscheduledVisit;
    }

    public String getUnscheduledVisitStatus1() {

        seleniumAction.clickElement(txt_UnscheduledVisit1);
        loggerObj.info("The txt_Screening is clicked");
        String UnscheduledVisit1 = driver.findElement(txt_UnscheduledVisit1).getText();
        loggerObj.info("The UnscheduledVisit Status is :" + UnscheduledVisit1);
        return UnscheduledVisit1;
    }


    public String getWeek1Status2() {

        seleniumAction.clickElement(txt_Week1Status2);
        loggerObj.info("The txt_Screening is clicked");
        String week1status = driver.findElement(txt_Week1Status2).getText();
        loggerObj.info("The Week1 Status is  :" + week1status);
        return week1status;
    }


    public String getWeek1Status1() {

        seleniumAction.clickElement(txt_Week1Status1);
        loggerObj.info("The txt_Week1Status1 is clicked");
        String Week1Status1 = driver.findElement(txt_Week1Status1).getText();
        loggerObj.info("The Week1 Status is :" + Week1Status1);
        return Week1Status1;
    }

    public String getWeek3Status() {

        seleniumAction.clickElement(txt_Week3Status);
        loggerObj.info("The txt_Week3Status is clicked");
        String Week3 = driver.findElement(txt_Week3Status).getText();
        loggerObj.info("The Week3Status Status is :" + Week3);
        return Week3;
    }

    public String getWeek5Status() {

        seleniumAction.clickElement(txt_Week5Status);
        loggerObj.info("The Week5Status is clicked");
        String status = driver.findElement(txt_Week5Status).getText();
        loggerObj.info("The Week5 Status is :" + status);
        return status;
    }

    public String getWeekOneBaseLineStatus() {

        seleniumAction.clickElement(txt_WeekOneBaseLine);
        loggerObj.info("The txt_Screening is clicked");
        String WeekOneBaseLinestatus = driver.findElement(txt_WeekOneBaseLine).getText();
        loggerObj.info("The WeekOneBaseLine Status is :" + WeekOneBaseLinestatus);
        return WeekOneBaseLinestatus;
    }
    public String getWeek1Status() {

        seleniumAction.clickElement(txt_Week1Status);
        loggerObj.info("The txt_Week1Status is not clicked");
        String Week1Status = driver.findElement(txt_Week1Status).getText();
        loggerObj.info("The WeekOneBaseLine Status is :" + Week1Status);
        return Week1Status;
    }




    public String getICFDiaryWindowJconnect() {

        seleniumAction.clickElement(txt_ICFDiaryWindowJconnect);
        loggerObj.info("The txt_ICFDiaryWindowJconnec is not clicked");
        String DiaryWindow = driver.findElement(txt_ICFDiaryWindowJconnect).getText();
        loggerObj.info("The ICFDiaryWindow is :" + DiaryWindow);
        return DiaryWindow;
    }

    public String getScreeningDiaryWindowJconnect() {

        seleniumAction.clickElement(txt_ScreeningDiaryWindowJconnect);
        loggerObj.info("The txt_Week1Status is not clicked");
        String DiaryWindowJconnect = driver.findElement(txt_ScreeningDiaryWindowJconnect).getText();
        loggerObj.info("The ScreeningDiaryWindow Jconnect is :" + DiaryWindowJconnect);
        return DiaryWindowJconnect;
    }

    public String getSaferInterviewDiaryWindowJconnect() {

        seleniumAction.clickElement(txt_SaferInterviewDiaryWindowJconnect);
        loggerObj.info("The txt_SaferInterviewDiaryWindowJconnect is not clicked");
        String DiaryWindow = driver.findElement(txt_SaferInterviewDiaryWindowJconnect).getText();
        loggerObj.info("The SaferInterviewDiaryWindowJconnect is :" + DiaryWindow);
        return DiaryWindow;
    }

    public String getWeek1BaselineDiaryWindowJconnect() {

        seleniumAction.clickElement(txt_Week1BaseLineDiaryWindowJconnect);
        loggerObj.info("The txt_Week1BaseLineDiaryWindowJconnect is not clicked");
        String Week1BaseLine = driver.findElement(txt_Week1BaseLineDiaryWindowJconnect).getText();
        loggerObj.info("The Week1BaseLineDiaryWindowJconnect is :" + Week1BaseLine);
        return Week1BaseLine;
    }

    public String getUnscheduledDiaryWindowJconnect() {

        seleniumAction.clickElement(txt_UnscheduledDiaryWindowJconnect);
        loggerObj.info("The txt_UnscheduledDiaryWindowJconnect is not clicked");
        String DiaryWindowJconnect = driver.findElement(txt_UnscheduledDiaryWindowJconnect).getText();
        loggerObj.info("The UnscheduledDiaryWindowJconnect is :" + DiaryWindowJconnect);
        return DiaryWindowJconnect;
    }

    public String getUnscheduledDiaryWindowJconnect1() {

        seleniumAction.clickElement(txt_UnscheduledDiaryWindowJconnect1);
        loggerObj.info("The txt_UnscheduledDiaryWindowJconnect is not clicked");
        String DiaryWindowJconnect = driver.findElement(txt_UnscheduledDiaryWindowJconnect1).getText();
        loggerObj.info("The UnscheduledDiaryWindowJconnect is :" + DiaryWindowJconnect);
        return DiaryWindowJconnect;
    }


    public String getWeek1DiaryWindowJconnect() {

        seleniumAction.clickElement(txt_Week1DiaryWindowJconnect);
        loggerObj.info("The txt_Week1DiaryWindowJconnect is not clicked");
        String Week1DiaryWindow = driver.findElement(txt_Week1DiaryWindowJconnect).getText();
        loggerObj.info("The Week1DiaryWindowJconnect is :" + Week1DiaryWindow);
        return Week1DiaryWindow;
    }

    public String getWeek1DiaryWindowJconnect1() {

        seleniumAction.clickElement(txt_Week1DiaryWindowJconnect1);
        loggerObj.info("The txt_Week1DiaryWindowJconnect is not clicked");
        String Week1DiaryWindow = driver.findElement(txt_Week1DiaryWindowJconnect1).getText();
        loggerObj.info("The Week1DiaryWindowJconnect is :" + Week1DiaryWindow);
        return Week1DiaryWindow;
    }


    public String getWeek3DiaryWindowJconnect() {

        seleniumAction.clickElement(txt_Week3DiaryWindowJconnect);
        loggerObj.info("The txt_Week3DiaryWindowJconnect is not clicked");
        String Week3DiaryWindow = driver.findElement(txt_Week3DiaryWindowJconnect).getText();
        loggerObj.info("The Week3DiaryWindowJconnect is :" + Week3DiaryWindow);
        return Week3DiaryWindow;
    }

    public String getWeek5DiaryWindowJconnect() {

        seleniumAction.clickElement(txt_Week5DiaryWindowJconnect);
        loggerObj.info("The txt_Week5DiaryWindowJconnect is not clicked");
        String DiaryWindow = driver.findElement(txt_Week5DiaryWindowJconnect).getText();
        loggerObj.info("The Week5DiaryWindowJconnect is :" + DiaryWindow);
        return DiaryWindow;
    }



    public boolean clickSubNumberMRN(String subNum){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();

            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//td)[1]//span[starts-with(text(),'"+subNum+"')]")));
            loggerObj.info("The SubNumberMRN is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickSummary(){
        try{

            seleniumAdaptor.JavaScriptClick(lnk_Summary);
            loggerObj.info("The lnk_Summary is not clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickVisits(){
        try{

            seleniumAdaptor.JavaScriptClick(lnk_Visits);
            loggerObj.info("The lnk_Visits is not clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickDiarySubjectList(){
        try{

            seleniumAdaptor.JavaScriptClick(btn_DiarySubjectList);
            loggerObj.info("The btn_DiarySubjectList is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean SelectVisit (String visittype){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_visittype);
            loggerObj.info("The btn_visittype is selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[8]//li[starts-with(text(),'"+visittype+"')]")));
            loggerObj.info("The Visittype is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean SelectVisit1 (String visittype){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_visittype);
            loggerObj.info("The btn_visittype is selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+visittype+"')]")));
            loggerObj.info("The Visittype is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean SelectAuthorVisitStatementTestementType (String statementTestementType){
        try{
//            seleniumAction.scrollBy("0", "1400");
//            seleniumAdaptor.scrollDown();
            seleniumAdaptor.JavaScriptClick(btn_drpStatementTestementType);
            loggerObj.info("The btN_drpStatementTestementType is selected");
            seleniumAdaptor.pauseFor(2);
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[9]//li[starts-with(text(),'"+statementTestementType+"')]")));
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//ul)[7]//li[starts-with(text(),'"+statementTestementType+"')]")));
            loggerObj.info("The callDurationHrs is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}

    public boolean clickAuthorVisitSave(){
        try{
            loggerObj.info("The btn_AuthorVisitSave is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AuthorVisitSave);
            loggerObj.info("The btn_AuthorVisitSave is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsAAA(){
        try{
            loggerObj.info("The lnk_FormsAAA is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_FormsAAA);
            loggerObj.info("The lnk_FormsAAA is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsPHQ(){
        try{
            loggerObj.info("The lnk_PHQ is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_PHQ);
            loggerObj.info("The lnk_PHQ is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsQLESQSF(){
        try{
            loggerObj.info("The lnk_QLESQSF is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_QLESQSF);
            loggerObj.info("The lnk_QLESQSF is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsQIDSSR(){
        try{
            loggerObj.info("The lnk_QIDSSR is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_QIDSSR);
            loggerObj.info("The lnk_QIDSSR is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsSHAPS(){
        try{
            loggerObj.info("The lnk_SHAPS is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_SHAPS);
            loggerObj.info("The lnk_SHAPS is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsCPFQ(){
        try{
            loggerObj.info("The lnk_CPFQ is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CPFQ);
            loggerObj.info("The lnk_CPFQ is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsGAD7(){
        try{
            loggerObj.info("The lnk_GAD7 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_GAD7);
            loggerObj.info("The lnk_GAD7 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickFormsInsomniaSeverity(){
        try{
            loggerObj.info("The lnk_InsomniaSeverity is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_InsomniaSeverity);
            loggerObj.info("The lnk_InsomniaSeverity is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormsAUDIT(){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            loggerObj.info("The lnk_AUDIT is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_AUDIT);
            loggerObj.info("The lnk_AUDIT is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormAuditTrial(){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            loggerObj.info("The lnk_FormAuditTrial is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_FormAuditTrial);
            loggerObj.info("The lnk_FormAuditTrial is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickRecordAuditTrial(){
        try{

            loggerObj.info("The lnk_RecordAuditTrial is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_RecordAuditTrial);
            loggerObj.info("The lnk_RecordAuditTrial is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickExport(){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            loggerObj.info("The btn_Export is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Export);
            loggerObj.info("The btn_Export is clicked");
            seleniumAdaptor.pauseFor(3);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickBack(){
        try{
//            seleniumAction.scrollBy("0", "1400");
//            seleniumAdaptor.scrollDown();
            loggerObj.info("The btn_Back is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Back);
            loggerObj.info("The btn_Back is clicked");
            seleniumAdaptor.pauseFor(3);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAction(){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            loggerObj.info("The lnk_Action is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Action);
            loggerObj.info("The lnk_Action is clicked");
            seleniumAdaptor.pauseFor(2);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickActionSubjectList(){
        try{
            loggerObj.info("The lnk_ActionSubjectList is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_ActionSubjectList);
            loggerObj.info("The lnk_ActionSubjectList is clicked");
//            seleniumAdaptor.pauseFor(2);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureMessageToSubject(String messageToSub){
        try{

            loggerObj.info("The txt_MessageToSubject is not clicked");
            seleniumAdaptor.JavaScriptClick(txt_MessageToSubject);
            seleniumAction.clearText(txt_MessageToSubject);
            seleniumAction.typeText(txt_MessageToSubject,messageToSub);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSendMsg(){
        try{
            loggerObj.info("The btn_SendMsg is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SendMsg);
            loggerObj.info("The btn_SendMsg is clicked");


            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}


    public boolean clickPrint(){
        try{
            seleniumAction.scrollBy("0", "1400");
            seleniumAdaptor.scrollDown();
            loggerObj.info("The btn_Print is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Print);
            loggerObj.info("The btn_Print is clicked");
            seleniumAdaptor.pauseFor(3);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public String getFormsPHQ() {

        seleniumAction.clickElement(txt_FormsPHQ);
        loggerObj.info("The txt_FormsPHQ is clicked");
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(txt_FormsPHQ).getText();
        loggerObj.info("The Forms Description is :" + txt);
        return txt;
    }

    public String getFormsAUDIT() {

        seleniumAction.clickElement(txt_FormsAUDIT);
        loggerObj.info("The txt_FormsAUDIT is clicked");
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(txt_FormsAUDIT).getText();
        loggerObj.info("The Forms Description is :" + txt);
        return txt;
    }

    public String getFormsCHRTSR() {

        seleniumAction.clickElement(txt_FormsCHRTSR);
        loggerObj.info("The txt_FormsCHRTSR is clicked");
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(txt_FormsCHRTSR).getText();
        loggerObj.info("The Forms Description is :" + txt);
        return txt;
    }
    public boolean clickFormsCHRTSR(){
        try{
            loggerObj.info("The lnk_CHRTSR is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CHRTSR);
            loggerObj.info("The lnk_CHRTSR is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickVisitCompletedForms(){
        try{
            loggerObj.info("The btn_VisitCompletedForms is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_VisitCompletedForms);
            loggerObj.info("The btn_VisitCompletedForms is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickVisitPartiallSubmittedForms(){
        try{
            loggerObj.info("The btn_VisitPartiallSubmittedForms is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_VisitPartiallSubmittedForms);
            loggerObj.info("The btn_VisitPartiallSubmittedForms is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String getSubFormsStartDate() {

        seleniumAction.clickElement(SubFormsStartDate);
        loggerObj.info("The SubFormsStartDate is not clicked");
        String number = driver.findElement(SubFormsStartDate).getText();
        loggerObj.info("The Scheduled StartDate for Form is :" + number);
        return number;
    }

    public String getSubFormsEndDate() {

        seleniumAction.clickElement(SubFormsEndDate);
        loggerObj.info("The SubFormsEndDate is not clicked");
        String number = driver.findElement(SubFormsEndDate).getText();
        loggerObj.info("The Scheduled EndDate for Form is :" + number);
        return number;
    }

    public String getActualSubmissionDate() {

        seleniumAction.clickElement(actualSubmissionDate);
        loggerObj.info("The actualSubmissionDate is not clicked");
        String number = driver.findElement(actualSubmissionDate).getText();
        loggerObj.info("The ActualSubmissionDate for Form is :" + number);
        return number;
    }


    public void checkSubFormsEndDate(){

        if (driver.findElement(By.xpath("((//div[@class='ant-table-body'])[1]//table[1]/tbody[1])/tr[1]/td[2]")).isDisplayed())

        {
            loggerObj.info("The SubFormsEndDate is Visible");
        }
        else
        {

            loggerObj.info("The SubFormsEndDate is not Present");
        }
    }

    public boolean clickWithdrawn(){
        try{

            loggerObj.info("The btn_WithDrawn is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_WithDrawn);
            loggerObj.info("The btn_WithDrawn is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureWithdrawnComments(String withdrawnComments){
        try{

            loggerObj.info("The input_WithdrawnComments is not captured");
            seleniumAdaptor.JavaScriptClick(input_WithdrawnComments);
            seleniumAction.clearText(input_WithdrawnComments);
            seleniumAction.typeText(input_WithdrawnComments,withdrawnComments);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureWithdrawnComments1(String withdrawnComments){
        try{

            loggerObj.info("The input_Password is not clicked");
            seleniumAdaptor.JavaScriptClick(input_WithdrawnComments);
            seleniumAction.clearText(input_WithdrawnComments);
            seleniumAction.typeText(input_WithdrawnComments,withdrawnComments);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickSaveComments(){
        try{

            loggerObj.info("The btn_SaveComments is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SaveComments);
            loggerObj.info("The btn_SaveComments is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public String getWithDrawenStatusSubjectList() {

        seleniumAction.clickElement(withDrawenStatusSubjectList);
        loggerObj.info("The actualSubmissionDate is not clicked");
        String desc = driver.findElement(actualSubmissionDate).getText();
        loggerObj.info("The WithDrawenStatus Descriptionm is :" + desc);
        return desc;
    }




}
