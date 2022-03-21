import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExceltoDataProvider {
ExcelAPI EAPI=null;
String xlFilePath="D:\\Workspace\\Stagin_ PigeonLabTest\\Testdata1.xlsx";
String sheetName="Data";
	
@DataProvider(name="userData")
public Object[][] userformdata() throws IOException
{
	Object[][] data=testdata(xlFilePath,sheetName);
	return data;
}
 
@Test(dataProvider="userData")
public void filluserform(String TestA1,String name )
{
	System.out.println(TestA1 +""+name);
	//System.out.println(name);
}

	public Object[][] testdata(String xlFilePath,String SheetName) throws IOException
	{
		Object[][] excelData=null;
		EAPI=new ExcelAPI(xlFilePath);
		int rows=EAPI.getRowCount(SheetName);
		int columns =EAPI.getColumnCount(SheetName);
		
		excelData=new Object[rows][columns];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				excelData[i-1][j]=EAPI.getCellData(SheetName, j, i);
				
			}
		}
		return excelData;
	}
}
