package Staging.com.cybex.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Staging.com.cybex.base.Base;

public class util extends Base{

	
	public static long PAGELOADTIMEOUT=60;
	public static long IMPLICITWAIT=10;
	
	public static void SwitchWindow() throws InterruptedException
	{
		for(String childwindow:driver.getWindowHandles())
		{
			driver.switchTo().window(childwindow);
			
		}
			  Thread.sleep(5000);	  
	}
	

	
	
	
	
	
	public static String getScreenshot(WebDriver driver,String ScreenshotName) throws IOException
	{
		String DateName=new SimpleDateFormat("yyyymmddhhmmdd").format(new Date());
		TakesScreenshot TS=(TakesScreenshot)driver;
		File Source=TS.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+ "/FailedTestScreenshots/"+ ScreenshotName+DateName+".png";
		File finalDestination =new File(destination);
		FileUtils.copyFile(Source, finalDestination);
		return destination;
	
	}
	
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "//screenshots//" + System.currentTimeMillis() + ".png"));
	}
	
	
	
	

}
