package base;

//import org.junit.Test;
import com.google.common.base.Equivalence;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.ArrayList;

public class TestMain {

    public static WebDriver driver;
    String webDriverlocationpath=  System.getProperty("user.dir")+ File.separator +"src"+ File.separator+"test"+File.separator+"resources"+File.separator+"webdriver";
//    @Test
//    public void testMeth(){
//        int serviceProviderCode = (int)(Math.random() * (99 - 60) + 60);
//        int threeDigitsNumber = (int)(Math.random() * (999 - 100) + 100);
//        int fouDegitsNumber = (int)(Math.random() * (9999 - 1000) + 1000);
//
//        String forMatedNumber = "0"+serviceProviderCode+" "+threeDigitsNumber+" "+fouDegitsNumber ;
//        System.out.println(forMatedNumber);
//    }

    @Test

    public void opentabAmazonWebAppReal(){

        System.setProperty("webdriver.chrome.driver",webDriverlocationpath+"\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://google.com");


        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://jconnect-build.jiva-demo.jivascience.com/webapp/admin/auth/login");



    }


}
