package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;

public class WebAppLoginPage extends BaseClass {


    private static Logger loggerObj = LogManager.getLogger(WebAppLoginPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public WebAppLoginPage(WebDriver driver)
    {
        super(driver);

    }



    @FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement input_PhoneCode;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1niwhzg r-1loqt21 r-13awgt0 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[1]")
    private WebElement input_PhoneCode1;

    @FindBy(xpath="(//input[@placeholder='Enter your 10-Digit Phone Number.'])[1]")
    private WebElement input_PhoneNum;

    private By phoneNumText = By.xpath("(//input[@placeholder='Enter your 10-Digit Phone Number.'])[1]");


    private By passwordText = By.xpath("(//input[@placeholder='Password'])[1]");

    private By mountainTime = By.xpath("(//div[text()='(GMT-07:00) Mountain Time (US & Canada)'])[1]");

    private By pacificTime = By.xpath("(//div[text()='(GMT-08:00) Pacific Time (US & Canada)'])[1]");

    private By easternTime = By.xpath("(//div[text()='(GMT-05:00) Eastern Time (US & Canada)'])[1]");

    private By indianTime = By.xpath("(//div[text()='(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi'])[1]");

    private By centralTime = By.xpath("(//div[text()='(GMT-06:00) Central Time (US & Canada)'])[1]");

    private By formNamePHQ = By.xpath("(//div[text()='PHQ-9'])[1]");

    private By formNameAUDIT = By.xpath("(//div[text()='AUDIT'])[1]");

    private By formNameCHRTSR = By.xpath("(//div[text()='CHRT-SR12'])[1]");

    private By loginText = By.xpath("(//div[text()='Login'])[1]");


    @FindBy(xpath="(//input[@type='password'])[1]")
    private WebElement input_Password;

    @FindBy(xpath="(//textarea[@id='comments'])[1]")
    private WebElement input_WithdrawnComments;

    @FindBy(xpath="(//div[text()='Save'])[1]")
    private WebElement btn_SaveTimeZone;

    @FindBy(xpath="(//span[text()='Save'])[1]")
    private WebElement btn_SaveComments;

    @FindBy(xpath="(//div[text()='Diary'])[1]")
    private WebElement btn_Diary;

    @FindBy(xpath="(//span[text()='Withdrawn'])[1]")
    private WebElement btn_WithDrawn;

    @FindBy(xpath="(//div[text()='Week -1 Baseline'])[1]")
    private WebElement lnk_Week1Baseline;
    @FindBy(xpath="(//div[text()='Week 1'])[1]")
    private WebElement lnk_Week1;

    @FindBy(xpath="(//*[contains(text(),'Unscheduled')])[1]")
    private WebElement lnk_Unscheduled1;

    @FindBy(xpath="(//*[contains(text(),'Unscheduled')])[2]")
    private WebElement lnk_Unscheduled2;


    @FindBy(xpath="(//div[text()='Calls'])[1]")
    private WebElement btn_Calls;

    @FindBy(xpath="(//div[@aria-label='Past Calls, tab, 2 of 2'])[1]")
    private WebElement btn_PastCalls;

    @FindBy(xpath="(//div[@aria-label='Upcoming Calls, tab, 1 of 2'])[1]")
    private WebElement btn_UpcommingCalls;
    @FindBy(xpath="(//div[text()='Screening'])[1]")
    private WebElement lnk_Screening;

    @FindBy(xpath="(//div[text()='Depression form'])[1]")
    private WebElement lnk_DepressionForm;

    @FindBy(xpath="(//div[text()='CHRT-SR12'])[1]")
    private WebElement lnk_CHRTSRForm;

    @FindBy(xpath="(//div[text()='Q-LES-Q-SF'])[1]")
    private WebElement lnk_OLESQSFForm;

    @FindBy(xpath="(//div[text()='SHAPS'])[1]")
    private WebElement lnk_SHAPSForm;

    @FindBy(xpath="(//div[text()='GAD-7'])[1]")
    private WebElement lnk_GAD7Form;

    @FindBy(xpath="(//div[text()='Insomnia Severity Index (ISI)'])[1]")
    private WebElement lnk_InsomniaSeverityIndexForm;

    @FindBy(xpath="(//div[text()='CPFQ'])[1]")
    private WebElement lnk_CPFQForm;

    @FindBy(xpath="(//div[text()='QIDS-SR'])[1]")
    private WebElement lnk_QIDSSRForm;

    @FindBy(xpath="(//input[@class='css-11aywtz'])[1]")
    private WebElement input_Name;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[1]")
    private WebElement radiobtn_physicalHealthPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[1]")
    private WebElement radiobtn_insomniaDifficultSleep;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[5]")
    private WebElement radiobtn_insomniaStayingASleep;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[11]")
    private WebElement radiobtn_insomniaProblemWaking;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[16]")
    private WebElement radiobtn_insomniaCurrentSleepPattern;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[21]")
    private WebElement radiobtn_insomniaInterfere;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[26]")
    private WebElement radiobtn_insomniaNoticiable;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[31]")
    private WebElement radiobtn_insomniaWorried;




    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[6]")
    private WebElement radiobtn_MoodPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[11]")
    private WebElement radiobtn_WorkPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[16]")
    private WebElement radiobtn_HouseHoldActivitiesPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[21]")
    private WebElement radiobtn_SocialRelationshipPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[26]")
    private WebElement radiobtn_FamilyRelationshipPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[31]")
    private WebElement radiobtn_LeisureTimePoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[36]")
    private WebElement radiobtn_FunctionPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[41]")
    private WebElement radiobtn_PerformancePoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[46]")
    private WebElement radiobtn_EconomicStatusPoor;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[51]")
    private WebElement radiobtn_HousingSituationPoor;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[56]")
    private WebElement radiobtn_FeelingDizzyPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[61]")
    private WebElement radiobtn_VisiontoWorkPoor;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[66]")
    private WebElement radiobtn_WellBeingPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[71]")
    private WebElement radiobtn_MedicationPoor;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[76]")
    private WebElement radiobtn_OverallSatisfactionPoor;


    @FindBy(xpath="(//div[text()='AAA'])[1]")
    private WebElement lnk_AAAForm;


    @FindBy(xpath="(//div[text()='New Form'])[1]")
    private WebElement lnk_NewForm;

    @FindBy(xpath="(//div[text()='Form2 for GRID45455_1'])[1]")
    private WebElement lnk_FormForGrid;

    @FindBy(xpath="(//div[text()='six options85665'])[1]")
    private WebElement lnk_SixOptionsForm;

    @FindBy(xpath="(//div[text()='PHQ-9'])[1]")
    private WebElement lnk_PHQForm;

    @FindBy(xpath="(//div[text()='AUDIT'])[1]")
    private WebElement lnk_AuditForm;

    @FindBy(xpath="(//div[text()='Effects of body'])[1]")
    private WebElement lnk_EffectsOfBodyForm;

    @FindBy(xpath="(//div[text()='GRID Form123_1'])[1]")
    private WebElement lnk_GridForm123;


    @FindBy(xpath="(//div[text()='Chat'])[1]")
    private WebElement btn_Chat;

    @FindBy(xpath="(//div[@class='css-901oao r-jwli3a'])[1]")
    private WebElement btn_AddParticipants;

    @FindBy(xpath="(//div[@class='sc-hLBbgP jROBVC'])[1]")
    private WebElement btn_AddParticipants1;



    @FindBy(xpath="(//div[text()='More'])[1]")
    private WebElement btn_More;

    @FindBy(xpath="//*[contains(text(),'Notifications')]")
    private WebElement btn_Notifications;

    @FindBy(xpath="(//div[text()='Login'])[1]")
    private WebElement btn_Login;

    @FindBy(xpath="(//img[@src='assets/images/jConfigure_build.svg'])[1]")
    private WebElement lnk_JConfigureBuild;

    @FindBy(xpath="(//img[@src='assets/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild;

    @FindBy(xpath="(//input[@placeholder='Select Timezone'])[1]")
    private WebElement lnk_TimeZone;

    @FindBy(xpath="//*[contains(text(),'Timezone')]")
    private WebElement lnk_TimeZone1;

    @FindBy(xpath="//*[contains(text(),'Contact')]")
    private WebElement lnk_Contact;

    @FindBy(xpath="//*[contains(text(),'My Profile')]")
    private WebElement lnk_MyProfile1;

    @FindBy(xpath="//*[contains(text(),'Logout')]")
    private WebElement lnk_LogOut1;

    @FindBy(xpath="(//*[contains(text(),'No')])[3]")
    private WebElement btn_LogOutNo;

//    @FindBy(xpath="//*[contains(text(),'Your access is inactivated. Please contact your Study Coordinator.')]")
//    private WebElement txt_AccessInactivated;

    private By txt_AccessInactivated =  By.xpath("//*[contains(text(),'Your access is inactivated. Please contact your Study Coordinator.')]");

    private By txt_ICF =  By.xpath("(//div[text()='ICF'])[1]");

    private By txt_More =  By.xpath("(//*[contains(text(),'More')])[2]");

    private By txt_More1 =  By.xpath("(//*[contains(text(),'More')])[1]");
    private By txt_Notifications =  By.xpath("(//*[contains(text(),'Notifications')])[1]");


    private By txt_CallScheduleNotifications =  By.xpath("(//*[contains(text(),'Call Schedule Notification')])[1]");

    private By gettxtTimeZone =  By.xpath("(//*[contains(text(),'Timezone')])[1]");

    private By formFillAllDetails =  By.xpath("(//div[text()='Please fill all the required fields'])[1]");

    private By msgLogOut =  By.xpath("//*[contains(text(),'You are logging out of jConnect. Do you want to continue?')]");

    private By gettxtSite =  By.xpath("(//*[contains(text(),'160 - The Bishop Center for Translational Neuroscience')])[1]");

    private By gettxtSite1 =  By.xpath("((//div[@class='css-1dbjc4n'])[1]//div[2]/text()[1])[2]");
    private By gettxtTimeZone1 =  By.xpath("(//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu'])[1]");


    private By firstName =  By.xpath("(//div[@class='css-901oao r-1viopy3 r-ubezar r-1ffoksr'])[1]");

    private By email =  By.xpath("(//div[@class='css-901oao r-1viopy3 r-ubezar r-1ffoksr'])[3]");

    private By study =  By.xpath("(//div[@class='css-901oao r-1viopy3 r-ubezar r-1ffoksr'])[6]");

    private By version =  By.xpath("(//div[@class='css-901oao r-1viopy3 r-ubezar r-1ffoksr'])[8]");



    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu'])[1]")
    private WebElement lnk_TimeZoneoption;

    private By txt_Contact =  By.xpath("(//*[contains(text(),'Contact')])[1]");

    private By txt_MyProfile =  By.xpath("(//*[contains(text(),'My Profile')])[1]");

    private By gettxtLogout =  By.xpath("(//*[contains(text(),'Logout')])[1]");


    private By txt_SearchParticipants =  By.xpath("(//input[@placeholder='Search Participants'])[1]");

    private By txt_DoneParticipants =  By.xpath("(//*[contains(text(),'Done')])[1]");

    private By txt_ParticipantNameDan =  By.xpath("(//*[contains(text(),'Dan nick')])[1]");

    private By txt_Chat =  By.xpath("(//*[contains(text(),'No chats to display.')])[1]");

    private By txt_ICF1 =  By.xpath("(//*[contains(text(),'ICF')])[2]");

    private By txt_Screening =  By.xpath("(//*[contains(text(),'Screening')])[4]");


    private By txt_Screening1 =  By.xpath("(//*[contains(text(),'Screening')])[2]");
    private By txt_UpcomingCalls =  By.xpath("(//*[contains(text(),'Upcoming Calls')])[1]");

    private By txt_PastCalls =  By.xpath("(//*[contains(text(),'Past Calls')])[1]");

    private By txt_NoPastCalls =  By.xpath("(//*[contains(text(),'There are no past calls.')])[1]");
    private By txt_Alert =  By.xpath("(//div[@class='css-901oao r-11no91h r-1viopy3 r-1enofrn r-1xnzce8'])[1]");

    private By txtNoDiaryQuestionare = By.xpath("(//div[text()='No Diary/Questionnaires are available. Please contact your Site Staff'])[1]");

    @FindBy(xpath="(//a[text()=' Log Out '])[1]")
    private WebElement btn_SignOut;


    @FindBy(xpath="(//div[text()='ICF'])[1]")
    private WebElement lnk_ICFmeeting;

    @FindBy(xpath="(//div[text()='Logout'])[1]")
    private WebElement lnk_WebAppLogOut;

    @FindBy(xpath="(//div[text()='Yes'])[1]")
    private WebElement lnk_WebAppLogOutYes;
    @FindBy(xpath="(//div[text()='Safer'])[1]")
    private WebElement lnk_WebAppSafer;

    @FindBy(xpath="(//div[text()='SAFER Interview'])[1]")
    private WebElement lnk_WebAppSafer1;

    @FindBy(xpath="(//*[contains(text(),'Screening')])[3]")
    private WebElement lnk_WebAppScreening;

    @FindBy(xpath="(//*[contains(text(),'Screening')])[2]")
    private WebElement lnk_WebAppScreening2;

    @FindBy(xpath="(//*[contains(text(),'Screening')])[1]")
    private WebElement lnk_WebAppScreening1;


    @FindBy(xpath="(//*[contains(text(),'Week1BaseLine')])[2]")
    private WebElement lnk_WebAppWeekOneBaseLine;

    @FindBy(xpath="(//*[contains(text(),'Week1BaseLine')])[1]")
    private WebElement lnk_WebAppWeekOneBaseLine1;

    @FindBy(xpath="(//*[contains(text(),'Week 1')])[4]")
    private WebElement lnk_WebAppWeekOne;

    @FindBy(xpath="(//*[contains(text(),'Week 1')])[2]")
    private WebElement lnk_WebAppWeekOne1;

    @FindBy(xpath="(//*[contains(text(),'Unscheduled')])[2]")
    private WebElement lnk_WebAppUnscheduled;

    @FindBy(xpath="(//div[text()='Join Call'])[1]")
    private WebElement btn_JoinICFCall;

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[11]")
    private WebElement btn_EndCall1;

    @FindBy(xpath="(//div[text()='Submit'])[1]")
    private WebElement btn_SubmitDepFform;

    @FindBy(xpath="(//div[text()='OK'])[1]")
    private WebElement btn_SubmitformOK;

    private By txt_StatusScreening = By.xpath("//*[contains(text(),'Completed')]");

    private By windowStartDateWeek3 = By.xpath("(//div[@class='css-901oao r-1viopy3 r-1enofrn r-1g94qm0 r-1g80hic'][starts-with(text(),'Start Time')])[5]");


    private By window1StartDateWeek3 = By.xpath("(//div[@class='css-901oao r-1viopy3 r-1enofrn r-1g94qm0 r-1g80hic'][starts-with(text(),'Start Time')])[4]");


    private By windowEndDateWeek3 = By.xpath("(//div[@class='css-901oao r-1viopy3 r-1enofrn r-1g94qm0 r-1g80hic'][starts-with(text(),'End Time')])[5]");


    private By window1EndDateWeek3 = By.xpath("(//div[@class='css-901oao r-1viopy3 r-1enofrn r-1g94qm0 r-1g80hic'][starts-with(text(),'End Time')])[4]");

    private By txt_StatusScreening1 = By.xpath("//*[contains(text(),'Status:' )]");

    private By webAppAccessInactivated = By.xpath("//*[contains(text(),'Your access is inactivated. Please contact your Study Coordinator.' )]");


    @FindBy(xpath="//*[contains(text(),'Jackie')]")
    private WebElement lnk_ChatParticipantsWebApp;

    @FindBy(xpath="//*[contains(text(),'JSA SC')]")
    private WebElement lnk_ChatParticipantsWebApp1;

    @FindBy(xpath="(//div[@class='css-901oao'])[3]")
    private WebElement lnk_ChatAttachment;

    @FindBy(xpath="(//*[contains(text(),'pdf')])[2]")
    private WebElement lnk_ChatAttachment1;

    @FindBy(xpath="(//*[contains(text(),'pdf')])[1]")
    private WebElement lnk_ChatAttachment3;

    @FindBy(xpath="(//div//div[text()='AutomationSample.pdf'])[1]")
    private WebElement lnk_ChatAttachment4;

    @FindBy(xpath = "(//textarea[@placeholder='Type a message...'])[1]")
    private WebElement input_Message;

    @FindBy(xpath="(//div[@class='css-901oao r-jwli3a'])[2]")
    private WebElement btn_CheckCircle;


    @FindBy(xpath="(//img[@class='css-9pa8cd'])[2]")
    private WebElement btn_backDiary;

    @FindBy(xpath="(//img[@class='css-9pa8cd'])[3]")
    private WebElement btn_back;

    @FindBy(xpath="(//span[@class='css-901oao css-16my406 r-jwli3a'])[1]")
    private WebElement btn_back1;

    @FindBy(xpath="(//span[@class='css-901oao css-16my406'])[13]")
    private WebElement btn_back3;

    @FindBy(xpath="(//img[@class='css-9pa8cd'])[1]")
    private WebElement btn_back2;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-14lw9ot r-rs99b7 r-z80fyv r-1777fci r-19wmn03'])[2]")
    private WebElement chk_Field2SwellingOnmLegs;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-14lw9ot r-rs99b7 r-z80fyv r-1777fci r-19wmn03'])[8]")
    private WebElement chk_Field4SwellingOnmLegs;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-14lw9ot r-rs99b7 r-z80fyv r-1777fci r-19wmn03'])[14]")
    private WebElement chk_Field5SwellingOnmLegs;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-14lw9ot r-rs99b7 r-z80fyv r-1777fci r-19wmn03'])[19]")
    private WebElement chk_FieldNameQuesSwellingOnmLegs;

    @FindBy(xpath="(//input[@placeholder='Enter here'])[1]")
    private WebElement input_TestField1;

    @FindBy(xpath="(//input[@placeholder='Enter here'])[2]")
    private WebElement input_TestField2;

    @FindBy(xpath="(//textarea[@placeholder='Enter here'])[1]")
    private WebElement input_TestField3;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[33]")
    private WebElement radiobtn_DifficultyNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[37]")
    private WebElement radiobtn_DifficultyNotAtAll1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[29]")
    private WebElement radiobtn_ThoughtsNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[33]")
    private WebElement radiobtn_ThoughtsNotAtAll1;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[33]")
    private WebElement radiobtn_PHQHurtYourselfNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[37]")
    private WebElement radiobtn_PHQLittleInterest;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[37]")
    private WebElement radiobtn_PHQTGetAlongNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1p1xfu9 r-1f0042m'])[9]")
    private WebElement radiobtn_PHQHurtingYourselfMorethanHalf;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[36]")
    private WebElement radiobtn_PHQHurtingYourselfNearlyEveryDay;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[37]")
    private WebElement radiobtn_PHQTGetAlongNotAtAll1;
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[25]")
    private WebElement radiobtn_SpeakingSlowlyNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[29]")
    private WebElement radiobtn_SpeakingSlowlyNotAtAll1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[21]")
    private WebElement radiobtn_TroubleConcentratingNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[25]")
    private WebElement radiobtn_TroubleConcentratingNotAtAll1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[17]")
    private WebElement radiobtn_FeelingBadNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[21]")
    private WebElement radiobtn_FeelingBadNotAtAll1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[13]")
    private WebElement chk_PoorAppetiteNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[17]")
    private WebElement chk_PoorAppetiteNotAtAll1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[9]")
    private WebElement radiobtn_FeelingTiredNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[13]")
    private WebElement radiobtn_FeelingTiredNotAtAll1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[5]")
    private WebElement radiobtn_TroubleFallingNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[5]")
    private WebElement radiobtn_TroubleFallingNotAtAll1;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[1]")
    private WebElement radiobtn_FeelingDownNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr'])[1]")
    private WebElement radiobtn_PHQLittleInterest1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[1]")
    private WebElement radiobtn_CHRTNeverBetterDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[1]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNeverBetterStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[4]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNeverBetterAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[1]")
    private WebElement radiobtn_feelingNervousNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[5]")
    private WebElement radiobtn_stopWorrying;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[9]")
    private WebElement radiobtn_worryingTooMuchNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[13]")
    private WebElement radiobtn_troubleRelaxingNotAtAll;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[17]")
    private WebElement radiobtn_restlessNotAtAll;
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[21]")
    private WebElement radiobtn_becomeAnnoyedNotAtAll;
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[25]")
    private WebElement radiobtn_feelingAfraid;





    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[5]")
    private WebElement radiobtn_CHRTNoFutureDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[6]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNoFutureStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[9]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNoFutureAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[11]")
    private WebElement radiobtn_CHRTNothingRightDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[11]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNothingRightStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[14]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNothingRightAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[16]")
    private WebElement radiobtn_CHRTEverythingWrongDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[16]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTEverythingWrongStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[19]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTEverythingWrongAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[21]")
    private WebElement radiobtn_NoOneDependOnDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[21]//div[1]/div[1])[1]")
    private WebElement radiobtn_NoOneDependOnStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[24]//div[1]/div[1])[1]")
    private WebElement radiobtn_NoOneDependOnAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[26]")
    private WebElement radiobtn_AreGoneDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[26]//div[1]/div[1])[1]")
    private WebElement radiobtn_AreGoneStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[29]//div[1]/div[1])[1]")
    private WebElement radiobtn_AreGoneAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[31]")
    private WebElement radiobtn_SufferingDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[31]//div[1]/div[1])[1]")
    private WebElement radiobtn_SufferingStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[34]//div[1]/div[1])[1]")
    private WebElement radiobtn_SufferingAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[36]")
    private WebElement radiobtn_NoReasonToLiveDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[36]//div[1]/div[1])[1]")
    private WebElement radiobtn_NoReasonToLiveStronglyDisagree1;


    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[39]//div[1]/div[1])[1]")
    private WebElement radiobtn_NoReasonToLiveAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[41]")
    private WebElement radiobtn_GoToSleepDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[41]//div[1]/div[1])[1]")
    private WebElement radiobtn_GoToSleepStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[44]//div[1]/div[1])[1]")
    private WebElement radiobtn_GoToSleepAgree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[46]")
    private WebElement radiobtn_KillingMyselfDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[46]//div[1]/div[1])[1]")
    private WebElement radiobtn_KillingMyselfStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[49]//div[1]/div[1])[1]")
    private WebElement radiobtn_KillingMyselfAgree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[50]//div[1]/div[1])[1]")
    private WebElement radiobtn_KillingMyselfStronglyagree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[51]")
    private WebElement radiobtn_HowToKillingMyselfDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[51]//div[1]/div[1])[1]")
    private WebElement radiobtn_HowToKillingMyselfStronglyDisagree1;


    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[54]//div[1]/div[1])[1]")
    private WebElement radiobtn_HowToKillingMyselfAgree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[55]//div[1]/div[1])[1]")
    private WebElement radiobtn_HowToKillingMyselfStronglyagree;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[56]")
    private WebElement radiobtn_PlanToKillingMyselfDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[56]//div[1]/div[1])[1]")
    private WebElement radiobtn_PlanToKillingMyselfStronglyDisagree1;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[59]//div[1]/div[1])[1]")
    private WebElement radiobtn_PlanToKillingMyselfAgree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[60]//div[1]/div[1])[1]")
    private WebElement radiobtn_PlanToKillingMyselfStronglyagree;


    @FindBy(xpath="(//textarea[@placeholder='Enter here'])[1]")
    private WebElement input_Field1;

    @FindBy(xpath="(//textarea[@placeholder='Enter here'])[2]")
    private WebElement input_2field1;

    @FindBy(xpath="(//input[@placeholder='Enter here'])[1]")
    private WebElement input_2field2;

    @FindBy(xpath="(//textarea[@placeholder='Enter here'])[3]")
    private WebElement input_field;

    @FindBy(xpath="//*[contains(text(),'yes')]")
    private WebElement chk_field4yes;


    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-14lw9ot r-rs99b7 r-z80fyv r-1777fci r-19wmn03'])[1]")
    private WebElement chk_DepField1Option1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-14lw9ot r-rs99b7 r-z80fyv r-1777fci r-19wmn03'])[3]")
    private WebElement chk_DepField2Option1;

    private By btn_EndCall = By.xpath("(//div[@class='jitsi-icon jitsi-icon-default '])[11]");

    private By btn_EndCall3 = By.xpath("(//div[@class='toolbox-icon   hangup-button'])[1]");



    private By btn_JivaScience = By.xpath("(//a[@aria-label='jConnect  Televisit Logo, links to  Homepage'])[1]");


    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[11]")
    private WebElement btn_EndCall2;


    @FindBy(xpath="(//div[@class='toolbox-icon   hangup-button'])[1]")
    private WebElement btn_EndCall4;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu'])[1]")
    private WebElement btn_SelectTimeZone;



    public boolean captureTimeZoneWebApp(String timeZoneWebApp){
        try{
//            seleniumAdaptor.pauseFor(1);
//            seleniumAdaptor.scrollDown();
//            seleniumAdaptor.scrollDown();
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + timeZoneWebApp + "']")));
            loggerObj.info("The timezone is captured");
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSelectTimeZone(){
        try{

            loggerObj.info("The btn_SelectTimeZone is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SelectTimeZone);
            loggerObj.info("The btn_SelectTimeZone is clicked");
            seleniumAdaptor.pauseFor(2);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }







    public boolean captureTimeZoneOption(String timezone){

        try{

            seleniumAdaptor.pauseFor(2);
            seleniumAction.clickElement(driver.findElement(By.xpath("//div//div[text()='" + timezone + "']")));
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean capturePhoneCode(String phoneCode){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_PhoneCode is not clicked");
            seleniumAdaptor.JavaScriptClick(input_PhoneCode1);
            seleniumAction.clearText(input_PhoneCode1);
            seleniumAction.typeText(input_PhoneCode1,phoneCode);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean capturePhoneCode1(String phoneCode){
        try{

            loggerObj.info("The input_PhoneCode is not clicked");
            seleniumAdaptor.JavaScriptClick(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptSetValue(input_PhoneCode,phoneCode);
            loggerObj.info("The input_Date is captured");
//            seleniumAdaptor.JavaScriptClick(input_PhoneCode);
//            seleniumAction.clearText(input_PhoneCode1);
            seleniumAction.typeText(input_PhoneCode1,phoneCode);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean capturePhoneCode2(String phoneCode){
        try{

            loggerObj.info("The input_PhoneCode is not clicked");
            seleniumAdaptor.JavaScriptClick(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAdaptor.pauseFor(2);
            seleniumAdaptor.JavaScriptSetValue(input_PhoneCode,phoneCode);
            loggerObj.info("The input_Date is captured");
            seleniumAction.clearText(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            seleniumAction.clearText(input_PhoneCode);
            driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(phoneCode);
            seleniumAction.typeText(input_PhoneCode1,phoneCode);
            seleniumAdaptor.JavaScriptClick(input_PhoneNum);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public String getPhoneNumText() {

        seleniumAction.clickElement(phoneNumText);
        loggerObj.info("The phoneNumText is clicked");
        String text = driver.findElement(phoneNumText).getText();
//        WebElement element = driver.findElement(By.xpath("(//input[@placeholder='Enter your 10-Digit Phone Number.'])[1]"));
//        String val=element.getAttribute("innerText");
//        loggerObj.info("The phoneNumText1 is :" + val);
        loggerObj.info("The phoneNumText is :" + text);

        return text;
    }


    public String getFormNamePHQ() {

        seleniumAction.clickElement(formNamePHQ);
        loggerObj.info("The formNamePHQ is clicked");
        String text = driver.findElement(formNamePHQ).getText();
        loggerObj.info("The form Name PHQ Description is :" + text);

        return text;
    }

    public String getformNameAUDIT() {

        seleniumAction.clickElement(formNameAUDIT);
        loggerObj.info("The formNameAUDIT is clicked");
        String text = driver.findElement(formNameAUDIT).getText();
        loggerObj.info("The form Name AUDIT  Description is :" + text);

        return text;
    }


    public String getFormNameCHRTSR() {

        seleniumAction.clickElement(formNameCHRTSR);
        loggerObj.info("The formNamePHQ is clicked");
        String text = driver.findElement(formNameCHRTSR).getText();
        loggerObj.info("The form Name CHRTSR Description is :" + text);

        return text;
    }



    public String getCentralTime() {

        seleniumAction.clickElement(centralTime);
        loggerObj.info("The centralTime is clicked");
        String text = driver.findElement(centralTime).getText();
        loggerObj.info("The centralTime is :" + text);

        return text;
    }

    public String getpacificTime() {

        seleniumAction.clickElement(pacificTime);
        loggerObj.info("The pacificTime is clicked");
        String text = driver.findElement(pacificTime).getText();
        loggerObj.info("The pacificTime is :" + text);

        return text;
    }

    public String geteasternTime() {

        seleniumAction.clickElement(easternTime);
        loggerObj.info("The easternTime is clicked");
        String text = driver.findElement(easternTime).getText();
        loggerObj.info("The easternTime is :" + text);

        return text;
    }

    public String getindianTime() {

        seleniumAction.clickElement(indianTime);
        loggerObj.info("The indianTime is clicked");
        String text = driver.findElement(indianTime).getText();
        loggerObj.info("The indianTime is :" + text);

        return text;
    }

    public String getMountainTime() {

        seleniumAction.clickElement(mountainTime);
        loggerObj.info("The mountainTime is clicked");
        String text = driver.findElement(mountainTime).getText();
        loggerObj.info("The mountainTime is :" + text);

        return text;
    }



    public String getPasswordText() {

        seleniumAction.clickElement(passwordText);
        loggerObj.info("The passwordText is clicked");
        String text = driver.findElement(passwordText).getText();
        loggerObj.info("The passwordText is :" + text);

        return text;
    }

    public String getLoginText() {

        seleniumAction.clickElement(loginText);
        loggerObj.info("The loginText is clicked");
        String text = driver.findElement(loginText).getText();
        loggerObj.info("The LoginText is :" + text);

        return text;
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

    public void opentabJconnectWebApp(){


//        seleniumAdaptor.openNewTabJS(2);
//       Set<String> handles=driver.getWindowHandles();
//       for(String actual: handles){
//
//           if(!actual.equalsIgnoreCase(currentHandle)){
//               driver.switchTo().window(actual);
               ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(w.get(1));
//        seleniumAdaptor.switchToTab(3);
        driver.get("https://jconnect-build.qa.jivascience.com/webapp/admin/auth/login");

    }

    public void opentabJconnectWebApp1(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        seleniumAdaptor.switchToTab(0);
        driver.switchTo().window(tabs.get(3));
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");


    }

    public void opentabJconnect2(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        seleniumAdaptor.switchToTab(0);
        driver.switchTo().window(tabs.get(2));
        driver.get("https://jcollaborate.jiva-demo.jivascience.com/api/CRIOIntegration/users/sign_in");


    }

    public void opentabJconnect3(){
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        seleniumAdaptor.switchToTab(0);
        driver.switchTo().window(tabs.get(2));
        driver.get("https://jcollaborate.jiva-demo.jivascience.com/api/CRIOIntegration/users/sign_in");


    }


    public boolean capturePassword(String password){
        try{
//			seleniumAdaptor.pauseFor(2);
            loggerObj.info("The input_Password is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Password);
            seleniumAction.clearText(input_Password);
            seleniumAction.typeText(input_Password,password);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickSaveTimeZone(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_SaveTimeZone is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SaveTimeZone);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_SaveTimeZone is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickLogin(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Login is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Login);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Login is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }



    public boolean clickICF(){
        try{

            loggerObj.info("The lnk_ICFmeeting is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_ICFmeeting);

            loggerObj.info("The lnk_ICFmeeting is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickWebAppLogOut(){
        try{

            loggerObj.info("The lnk_WebAppLogOut is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppLogOut);

            loggerObj.info("The lnk_WebAppLogOut is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickWebAppLogOutYes(){
        try{

            loggerObj.info("The lnk_WebAppLogOutYes is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppLogOutYes);

            loggerObj.info("The lnk_WebAppLogOutYes is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }


    public boolean clickDiary(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Diary is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Diary);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Diary is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickDiary1(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Diary is not clicked");
            seleniumAction.clickElement(btn_Diary);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Diary is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickWeek1Baseline(){
        try{

            loggerObj.info("The lnk_Week1Baseline is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Week1Baseline);
            loggerObj.info("The lnk_Week1Baseline is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWeek1(){
        try{

            loggerObj.info("The lnk_Week1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Week1);
            loggerObj.info("The lnk_Week1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickUnscheduled1(){
        try{

            loggerObj.info("The lnk_Unscheduled1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Unscheduled1);
            loggerObj.info("The lnk_Unscheduled1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickUnscheduled2(){
        try{

            loggerObj.info("The lnk_Unscheduled2 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Unscheduled2);
            loggerObj.info("The lnk_Unscheduled2 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickCalls(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Calls is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Calls);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Calls is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPastCalls(){
        try{

            loggerObj.info("The btn_PastCalls is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_PastCalls);
            loggerObj.info("The btn_PastCalls is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickUpcomingCalls(){
        try{

            loggerObj.info("The btn_UpcommingCalls is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_UpcommingCalls);
            loggerObj.info("The btn_UpcommingCalls is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickScreening(){
        try{

            loggerObj.info("The lnk_Screening is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Screening);
            loggerObj.info("The lnk_Screening is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickDepressionForm(){
        try{

            loggerObj.info("The lnk_DepressionForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_DepressionForm);
            loggerObj.info("The lnk_DepressionForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTSRForm(){
        try{

            loggerObj.info("The lnk_CHRTSRForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CHRTSRForm);
            loggerObj.info("The lnk_CHRTSRForm is clicked");

            return true;
        } catch(Exception var2) {

            var2.printStackTrace();
            return false;
        }
    }



    public void checkFormsSubmitButtonVisibility(){

        if

        (driver.findElement(By.xpath("(//div[text()='Submit'])[1]")).isDisplayed())

        {
            loggerObj.info("The FormSubmit Button is Visible");
        }
        else
        {

            loggerObj.info("The FormSubmit Button is not Visible");
        }
    }

    public void checkFormsSubmitButtonVisibility1(){

        boolean t = driver.findElement(By.xpath("(//div[text()='Submit'])[1](//div[text()='Submit'])[1]")).isDisplayed();
        if (t) {
            loggerObj.info("FormsSubmitButton is dispalyed");
        } else {
            loggerObj.info("FormsSubmitButton is not dispalyed");
        }
    }

    public void checkFormsSubmitButtonVisibility2(){

//        boolean t = driver.findElement(By.xpath("(//div[text()='Submit'])[1]")).isDisplayed();
        int t = driver.findElements(By.xpath("(//div[text()='Submit'])[1]")).size();
        if (t > 0) {
            loggerObj.info("FormsSubmitButton is present");
        }else {
            loggerObj.info("FormsSubmitButton is not present");
        }
    }

    public boolean clickOLESQSFForm(){
        try{

            loggerObj.info("The lnk_OLESQSFForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_OLESQSFForm);
            loggerObj.info("The lnk_OLESQSFForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSHAPSForm(){
        try{

            loggerObj.info("The lnk_SHAPSForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_SHAPSForm);
            loggerObj.info("The lnk_SHAPSForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickGAD7Form(){
        try{

            loggerObj.info("The lnk_GAD7Form is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_GAD7Form);
            loggerObj.info("The lnk_GAD7Form is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickCPFQForm(){
        try{

            loggerObj.info("The lnk_CPFQForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_CPFQForm);
            loggerObj.info("The lnk_CPFQForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickQIDSSRForm(){
        try{

            loggerObj.info("The lnk_QIDSSRForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_QIDSSRForm);
            loggerObj.info("The lnk_QIDSSRForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickInsomniaSeverityIndexForm(){
        try{

            loggerObj.info("The lnk_InsomniaSeverityIndexForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_InsomniaSeverityIndexForm);
            loggerObj.info("The lnk_InsomniaSeverityIndexForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureFallingAsleepQIDS(String fallingAsleepQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The fallingAsleepQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+fallingAsleepQIDS+"')])[1]")));
            loggerObj.info("The fallingAsleepQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSleepDuringNightQIDS(String sleepDuringNightQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The sleepDuringNightQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+sleepDuringNightQIDS+"')])[1]")));
            loggerObj.info("The slewpDuringNightQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureWakingUpTooEarlyQIDS(String wakingUpTooEarlyQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The wakingUpTooEarlyQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+wakingUpTooEarlyQIDS+"')])[1]")));
            loggerObj.info("The wakingUpTooEarlyQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSleepingTooMuchQIDS(String sleepingTooMuchQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The sleepingTooMuchQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+sleepingTooMuchQIDS+"')])[1]")));
            loggerObj.info("The sleepingTooMuchQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureFeelingSadQIDS(String feelingSadQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The feelingSadQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+feelingSadQIDS+"')])[1]")));
            loggerObj.info("The feelingSadQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureDecreasedAppetiteQIDS(String decreasedAppetiteQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The decreasedAppetiteQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+decreasedAppetiteQIDS+"')])[1]")));
            loggerObj.info("The decreasedAppetiteQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureIncreasedAppetiteQIDS(String increasedAppetiteQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The increasedAppetiteQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+increasedAppetiteQIDS+"')])[1]")));
            loggerObj.info("The increasedAppetiteQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureDecreasedWeightQIDS(String decreasedWeightQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The wecreasedWeightQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+decreasedWeightQIDS+"')])[1]")));
            loggerObj.info("The wecreasedWeightQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureIncreasedWeightQIDS(String increasedWeightQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The increasedWeightQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+increasedWeightQIDS+"')])[1]")));
            loggerObj.info("The increasedWeightQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureConcentrationQIDS(String concentrationQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The concentrationQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+concentrationQIDS+"')])[1]")));
            loggerObj.info("The concentrationQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureViewOfMyselfQIDS(String viewOfMyselfQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The viewOfMyselfQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+viewOfMyselfQIDS+"')])[1]")));
            loggerObj.info("The viewOfMyselfQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureThoughtsOfDeathQIDS(String thoughtsOfDeathQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The thoughtsOfDeathQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+thoughtsOfDeathQIDS+"')])[1]")));
            loggerObj.info("The thoughtsOfDeathQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureGeneralInterestQIDS(String generalInterest){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The generalInterest is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+generalInterest+"')])[1]")));
            loggerObj.info("The generalInterest is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnergyLevelQIDS(String energyLevelQIDS){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The energyLevelQIDS is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+energyLevelQIDS+"')])[1]")));
            loggerObj.info("The energyLevelQIDS is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSlowedDownQIDS(String slowedDown){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The slowedDown is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+slowedDown+"')])[1]")));
            loggerObj.info("The slowedDown is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureFeelingRestlessQIDS(String feelingRestless){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The feelingRestless is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+feelingRestless+"')])[1]")));
            loggerObj.info("The feelingRestless is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }





    public boolean captureDifficultToWork(String difficultToWork){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The difficultToWork is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+difficultToWork+"')])[1]")));
            loggerObj.info("The difficultToWork is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureMotivationCPFQ(String motivationCPFQ){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The motivationCPFQ is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+motivationCPFQ+"')])[1]")));
            loggerObj.info("The motivationCPFQ is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureWakefullnessCPFQ(String wakefullnessCPFQ){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The wakefullnessCPFQ is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+wakefullnessCPFQ+"')])[2]")));
            loggerObj.info("The wakefullnessCPFQ is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnergyCPFQ(String energyCPFQ){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The energyCPFQ is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+energyCPFQ+"')])[3]")));
            loggerObj.info("The energyCPFQ is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureFocusCPFQ(String focusCPFQ){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The focusCPFQ is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+focusCPFQ+"')])[4]")));
            loggerObj.info("The focusCPFQ is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureAbilityToRememberCPFQ(String abilityToRememberCPFQ){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The abilityToRememberCPFQ is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+abilityToRememberCPFQ+"')])[5]")));
            loggerObj.info("The abilityToRememberCPFQ is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureAbilityToFindWordsCPFQ(String abilityToFindWords){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The abilityToFindWords is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+abilityToFindWords+"')])[6]")));
            loggerObj.info("The abilityToFindWords is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSharpnessCPFQ(String sharpnessCPFQ){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The sharpnessCPFQ is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+sharpnessCPFQ+"')])[7]")));
            loggerObj.info("The sharpnessCPFQ is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureName(String name){
        try{

            loggerObj.info("The input_Name is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Name);
            seleniumAction.clearText(input_Name);
            seleniumAction.typeText(input_Name,name);
            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickFeelingNervousNotAtAll(){
        try{

            loggerObj.info("The radiobtn_feelingNervousNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_feelingNervousNotAtAll);
            loggerObj.info("The radiobtn_feelingNervousNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickStopWorrying(){
        try{

            loggerObj.info("The radiobtn_stopWorrying is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_stopWorrying);
            loggerObj.info("The radiobtn_stopWorrying is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickWorryingTooMuchNotAtAll(){
        try{

            loggerObj.info("The radiobtn_worryingTooMuchNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_worryingTooMuchNotAtAll);
            loggerObj.info("The radiobtn_worryingTooMuchNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickTroubleRelaxingNotAtAll(){
        try{

            loggerObj.info("The radiobtn_troubleRelaxingNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_troubleRelaxingNotAtAll);
            loggerObj.info("The radiobtn_troubleRelaxingNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickRestless(){
        try{

            loggerObj.info("The radiobtn_restlessNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_restlessNotAtAll);
            loggerObj.info("The radiobtn_restlessNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickBecomeAnnoyedNotAtAll(){
        try{

            loggerObj.info("The radiobtn_becomeAnnoyedNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_becomeAnnoyedNotAtAll);
            loggerObj.info("The radiobtn_becomeAnnoyedNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }

    public boolean clickFeelingAfraidNotAtAll(){
        try{

            loggerObj.info("The radiobtn_feelingAfraid is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_feelingAfraid);
            loggerObj.info("The radiobtn_feelingAfraid is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }



    public boolean captureEnjoyTelevision(String enjoyTelevision){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyTelevision is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyTelevision+"')])[1]")));
            loggerObj.info("The enjoyTelevision is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureEnjoyBeingWithFamily(String enjoyBeingWithFamily){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyBeingWithFamily is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyBeingWithFamily+"')])[2]")));
            loggerObj.info("The enjoyBeingWithFamily is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePleasureInHobbies(String pleasureInHobbies){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The pleasureInHobbies is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+pleasureInHobbies+"')])[3]")));
            loggerObj.info("The pleasureInHobbies is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnjoyFavouriteMeal(String enjoyFavouriteMeal){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyFavouriteMeal is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyFavouriteMeal+"')])[4]")));
            loggerObj.info("The enjoyFavouriteMeal is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnjoyShower(String enjoyShower){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyShower is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyShower+"')])[5]")));
            loggerObj.info("The enjoyShower is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean capturePleasureInBread(String pleasureInBread){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The pleasureInBread is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+pleasureInBread+"')])[6]")));
            loggerObj.info("The pleasureInBread is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureEnjoySeingZPeopleSmile(String enjoySeingZPeopleSmile){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoySeingZPeopleSmile is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoySeingZPeopleSmile+"')])[7]")));
            loggerObj.info("The enjoySeingZPeopleSmile is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnjoyLookingSmart(String enjoyLookingSmart){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyLookingSmart is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyLookingSmart+"')])[8]")));
            loggerObj.info("The enjoyLookingSmart is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureEnjoyReadingBook(String enjoyReadingBook){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyReadingBook is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyReadingBook+"')])[9]")));
            loggerObj.info("The enjoyReadingBook is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnjoyTea(String enjoyTea){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyTea is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyTea+"')])[10]")));
            loggerObj.info("The enjoyTea is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean capturePleasureInSmallThings(String pleasureInSmallThings){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The pleasureInSmallThings is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+pleasureInSmallThings+"')])[11]")));
            loggerObj.info("The pleasureInSmallThings is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureEnjoyView(String enjoyView){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The enjoyView is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+enjoyView+"')])[12]")));
            loggerObj.info("The enjoyView is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturPleasureFromHelpingOthers(String pleasureFromHelpingOthers){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The pleasureFromHelpingOthers is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+pleasureFromHelpingOthers+"')])[13]")));
            loggerObj.info("The pleasureFromHelpingOthers is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturPleasureFromPraise(String pleasureFromPraise){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The pleasureFromPraise is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-gy4na3'][starts-with(text(),'"+pleasureFromPraise+"')])[14]")));
            loggerObj.info("The pleasureFromPraise is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickInsomniaDifficultSleep(){
        try{

            loggerObj.info("The radiobtn_insomniaDifficultSleep is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaDifficultSleep);
            loggerObj.info("The radiobtn_insomniaDifficultSleep is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickInsomniaStayingASleep(){
        try{

            loggerObj.info("The radiobtn_insomniaStayingASleep is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaStayingASleep);
            loggerObj.info("The radiobtn_insomniaStayingASleep is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickInsomniaProblemWaking(){
        try{

            loggerObj.info("The radiobtn_insomniaProblemWaking is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaProblemWaking);
            loggerObj.info("The radiobtn_insomniaProblemWaking is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickInsomniaCurrentSleepPattern(){
        try{

            loggerObj.info("The radiobtn_insomniaCurrentSleepPattern is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaCurrentSleepPattern);
            loggerObj.info("The radiobtn_insomniaCurrentSleepPattern is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickInsomniaInterfere(){
        try{

            loggerObj.info("The radiobtn_insomniaInterfere is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaInterfere);
            loggerObj.info("The radiobtn_insomniaInterfere is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickInsomniaNoticiable(){
        try{

            loggerObj.info("The radiobtn_insomniaNoticiable is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaNoticiable);
            loggerObj.info("The radiobtn_insomniaNoticiable is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickInsomniaWorried(){
        try{

            loggerObj.info("The radiobtn_insomniaWorried is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_insomniaWorried);
            loggerObj.info("The radiobtn_insomniaWorried is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }







    public boolean clickPhysicalHealthPoor(){
        try{

            loggerObj.info("The radiobtn_physicalHealthPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_physicalHealthPoor);
            loggerObj.info("The radiobtn_physicalHealthPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickMoodPoor(){
        try{

            loggerObj.info("The radiobtn_MoodPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_MoodPoor);
            loggerObj.info("The radiobtn_MoodPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWorkPoor(){
        try{

            loggerObj.info("The radiobtn_WorkPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_WorkPoor);
            loggerObj.info("The radiobtn_WorkPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickHouseHoldActivitiesPoor(){
        try{

            loggerObj.info("The radiobtn_HouseHoldActivitiesPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_HouseHoldActivitiesPoor);
            loggerObj.info("The radiobtn_HouseHoldActivitiesPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSocialRelationshipPoor(){
        try{

            loggerObj.info("The radiobtn_SocialRelationshipPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_SocialRelationshipPoor);
            loggerObj.info("The radiobtn_SocialRelationshipPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFamilyRelationshipPoor(){
        try{

            loggerObj.info("The radiobtn_FamilyRelationshipPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FamilyRelationshipPoor);
            loggerObj.info("The radiobtn_FamilyRelationshipPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickLeisureTimePoor(){
        try{

            loggerObj.info("The radiobtn_LeisureTimePoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_LeisureTimePoor);
            loggerObj.info("The radiobtn_LeisureTimePoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFunctionPoor(){
        try{

            loggerObj.info("The radiobtn_FunctionPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FunctionPoor);
            loggerObj.info("The radiobtn_FunctionPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickPerformancePoor(){
        try{

            loggerObj.info("The radiobtn_PerformancePoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PerformancePoor);
            loggerObj.info("The radiobtn_PerformancePoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickEconomicStatusPoor(){
        try{

            loggerObj.info("The radiobtn_EconomicStatusPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_EconomicStatusPoor);
            loggerObj.info("The radiobtn_EconomicStatusPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickHousingSituationPoor(){
        try{

            loggerObj.info("The radiobtn_HousingSituationPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_HousingSituationPoor);
            loggerObj.info("The radiobtn_HousingSituationPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFeelingDizzyPoor(){
        try{

            loggerObj.info("The radiobtn_FeelingDizzyPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FeelingDizzyPoor);
            loggerObj.info("The radiobtn_FeelingDizzyPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickVisiontoWorkPoor(){
        try{

            loggerObj.info("The radiobtn_VisiontoWorkPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_VisiontoWorkPoor);
            loggerObj.info("The radiobtn_VisiontoWorkPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWellBeingPoor(){
        try{

            loggerObj.info("The radiobtn_WellBeingPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_WellBeingPoor);
            loggerObj.info("The radiobtn_WellBeingPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickMedicationPoor(){
        try{

            loggerObj.info("The radiobtn_MedicationPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_MedicationPoor);
            loggerObj.info("The radiobtn_MedicationPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickOverallSatisfactionPoor(){
        try{

            loggerObj.info("The radiobtn_OverallSatisfactionPoor is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_OverallSatisfactionPoor);
            loggerObj.info("The radiobtn_OverallSatisfactionPoor is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickAAAForm(){
        try{

            loggerObj.info("The lnk_AAARForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_AAAForm);
            loggerObj.info("The lnk_AAARForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNewForm(){
        try{

            loggerObj.info("The lnk_NewForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_NewForm);
            loggerObj.info("The lnk_NewForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFormForGrid(){
        try{

            loggerObj.info("The lnk_FormForGrid is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_FormForGrid);
            loggerObj.info("The lnk_FormForGrid is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSixOptionsForm(){
        try{

            loggerObj.info("The lnk_SixOptionsForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_SixOptionsForm);
            loggerObj.info("The lnk_SixOptionsForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPHQForm(){
        try{

            loggerObj.info("The lnk_PHQForm not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_PHQForm);
            loggerObj.info("The lnk_PHQForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickAuditForm(){
        try{

            loggerObj.info("The lnk_AuditForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_AuditForm);
            loggerObj.info("The lnk_AuditForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickEffectsOfBodyForm(){
        try{

            loggerObj.info("The lnk_EffectsOfBodyForm is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_EffectsOfBodyForm);
            loggerObj.info("The lnk_EffectsOfBodyForm is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickGridForm123(){
        try{

            loggerObj.info("The lnk_GridForm123 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_GridForm123);
            loggerObj.info("The lnk_GridForm123 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickChat(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Chat is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Chat);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_Chat is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickAddParticipants(){
        try{

            loggerObj.info("The btn_AddParticipants is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddParticipants);
            loggerObj.info("The btn_AddParticipants is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAddParticipants1(){
        try{

            loggerObj.info("The btn_AddParticipants1 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_AddParticipants1);
            loggerObj.info("The btn_AddParticipants1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickMore(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_More is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_More);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The btn_More is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNotifications(){
        try{
//            seleniumAdaptor.pauseFor(2);
            loggerObj.info("The btn_Notifications is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_Notifications);
            loggerObj.info("The btn_Notifications is clicked");
            seleniumAdaptor.pauseFor(4);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String gettxtAlert() {

        seleniumAction.clickElement(txt_Alert);
        loggerObj.info("The txt_Alert is clicked");
        String alert = driver.findElement(txt_Alert).getText();
        loggerObj.info("The ICF description is :" + alert);
        return alert;
    }

    public String gettxtAccessInactivated() {

        seleniumAction.clickElement(txt_AccessInactivated);
        loggerObj.info("The txt_AccessInactivated is clicked");
        String alert = driver.findElement(txt_AccessInactivated).getText();
        loggerObj.info("The AccessInactivated message description is :" + alert);
        return alert;
    }



    public boolean clickJConnectBuild(){
        try{
//        seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_JConnectBuild is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_JConnectBuild);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_JConnectBuild is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickTimeZone(){
        try{
//        seleniumAdaptor.pauseFor(2);
            loggerObj.info("The lnk_TimeZone is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_TimeZone);
//			loggerObj.debug("Print Logger");
            loggerObj.info("The lnk_TimeZone is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickTimeZone1(){
        try{

            loggerObj.info("The lnk_TimeZone1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_TimeZone1);
            loggerObj.info("The lnk_TimeZone1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickContact1(){
        try{

            loggerObj.info("The lnk_Contact is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_Contact);
            loggerObj.info("The lnk_Contact is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickMyProfile1(){
        try{

            loggerObj.info("The lnk_MyProfile1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_MyProfile1);
            loggerObj.info("The lnk_MyProfile1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickLogOut1(){
        try{

            loggerObj.info("The lnk_LogOut1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_LogOut1);
            loggerObj.info("The lnk_LogOut1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickLogOutNo(){
        try{

            loggerObj.info("The btn_LogOutNo is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_LogOutNo);
            loggerObj.info("The btn_LogOutNo is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean buttonBackBrowser(){
        try{

            driver.navigate().back();
            loggerObj.info("The back button is clicked");
            seleniumAdaptor.pauseFor(2);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public String gettxtSearchParticipants() {

        seleniumAction.clickElement(txt_SearchParticipants);
        loggerObj.info("The txt_SearchParticipants is clicked");
        String txt = driver.findElement(txt_SearchParticipants).getText();
        loggerObj.info("The SearchParticipants field description is :" + txt);
        return txt;
    }

    public String gettxtMore() {

//        seleniumAction.clickElement(txt_More);
        loggerObj.info("The txt_More is clicked");
        String txt = driver.findElement(txt_More).getText();
        loggerObj.info("The More option description is :" + txt);
        return txt;
    }

    public String gettxtMore1() {

//        seleniumAction.clickElement(txt_More);
        loggerObj.info("The txt_More1 is clicked");
        String txt = driver.findElement(txt_More1).getText();
        loggerObj.info("The More option description is :" + txt);
        return txt;
    }

    public String gettxtNotifications() {

//        seleniumAction.clickElement(txt_Notifications);
//        loggerObj.info("The txt_Notifications is clicked");
        String txt = driver.findElement(txt_Notifications).getText();
        loggerObj.info("The Notifications description is :" + txt);
        return txt;
    }

//    public String gettxtTimeZone1() {
//
////        seleniumAction.clickElement(txt_Notifications);
////        loggerObj.info("The txt_TimeZone is clicked");
//        String txt = driver.findElement(txt_TimeZone1).getText();
//        loggerObj.info("The TimeZone description is :" + txt);
//        return txt;
//    }


    public String gettxtCallScheduleNotifications() {

        seleniumAction.clickElement(txt_CallScheduleNotifications);
        loggerObj.info("The txt_Notifications is clicked");
        String txt = driver.findElement(txt_CallScheduleNotifications).getText();
        loggerObj.info("The CallScheduleNotifications description is :" + txt);
        return txt;
    }
    public String gettxtTimeZone() {

//        seleniumAction.clickElement(gettxtTimeZone);
//        loggerObj.info("The gettxtTimeZone is clicked");
        String txt = driver.findElement(gettxtTimeZone).getText();
        loggerObj.info("The TimeZone description is :" + txt);
        return txt;
    }

    public String gettxtTimeZoneoption() {

//        seleniumAction.clickElement(gettxtTimeZone);
//        loggerObj.info("The gettxtTimeZone1 is clicked");
        String txt = driver.findElement(gettxtTimeZone1).getText();
        loggerObj.info("The TimeZone description is :" + txt);
        return txt;
    }

    public String getFirstName() {

        seleniumAction.clickElement(firstName);
        loggerObj.info("The firstName is clicked");
        String password = driver.findElement(firstName).getText();
        String txt = password.split(":")[1].trim();
        loggerObj.info("The firstName is :" + txt);


        return txt;
    }

    public String getEmail() {

        seleniumAction.clickElement(email);
        loggerObj.info("The email is clicked");
        String password = driver.findElement(email).getText();
        String txt = password.split(":")[1].trim();
        loggerObj.info("The email is :" + txt);


        return txt;
    }

    public String getStudy() {

        seleniumAction.clickElement(study);
        loggerObj.info("The study is clicked");
        String password = driver.findElement(study).getText();
        String txt = password.split(":")[1].trim();
        loggerObj.info("The study is :" + txt);


        return txt;
    }

    public String getversion() {

        seleniumAction.clickElement(version);
        loggerObj.info("The version is clicked");
        String password = driver.findElement(version).getText();
        String txt = password.split(":")[1].trim();
        loggerObj.info("The version is :" + txt);


        return txt;
    }




    public String gettxtSite() {

        seleniumAction.clickElement(gettxtSite);
        loggerObj.info("The gettxtSite is clicked");
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(gettxtSite).getText();
        loggerObj.info("The Site description is :" + txt);
        return txt;
    }

    public String getMsgLogOut() {

        seleniumAction.clickElement(msgLogOut);
        loggerObj.info("The msgLogOut is clicked");
        seleniumAdaptor.pauseFor(1);
        String txt = driver.findElement(msgLogOut).getText();
        loggerObj.info("The Site description is :" + txt);
        return txt;
    }

    public String getMsgFormFillAllDetails() {

        seleniumAction.clickElement(formFillAllDetails);
        loggerObj.info("The msgLogOut is clicked");
        String txt = driver.findElement(formFillAllDetails).getText();
        loggerObj.info("The Alert Message for not filling all the req details in Form is :" + txt);
        return txt;
    }

    public String gettxtContact() {

//        seleniumAction.clickElement(txt_Contact);
//        loggerObj.info("The txt_Contact is clicked");
        String txt = driver.findElement(txt_Contact).getText();
        loggerObj.info("The Contact description is :" + txt);
        return txt;
    }

    public String gettxtMyProfile() {

//        seleniumAction.clickElement(txt_MyProfile);
//        loggerObj.info("The txt_MyProfile is clicked");
        String txt = driver.findElement(txt_MyProfile).getText();
        loggerObj.info("The MyProfile description is :" + txt);
        return txt;
    }

    public String gettxLogout() {

//        seleniumAction.clickElement(gettxtLogout);
//        loggerObj.info("The gettxtLogout is clicked");
        String txt = driver.findElement(gettxtLogout).getText();
        loggerObj.info("The Logout description is :" + txt);
        return txt;
    }

    public String gettxtDoneParticipants() {

//        seleniumAction.clickElement(txt_DoneParticipants);
        loggerObj.info("The txt_DoneParticipants is clicked");
        String txt = driver.findElement(txt_DoneParticipants).getText();
        loggerObj.info("The DoneParticipants button description is :" + txt);
        return txt;
    }

    public String gettxtParticipantName() {

//        seleniumAction.clickElement(txt_ParticipantNameDan);
        loggerObj.info("The txt_ParticipantNameDan is clicked");
        String txt = driver.findElement(txt_ParticipantNameDan).getText();
        loggerObj.info("The ParticipantName description is :" + txt);
        return txt;
    }


    public String gettxtChat() {

        seleniumAction.clickElement(txt_Chat);
        loggerObj.info("The txt_Chat is clicked");
        String txt = driver.findElement(txt_Chat).getText();
        loggerObj.info("The Chat description is :" + txt);
        return txt;
    }


    public String gettxtICF() {

        seleniumAction.clickElement(txt_ICF);
        loggerObj.info("The txt_ICF is clicked");
        String iCFtxt = driver.findElement(txt_ICF).getText();
        loggerObj.info("The ICF description is :" + iCFtxt);
        return iCFtxt;
    }

    public String gettxtICF1() {

        seleniumAction.clickElement(txt_ICF1);
        loggerObj.info("The txt_ICF is clicked1");
        String iCFtxt = driver.findElement(txt_ICF1).getText();
        loggerObj.info("The ICF description is :" + iCFtxt);
        return iCFtxt;
    }

    public String gettxtScreening() {

        seleniumAction.clickElement(txt_Screening);
        loggerObj.info("The txt_Screening is clicked1");
        String txt = driver.findElement(txt_Screening).getText();
        loggerObj.info("The Screening description is :" + txt);
        return txt;
    }

    public String gettxtScreening1() {

        seleniumAction.clickElement(txt_Screening1);
        loggerObj.info("The txt_Screening1 is clicked1");
        String txt = driver.findElement(txt_Screening1).getText();
        loggerObj.info("The Screening description is :" + txt);
        return txt;
    }



    public String gettxtUpcomingCalls() {

        seleniumAction.clickElement(txt_UpcomingCalls);
        loggerObj.info("The txt_UpcomingCalls is clicked1");
        String txt = driver.findElement(txt_UpcomingCalls).getText();
        loggerObj.info("The UpcomingCalls description is :" + txt);
        return txt;
    }

    public String gettxtPastCalls() {

        seleniumAction.clickElement(txt_PastCalls);
        seleniumAdaptor.pauseFor(1);
        loggerObj.info("The txt_PastCalls is clicked1");
        String txt = driver.findElement(txt_PastCalls).getText();
        loggerObj.info("The PastCalls description is :" + txt);
        return txt;
    }

    public String gettxtNoPastCalls() {

        seleniumAction.clickElement(txt_NoPastCalls);
        seleniumAdaptor.pauseFor(1);
        loggerObj.info("The txt_NoPastCalls is clicked1");
        String txt = driver.findElement(txt_NoPastCalls).getText();
        loggerObj.info("The NoPastCalls description is :" + txt);
        return txt;
    }




    public String gettxtNoDiaryQuestionare() {

        seleniumAction.clickElement(txtNoDiaryQuestionare);
        loggerObj.info("The txtNoDiaryQuestionare is clicked");
        String iCFtxt = driver.findElement(txtNoDiaryQuestionare).getText();
        loggerObj.info("The NoDiaryQuestionare description is :" + iCFtxt);
        return iCFtxt;
    }

    public boolean clickICFmeeting() {
        try {

            loggerObj.info("The lnk_ICFmeeting is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_ICFmeeting);
            loggerObj.info("The lnk_ICFmeeting is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWebAppSafermeeting() {
        try {

            loggerObj.info("The lnk_WebAppSafer is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppSafer);
            loggerObj.info("The lnk_WebAppSafer is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickWebAppSafermeeting1() {
        try {

            loggerObj.info("The lnk_WebAppSafer is not clicked1");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppSafer1);
            loggerObj.info("The lnk_WebAppSafer1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickWebAppScreeningmeeting() {
        try {

            loggerObj.info("The lnk_WebAppScreening is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppScreening);
            loggerObj.info("The lnk_WebAppScreening is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWebAppScreeningmeeting2() {
        try {

            loggerObj.info("The lnk_WebAppScreening2 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppScreening2);
            loggerObj.info("The lnk_WebAppScreening2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickWebAppScreeningmeeting1() {
        try {

            loggerObj.info("The lnk_WebAppScreening1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppScreening1);
            loggerObj.info("The lnk_WebAppScreening1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickWebAppWeekOneBaseLinemeeting() {
        try {

            loggerObj.info("The lnk_WebAppWeekOneBaseLine is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppWeekOneBaseLine);
            loggerObj.info("The lnk_WebAppWeekOneBaseLine is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWebAppWeekOneBaseLinemeeting1() {
        try {

            loggerObj.info("The lnk_WebAppWeekOneBaseLine1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppWeekOneBaseLine1);
            loggerObj.info("The lnk_WebAppWeekOneBaseLine1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickWebAppWeekOnemeeting() {
        try {

            loggerObj.info("The lnk_WebAppWeekOne is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppWeekOne);
            loggerObj.info("The lnk_WebAppWeekOne is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickWebAppWeekOnemeeting1() {
        try {

            loggerObj.info("The lnk_WebAppWeekOne1 is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppWeekOne1);
            loggerObj.info("The lnk_WebAppWeekOne1 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickWebAppUnscheduledmeeting1() {
        try {

            loggerObj.info("The lnk_WebAppUnscheduled is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_WebAppUnscheduled);
            loggerObj.info("The lnk_WebAppUnscheduled is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickJoinICFCall() {
        try {

            loggerObj.info("The btn_JoinICFCall is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_JoinICFCall);
            loggerObj.info("The btn_JoinICFCall is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickEndCallWebApp() {
        try {
          seleniumAction.hoverMouseOverElement(btn_EndCall);
            loggerObj.info("The btn_EndCall is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_EndCall1);
            loggerObj.info("The btn_EndCall is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickEndCallWebApp1() {
        try {
            seleniumAction.hoverMouseOverElement(btn_EndCall);
            seleniumAdaptor.JavaScriptClick(btn_EndCall2);
            loggerObj.info("The JS1btn_EndCall2 is clicked");
            seleniumAction.clickElement(btn_EndCall2);
            loggerObj.info("The 1btn_EndCall2 is clicked");

//            loggerObj.info("The btn_EndCall2 is not clicked");
//            seleniumAction.WaitFoElementToBeVisible(btn_EndCall2);
//            seleniumAction.clickElement(btn_EndCall2);
//            seleniumAdaptor.JavaScriptClick(btn_EndCall2);
//            seleniumAction.clickElement(btn_EndCall2);
//            loggerObj.info("The btn_EndCall2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickEndCallWebApp2() {
        try {

            seleniumAction.hoverMouseOverElement(btn_JivaScience);
            seleniumAction.hoverMouseOverElement(btn_EndCall3);
            seleniumAdaptor.JavaScriptClick(btn_EndCall4);
            loggerObj.info("The btn_EndCall4 is clicked");
//            seleniumAction.clickElement(btn_EndCall2);
//            loggerObj.info("The 1btn_EndCall2 is clicked");

            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }}




    public boolean captureOptionstobeSlected(String OptionstobeSlected){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The radiobtn_OptionstobeSlected is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz r-1wbh5a2 r-a023e6 r-156q2ks']//div[1][starts-with(text(),'"+OptionstobeSlected+"')]")));
            loggerObj.info("The radiobtn_OptionstobeSlected is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureField123(String Field123){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The radiobtn_Field123 is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz r-1wbh5a2 r-a023e6 r-156q2ks']//div[1][starts-with(text(),'"+Field123+"')]")));
            loggerObj.info("The radiobtn_Field123 is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickDepField1Option1(){
        try{

            loggerObj.info("The chk_DepField1Option1 is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_DepField1Option1);
            loggerObj.info("The chk_DepField1Option1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickDepField2Option1(){
        try{

            loggerObj.info("The chk_DepField2Option1 is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_DepField2Option1);
            loggerObj.info("The chk_DepField2Option1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSubmitDepFform(){
        try{

            loggerObj.info("The btn_SubmitDepFform is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SubmitDepFform);
            loggerObj.info("The btn_SubmitDepFform is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSubmitformOK(){
        try{

            loggerObj.info("The btn_SubmitformOK is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_SubmitformOK);
            loggerObj.info("The btn_SubmitformOK is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public String getCheckingStatusScreening() {

        String status=driver.findElement(txt_StatusScreening).getText();
        loggerObj.info("The Screening Status is :" + status);
        return status;
    }

    public String getCheckingStatusScreening1() {

        String status=driver.findElement(txt_StatusScreening1).getText();
        loggerObj.info("The Screening Status is :" + status);
        return status;
    }


    public boolean clickBackDiary(){
        try{

            loggerObj.info("The btn_backDiary is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_backDiary);
            loggerObj.info("The btn_backDiary is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickBack(){
        try{

            loggerObj.info("The btn_back is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_back);
            loggerObj.info("The btn_back is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickBack1(){
        try{

            loggerObj.info("The btn_back1 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_back1);
            loggerObj.info("The btn_back1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickBack3(){
        try{

            loggerObj.info("The btn_back3 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_back3);
            loggerObj.info("The btn_back3 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickBack2(){
        try{

            loggerObj.info("The btn_back2 is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_back2);
            loggerObj.info("The btn_back2 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickTimeZoneoption(){
        try{

            loggerObj.info("The lnk_TimeZoneoption is not clicked");
            seleniumAdaptor.JavaScriptClick(lnk_TimeZoneoption);
            loggerObj.info("The lnk_TimeZoneoption is clicked");
            seleniumAdaptor.pauseFor(1);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickField2SwellingOnmLegs(){
        try{

            loggerObj.info("The chk_Field2SwellingOnmLegs is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_Field2SwellingOnmLegs);
            loggerObj.info("The chk_Field2SwellingOnmLegs is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
//
    public boolean clickField4SwellingOnmLegs(){
        try{

            loggerObj.info("The chk_Field4SwellingOnmLegs is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_Field4SwellingOnmLegs);
            loggerObj.info("The chk_Field4SwellingOnmLegs is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickField5SwellingOnmLegs(){
        try{

            loggerObj.info("The chk_Field5SwellingOnmLegs is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_Field5SwellingOnmLegs);
            loggerObj.info("The chk_Field5SwellingOnmLegs is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFieldNameQuesSwellingOnmLegs(){
        try{

            loggerObj.info("The chk_FieldNameQuesSwellingOnmLegs is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_FieldNameQuesSwellingOnmLegs);
            loggerObj.info("The chk_FieldNameQuesSwellingOnmLegs is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureTestField1(String testField1){
        try{

            loggerObj.info("The input_TestField1 is not clicked");
            seleniumAdaptor.JavaScriptClick(input_TestField1);
            seleniumAction.clearText(input_TestField1);
            seleniumAction.typeText(input_TestField1,testField1);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
//
//
    public boolean captureTestField2(String testField2){
        try{

            loggerObj.info("The input_TestField2 is not clicked");
            seleniumAdaptor.JavaScriptClick(input_TestField2);
            seleniumAction.clearText(input_TestField2);
            seleniumAction.typeText(input_TestField2,testField2);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
//
//
    public boolean captureTestField3(String testField3){
        try{

            loggerObj.info("The input_TestField3 is not clicked");
            seleniumAdaptor.JavaScriptClick(input_TestField3);
            seleniumAction.clearText(input_TestField3);
            seleniumAction.typeText(input_TestField3,testField3);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureField2Yes(String Field2option){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The captureField2Yes is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+Field2option+"')]")));
            loggerObj.info("The captureField2Yes is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureField2No(String Field2option){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The captureField2No is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+Field2option+"')]")));
            loggerObj.info("The captureField2No is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureField2option(String Field2option){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The Field2option is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+Field2option+"')]")));
            loggerObj.info("The Field2option is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

//    public boolean captureField2option(String Field2option){
//        try{
//            seleniumAction.scrollBy("0", "1400");
//
//            seleniumAdaptor.scrollDown();
//            loggerObj.info("The Field2option is not selected");
//            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+Field2option+"')]")));
//            loggerObj.info("The Field2option is selected");
//
//            return true;
//        } catch(Exception var2) {
//            var2.printStackTrace();
//            return false;
//        }
//    }


    public boolean capturefield14(String field4){
        try{


            seleniumAdaptor.scrollDown();
            loggerObj.info("The field4 is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[2][starts-with(text(),'"+field4+"')]")));
            loggerObj.info("The field4 is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureSingleselectopt(String Singleselectopt){
        try{


            loggerObj.info("The Singleselectopt is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz r-1wbh5a2 r-a023e6 r-156q2ks']//div[1][starts-with(text(),'"+Singleselectopt+"')]")));
            loggerObj.info("The Singleselectopt is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean capturefield4(String capturefield4){
        try{


            loggerObj.info("The capturefield4 is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz r-1wbh5a2 r-a023e6 r-156q2ks']//div[1][starts-with(text(),'"+capturefield4+"')]")));
            loggerObj.info("The capturefield4 is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturefield11(String field1){
        try{

            loggerObj.info("The input_Field1 is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Field1);
            seleniumAction.clearText(input_Field1);
            seleniumAction.typeText(input_Field1,field1);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureinput_2field1(String field1){
        try{

            loggerObj.info("The input_2field1 is not clicked");
            seleniumAdaptor.JavaScriptClick(input_2field1);
            seleniumAction.clearText(input_2field1);
            seleniumAction.typeText(input_2field1,field1);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureinput_2field2(String field2){
        try{

            loggerObj.info("The input_TestField3 is not clicked");
            seleniumAdaptor.JavaScriptClick(input_2field2);
            seleniumAction.clearText(input_2field2);
            seleniumAction.typeText(input_2field2,field2);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureinput_field(String field){
        try{

            loggerObj.info("The input_field is not clicked");
            seleniumAdaptor.JavaScriptClick(input_field);
            seleniumAction.clearText(input_field);
            seleniumAction.typeText(input_field,field);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturefield4yes(){
        try{

            loggerObj.info("The chk_field4yes is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_field4yes);
            loggerObj.info("The chk_field4yes is clicked");

            return true;
        } catch(Exception var2) {
            return false;
        }
    }
    public boolean captureFeelingDown(String feelingdown){
        try{


            loggerObj.info("The feelingdown is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+feelingdown+"')])[1]")));
            loggerObj.info("The feelingdown is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTroubleFalling(String troubleFalling){
        try{


            loggerObj.info("The troubleFalling is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+troubleFalling+"')])[2]")));
            loggerObj.info("The troubleFalling is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureFeelingTired(String feelingTired){
        try{


            loggerObj.info("The feelingTired is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+feelingTired+"')])[3]")));
            loggerObj.info("The feelingTired is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePoorAppetite(String poorAppetite){
        try{


            loggerObj.info("The poorAppetite is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+poorAppetite+"')])[4]")));
            loggerObj.info("The poorAppetite is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureFeelingBad(String feelingBad){
        try{


            loggerObj.info("The feelingBad is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+feelingBad+"')])[5]")));
            loggerObj.info("The feelingBad is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureGTroubleConcentrating(String troubleConcentrating){
        try{


            loggerObj.info("The troubleConcentrating is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+troubleConcentrating+"')])[6]")));
            loggerObj.info("The troubleConcentrating is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureSpeakingSlowly(String speakingSlowly){
        try{


            loggerObj.info("The speakingSlowly is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+speakingSlowly+"')])[7]")));
            loggerObj.info("The speakingSlowly is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean captureThoughts(String thoughts){
        try{


            loggerObj.info("The thoughts is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+thoughts+"')])[8]")));
            loggerObj.info("The thoughts is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }




    public boolean captureDifficulty(String difficulty){
        try{


            loggerObj.info("The difficulty is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-901oao r-1kihuf0'][starts-with(text(),'"+difficulty+"')])[9]")));
            loggerObj.info("The difficulty is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickPHQTGetAlongNotAtAll(){
        try{

            loggerObj.info("The radiobtn_PHQTGetAlongNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQTGetAlongNotAtAll);
            loggerObj.info("The radiobtn_PHQTGetAlongNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPHQHurtingYourselfMorethanHalf(){
        try{

            loggerObj.info("The radiobtn_PHQHurtingYourselfMorethanHalf is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQHurtingYourselfMorethanHalf);
            loggerObj.info("The radiobtn_PHQHurtingYourselfMorethanHalf is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPHQHurtingYourselfNearlyEveryDay(){
        try{

            loggerObj.info("The radiobtn_PHQHurtingYourselfNearlyEveryDay is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQHurtingYourselfNearlyEveryDay);
            loggerObj.info("The radiobtn_PHQHurtingYourselfNearlyEveryDay is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickPHQTGetAlongNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_PHQTGetAlongNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQTGetAlongNotAtAll1);
            loggerObj.info("The radiobtn_PHQTGetAlongNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPHQHurtYourselfNotAtAll(){
        try{

            loggerObj.info("The radiobtn_PHQHurtYourselfNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQHurtYourselfNotAtAll);
            loggerObj.info("The radiobtn_PHQHurtYourselfNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickLittleInterest(){
        try{

            loggerObj.info("The radiobtn_PHQLittleInterest is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQLittleInterest);
            loggerObj.info("The radiobtn_PHQLittleInterest is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickPHQLittleInterest1(){
        try{

            loggerObj.info("The radiobtn_PHQLittleInterest is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQLittleInterest1);
            loggerObj.info("The radiobtn_PHQLittleInterest is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPHQLittleInterest2(){
        try{

            loggerObj.info("The radiobtn_PHQLittleInterest is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PHQLittleInterest1);
            loggerObj.info("The radiobtn_PHQLittleInterest is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickDifficultyNotAtAll(){
        try{

            loggerObj.info("The radiobtn_DifficultyNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_DifficultyNotAtAll);
            loggerObj.info("The radiobtn_DifficultyNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickDifficultyNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_DifficultyNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_DifficultyNotAtAll1);
            loggerObj.info("The radiobtn_DifficultyNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickThoughtsNotAtAll(){
        try{

            loggerObj.info("The radiobtn_ThoughtsNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_ThoughtsNotAtAll);
            loggerObj.info("The radiobtn_ThoughtsNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickThoughtsNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_ThoughtsNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_ThoughtsNotAtAll1);
            loggerObj.info("The radiobtn_ThoughtsNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSpeakingSlowlyNotAtAll(){
        try{

            loggerObj.info("The radiobtn_SpeakingSlowlyNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_SpeakingSlowlyNotAtAll);
            loggerObj.info("The radiobtn_SpeakingSlowlyNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSpeakingSlowlyNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_SpeakingSlowlyNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_SpeakingSlowlyNotAtAll1);
            loggerObj.info("The radiobtn_SpeakingSlowlyNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickTroubleConcentratingNotAtAll(){
        try{

            loggerObj.info("The radiobtn_TroubleConcentratingNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_TroubleConcentratingNotAtAll);
            loggerObj.info("The radiobtn_TroubleConcentratingNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickTroubleConcentratingNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_TroubleConcentratingNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_TroubleConcentratingNotAtAll1);
            loggerObj.info("The radiobtn_TroubleConcentratingNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFeelingBadNotAtAll(){
        try{

            loggerObj.info("The radiobtn_FeelingBadNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FeelingBadNotAtAll);
            loggerObj.info("The radiobtn_FeelingBadNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFeelingBadNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_FeelingBadNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FeelingBadNotAtAll1);
            loggerObj.info("The radiobtn_FeelingBadNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }



    public boolean clickPoorAppetiteNotAtAll(){
        try{

            loggerObj.info("The chk_PoorAppetiteNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_PoorAppetiteNotAtAll);
            loggerObj.info("The chk_PoorAppetiteNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPoorAppetiteNotAtAll1(){
        try{

            loggerObj.info("The chk_PoorAppetiteNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(chk_PoorAppetiteNotAtAll1);
            loggerObj.info("The chk_PoorAppetiteNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickFeelingTiredNotAtAll(){
        try{

            loggerObj.info("The radiobtn_FeelingTiredNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FeelingTiredNotAtAll);
            loggerObj.info("The radiobtn_FeelingTiredNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickFeelingTiredNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_FeelingTiredNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FeelingTiredNotAtAll1);
            loggerObj.info("The radiobtn_FeelingTiredNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickTroubleFallingNotAtAll(){
        try{

            loggerObj.info("The radiobtn_TroubleFallingNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_TroubleFallingNotAtAll);
            loggerObj.info("The radiobtn_TroubleFallingNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickTroubleFallingNotAtAll1(){
        try{

            loggerObj.info("The radiobtn_TroubleFallingNotAtAll1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_TroubleFallingNotAtAll1);
            loggerObj.info("The radiobtn_TroubleFallingNotAtAll1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickFeelingDownNotAtAll(){
        try{

            loggerObj.info("The radiobtn_FeelingDownNotAtAll is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_FeelingDownNotAtAll);
            loggerObj.info("The radiobtn_FeelingDownNotAtAll is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }




    public boolean clickCHRTNeverBetterDisagree(){
        try{

            loggerObj.info("The radiobtn_CHRTNeverBetterDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNeverBetterDisagree);
            loggerObj.info("The radiobtn_CHRTNeverBetterDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTNeverBetterDisagree1(){
        try{

            loggerObj.info("The radiobtn_CHRTNeverBetterDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNeverBetterStronglyDisagree1);
            loggerObj.info("The radiobtn_CHRTNeverBetterDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTNeverBetterAgree(){
        try{

            loggerObj.info("The radiobtn_CHRTNeverBetterAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNeverBetterAgree);
            loggerObj.info("The radiobtn_CHRTNeverBetterAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickCHRTNoFutureDisagree(){
        try{

            loggerObj.info("The radiobtn_CHRTNoFutureDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNoFutureDisagree);
            loggerObj.info("The radiobtn_CHRTNoFutureDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickCHRTNoFutureDisagree1(){
        try{

            loggerObj.info("The radiobtn_CHRTNoFutureDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNoFutureStronglyDisagree1);
            loggerObj.info("The radiobtn_CHRTNoFutureDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTNoFutureAgree(){
        try{

            loggerObj.info("The radiobtn_CHRTNoFutureAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNoFutureAgree);
            loggerObj.info("The radiobtn_CHRTNoFutureAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickCHRTNothingRightDisagree(){
        try{

            loggerObj.info("The radiobtn_CHRTNothingRightDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNothingRightDisagree);
            loggerObj.info("The radiobtn_CHRTNothingRightDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTNothingRightDisagree1(){
        try{

            loggerObj.info("The radiobtn_CHRTNothingRightDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNothingRightStronglyDisagree1);
            loggerObj.info("The radiobtn_CHRTNothingRightDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTNothingRightAgree(){
        try{

            loggerObj.info("The radiobtn_CHRTNothingRightAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNothingRightAgree);
            loggerObj.info("The radiobtn_CHRTNothingRightAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickCHRTEverythingWrongDisagree(){
        try{

            loggerObj.info("The radiobtn_CHRTEverythingWrongDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTEverythingWrongDisagree);
            loggerObj.info("The radiobtn_CHRTEverythingWrongDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTEverythingWrongDisagree1(){
        try{

            loggerObj.info("The radiobtn_CHRTEverythingWrongDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTEverythingWrongStronglyDisagree1);
            loggerObj.info("The radiobtn_CHRTEverythingWrongDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCHRTEverythingWrongAgree(){
        try{

            loggerObj.info("The radiobtn_CHRTEverythingWrongAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTEverythingWrongAgree);
            loggerObj.info("The radiobtn_CHRTEverythingWrongAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNoOneDependOnDisagree(){
        try{

            loggerObj.info("The radiobtn_NoOneDependOnDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_NoOneDependOnDisagree);
            loggerObj.info("The radiobtn_NoOneDependOnDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNoOneDependOnDisagree1(){
        try{

            loggerObj.info("The radiobtn_NoOneDependOnDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_NoOneDependOnStronglyDisagree1);
            loggerObj.info("The radiobtn_NoOneDependOnDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNoOneDependOnAgree(){
        try{

            loggerObj.info("The radiobtn_NoOneDependOnAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_NoOneDependOnAgree);
            loggerObj.info("The radiobtn_NoOneDependOnAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickAreGoneDisagree(){
        try{

            loggerObj.info("The radiobtn_AreGoneDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_AreGoneDisagree);
            loggerObj.info("The radiobtn_AreGoneDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAreGoneDisagree1(){
        try{

            loggerObj.info("The radiobtn_AreGoneDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_AreGoneStronglyDisagree1);
            loggerObj.info("The radiobtn_AreGoneDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickAreGoneAgree(){
        try{

            loggerObj.info("The radiobtn_AreGoneAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_AreGoneAgree);
            loggerObj.info("The radiobtn_AreGoneAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSufferingDisagree(){
        try{

            loggerObj.info("The radiobtn_SufferingDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_SufferingDisagree);
            loggerObj.info("The radiobtn_SufferingDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickSufferingDisagree1(){
        try{

            loggerObj.info("The radiobtn_SufferingDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_SufferingStronglyDisagree1);
            loggerObj.info("The radiobtn_SufferingDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickSufferingAgree(){
        try{

            loggerObj.info("The radiobtn_SufferingAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_SufferingAgree);
            loggerObj.info("The radiobtn_SufferingAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickNoReasonToLiveDisagree(){
        try{

            loggerObj.info("The NoReasonToLiveDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_NoReasonToLiveDisagree);
            loggerObj.info("The radiobtn_NoReasonToLiveDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickNoReasonToLiveDisagree1(){
        try{

            loggerObj.info("The NoReasonToLiveDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_NoReasonToLiveStronglyDisagree1);
            loggerObj.info("The radiobtn_NoReasonToLiveDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickNoReasonToLiveAgree(){
        try{

            loggerObj.info("The radiobtn_NoReasonToLiveAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_NoReasonToLiveAgree);
            loggerObj.info("The radiobtn_NoReasonToLiveAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickGoToSleepDisagree(){
        try{

            loggerObj.info("The radiobtn_GoToSleepDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_GoToSleepDisagree);
            loggerObj.info("The radiobtn_GoToSleepDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickGoToSleepDisagree1(){
        try{

            loggerObj.info("The radiobtn_GoToSleepDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_GoToSleepStronglyDisagree1);
            loggerObj.info("The radiobtn_GoToSleepDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickGoToSleepAgree(){
        try{

            loggerObj.info("The radiobtn_GoToSleepAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_GoToSleepAgree);
            loggerObj.info("The radiobtn_GoToSleepAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickKillingMyselfDisagree(){
        try{

            loggerObj.info("The radiobtn_KillingMyselfDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_KillingMyselfDisagree);
            loggerObj.info("The radiobtn_KillingMyselfDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickKillingMyselfDisagree1(){
        try{

            loggerObj.info("The radiobtn_KillingMyselfDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_KillingMyselfStronglyDisagree1);
            loggerObj.info("The radiobtn_KillingMyselfDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickKillingMyselfAgree(){
        try{

            loggerObj.info("The radiobtn_KillingMyselfAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_KillingMyselfAgree);
            loggerObj.info("The radiobtn_KillingMyselfAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickKillingMyselfStronglyagree(){
        try{

            loggerObj.info("The radiobtn_KillingMyselfStronglyagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_KillingMyselfStronglyagree);
            loggerObj.info("The radiobtn_KillingMyselfStronglyagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }}
    public boolean clickHowToKillingMyselfDisagree(){
        try{

            loggerObj.info("The radiobtn_HowToKillingMyselfDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_HowToKillingMyselfDisagree);
            loggerObj.info("The radiobtn_HowToKillingMyselfDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickHowToKillingMyselfDisagree1(){
        try{

            loggerObj.info("The radiobtn_HowToKillingMyselfDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_HowToKillingMyselfStronglyDisagree1);
            loggerObj.info("The radiobtn_HowToKillingMyselfDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickHowToKillingMyselfAgree(){
        try{

            loggerObj.info("The radiobtn_HowToKillingMyselfAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_HowToKillingMyselfAgree);
            loggerObj.info("The radiobtn_HowToKillingMyselfAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickHowToKillingMyselfStronglyagree(){
        try{

            loggerObj.info("The radiobtn_HowToKillingMyselfStronglyagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_HowToKillingMyselfStronglyagree);
            loggerObj.info("The radiobtn_HowToKillingMyselfStronglyagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean clickPlanToKillingMyselfDisagree(){
        try{

            loggerObj.info("The radiobtn_PlanToKillingMyselfDisagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PlanToKillingMyselfDisagree);
            loggerObj.info("The radiobtn_PlanToKillingMyselfDisagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean clickPlanToKillingMyselfDisagree1(){
        try{

            loggerObj.info("The radiobtn_PlanToKillingMyselfDisagree1 is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PlanToKillingMyselfStronglyDisagree1);
            loggerObj.info("The radiobtn_PlanToKillingMyselfDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPlanToKillingMyselfAgree(){
        try{

            loggerObj.info("The radiobtn_PlanToKillingMyselfAgree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PlanToKillingMyselfAgree);
            loggerObj.info("The radiobtn_PlanToKillingMyselfAgree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickPlanToKillingMyselfStronglyagree(){
        try{

            loggerObj.info("The radiobtn_PlanToKillingMyselfStronglyagree is not clicked");
            seleniumAdaptor.JavaScriptClick(radiobtn_PlanToKillingMyselfStronglyagree);
            loggerObj.info("The radiobtn_PlanToKillingMyselfStronglyagree is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureFrequencyOfAlcohol(String frequencyOfAlcohol){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The frequencyOfAlcohol is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+frequencyOfAlcohol+"')])[1]")));
            loggerObj.info("The frequencyOfAlcohol is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureNoOfDrinks(String nOfDrinks){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The nOfDrinks is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+nOfDrinks+"')])[1]")));
            loggerObj.info("The nOfDrinks is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureSixOrMoreDrinks(String sixOrMoreDrinks){
        try{
            seleniumAction.scrollBy("0", "1400");

            seleniumAdaptor.scrollDown();
            loggerObj.info("The sixOrMoreDrinks is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+sixOrMoreDrinks+"')])[1]")));
            loggerObj.info("The sixOrMoreDrinks is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureStopDrinkingOnceStarted(String stopDrinkingOnceStarted){
        try{
            seleniumAction.scrollBy("0", "1400");


            loggerObj.info("The stopDrinkingOnceStarted is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+stopDrinkingOnceStarted+"')])[2]")));
            loggerObj.info("The stopDrinkingOnceStarted is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureFailedToDo(String failedToDo){
        try{

            loggerObj.info("The failedToDo is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+failedToDo+"')])[3]")));
            loggerObj.info("The failedToDo is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureHeavyDrinkingSeason(String heavyDrinkingSeason){
        try{

            loggerObj.info("The heavyDrinkingSeason is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+heavyDrinkingSeason+"')])[4]")));
            loggerObj.info("The heavyDrinkingSeason is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureFeelingGuilt(String feelingGuilt){
        try{

            loggerObj.info("The feelingGuilt is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+feelingGuilt+"')])[5]")));
            loggerObj.info("The feelingGuilt is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureUnableToRemember(String unableToRemember){
        try{

            loggerObj.info("The unableToRemember is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz']//div[1][starts-with(text(),'"+unableToRemember+"')])[6]")));
            loggerObj.info("The unableToRemember is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }
    public boolean captureInjured(String injured){
        try{

            loggerObj.info("The injured is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz r-1wbh5a2 r-a023e6 r-156q2ks']//div[1][starts-with(text(),'"+injured+"')])[1]")));
            loggerObj.info("The injured is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureInjured1(String injured){
        try{

            loggerObj.info("The injured is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+injured+"')])[1]")));
            loggerObj.info("The injured is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureCutDown(String cutDown){
        try{

            loggerObj.info("The cutDown is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-18u37iz r-1wbh5a2 r-a023e6 r-156q2ks']//div[1][starts-with(text(),'"+cutDown+"')])[2]")));
            loggerObj.info("The cutDown is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureCutDown1(String cutDown){
        try{

            loggerObj.info("The cutDown is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+cutDown+"')])[2]")));
            loggerObj.info("The cutDown is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureAntiDepressent(String antiDepressent){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The antiDepressent is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+antiDepressent+"')])[1]")));
            loggerObj.info("The antiDepressent is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureDaysaWeekPrescribedByDoc(String daysAWeekNeeded){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The daysAWeekNeeded is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+daysAWeekNeeded+"')])[1]")));
            loggerObj.info("The daysAWeekNeeded is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimesADayPrescribedByDoc(String timesADayNeeded){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The timesADayNeeded is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+timesADayNeeded+"')])[1]")));
            loggerObj.info("The timesADayNeeded is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTakeDrugInPast(String takeDrugInPast){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The takeDrugInPast is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+takeDrugInPast+"')])[2]")));
            loggerObj.info("The takeDrugInPast is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public boolean captureDaysaWeekYouNeedDrug(String daysAWeek){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The daysAWeek is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+daysAWeek+"')])[1]")));
            loggerObj.info("The daysAWeek is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureTimesADayUsuallyTake(String timesADayUsuallyTake){
        try{

            seleniumAdaptor.scrollDown();
            loggerObj.info("The timesADayUsuallyTake is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+timesADayUsuallyTake+"')])[2]")));
            loggerObj.info("The timesADayUsuallyTake is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePillsEachTime(String pillsEachTime){
        try{

            loggerObj.info("The pillsEachTime is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+pillsEachTime+"')])[1]")));
            loggerObj.info("The pillsEachTime is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean capturePillsMissed(String pillsMissede){
        try{

            loggerObj.info("The pillsMissede is not selected");
            seleniumAdaptor.JavaScriptClick(driver.findElement(By.xpath("(//div[@class='css-901oao r-rjixqe r-1hfyk0a'][starts-with(text(),'"+pillsMissede+"')])[3]")));
            loggerObj.info("The pillsMissede is selected");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


    public String getWindowStartDateWeek3() {

        seleniumAction.clickElement(windowStartDateWeek3);
        System.out.println("The windowStartDateWeek3 is clicked");
        String startdate = driver.findElement(windowStartDateWeek3).getText();
        String number = startdate.split(":")[1].trim();
        loggerObj.info("The StartDate for Week3 in WebApp is :" + number);


        return number;
    }

    public String getWindow1StartDateWeek3() {

        seleniumAction.clickElement(window1StartDateWeek3);
        loggerObj.info("The window1StartDateWeek3 is clicked");
        String startdate = driver.findElement(window1StartDateWeek3).getText();
        String number = startdate.split(":")[1].trim();
        loggerObj.info("The StartDate for Week3 in WebApp is :" + number);


        return number;
    }

    public String getWindowEndDateWeek3() {

        seleniumAction.clickElement(windowEndDateWeek3);
        System.out.println("The windowEndDateWeek3 is clicked");
        String startdate = driver.findElement(windowEndDateWeek3).getText();
        String number = startdate.split(":")[1].trim();
        loggerObj.info("The EndDate for Week3 in WebApp is :" + number);


        return number;
    }

    public String getWindow1EndDateWeek3() {

        seleniumAction.clickElement(window1EndDateWeek3);
        loggerObj.info("The windowEndDateWeek3 is clicked");
        String startdate = driver.findElement(window1EndDateWeek3).getText();
        String number = startdate.split(":")[1].trim();
        loggerObj.info("The EndDate for Week3 in WebApp is :" + number);


        return number;
    }


    public String getWebAppAccessInactivated() {

        seleniumAction.clickElement(webAppAccessInactivated);
        loggerObj.info("The actualSubmissionDate is not clicked");
        String desc = driver.findElement(webAppAccessInactivated).getText();
        loggerObj.info("The WebAppAccessInactivated Descriptionm is :" + desc);
        return desc;
    }

//    public String getPassword() {
//
//        seleniumAction.clickElement(webmailPassword);
//        System.out.println("The Password is clicked");
//        String password = driver.findElement(webmailPassword).getText();
//        String number = password.split(":")[1].trim();
//        loggerObj.info("The Password is :" + number);
//        System.out.println("The Password is :" + number);
//
//        return number;
//    }

    public boolean clickChatParticipantsWebApp(){
        try{


            loggerObj.info("The lnk_ChatParticipantsWebApp is not clicked");
            seleniumAction.clickElement(lnk_ChatParticipantsWebApp);
            loggerObj.info("The lnk_ChatParticipantsWebApp is clicked");
            seleniumAdaptor.pauseFor(2);


            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickChatParticipantsWebApp1(){
        try{
            loggerObj.info("The lnk_ChatParticipantsWebApp1 is not clicked");
            seleniumAction.clickElement(lnk_ChatParticipantsWebApp1);
            loggerObj.info("The lnk_ChatParticipantsWebApp1 is clicked");
            seleniumAdaptor.pauseFor(2);
            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickChatAttachment(){
        try{
            loggerObj.info("The lnk_ChatAttachment1 is not clicked");
            seleniumAction.clickElement(lnk_ChatAttachment1);
            loggerObj.info("The lnk_ChatAttachment1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickChatAttachment3(){
        try{
            loggerObj.info("The lnk_ChatAttachment3 is not clicked");
            seleniumAction.clickElement(lnk_ChatAttachment3);
//            seleniumAdaptor.JavaScriptClick(lnk_ChatAttachment3);
            loggerObj.info("The lnk_ChatAttachment3 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickChatAttachment4(){
        try{
            loggerObj.info("The lnk_ChatAttachment4 is not clicked");
//            seleniumAction.clickElement(lnk_ChatAttachment4);
            seleniumAdaptor.JavaScriptClick(lnk_ChatAttachment4);
            loggerObj.info("The lnk_ChatAttachment4 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean captureMessageWebApp(String message1) {
        try {

            loggerObj.info("The input_Message is not clicked");
            seleniumAdaptor.JavaScriptClick(input_Message);
            seleniumAction.clearText(input_Message);
            seleniumAction.typeText(input_Message, message1);
            loggerObj.info("The input_Message is captured");
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

    public boolean clickCheckCircleWebApp(){
        try{

            loggerObj.info("The btn_checkCircle is not clicked");
            seleniumAction.clickElement(btn_CheckCircle);
//            seleniumAdaptor.JavaScriptClick(btn_CheckCircle);
            loggerObj.info("The btn_checkCircle is clicked");
            seleniumAdaptor.pauseFor(2);

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

}









