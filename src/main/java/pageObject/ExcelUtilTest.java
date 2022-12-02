package pageObject;

import base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.spliterator;


public class ExcelUtilTest extends BaseClass {



    private static Logger loggerObj = LogManager.getLogger(ExcelUtilTest.class);
    public static HashMap<String, String> storeValue = new HashMap<>();

    public ExcelUtilTest(WebDriver driver) {
        super(driver);

    }

//    public static void main(String[] args) {

    public String Excel() {

        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/AA338_AUDIT_27Nov2022.xlsx");
        String sheetName = "AA338";
        String data = reader.getCellData(sheetName, 1, 2);
        loggerObj.info(data);
        int rowCount = reader.getRowCount(sheetName);
        loggerObj.info("total rows: " + rowCount);

        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
            String VisitName = reader.getCellData(sheetName, "Visit Name", rowNum);
            String FormName = reader.getCellData(sheetName, "Form Name", rowNum);
            String RecordNumber = reader.getCellData(sheetName, "Record Number", rowNum);
            String FieldName = reader.getCellData(sheetName, "Field Name", rowNum);
            String DateofModication = reader.getCellData(sheetName, "Date of Modication", rowNum);
            String OldValue = reader.getCellData(sheetName, "Old Value", rowNum);
            String NewValue = reader.getCellData(sheetName, "New Value", rowNum);
            String InsertUpdate = reader.getCellData(sheetName, "Insert/Update", rowNum);
            String eDiaryVersion = reader.getCellData(sheetName, "eDiaryVersion", rowNum);

            loggerObj.info(VisitName + " " + FormName + " " + RecordNumber + " " + FieldName + " " + DateofModication + " " + OldValue + " " + NewValue + " " + InsertUpdate + " " + eDiaryVersion);

        }
        return sheetName;
    }


