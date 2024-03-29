package base;


//import org.apache.log4j.Logger;

//import io.cucumber.core.api.Scenario;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import seleniumaction.SeleniumAction;
import seleniumadaptor.SeleniumAdaptor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    String broserName="chrome";
//    String broserName="Edge";
    public SeleniumAction seleniumAction;
 public  ExtentTest extentTest;

// private static final String LOG_FILE = "log4j.properties";
private static Logger logger = LogManager.getLogger(BaseClass.class);

    public SeleniumAdaptor seleniumAdaptor;
    public static   WebDriver driver;
//    public static  WebDriver drivers;
    String webDriverlocationpath=  System.getProperty("user.dir")+File.separator +"src"+ File.separator+"test"+File.separator+"resources"+File.separator+"webdriver";
    static String screenshotlocationpath=  System.getProperty("user.dir") + File.separator +"target" + File.separator+"screenshots";

    public static HashMap<String, String> storeValue = new HashMap<>();

    public   BaseClass(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        seleniumAction= new SeleniumAction(driver);
        seleniumAdaptor= new SeleniumAdaptor(driver);

    }

    public BaseClass() {
    }

//    Logger logger  = Logger.getLogger(BaseClass.class);
//    Properties properties = new Properties();



    public WebDriver openBrowser(String url) throws Exception {

        if(broserName.equalsIgnoreCase("chrome")){
         System.setProperty("webdriver.chrome.driver",webDriverlocationpath+"\\chromedriver1.exe");
          ChromeOptions options = new ChromeOptions();
          HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
            HashMap<String, Object> profile = new HashMap<String, Object>();
            HashMap<String, Object> prefs = new HashMap<String, Object>();

            contentSettings.put("media_stream", 2);
            profile.put("managed_default_content_settings", contentSettings);
            prefs.put("profile", profile);
            options.setExperimentalOption("prefs", prefs);

            options.addArguments("disable-notifications");
            options.addArguments("disable-geolocation");
            options.addArguments("disable-media-stream");

//            WebDriverManager.chromedriver().setup();

//            options.add_experimental_option("useAutomationExtension", False);
//            options.add_experimental_option("excludeSwitches",["enable-automation"]);
//            options.addArguments("enable-automation");
            driver = new ChromeDriver(options);
            options.addArguments("disable-infobars");



//            options = uc.ChromeOptions();
               }
        else if(broserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.marionette", webDriverlocationpath+ "\\geckodriver.exe");
            driver =new FirefoxDriver();
        }
        else if(broserName.equalsIgnoreCase("Edge")){
            //set path to Edge.exe
            System.setProperty("webdriver.edge.driver",webDriverlocationpath+"\\msedgedriver1.exe");
            EdgeOptions options = new EdgeOptions();

            driver =new EdgeDriver();
       }
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");}

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000l, TimeUnit.SECONDS);
        driver.get(url);
        return driver;

        //AddReport
//       reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "./reports/Execution.html");


    }
    public static String generateRandomString(int length) {
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }
        return sb.toString();
    }
//    public static void takeScreenShot(Scenario scenario) {
//        try {
//            File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String time = java.time.LocalTime.now().toString();
//            String [] timeStr = time.split(":");
//            String x = timeStr[0]+""+timeStr[1]+""+timeStr[2];
//            String screenshotName = x.substring(0,8);
////            File destinationPath = new File("\\PriscillaAssesment\\target" + screenshotName +"_"+ generateRandomString(5) + ".png");
////            File destinationPath = new File("C:\\Reg\\Screenshots/screenshot" + screenshotName +"_"+ generateRandomString(5) + ".png");
//            File destinationPath = new File(screenshotlocationpath + screenshotName +"_"+ generateRandomString(5) + ".png");
//            copy(sourcePath, destinationPath);
//            Reporter.addScreenCaptureFromPath(destinationPath.toString());
//
//            InputStream is = new FileInputStream(screenshotlocationpath + screenshotName +"_"+ generateRandomString(5) + ".png");
//      byte[] ssBytes = IOUtils.toByteArray(is);
//      String base64 = Base64.getEncoder().encodeToString(ssBytes);
//
////extentTest.log(LogStatus.FAIL, "TEST CASE FAILED "+ result.getName());
//
////            extentTest.log(LogStatus.PASS,extentTest.addScreenCapture("data:image/png:base64," + base64));
//        }
//        catch (Exception e) {
//            System.out.println("Unable to take screenshot");
//            System.out.println(e);
//
//        }
//    }

//    public void attachScreenshot(Scenario scenario){
//
//        if(scenario.isFailed()){
//
//            byte[] screenshotTaken=  ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshotTaken,"image/png", "error screen");
//        }
//    }

//    takeScreenShotNew(this.scenario);

    public static void takeScreenShotNew(Scenario scenario) {
        try {
            TakesScreenshot ts =(TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");


//            byte[] imageBytes= IOUtils.toByteArray(new FileInputStream(String.valueOf(src)));
//             Base64.getEncoder().encodeToString(imageBytes);
        }
        catch (Exception e) {
            System.out.println("Unable to take screenshot");
            System.out.println(e);

        }
    }

    public static void takeScreenShotNew5(Scenario scenario) {
        try {
            TakesScreenshot ts =(TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BASE64).getBytes();
            scenario.attach(src, "data:image/png:base64", "screenshot");
//            String encodedBase64 = null;
//            byte[] bytes = new byte[(int)finalDesti]
//            encodedBase64= new String(Base64Encoder.encodedBase64String(bytes));
//          String img = "data:image/png:base64, " +encodedBase64;
//            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(img.toString());

        }
        catch (Exception e) {
            System.out.println("Unable to take screenshot");
            System.out.println(e);

        }
    }


    public String takeScreenShotNew2(Scenario scenario) throws IOException {

        TakesScreenshot ts =(TakesScreenshot) driver;
        byte[] src = ts.getScreenshotAs(OutputType.BASE64).getBytes();
        scenario.attach(src, "image/png", "screenshot");
//        byte[] imageBytes= IOUtils.toByteArray(new FileInputStream(String.valueOf(src)));
//
//
//
        return Base64.getEncoder().encodeToString(src);



    }





    public static String getScreenshotAsBase64() throws IOException {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"/Screenshots/image.png";
        FileUtils.copyFile(source, new File(path));
        byte[] imageBytes= IOUtils.toByteArray(new FileInputStream(path));
//        scenario.attach(path, "image/png", "screenshot");
        return Base64.getEncoder().encodeToString(imageBytes);

    }

    public String getBase64() throws IOException {

        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);

    }

    public void putValue(String vname, String vvalue) {
        storeValue.put(vname, vvalue);
    }


    public String getValue(String vname) {
        return storeValue.get(vname);
    }

    public void validate(String expectedResult, String actualResult) {
        Assert.assertEquals(expectedResult, actualResult);
    }




}


