package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import seleniumaction.SeleniumAction;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

public class PDFReaderPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(PDFReaderPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public PDFReaderPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath="(//embed[@type='application/x-google-chrome-pdf'])[1]")
    private WebElement btn_pdfelement;

    public String  readPDF() throws InterruptedException, IOException {
        seleniumAdaptor.pauseFor(18);

        String getURL= driver.getCurrentUrl();
        URL pdfURL = new URL(getURL);
        loggerObj.info ("The PDF URL is :" + pdfURL);

       InputStream is = pdfURL.openStream();
        BufferedInputStream fileParse = new BufferedInputStream(is);
        PDDocument document =  null;

        document = PDDocument.load(fileParse);
        String pdfContent = new PDFTextStripper().getText(document);
        loggerObj.info (pdfContent);
        return pdfContent;

    }


    public void ScrollPDF() {
//        seleniumAdaptor.scrollDown(btn_pdfelement);
//        seleniumAdaptor.scrollToEndOfPage(btn_pdfelement);
        WebElement element = driver.findElement(By.xpath("//embed[@type='application/x-google-chrome-pdf']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "element");

//        var element = driver.findElement(By.xpath("(//embed[@type='application/x-google-chrome-pdf'])[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);
//        actions.perform();

    }


            public String getCurrentURL() {
                seleniumAdaptor.pauseFor(10);
                String url = driver.getCurrentUrl();
                loggerObj.info("The PDF URL is :" + url);
                return url;

            }

            public boolean launchURL(String url) {
                try {
                    driver.get(url);
                    return true;
                } catch (Exception var2) {
                    return false;
                }
            }


        }
