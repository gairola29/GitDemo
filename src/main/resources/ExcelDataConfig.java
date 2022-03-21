import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath)
	{
		
		
File Src= new File(excelpath);
		
		try {
			FileInputStream fis=new FileInputStream(Src);
			
			wb= new XSSFWorkbook(fis);
			 sheet1=wb.getSheetAt(0);
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int SheetNumber, int row,int column)
	{
		sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;	
}
	
}
