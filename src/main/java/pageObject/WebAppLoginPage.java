package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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

    @FindBy(xpath="(//input[@type='password'])[1]")
    private WebElement input_Password;
    @FindBy(xpath="(//div[text()='Save'])[1]")
    private WebElement btn_SaveTimeZone;

    @FindBy(xpath="(//div[text()='Diary'])[1]")
    private WebElement btn_Diary;



    @FindBy(xpath="(//div[text()='Week -1 Baseline'])[1]")
    private WebElement lnk_Week1Baseline;
    @FindBy(xpath="(//div[text()='Week 1'])[1]")
    private WebElement lnk_Week1;


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

    @FindBy(xpath="(//div[text()='More'])[1]")
    private WebElement btn_More;

    @FindBy(xpath="(//div[text()='Login'])[1]")
    private WebElement btn_Login;

    @FindBy(xpath="(//img[@src='assets/images/jConfigure_build.svg'])[1]")
    private WebElement lnk_JConfigureBuild;

    @FindBy(xpath="(//img[@src='assets/images/jConnect_build.svg'])[1]")
    private WebElement lnk_JConnectBuild;

    @FindBy(xpath="(//input[@placeholder='Select Timezone'])[1]")
    private WebElement lnk_TimeZone;

    private By txt_ICF =  By.xpath("(//div[text()='ICF'])[1]");

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

    @FindBy(xpath="(//div[text()='Join Call'])[1]")
    private WebElement btn_JoinICFCall;

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[11]")
    private WebElement btn_EndCall1;

    @FindBy(xpath="(//div[text()='Submit'])[1]")
    private WebElement btn_SubmitDepFform;

    private By txt_StatusScreening = By.xpath("//*[contains(text(),'Completed')]");

    private By windowStartDateWeek3 = By.xpath("(//div[@class='css-901oao r-1viopy3 r-1enofrn r-1g94qm0 r-1g80hic'][starts-with(text(),'Start Time')])[5]");

    private By windowEndDateWeek3 = By.xpath("(//div[@class='css-901oao r-1viopy3 r-1enofrn r-1g94qm0 r-1g80hic'][starts-with(text(),'End Time')])[5]");

    private By txt_StatusScreening1 = By.xpath("//*[contains(text(),'Status:' )]");

    @FindBy(xpath="(//img[@class='css-9pa8cd'])[2]")
    private WebElement btn_backDiary;

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
    private WebElement radiobtn_CHRTNeverBetterDisagree1;

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
    private WebElement radiobtn_CHRTNoFutureDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[11]")
    private WebElement radiobtn_CHRTNothingRightDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[11]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTNothingRightDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[16]")
    private WebElement radiobtn_CHRTEverythingWrongDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[16]//div[1]/div[1])[1]")
    private WebElement radiobtn_CHRTEverythingWrongDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[21]")
    private WebElement radiobtn_NoOneDependOnDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[21]//div[1]/div[1])[1]")
    private WebElement radiobtn_NoOneDependOnDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[26]")
    private WebElement radiobtn_AreGoneDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[26]//div[1]/div[1])[1]")
    private WebElement radiobtn_AreGoneDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[31]")
    private WebElement radiobtn_SufferingDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[31]//div[1]/div[1])[1]")
    private WebElement radiobtn_SufferingDisagree1;
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[36]")
    private WebElement radiobtn_NoReasonToLiveDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[36]//div[1]/div[1])[1]")
    private WebElement radiobtn_NoReasonToLiveDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[41]")
    private WebElement radiobtn_GoToSleepDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[41]//div[1]/div[1])[1]")
    private WebElement radiobtn_GoToSleepDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[46]")
    private WebElement radiobtn_KillingMyselfDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[46]//div[1]/div[1])[1]")
    private WebElement radiobtn_KillingMyselfDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[51]")
    private WebElement radiobtn_HowToKillingMyselfDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[51]//div[1]/div[1])[1]")
    private WebElement radiobtn_HowToKillingMyselfDisagree1;

    @FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1kihuf0 r-1dzdj1l r-1loqt21 r-z80fyv r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-19wmn03'])[56]")
    private WebElement radiobtn_PlanToKillingMyselfDisagree;

    @FindBy(xpath="((//div[@class='css-1dbjc4n r-eqz5dr r-d0pm55 r-1hfyk0a'])[56]//div[1]/div[1])[1]")
    private WebElement radiobtn_PlanToKillingMyselfDisagree1;


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

    @FindBy(xpath="(//div[@class='jitsi-icon jitsi-icon-default '])[11]")
    private WebElement btn_EndCall2;
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
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");

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



    public String gettxtICF() {

        seleniumAction.clickElement(txt_ICF);
        loggerObj.info("The txt_ICF is clicked");
        String iCFtxt = driver.findElement(txt_ICF).getText();
        loggerObj.info("The ICF description is :" + iCFtxt);
        return iCFtxt;
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
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNeverBetterDisagree1);
            loggerObj.info("The radiobtn_CHRTNeverBetterDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNoFutureDisagree1);
            loggerObj.info("The radiobtn_CHRTNoFutureDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTNothingRightDisagree1);
            loggerObj.info("The radiobtn_CHRTNothingRightDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_CHRTEverythingWrongDisagree1);
            loggerObj.info("The radiobtn_CHRTEverythingWrongDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_NoOneDependOnDisagree1);
            loggerObj.info("The radiobtn_NoOneDependOnDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_AreGoneDisagree1);
            loggerObj.info("The radiobtn_AreGoneDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_SufferingDisagree1);
            loggerObj.info("The radiobtn_SufferingDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_NoReasonToLiveDisagree1);
            loggerObj.info("The radiobtn_NoReasonToLiveDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_GoToSleepDisagree1);
            loggerObj.info("The radiobtn_GoToSleepDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_KillingMyselfDisagree1);
            loggerObj.info("The radiobtn_KillingMyselfDisagree1 is clicked");

            return true;
        } catch(Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }

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
            seleniumAdaptor.JavaScriptClick(radiobtn_HowToKillingMyselfDisagree1);
            loggerObj.info("The radiobtn_HowToKillingMyselfDisagree1 is clicked");

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
            seleniumAdaptor.JavaScriptClick(radiobtn_PlanToKillingMyselfDisagree1);
            loggerObj.info("The radiobtn_PlanToKillingMyselfDisagree1 is clicked");

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

    public String getWindowEndDateWeek3() {

        seleniumAction.clickElement(windowEndDateWeek3);
        System.out.println("The windowEndDateWeek3 is clicked");
        String startdate = driver.findElement(windowEndDateWeek3).getText();
        String number = startdate.split(":")[1].trim();
        loggerObj.info("The EndDate for Week3 in WebApp is :" + number);


        return number;
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





}









