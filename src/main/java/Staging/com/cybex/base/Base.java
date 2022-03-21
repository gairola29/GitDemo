package Staging.com.cybex.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.*;


import Staging.com.ExtentReportListener.*;
import Staging.com.cybex.util.util;
import Staging.com.cybex.util.Sendmail;
import Staging.com.cybex.util.WebEventListener;


public class Base {

	public  static WebDriver driver ;
	public static Properties prop;
	
	public  static EventFiringWebDriver Event_driver;
	public static WebEventListener eventListener;
	
	public ExtentReports extent;
	public static ExtentTest Extentlog;
	
	
	
	public Base()
	{
		
		
		
		try {
			prop = new Properties();
			
FileInputStream ip = new FileInputStream("src//main//resources//config.properties");
		
		
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
public static void initialization(){
	String browserName = prop.getProperty("browser");
	//String browserName = prop.getProperty("chrome");
	
	//String browserName="chrome";
	System.out.print(browserName);
	
	
	if(browserName.contains("chrome")){
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");	
	driver = new ChromeDriver(); 
	}
	else if(browserName.equals("edge")){
		System.setProperty("webdriver.edge.driver", "D://edgedriver_win64//msedgedriver.exe");	
		driver = new FirefoxDriver(); 
	}
	
	Event_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	eventListener = new WebEventListener();
	Event_driver.register(eventListener);
	driver = Event_driver;
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(util.PAGELOADTIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(util.IMPLICITWAIT, TimeUnit.SECONDS);
	//driver.get("http://cybex-customer-dev.s3-website.ap-south-1.amazonaws.com/");
	driver.get(prop.getProperty("url"));
	
}
	@BeforeTest
    public void config()
    {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		//extent =new ExtentReports(System.getProperty("user.dir") +"/test-output/Extent/"+timeStamp+".html", true);
		extent =new ExtentReports(System.getProperty("user.dir") +"/test-output/Report/Extent/"+timeStamp+".html", true);
      // extent = new ExtentReports(System.getProperty("user.dir") +"/test-output/Extent.html", true);
    }
	
	
	@AfterSuite
	public void SendReport()
	{
	Sendmail sm=new Sendmail();
	
     sm.sendmailreport();
	}
	
	@AfterMethod
	public void TearDown(ITestResult result) throws IOException
{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Extentlog.log(LogStatus.FAIL, "Test case failed"+result.getName());
			Extentlog.log(LogStatus.FAIL, "Test case failed"+result.getThrowable());
			String screenShotPath=util.getScreenshot(driver, result.getName());
			Extentlog.log(LogStatus.FAIL,Extentlog.addScreenCapture(screenShotPath) );
			
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Extentlog.log(LogStatus.SKIP, "Test case skipped is "+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			Extentlog.log(LogStatus.PASS, "Test case passed is "+result.getName());
		}
		{
		
		extent.endTest(Extentlog);
	}
		
		extent.flush();
	driver.quit();
	

}
}