//
//        if(!reader.isSheetExist("Reg")){
//         reader.addSheet("Reg");




    public String Xl() {

        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/AA338_AUDIT_27Nov2022.xlsx");
        String sheetName = "AA338";
        String data = reader.getCellData(sheetName, 1, 2);
        loggerObj.info(data);
        int rowCount = reader.getRowCount(sheetName);
        loggerObj.info("total rows: " + rowCount);

        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {

            String VisitName = reader.getCellData(sheetName, "Visit Name", rowNum);
            String FormName = reader.getCellData(sheetName, "Form Name", rowNum);
            String RecordNumber = reader.getCellData(sheetName, "Record Number", rowNum);
            String FieldName = reader.getCellData(sheetName, "Field Name", rowNum);
            String DateofModication = reader.getCellData(sheetName, "Date of Modication", rowNum);
            String OldValue = reader.getCellData(sheetName, "Old Value", rowNum);
            String NewValue = reader.getCellData(sheetName, "New Value", rowNum);
            String InsertUpdate = reader.getCellData(sheetName, "Insert/Update", rowNum);
            String eDiaryVersion = reader.getCellData(sheetName, "eDiaryVersion", rowNum);


            loggerObj.info(VisitName + " " + FormName + " " + RecordNumber + " " + FieldName + " " + DateofModication + " " + OldValue + " " + NewValue + " " + InsertUpdate + " " + eDiaryVersion);


            return sheetName;

        }


        return sheetName;
    }




    public static <return1> List<Object> Excel1() {


        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/AA338_AUDIT_27Nov2022.xlsx");
//        Xls_Reader reader1 = new Xls_Reader("C:/Users/HP/Downloads/'"+subject+"'_AUDIT_27Nov2022.xlsx");
        String sheetName = "AA338";
        String data = reader.getCellData(sheetName, 1, 2);
        loggerObj.info(data);
        int rowCount = reader.getRowCount(sheetName);
        loggerObj.info("total rows: " + rowCount);

        String VisitName = null;
        String FormName = null;
        String RecordNumber = null;
        String FieldName = null;
        String DateofModication = null;
        String OldValue = null;
        String NewValue = null;
        String InsertUpdate = null;
        String eDiaryVersion = null;
        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
            VisitName = reader.getCellData(sheetName, "Visit Name", rowNum);
            FormName = reader.getCellData(sheetName, "Form Name", rowNum);
            RecordNumber = reader.getCellData(sheetName, "Record Number", rowNum);
            FieldName = reader.getCellData(sheetName, "Field Name", rowNum);
            DateofModication = reader.getCellData(sheetName, "Date of Modication", rowNum);
            OldValue = reader.getCellData(sheetName, "Old Value", rowNum);
            NewValue = reader.getCellData(sheetName, "New Value", rowNum);
            InsertUpdate = reader.getCellData(sheetName, "Insert/Update", rowNum);
            eDiaryVersion = reader.getCellData(sheetName, "eDiaryVersion", rowNum);

            loggerObj.info(VisitName + " " + FormName + " " + RecordNumber + " " + FieldName + " " + DateofModication + " " + OldValue + " " + NewValue + " " + InsertUpdate + " " + eDiaryVersion);


        }


        return asList(VisitName, FormName, RecordNumber, FieldName, DateofModication, OldValue, NewValue, InsertUpdate, eDiaryVersion);


    }

    public  String  XLreal( ) {

        List<Object>person = Excel1();
        loggerObj.info(person);

//        String ret = null;

        return person.toString();
    }







    public String Xldata1(String subject, String forms, String date) {

//        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/AA338_AUDIT_27Nov2022.xlsx");27Nov2022
//              Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/"+subject+"_AUDIT_"+date+".xlsx");
        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/" + subject + "_" + forms + "_" + date + ".xlsx");
              String sheetName = subject;

        String data = reader.getCellData(sheetName, 1, 2);

        loggerObj.info(data);

        int rowCount = reader.getRowCount(sheetName);
        loggerObj.info("total rows: " + rowCount);

        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
            String VisitName = reader.getCellData(sheetName, "Visit Name", rowNum);
            String FormName = reader.getCellData(sheetName, "Form Name", rowNum);
            String RecordNumber = reader.getCellData(sheetName, "Record Number", rowNum);
            String FieldName = reader.getCellData(sheetName, "Field Name", rowNum);
            String DateofModication = reader.getCellData(sheetName, "Date of Modication", rowNum);
            String OldValue = reader.getCellData(sheetName, "Old Value", rowNum);
            String NewValue = reader.getCellData(sheetName, "New Value", rowNum);
            String InsertUpdate = reader.getCellData(sheetName, "Insert/Update", rowNum);
            String eDiaryVersion = reader.getCellData(sheetName, "eDiaryVersion", rowNum);


            loggerObj.info(VisitName + "||" + FormName +    "||"      + RecordNumber +     "||"       + FieldName +     "||"          + DateofModication + "||" + OldValue + "||" + NewValue + "||" + InsertUpdate + "||" + eDiaryVersion);


        }
        return sheetName;
    }






    public String Exceldatadate(String subject, String forms, String date) {

//        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/AA338_AUDIT_27Nov2022.xlsx");
        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/" + subject + "_" + forms + "_" + date + ".xlsx");
        String sheetName = subject;
       String data = reader.getCellData(sheetName, 1, 2);
        loggerObj.info(data);
        String VisitName;

        String FormName ;
        String RecordNumber;
        String FieldName;

        int rowCount = reader.getRowCount(sheetName);
        loggerObj.info("total rows: " + rowCount);

        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {

              VisitName= reader.getCellData(sheetName, "Visit Name", rowNum);
            FormName = reader.getCellData(sheetName, "Form Name", rowNum);
             RecordNumber= reader.getCellData(sheetName, "Record Number", rowNum);
             FieldName= reader.getCellData(sheetName, "Field Name", rowNum);
//            String DateofModication = reader.getCellData(sheetName, "Date of Modication", rowNum);
//            String OldValue = reader.getCellData(sheetName, "Old Value", rowNum);
//            String NewValue = reader.getCellData(sheetName, "New Value", rowNum);
//            String InsertUpdate = reader.getCellData(sheetName, "Insert/Update", rowNum);
//            String eDiaryVersion = reader.getCellData(sheetName, "eDiaryVersion", rowNum);

//            loggerObj.info(VisitName + " " + FormName + " " + RecordNumber + " " + FieldName + " " + DateofModication + " " + OldValue + " " + NewValue + " " + InsertUpdate + " " + eDiaryVersion);
//
return VisitName;
        }



        return sheetName;
    }






    public String Exceldatadate5(String subject, String forms, String date) {

//        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/AA338_AUDIT_27Nov2022.xlsx");
        Xls_Reader reader = new Xls_Reader("C:/Users/HP/Downloads/" + subject + "_" + forms + "_" + date + ".xlsx");
        String sheetName = subject;
//        String data = reader.getCellData(sheetName, 1, 2);
//        loggerObj.info(data);
        String ar[]= new String[9];


//        String RecordNumber;
//        String FieldName;

        int rowCount = reader.getRowCount(sheetName);
        loggerObj.info("total rows: " + rowCount);

        for (int rowNum = 1; rowNum <= rowCount; rowNum++) {

            ar[0]= reader.getCellData(sheetName, "Visit Name", rowNum);
            ar [1] = reader.getCellData(sheetName, "Form Name", rowNum);
            ar [2]= reader.getCellData(sheetName, "Record Number", rowNum);
            ar [3]= reader.getCellData(sheetName, "Field Name", rowNum);
            ar[5]= reader.getCellData(sheetName, "Visit Name", rowNum);
            ar [6] = reader.getCellData(sheetName, "Form Name", rowNum);
            ar [7]= reader.getCellData(sheetName, "Record Number", rowNum);
            ar [8]= reader.getCellData(sheetName, "Field Name", rowNum);


//            ar [4] = String.valueOf(ar);
//            ar DateofModication = (ar) reader.getCellData(sheetName, "Date of Modication", rowNum);


//            ar OldValue = (ar) reader.getCellData(sheetName, "Old Value", rowNum);
//            ar NewValue = (ar) reader.getCellData(sheetName, "New Value", rowNum);
//            ar InsertUpdate = (ar) reader.getCellData(sheetName, "Insert/Update", rowNum);
//            ar eDiaryVersion = (ar) reader.getCellData(sheetName, "eDiaryVersion", rowNum);

//            loggerObj.info(VisitName + " " + FormName + " " + RecordNumber + " " + FieldName + " " + DateofModication + " " + OldValue + " " + NewValue + " " + InsertUpdate + " " + eDiaryVersion);

            loggerObj.info(ar[8]);

        }


//        return ar.toString();
        return ar.toString();
//        return Arrays.toString(ar);
    }






















}






