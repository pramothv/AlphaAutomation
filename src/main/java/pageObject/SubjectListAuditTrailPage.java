package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class SubjectListAuditTrailPage extends BaseClass {

    private static Logger loggerObj = LogManager.getLogger(SubjectListAuditTrailPage.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public SubjectListAuditTrailPage(WebDriver driver)
    {
        super(driver);

    }





    @FindBy(xpath="(//i[@class='anticon anticon-right'])[1]")
    private WebElement btn_arrowNextPage;


    private By txt_VisitName1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[1]");
    private By txt_FormName1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[2]");
    private By txt_FieldName1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[4]");
    private By txt_ModificationDate1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[5]");
    private By txt_NewValue1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[7]");
    private By txt_eDiaryVersion1 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[9]");


    private By txt_VisitName2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[1]");
    private By txt_FormName2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[2]");
    private By txt_FieldName2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[4]");
    private By txt_ModificationDate2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[5]");
    private By txt_NewValue2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[7]");
    private By txt_eDiaryVersion2 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[9]");

    private By txt_VisitName3 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[1]");
    private By txt_FormName3 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[2]");
    private By txt_FieldName3 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[4]");
    private By txt_ModificationDate3 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[5]");
    private By txt_NewValue3 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[7]");
    private By txt_eDiaryVersion3 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[9]");

    private By txt_VisitName4 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[1]");
    private By txt_FormName4 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[2]");
    private By txt_FieldName4 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[4]");
    private By txt_ModificationDate4 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[5]");
    private By txt_NewValue4 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[7]");
    private By txt_eDiaryVersion4 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[9]");

    private By txt_VisitName5 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[1]");
    private By txt_FormName5 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[2]");
    private By txt_FieldName5 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[4]");
    private By txt_ModificationDate5 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[5]");
    private By txt_NewValue5 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[7]");
    private By txt_eDiaryVersion5 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[9]");


    private By txt_VisitName6 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[1]");
    private By txt_FormName6 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[2]");
    private By txt_FieldName6 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[4]");
    private By txt_ModificationDate6 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[5]");
    private By txt_NewValue6 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[7]");
    private By txt_eDiaryVersion6 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[9]");


    private By txt_VisitName7 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[1]");
    private By txt_FormName7 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[2]");
    private By txt_FieldName7 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[4]");
    private By txt_ModificationDate7 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[5]");
    private By txt_NewValue7 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[7]");
    private By txt_eDiaryVersion7 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[9]");


    private By txt_VisitName8 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[1]");
    private By txt_FormName8 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[2]");
    private By txt_FieldName8 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[4]");
    private By txt_ModificationDate8 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[5]");
    private By txt_NewValue8 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[7]");
    private By txt_eDiaryVersion8 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[8]/td[9]");


    private By txt_VisitName9 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[9]/td[1]");
    private By txt_FormName9 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[9]/td[2]");
    private By txt_FieldName9 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[9]/td[4]");
    private By txt_ModificationDate9 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[9]/td[5]");
    private By txt_NewValue9 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[9]/td[7]");
    private By txt_eDiaryVersion9 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[9]/td[9]");


    private By txt_VisitName10 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[10]/td[1]");
    private By txt_FormName10 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[10]/td[2]");
    private By txt_FieldName10 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[10]/td[4]");
    private By txt_ModificationDate10 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[10]/td[5]");
    private By txt_NewValue10 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[10]/td[7]");
    private By txt_eDiaryVersion10 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[10]/td[9]");

    private By txt_VisitName11 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[1]");
    private By txt_FormName11 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[2]");
    private By txt_FieldName11 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[4]");
    private By txt_ModificationDate11 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[5]");
    private By txt_NewValue11 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[7]");
    private By txt_eDiaryVersion11 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[1]/td[9]");



    private By txt_VisitName12 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[1]");
    private By txt_FormName12 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[2]");
    private By txt_FieldName12 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[4]");
    private By txt_ModificationDate12 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[5]");
    private By txt_NewValue12 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[7]");
    private By txt_eDiaryVersion12 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[2]/td[9]");

    private By txt_VisitName13 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[1]");
    private By txt_FormName13 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[2]");
    private By txt_FieldName13 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[4]");
    private By txt_ModificationDate13 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[5]");
    private By txt_NewValue13 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[7]");
    private By txt_eDiaryVersion13 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[3]/td[9]");


    private By txt_VisitName14 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[1]");
    private By txt_FormName14 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[2]");
    private By txt_FieldName14 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[4]");
    private By txt_ModificationDate14 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[5]");
    private By txt_NewValue14 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[7]");
    private By txt_eDiaryVersion14 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[4]/td[9]");



    private By txt_VisitName15 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[1]");
    private By txt_FormName15 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[2]");
    private By txt_FieldName15 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[4]");
    private By txt_ModificationDate15 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[5]");
    private By txt_NewValue15 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[7]");
    private By txt_eDiaryVersion15 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[5]/td[9]");


    private By txt_VisitName16 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[1]");
    private By txt_FormName16 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[2]");
    private By txt_FieldName16 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[4]");
    private By txt_ModificationDate16 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[5]");
    private By txt_NewValue16 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[7]");
    private By txt_eDiaryVersion16 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[6]/td[9]");


    private By txt_VisitName17 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[1]");
    private By txt_FormName17 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[2]");
    private By txt_FieldName17 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[4]");
    private By txt_ModificationDate17 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[5]");
    private By txt_NewValue17 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[7]");
    private By txt_eDiaryVersion17 = By.xpath("//div[@class='ant-spin-container']//div[@class='ant-table-body']/table/tbody/tr[7]/td[9]");




    public boolean clickArrowNextPage() {
        try {

            loggerObj.info("The btn_arrowNextPage is not clicked");
            seleniumAdaptor.JavaScriptClick(btn_arrowNextPage);
            loggerObj.info("The btn_arrowNextPage is clicked");


            return true;
        } catch (Exception var2) {
            return false;
        }
    }


    public String getVisitName1() {

        seleniumAction.clickElement(txt_VisitName1);
        loggerObj.info("The txt_VisitName1 is not clicked");
        String txt = driver.findElement(txt_VisitName1).getText();
        loggerObj.info("The VisitName1 is :" + txt);
        return txt;
    }


    public String getFormName1() {

        seleniumAction.clickElement(txt_FormName1);
        loggerObj.info("The txt_FormName1 is not clicked");
        String txt = driver.findElement(txt_FormName1).getText();
        loggerObj.info("The FormName1 is :" + txt);
        return txt;
    }


    public String getFieldName1() {

        seleniumAction.clickElement(txt_FieldName1);
        loggerObj.info("The txt_FieldName1 is not clicked");
        String txt = driver.findElement(txt_FieldName1).getText();
        loggerObj.info("The FieldName1 is :" + txt);
        return txt;
    }


    public String getModificationDate1() {

        seleniumAction.clickElement(txt_ModificationDate1);
        loggerObj.info("The txt_ModificationDate1 is not clicked");
        String txt = driver.findElement(txt_ModificationDate1).getText();
        loggerObj.info("The ModificationDate1 is :" + txt);
        return txt;
    }



    public String getNewValue1() {

        seleniumAction.clickElement(txt_NewValue1);
        loggerObj.info("The txt_NewValue1 is not clicked");
        String txt = driver.findElement(txt_NewValue1).getText();
        loggerObj.info("The txt_NewValue1 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion1() {

        seleniumAction.clickElement(txt_eDiaryVersion1);
        loggerObj.info("The txt_eDiaryVersion1 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion1).getText();
        loggerObj.info("The eDiaryVersion1 is :" + txt);
        return txt;
    }


    public String getVisitName2() {

        seleniumAction.clickElement(txt_VisitName2);
        loggerObj.info("The txt_VisitName2 is not clicked");
        String txt = driver.findElement(txt_VisitName2).getText();
        loggerObj.info("The VisitName2 is :" + txt);
        return txt;
    }


    public String getFormName2() {

        seleniumAction.clickElement(txt_FormName2);
        loggerObj.info("The txt_FormName2 is not clicked");
        String txt = driver.findElement(txt_FormName2).getText();
        loggerObj.info("The FormName2 is :" + txt);
        return txt;
    }


    public String getFieldName2() {

        seleniumAction.clickElement(txt_FieldName2);
        loggerObj.info("The txt_FieldName2 is not clicked");
        String txt = driver.findElement(txt_FieldName2).getText();
        loggerObj.info("The FieldName2 is :" + txt);
        return txt;
    }


    public String getModificationDate2() {

        seleniumAction.clickElement(txt_ModificationDate2);
        loggerObj.info("The txt_ModificationDate2 is not clicked");
        String txt = driver.findElement(txt_ModificationDate2).getText();
        loggerObj.info("The ModificationDate2 is :" + txt);
        return txt;
    }



    public String getNewValue2() {

        seleniumAction.clickElement(txt_NewValue2);
        loggerObj.info("The txt_NewValue2 is not clicked");
        String txt = driver.findElement(txt_NewValue2).getText();
        loggerObj.info("The txt_NewValue2 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion2() {

        seleniumAction.clickElement(txt_eDiaryVersion2);
        loggerObj.info("The txt_NewValue1 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion2).getText();
        loggerObj.info("The eDiaryVersion2 is :" + txt);
        return txt;
    }


    public String getVisitName3() {

        seleniumAction.scrollBy("0", "1400");
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.scrollDown();
        seleniumAction.clickElement(txt_VisitName3);
        loggerObj.info("The txt_VisitName3 is not clicked");
        String txt = driver.findElement(txt_VisitName3).getText();
        loggerObj.info("The VisitName3 is :" + txt);
        return txt;
    }


    public String getFormName3() {

        seleniumAction.clickElement(txt_FormName3);
        loggerObj.info("The txt_FormName3 is not clicked");
        String txt = driver.findElement(txt_FormName3).getText();
        loggerObj.info("The FormName3 is :" + txt);
        return txt;
    }




    public String getFieldName3() {

        seleniumAction.clickElement(txt_FieldName3);
        loggerObj.info("The txt_FieldName3 is not clicked");
        String txt = driver.findElement(txt_FieldName3).getText();
        loggerObj.info("The FieldName3 is :" + txt);
        return txt;
    }


    public String getModificationDate3() {

        seleniumAction.clickElement(txt_ModificationDate3);
        loggerObj.info("The txt_ModificationDate3 is not clicked");
        String txt = driver.findElement(txt_ModificationDate3).getText();
        loggerObj.info("The ModificationDate3 is :" + txt);
        return txt;
    }



    public String getNewValue3() {

        seleniumAction.clickElement(txt_NewValue3);
        loggerObj.info("The txt_NewValue3 is not clicked");
        String txt = driver.findElement(txt_NewValue3).getText();
        loggerObj.info("The txt_NewValue3 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion3() {

        seleniumAction.clickElement(txt_eDiaryVersion3);
        loggerObj.info("The txt_NewValue3 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion3).getText();
        loggerObj.info("The eDiaryVersion3 is :" + txt);
        return txt;
    }


    public String getVisitName4() {

        seleniumAction.clickElement(txt_VisitName4);
        loggerObj.info("The txt_VisitName4 is not clicked");
        String txt = driver.findElement(txt_VisitName4).getText();
        loggerObj.info("The VisitName4 is :" + txt);
        return txt;
    }


    public String getFormName4() {

        seleniumAction.clickElement(txt_FormName4);
        loggerObj.info("The txt_FormName4 is not clicked");
        String txt = driver.findElement(txt_FormName4).getText();
        loggerObj.info("The FormName4 is :" + txt);
        return txt;
    }


    public String getFieldName4() {

        seleniumAction.clickElement(txt_FieldName4);
        loggerObj.info("The txt_FieldName4 is not clicked");
        String txt = driver.findElement(txt_FieldName4).getText();
        loggerObj.info("The FieldName4 is :" + txt);
        return txt;
    }


    public String getModificationDate4() {

        seleniumAction.clickElement(txt_ModificationDate4);
        loggerObj.info("The txt_ModificationDate4 is not clicked");
        String txt = driver.findElement(txt_ModificationDate4).getText();
        loggerObj.info("The ModificationDate4 is :" + txt);
        return txt;
    }



    public String getNewValue4() {

        seleniumAction.clickElement(txt_NewValue4);
        loggerObj.info("The txt_NewValue4 is not clicked");
        String txt = driver.findElement(txt_NewValue4).getText();
        loggerObj.info("The txt_NewValue4 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion4() {

        seleniumAction.clickElement(txt_eDiaryVersion4);
        loggerObj.info("The txt_NewValue4 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion4).getText();
        loggerObj.info("The eDiaryVersion4 is :" + txt);
        return txt;
    }



    public String getVisitName5() {

        seleniumAction.scrollBy("0", "1400");
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.scrollDown();
        seleniumAction.clickElement(txt_VisitName5);
        loggerObj.info("The txt_VisitName5 is not clicked");
        String txt = driver.findElement(txt_VisitName5).getText();
        loggerObj.info("The VisitName5 is :" + txt);
        return txt;
    }


    public String getFormName5() {

        seleniumAction.clickElement(txt_FormName5);
        loggerObj.info("The txt_FormName5 is not clicked");
        String txt = driver.findElement(txt_FormName5).getText();
        loggerObj.info("The FormName5 is :" + txt);
        return txt;
    }


    public String getFieldName5() {

        seleniumAction.clickElement(txt_FieldName5);
        loggerObj.info("The txt_FieldName5 is not clicked");
        String txt = driver.findElement(txt_FieldName5).getText();
        loggerObj.info("The FieldName5 is :" + txt);
        return txt;
    }


    public String getModificationDate5() {

        seleniumAction.clickElement(txt_ModificationDate5);
        loggerObj.info("The txt_ModificationDate5 is not clicked");
        String txt = driver.findElement(txt_ModificationDate5).getText();
        loggerObj.info("The ModificationDate5 is :" + txt);
        return txt;
    }



    public String getNewValue5() {

        seleniumAction.clickElement(txt_NewValue5);
        loggerObj.info("The txt_NewValue5 is not clicked");
        String txt = driver.findElement(txt_NewValue5).getText();
        loggerObj.info("The txt_NewValue5 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion5() {

        seleniumAction.clickElement(txt_eDiaryVersion5);
        loggerObj.info("The txt_eDiaryVersion5 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion5).getText();
        loggerObj.info("The eDiaryVersion5 is :" + txt);
        return txt;
    }


    public String getVisitName6() {

        seleniumAction.clickElement(txt_VisitName6);
        loggerObj.info("The txt_VisitName6 is not clicked");
        String txt = driver.findElement(txt_VisitName6).getText();
        loggerObj.info("The VisitName6 is :" + txt);
        return txt;
    }


    public String getFormName6() {

        seleniumAction.clickElement(txt_FormName6);
        loggerObj.info("The txt_FormName6 is not clicked");
        String txt = driver.findElement(txt_FormName6).getText();
        loggerObj.info("The FormName6 is :" + txt);
        return txt;
    }


    public String getFieldName6() {

        seleniumAction.clickElement(txt_FieldName6);
        loggerObj.info("The txt_FieldName6 is not clicked");
        String txt = driver.findElement(txt_FieldName6).getText();
        loggerObj.info("The FieldName6 is :" + txt);
        return txt;
    }


    public String getModificationDate6() {

        seleniumAction.clickElement(txt_ModificationDate6);
        loggerObj.info("The txt_ModificationDate6 is not clicked");
        String txt = driver.findElement(txt_ModificationDate6).getText();
        loggerObj.info("The ModificationDate6 is :" + txt);
        return txt;
    }



    public String getNewValue6() {

        seleniumAction.clickElement(txt_NewValue6);
        loggerObj.info("The txt_NewValue6 is not clicked");
        String txt = driver.findElement(txt_NewValue6).getText();
        loggerObj.info("The txt_NewValue6 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion6() {

        seleniumAction.clickElement(txt_eDiaryVersion6);
        loggerObj.info("The txt_eDiaryVersion6 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion6).getText();
        loggerObj.info("The eDiaryVersion6 is :" + txt);
        return txt;
    }

    public String getVisitName7() {

        seleniumAction.scrollBy("0", "1400");
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.scrollDown();
        seleniumAction.clickElement(txt_VisitName7);
        loggerObj.info("The txt_VisitName7 is not clicked");
        String txt = driver.findElement(txt_VisitName7).getText();
        loggerObj.info("The VisitName7 is :" + txt);
        return txt;
    }


    public String getFormName7() {

        seleniumAction.clickElement(txt_FormName7);
        loggerObj.info("The txt_FormName7 is not clicked");
        String txt = driver.findElement(txt_FormName7).getText();
        loggerObj.info("The FormName7 is :" + txt);
        return txt;
    }


    public String getFieldName7() {

        seleniumAction.clickElement(txt_FieldName7);
        loggerObj.info("The txt_FieldName7 is not clicked");
        String txt = driver.findElement(txt_FieldName7).getText();
        loggerObj.info("The FieldName7 is :" + txt);
        return txt;
    }


    public String getModificationDate7() {

        seleniumAction.clickElement(txt_ModificationDate7);
        loggerObj.info("The txt_ModificationDate7 is not clicked");
        String txt = driver.findElement(txt_ModificationDate7).getText();
        loggerObj.info("The ModificationDate7 is :" + txt);
        return txt;
    }



    public String getNewValue7() {

        seleniumAction.clickElement(txt_NewValue7);
        loggerObj.info("The txt_NewValue7 is not clicked");
        String txt = driver.findElement(txt_NewValue7).getText();
        loggerObj.info("The txt_NewValue7 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion7() {

        seleniumAction.clickElement(txt_eDiaryVersion7);
        loggerObj.info("The txt_eDiaryVersion7 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion7).getText();
        loggerObj.info("The eDiaryVersion7 is :" + txt);
        return txt;
    }

    public String getVisitName8() {

        seleniumAction.scrollBy("0", "1400");
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.scrollDown();
        seleniumAction.clickElement(txt_VisitName8);
        loggerObj.info("The txt_VisitName8 is not clicked");
        String txt = driver.findElement(txt_VisitName8).getText();
        loggerObj.info("The VisitName8 is :" + txt);
        return txt;
    }


    public String getFormName8() {

        seleniumAction.clickElement(txt_FormName8);
        loggerObj.info("The txt_FormName8 is not clicked");
        String txt = driver.findElement(txt_FormName8).getText();
        loggerObj.info("The FormName8 is :" + txt);
        return txt;
    }


    public String getFieldName8() {

        seleniumAction.clickElement(txt_FieldName8);
        loggerObj.info("The txt_FieldName8 is not clicked");
        String txt = driver.findElement(txt_FieldName8).getText();
        loggerObj.info("The FieldName8 is :" + txt);
        return txt;
    }


    public String getModificationDate8() {

        seleniumAction.clickElement(txt_ModificationDate8);
        loggerObj.info("The txt_ModificationDate8 is not clicked");
        String txt = driver.findElement(txt_ModificationDate8).getText();
        loggerObj.info("The ModificationDate8 is :" + txt);
        return txt;
    }



    public String getNewValue8() {

        seleniumAction.clickElement(txt_NewValue8);
        loggerObj.info("The txt_NewValue8 is not clicked");
        String txt = driver.findElement(txt_NewValue8).getText();
        loggerObj.info("The txt_NewValue8 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion8() {

        seleniumAction.clickElement(txt_eDiaryVersion8);
        loggerObj.info("The txt_eDiaryVersion8 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion8).getText();
        loggerObj.info("The eDiaryVersion8 is :" + txt);
        return txt;
    }

    public String getVisitName9() {

        seleniumAction.clickElement(txt_VisitName9);
        loggerObj.info("The txt_VisitName9 is not clicked");
        String txt = driver.findElement(txt_VisitName9).getText();
        loggerObj.info("The VisitName9 is :" + txt);
        return txt;
    }


    public String getFormName9() {

        seleniumAction.clickElement(txt_FormName9);
        loggerObj.info("The txt_FormName9 is not clicked");
        String txt = driver.findElement(txt_FormName9).getText();
        loggerObj.info("The FormName9 is :" + txt);
        return txt;
    }


    public String getFieldName9() {

        seleniumAction.clickElement(txt_FieldName9);
        loggerObj.info("The txt_FieldName9 is not clicked");
        String txt = driver.findElement(txt_FieldName9).getText();
        loggerObj.info("The FieldName9 is :" + txt);
        return txt;
    }


    public String getModificationDate9() {

        seleniumAction.clickElement(txt_ModificationDate9);
        loggerObj.info("The txt_ModificationDate9 is not clicked");
        String txt = driver.findElement(txt_ModificationDate9).getText();
        loggerObj.info("The ModificationDate9 is :" + txt);
        return txt;
    }



    public String getNewValue9() {

        seleniumAction.clickElement(txt_NewValue9);
        loggerObj.info("The txt_NewValue9 is not clicked");
        String txt = driver.findElement(txt_NewValue9).getText();
        loggerObj.info("The txt_NewValue9 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion9() {

        seleniumAction.clickElement(txt_eDiaryVersion9);
        loggerObj.info("The txt_eDiaryVersion9 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion9).getText();
        loggerObj.info("The eDiaryVersion9 is :" + txt);
        return txt;
    }

    public String getVisitName10() {

        seleniumAction.scrollBy("0", "1400");
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.scrollDown();
        seleniumAction.clickElement(txt_VisitName10);
        loggerObj.info("The txt_VisitName10 is not clicked");
        String txt = driver.findElement(txt_VisitName10).getText();
        loggerObj.info("The VisitName10 is :" + txt);
        return txt;
    }


    public String getFormName10() {

        seleniumAction.clickElement(txt_FormName10);
        loggerObj.info("The txt_FormName10 is not clicked");
        String txt = driver.findElement(txt_FormName10).getText();
        loggerObj.info("The FormName10 is :" + txt);
        return txt;
    }


    public String getFieldName10() {

        seleniumAction.clickElement(txt_FieldName10);
        loggerObj.info("The txt_FieldName10 is not clicked");
        String txt = driver.findElement(txt_FieldName10).getText();
        loggerObj.info("The FieldName10 is :" + txt);
        return txt;
    }


    public String getModificationDate10() {

        seleniumAction.clickElement(txt_ModificationDate10);
        loggerObj.info("The txt_ModificationDate10 is not clicked");
        String txt = driver.findElement(txt_ModificationDate10).getText();
        loggerObj.info("The ModificationDate10 is :" + txt);
        return txt;
    }



    public String getNewValue10() {

        seleniumAction.clickElement(txt_NewValue10);
        loggerObj.info("The txt_NewValue10 is not clicked");
        String txt = driver.findElement(txt_NewValue10).getText();
        loggerObj.info("The txt_NewValue10 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion10() {

        seleniumAction.clickElement(txt_eDiaryVersion10);
        loggerObj.info("The txt_eDiaryVersion10 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion10).getText();
        loggerObj.info("The eDiaryVersion10 is :" + txt);
        return txt;
    }

    public String getVisitName11() {

        seleniumAction.clickElement(txt_VisitName11);
        loggerObj.info("The txt_VisitName11 is not clicked");
        String txt = driver.findElement(txt_VisitName11).getText();
        loggerObj.info("The VisitName11 is :" + txt);
        return txt;
    }


    public String getFormName11() {

        seleniumAction.clickElement(txt_FormName11);
        loggerObj.info("The txt_FormName11 is not clicked");
        String txt = driver.findElement(txt_FormName11).getText();
        loggerObj.info("The FormName11 is :" + txt);
        return txt;
    }


    public String getFieldName11() {

        seleniumAction.clickElement(txt_FieldName11);
        loggerObj.info("The txt_FieldName11 is not clicked");
        String txt = driver.findElement(txt_FieldName11).getText();
        loggerObj.info("The FieldName11 is :" + txt);
        return txt;
    }


    public String getModificationDate11() {

        seleniumAction.clickElement(txt_ModificationDate11);
        loggerObj.info("The txt_ModificationDate11 is not clicked");
        String txt = driver.findElement(txt_ModificationDate11).getText();
        loggerObj.info("The ModificationDate11 is :" + txt);
        return txt;
    }



    public String getNewValue11() {

        seleniumAction.clickElement(txt_NewValue11);
        loggerObj.info("The txt_NewValue11 is not clicked");
        String txt = driver.findElement(txt_NewValue11).getText();
        loggerObj.info("The txt_NewValue11 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion11() {

        seleniumAction.clickElement(txt_eDiaryVersion11);
        loggerObj.info("The txt_eDiaryVersion11 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion11).getText();
        loggerObj.info("The eDiaryVersion11 is :" + txt);
        return txt;
    }

    public String getVisitName12() {

        seleniumAction.clickElement(txt_VisitName12);
        loggerObj.info("The txt_VisitName12 is not clicked");
        String txt = driver.findElement(txt_VisitName12).getText();
        loggerObj.info("The VisitName12 is :" + txt);
        return txt;
    }


    public String getFormName12() {

        seleniumAction.clickElement(txt_FormName12);
        loggerObj.info("The txt_FormName12 is not clicked");
        String txt = driver.findElement(txt_FormName12).getText();
        loggerObj.info("The FormName12 is :" + txt);
        return txt;
    }


    public String getFieldName12() {

        seleniumAction.clickElement(txt_FieldName12);
        loggerObj.info("The txt_FieldName12 is not clicked");
        String txt = driver.findElement(txt_FieldName12).getText();
        loggerObj.info("The FieldName12 is :" + txt);
        return txt;
    }


    public String getModificationDate12() {

        seleniumAction.clickElement(txt_ModificationDate12);
        loggerObj.info("The txt_ModificationDate12 is not clicked");
        String txt = driver.findElement(txt_ModificationDate12).getText();
        loggerObj.info("The ModificationDate12 is :" + txt);
        return txt;
    }



    public String getNewValue12() {

        seleniumAction.clickElement(txt_NewValue12);
        loggerObj.info("The txt_NewValue12 is not clicked");
        String txt = driver.findElement(txt_NewValue12).getText();
        loggerObj.info("The txt_NewValue12 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion12() {

        seleniumAction.clickElement(txt_eDiaryVersion12);
        loggerObj.info("The txt_eDiaryVersion12 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion12).getText();
        loggerObj.info("The eDiaryVersion12 is :" + txt);
        return txt;
    }

    public String getVisitName13() {

        seleniumAction.clickElement(txt_VisitName13);
        loggerObj.info("The txt_VisitName13 is not clicked");
        String txt = driver.findElement(txt_VisitName13).getText();
        loggerObj.info("The VisitName13 is :" + txt);

        return txt;
    }


    public String getFormName13() {

        seleniumAction.clickElement(txt_FormName13);
        loggerObj.info("The txt_FormName13 is not clicked");
        String txt = driver.findElement(txt_FormName13).getText();
        loggerObj.info("The FormName13 is :" + txt);
        return txt;
    }


    public String getFieldName13() {

        seleniumAction.clickElement(txt_FieldName13);
        loggerObj.info("The txt_FieldName13 is not clicked");
        String txt = driver.findElement(txt_FieldName13).getText();
        loggerObj.info("The FieldName13 is :" + txt);
        return txt;
    }


    public String getModificationDate13() {

        seleniumAction.clickElement(txt_ModificationDate13);
        loggerObj.info("The txt_ModificationDate13 is not clicked");
        String txt = driver.findElement(txt_ModificationDate13).getText();
        loggerObj.info("The ModificationDate13 is :" + txt);
        return txt;
    }



    public String getNewValue13() {

        seleniumAction.clickElement(txt_NewValue13);
        loggerObj.info("The txt_NewValue13 is not clicked");
        String txt = driver.findElement(txt_NewValue13).getText();
        loggerObj.info("The txt_NewValue13 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion13() {

        seleniumAction.clickElement(txt_eDiaryVersion13);
        loggerObj.info("The txt_eDiaryVersion13 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion13).getText();
        loggerObj.info("The eDiaryVersion13 is :" + txt);
        return txt;
    }

    public String getVisitName14() {

        seleniumAction.scrollBy("0", "1400");
        seleniumAdaptor.scrollDown();
        seleniumAdaptor.scrollDown();
        seleniumAction.clickElement(txt_VisitName14);
        loggerObj.info("The txt_VisitName14 is not clicked");
        String txt = driver.findElement(txt_VisitName14).getText();
        loggerObj.info("The VisitName14 is :" + txt);
        return txt;
    }


    public String getFormName14() {

        seleniumAction.clickElement(txt_FormName14);
        loggerObj.info("The txt_FormName14 is not clicked");
        String txt = driver.findElement(txt_FormName14).getText();
        loggerObj.info("The FormName14 is :" + txt);
        return txt;
    }


    public String getFieldName14() {

        seleniumAction.clickElement(txt_FieldName14);
        loggerObj.info("The txt_FieldName14 is not clicked");
        String txt = driver.findElement(txt_FieldName14).getText();
        loggerObj.info("The FieldName14 is :" + txt);
        return txt;
    }


    public String getModificationDate14() {

        seleniumAction.clickElement(txt_ModificationDate14);
        loggerObj.info("The txt_ModificationDate14 is not clicked");
        String txt = driver.findElement(txt_ModificationDate14).getText();
        loggerObj.info("The ModificationDate14 is :" + txt);
        return txt;
    }



    public String getNewValue14() {

        seleniumAction.clickElement(txt_NewValue14);
        loggerObj.info("The txt_NewValue14 is not clicked");
        String txt = driver.findElement(txt_NewValue14).getText();
        loggerObj.info("The txt_NewValue14 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion14() {

        seleniumAction.clickElement(txt_eDiaryVersion14);
        loggerObj.info("The txt_eDiaryVersion14 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion14).getText();
        loggerObj.info("The eDiaryVersion14 is :" + txt);
        return txt;
    }



    public String getVisitName15() {

        seleniumAction.clickElement(txt_VisitName15);
        loggerObj.info("The txt_VisitName15 is not clicked");
        String txt = driver.findElement(txt_VisitName15).getText();
        loggerObj.info("The VisitName15 is :" + txt);
        return txt;
    }


    public String getFormName15() {

        seleniumAction.clickElement(txt_FormName15);
        loggerObj.info("The txt_FormName15 is not clicked");
        String txt = driver.findElement(txt_FormName15).getText();
        loggerObj.info("The FormName15 is :" + txt);
        return txt;
    }


    public String getFieldName15() {

        seleniumAction.clickElement(txt_FieldName15);
        loggerObj.info("The txt_FieldName15 is not clicked");
        String txt = driver.findElement(txt_FieldName15).getText();
        loggerObj.info("The FieldName15 is :" + txt);
        return txt;
    }


    public String getModificationDate15() {

        seleniumAction.clickElement(txt_ModificationDate15);
        loggerObj.info("The txt_ModificationDate15 is not clicked");
        String txt = driver.findElement(txt_ModificationDate15).getText();
        loggerObj.info("The ModificationDate15 is :" + txt);
        return txt;
    }



    public String getNewValue15() {

        seleniumAction.clickElement(txt_NewValue15);
        loggerObj.info("The txt_NewValue15 is not clicked");
        String txt = driver.findElement(txt_NewValue15).getText();
        loggerObj.info("The txt_NewValue15 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion15() {

        seleniumAction.clickElement(txt_eDiaryVersion15);
        loggerObj.info("The txt_eDiaryVersion15 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion15).getText();
        loggerObj.info("The eDiaryVersion15 is :" + txt);
        return txt;
    }



    public String getVisitName16() {

        seleniumAction.clickElement(txt_VisitName16);
        loggerObj.info("The txt_VisitName16 is not clicked");
        String txt = driver.findElement(txt_VisitName16).getText();
        loggerObj.info("The VisitName16 is :" + txt);
        return txt;
    }


    public String getFormName16() {

        seleniumAction.clickElement(txt_FormName16);
        loggerObj.info("The txt_FormName16 is not clicked");
        String txt = driver.findElement(txt_FormName16).getText();
        loggerObj.info("The FormName16 is :" + txt);
        return txt;
    }


    public String getFieldName16() {

        seleniumAction.clickElement(txt_FieldName16);
        loggerObj.info("The txt_FieldName16 is not clicked");
        String txt = driver.findElement(txt_FieldName16).getText();
        loggerObj.info("The FieldName16 is :" + txt);
        return txt;
    }


    public String getModificationDate16() {

        seleniumAction.clickElement(txt_ModificationDate16);
        loggerObj.info("The txt_ModificationDate16 is not clicked");
        String txt = driver.findElement(txt_ModificationDate16).getText();
        loggerObj.info("The ModificationDate16 is :" + txt);
        return txt;
    }



    public String getNewValue16() {

        seleniumAction.clickElement(txt_NewValue16);
        loggerObj.info("The txt_NewValue16 is not clicked");
        String txt = driver.findElement(txt_NewValue16).getText();
        loggerObj.info("The txt_NewValue16 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion16() {

        seleniumAction.clickElement(txt_eDiaryVersion16);
        loggerObj.info("The txt_eDiaryVersion16 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion16).getText();
        loggerObj.info("The eDiaryVersion16 is :" + txt);
        return txt;
    }




    public String getVisitName17() {

        seleniumAction.clickElement(txt_VisitName17);
        loggerObj.info("The txt_VisitName17 is not clicked");
        String txt = driver.findElement(txt_VisitName17).getText();
        loggerObj.info("The VisitName17 is :" + txt);
        return txt;
    }


    public String getFormName17() {

        seleniumAction.clickElement(txt_FormName17);
        loggerObj.info("The txt_FormName17 is not clicked");
        String txt = driver.findElement(txt_FormName17).getText();
        loggerObj.info("The FormName17 is :" + txt);
        return txt;
    }


    public String getFieldName17() {

        seleniumAction.clickElement(txt_FieldName17);
        loggerObj.info("The txt_FieldName17 is not clicked");
        String txt = driver.findElement(txt_FieldName17).getText();
        loggerObj.info("The FieldName17 is :" + txt);
        return txt;
    }


    public String getModificationDate17() {

        seleniumAction.clickElement(txt_ModificationDate17);
        loggerObj.info("The txt_ModificationDate17 is not clicked");
        String txt = driver.findElement(txt_ModificationDate17).getText();
        loggerObj.info("The ModificationDate17 is :" + txt);
        return txt;
    }



    public String getNewValue17() {

        seleniumAction.clickElement(txt_NewValue17);
        loggerObj.info("The txt_NewValue17 is not clicked");
        String txt = driver.findElement(txt_NewValue17).getText();
        loggerObj.info("The txt_NewValue17 is :" + txt);
        return txt;
    }


    public String geteDiaryVersion17() {

        seleniumAction.clickElement(txt_eDiaryVersion17);
        loggerObj.info("The txt_eDiaryVersion17 is not clicked");
        String txt = driver.findElement(txt_eDiaryVersion17).getText();
        loggerObj.info("The eDiaryVersion17 is :" + txt);
        return txt;
    }


















}
