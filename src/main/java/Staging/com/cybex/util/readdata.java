package Staging.com.cybex.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import static org.junit.Assert.*;

import java.beans.Expression;
import java.sql.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import junit.framework.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata {
	
	public static void main(String[] args) throws IOException
	{

        String makeModel="";
	     
	     //Create an object of ReadGuru99ExcelFile class

	   //  motor_quote objExcelFile = new motor_quote();

	     //Prepare the path of excel file

	     String filePath = System.getProperty("user.dir")+"\\Testdata1.xlsx";
	     System.out.println(filePath);

	     //Call read file method of the class to read data

	 //  objExcelFile.readExcel(filePath,"excelExportAndFileIO.xlsx","car_insurance");
	     
	   
	    String fileName="Testdata1.xlsx";
	    String sheetName="Question1";
	     
	     //Create an object of File class to open xlsx file

	    // File file =    new File(filePath+"\\"+fileName);

	     //Create an object of FileInputStream class to read excel file

	     FileInputStream inputStream = new FileInputStream(filePath);

	     Workbook guru99Workbook = null;

	     //Find the file extension by splitting file name in substring  and getting only extension name

	     String fileExtensionName = fileName.substring(fileName.indexOf("."));

	     //Check condition if the file is xlsx file

	     if(fileExtensionName.equals(".xlsx")){

	     //If it is xlsx file then create object of XSSFWorkbook class

	     guru99Workbook = new XSSFWorkbook(inputStream);

	     }

	     //Check condition if the file is xls file

	     else if(fileExtensionName.equals(".xls")){

	         //If it is xls file then create object of XSSFWorkbook class

	     guru99Workbook = new HSSFWorkbook(inputStream);

	     }

	     //Read sheet inside the workbook by its name

	     Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
	     
	     

	     //Find number of rows in excel file

	     int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	     //Create a loop over all the rows of excel file to read it

	     for (int i = 0; i < rowCount+1; i++) {

	        String variantCC="";
	        String fuel_type="";

	         Row row = guru99Sheet.getRow(i);

	         //Create a loop to print cell values in a row
	        Cell cell=row.getCell(0);
	        
	        if(cell != null){
	        	makeModel=row.getCell(0).getStringCellValue();
		        System.out.println(makeModel);
	        }
	         
	        // fuel_type=row.getCell(1).getStringCellValue();
	         //variantCC=row.getCell(2).getStringCellValue();
	         

	    	/*@SuppressWarnings("resource")
	    	@DataProvider 
	    	public String getTestData() throws IOException
	    	{
	    		String makeModel="";

	        String filePath = System.getProperty("user.dir")+"\\Testdata1.xlsx";
	        System.out.println(filePath);
	        String fileName="Testdata1.xlsx";
	        String sheetName="Question1";
	        FileInputStream inputStream = new FileInputStream(filePath);

	        Workbook guru99Workbook = null;
	        String fileExtensionName = fileName.substring(fileName.indexOf("."));

	        if(fileExtensionName.equals(".xlsx")){

	        guru99Workbook = new XSSFWorkbook(inputStream);

	        }


	        else if(fileExtensionName.equals(".xls")){

	            //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	        }

	        //Read sheet inside the workbook by its name

	        Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
	        
	        

	        //Find number of rows in excel file

	        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	        //Create a loop over all the rows of excel file to read it

	        for (int i = 0; i < rowCount+1; i++) {

	           String variantCC="";
	           String fuel_type="";

	            Row row = guru99Sheet.getRow(i);

	            
	            Cell cell=row.getCell(0);
	    		if(cell != null)
	            {//Create a loop to print cell values in a row
	            makeModel=row.getCell(0).getStringCellValue();
	            System.out.println(makeModel);
	           // fuel_type=row.getCell(1).getStringCellValue();
	            //variantCC=row.getCell(2).getStringCellValue();
	            
	            }
	         
	           

	        }
	        return makeModel; 
	    		
	    		
	    		}
	    	*/
	      
	        

	     }
	      
	   
	}
	

}
