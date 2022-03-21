package Staging.com.cybex.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File Src= new File("D:\\Workspace\\Stagin_ PigeonLabTest\\Testdata1.xlsx");
		
		FileInputStream fis=new FileInputStream(Src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String datao =sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("data from excel-------"+   datao);
		int rowcount =sheet1.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i =0;i<rowcount;i++)
		{
			String sheetvalue =sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(sheetvalue);
		}
		
	wb.close();	
	}
	

}
