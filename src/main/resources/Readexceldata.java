import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readexceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelAPI EAPI=new ExcelAPI("D:\\Workspace\\Stagin_ PigeonLabTest\\Testdata1.xlsx");
		
		int colCount =EAPI.getColumnCount("Data");
		System.out.println(colCount);
		
		int rowCount =EAPI.getRowCount("Data");
		System.out.println(rowCount);
		
		/*FileInputStream fis=new FileInputStream("D:\\Workspace\\Stagin_ PigeonLabTest\\Testdata1.xlsx");
	
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet("Data");
		XSSFRow row=sheet.getRow(0);
		int colCount =row.getLastCellNum();
		System.out.println("total number of columns in excel sheet is "+ colCount);
		
		int rowCount =sheet.getLastRowNum()+1;
		System.out.println("total number of rows in excel sheet is "  + rowCount);
		*/
		
		
		
	}

}
