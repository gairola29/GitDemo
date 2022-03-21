package Staging.com.cybex.util;
import java.io.File;
import java.util.ArrayList;

public class Reader {
	static XLs_Reader datareader;
	
	static String filepath;
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> data=new ArrayList<Object[]> ();
		
		try
		{
			//filepath=System.getProperty("user.dir")+"\\Testdata.xlsx";
			//datareader= new XLs_Reader(filepath);
			datareader= new XLs_Reader("D:\\Workspace\\Stagin_ PigeonLabTest\\Testdata1.xlsx");
			for(int rowNum=2;rowNum<=datareader.getRowCount("Question1");rowNum++)
			{
				String Question_Text=datareader.getCellData("Question1", "Question_Text1", rowNum);
				
				//Object ob[]=Question_Text;
				data.add(new Object[]{Question_Text});
				
			}
			return data;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}

}
