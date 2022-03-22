package Staging.com.cybex.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Staging.com.cybex.base.Base;
import Staging.com.cybex.pages.CybexLoginPage;
import Staging.com.cybex.util.ExcelApi;

public class CybexHomePageTest extends Base  {
	
	//ExcelApi EAPI=null;
	//String xlFilePath="D:\\Workspace\\Stagin_ PigeonLabTest\\Testdata1.xlsx";
	//String sheetName="Data";
	//String sheetName1="message";
	
//@DataProvider(name="userData")
//	public Object[][] userformdata() throws IOException
//	{
//		Object[][] data=testdata(xlFilePath,sheetName);
//		return data;
//	}
//	
//	@DataProvider(name="userData1")
//	public Object[][] announcement() throws IOException
//	{
//		Object[][] data=testdata(xlFilePath,sheetName1);
//		return data;
//	}
//	public Object[][] testdata(String xlFilePath,String SheetName) throws IOException
//	{
//		
//		Object[][] excelData=null;
//		EAPI=new ExcelApi(xlFilePath);
//		int rows=EAPI.getRowCount(SheetName);
//		int columns =EAPI.getColumnCount(SheetName);
//		excelData=new Object[rows-1][columns];
//		
//		for(int i=1;i<rows;i++)
//		{
//			for(int j=0;j<columns;j++)
//			{
//				excelData[i-1][j]=EAPI.getCellData(SheetName, j, i);
//				
//			}
//			
//		}
//		return excelData;
//	}
// 
	Logger log;
	
	
	public CybexHomePageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
		
	}
	
	
	
//-------------------------------------Cybex Test Cases--------------------------------------------------
	@Test(priority=1,enabled = true)
	public void Login_To_Application()
	{
		Extentlog = extent.startTest("Login_To_Application");
		CybexLoginPage PLD=new CybexLoginPage();
	    log=Logger.getLogger("devpinoyLogger");
		log.info("Opening chrome browser");
		log=Logger.getLogger("devpinoyLogger");
		log.info("Brwoser opening ");
		Extentlog.log(LogStatus.INFO, "Opening chrome browser");
		prop.getProperty("browser");
		PLD.Clicking_LoginBtn();
		Extentlog.log(LogStatus.PASS, "User login to the application");
			}
	

@Test(priority=2,enabled = false)
public void Logout_from_The_Application() throws InterruptedException
{
	Extentlog = extent.startTest("Logout_from_The_Application");
	CybexLoginPage PLD=new CybexLoginPage();
	Login_To_Application();
	Extentlog.log(LogStatus.INFO, "Clicking on Logout Button");
	log.info("Clicking on logout button");
	PLD.Clicking_LogoutBtn();
	Extentlog.log(LogStatus.INFO, "Logout from the application");
	log.info("Logout from the application");
	Extentlog.log(LogStatus.PASS, "User logout from the application");
    }
}

@Test(priority=3,enabled = false)
public void Logout_from_The_web() throws InterruptedException
{
	Extentlog = extent.startTest("Logout_from_The_Application");
	CybexLoginPage PLD=new CybexLoginPage();
	Login_To_Application();
	Extentlog.log(LogStatus.INFO, "Clicking on Logout Button");
	log.info("Clicking on logout button");
	PLD.Clicking_LogoutBtn();
	Extentlog.log(LogStatus.INFO, "Logout from the application");
	log.info("Logout from the application");
	Extentlog.log(LogStatus.PASS, "User logout from the application");
    }
}

/////////////////////////Check posting of question without filtering enabled ///////////////////////////
		
/*
 * @Test(priority=1,enabled = false,dataProvider="userData") public void
 * Check_Posting_Question_Without_Filtering_Enabled(String TestA1,String name )
 * throws InterruptedException { Extentlog =
 * extent.startTest("Check_Posting_Question_Without_Filtering_Enabled");
 * CybexLoginPage PLD=new CybexLoginPage();
 * 
 * log=Logger.getLogger("devpinoyLogger"); log.info("Opening chrome browser");
 * log=Logger.getLogger("devpinoyLogger"); log.info("Brwoser opening ");
 * Extentlog.log(LogStatus.INFO, "Opening chrome browser");
 * prop.getProperty("browser"); PLD.click_Notification(); PLD.click_Event();
 * log.
 * info("In the workspace clicking on Technology and corporate communications");
 * Extentlog.log(LogStatus.INFO,
 * "In the workspance clicking on Technology and corporate communications");
 * PLD.click_ConfirmationBox(); ///////////System.out.println(TestA1 +""+name);
 * String ParanetWindow= driver.getWindowHandle(); log.
 * info("Clicked on Run option a new tab will open and you should be on new tab "
 * ); Extentlog.log(LogStatus.INFO,
 * "Clicked on run option a new tab will open and you should be on new tab ");
 * PLD.RunlinkBtn(); PLD.Option_Audience_WebApp();
 * log.info("Clicked on Audience webaApp option under run links");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Audience webaApp option under links"); for(String
 * childwindow:driver.getWindowHandles()){driver.switchTo().window(childwindow);
 * } PLD.ClickQA();
 * log.info("Clicked on Technology and Corporate Communications under AWA page"
 * ); Extentlog.log(LogStatus.INFO,
 * "Clicked on Technology and Corporate Communications under AWA page");
 * log.info("User Entering question under textfield Enter your question here");
 * Extentlog.log(LogStatus.INFO,
 * "User Entering question under textfield Enter your question here");
 * PLD.EnterQuestion.sendKeys(TestA1); log.info("User clicked on asked button");
 * Extentlog.log(LogStatus.INFO, "User clicked on asked button");
 * PLD.AskButton(); log.info("user licked on Submit button ");
 * Extentlog.log(LogStatus.INFO, "User clicked on Submit button");
 * PLD.SubmitQuestion(); String question= PLD.gettext(); try
 * {Assert.assertEquals(TestA1,question ); Assert.assertTrue(true);
 * log.info("Should see the question you have just posted");
 * Extentlog.log(LogStatus.PASS,
 * "Should see the question you have just posted");} catch(Exception ex )
 * {Assert.assertTrue(false); log.info("question not displayed");
 * Extentlog.log(LogStatus.PASS, "Question not displayed ");} String Votecount
 * =PLD.Vote_count(); PLD.click_voteicon();
 * log.info("Clicked on Vote link and vote has changed from 0 to 1.");
 * Extentlog.log(LogStatus.INFO,
 * "Clicked on Vote link and vote has changed from 0 to 1."); String
 * TotalVoteCount =PLD.Total_Vote_count(); if(Votecount==TotalVoteCount)
 * {Assert.assertTrue(false); log.info("Vote count value not increased");
 * Extentlog.log(LogStatus.FAIL, "Vote count value not increased");}
 * else{Assert.assertTrue(true); log.info("Vote count increased by 1");
 * Extentlog.log(LogStatus.PASS, "Vote count increased by 1");} driver.close();
 * driver.switchTo().window(ParanetWindow); PLD.click_Adminpannel(); log.
 * info("Click on the Admin pannel button a new tab will open & user should be on new tab"
 * ); Extentlog.log(LogStatus.INFO,
 * "Click on the Admin pannel button a new tab will open & user should be on new tab"
 * ); for(String
 * childwindow:driver.getWindowHandles()){driver.switchTo().window(childwindow);
 * }Thread.sleep(5000); PLD.click_Admin_pannel_firstoption(); log.
 * info("In admin pannel clicked on Technology and Corporate Communications to enter the session"
 * ); Extentlog.log(LogStatus.INFO,
 * "In admin pannel clicked on Technology and Corporate Communications to enter the session"
 * ); String AdminQ=PLD.Question_Admin.getText().toString();
 * if(AdminQ.equalsIgnoreCase(TestA1)) {Assert.assertTrue(true,
 * "user should see the question just posted on admin pannel");
 * log.info("user should see the question just posted on admin pannel");
 * Extentlog.log(LogStatus.PASS,
 * "user should see the question just posted on admin pannel");}
 * else{Assert.assertTrue(false,
 * "user should not see the question just posted on admin pannel");
 * log.info("user should not see the question just posted on admin pannel");
 * Extentlog.log(LogStatus.FAIL,
 * "user should not see the question just posted on admin pannel");} String
 * check =PLD.Verify_CrossIcon(); try { if(check.contains("true")) {
 * Assert.assertTrue(true,
 * "On the top right Question filtering showing cross icon");
 * log.info("On the top right Question filtering showing cross icon");
 * Extentlog.log(LogStatus.PASS,
 * "On the top right Question filtering showing cross icon");} else {
 * Assert.assertTrue(false,
 * "On the top right Question filtering showing cross icon");
 * log.info("On the top right Question filtering showing cross icon");
 * Extentlog.log(LogStatus.FAIL,
 * "On the top right Question filtering showing cross icon");} } catch(Exception
 * ex) { System.out.println(ex); } driver.close();
 * driver.switchTo().window(ParanetWindow);
 * log.info("Return to workspace.Click on the projector pannel");
 * Extentlog.log(LogStatus.INFO,
 * "Return to workspace.Click on the projector pannel");
 * PLD.click_Projectorpannel(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * PLD.Select_projectPanneloption(); log.
 * info("A new tab will open and user should be on new tab Click on Technology and Corporate Communications"
 * ); Extentlog.log(LogStatus.INFO,
 * "A new tab will open and user should be on new tab Click on Technology and Corporate Communications"
 * ); String Projectorscreen =PLD.verify_projectpannelquestiontext(); try {
 * if(Projectorscreen.equalsIgnoreCase("true")) {Assert.assertTrue(true,
 * "user should see the question just posted on Projector pannel");
 * log.info("user should see the question just posted on Projector pannel");
 * Extentlog.log(LogStatus.PASS,
 * "user should see the question just posted on Projector pannel"); } else {
 * Assert.assertTrue(false,
 * "user should not see the question just posted on Projector pannel");
 * log.info("user should not see the question just posted on Projector pannel");
 * Extentlog.log(LogStatus.FAIL,
 * "user should not see the question just posted on Projector pannel"); } }
 * catch(Exception ex) { System.out.println(ex); }
 * driver.switchTo().window(ParanetWindow); }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ///////////////Checking posting of question with filtering enabled
 * ///////////////////////
 * 
 * @Test(priority=2 ,enabled=false,dataProvider="userData") public void
 * checking_Posting_question_with_filtering_enable(String TestA1,String name)
 * throws InterruptedException { Extentlog =
 * extent.startTest("checking_Posting_question_with_filtering_enable");
 * Extentlog.log(LogStatus.INFO, "user login to applciation"); CybexLoginPage
 * PLD=new CybexLoginPage(); log=Logger.getLogger("devpinoyLogger");
 * log.info("Opening Browser"); prop.getProperty("browser");
 * PLD.click_Notification(); PLD.click_Event(); PLD.click_ConfirmationBox();
 * PLD.Agenda_link();
 * log.info("Clicked on Technology and Corporate Communications agenda");
 * Extentlog.log(LogStatus.INFO,
 * "Clicked on Technology and Corporate Communications agenda");
 * PLD.Edit_link();
 * log.info("Clicked on edit buttton of Technology and Corporate Communications"
 * ); Extentlog.log(LogStatus.INFO,
 * "Clicked on edit button of Technology and Corporate Communications");
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,500)");
 * log.info("Checked question filtering checkbox field");
 * Extentlog.log(LogStatus.INFO, "Checked question filtering checkbox field");
 * PLD.Checked_Question_filtering(); js.executeScript("window.scrollBy(0,500)");
 * log.info("Clicked on SaveQ&A button"); Extentlog.log(LogStatus.INFO,
 * "Clicked on SaveQ&A button"); PLD.Click_QABtn(); PLD.Pigeonholes_link();
 * log.info("Clicked on 2018 Asia Leadership Conference");
 * Extentlog.log(LogStatus.INFO, "Clicked on 2018 Asia Leadership Conference");
 * PLD.click_Event(); String ParanetWindow= driver.getWindowHandle();
 * js.executeScript("window.scrollBy(0,300)");
 * log.info("Clicked on Admin pannel"); Extentlog.log(LogStatus.INFO,
 * "Clicked on Admin pannel"); PLD.click_Adminpannel(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000); log.
 * info("Clicked on Technology and Corporate Communications under admin pannel"
 * ); Extentlog.log(LogStatus.INFO,
 * "Clicked on Technology and Corporate Communications under admin pannel");
 * PLD.click_Admin_pannel_firstoption(); log.
 * info("Verifing cross icon display under Question filtering section under admin pannel"
 * ); Extentlog.log(LogStatus.INFO,
 * "Verifing cross icon display under Question filtering section under admin pannel"
 * ); String check =PLD.Verify_CrossIcon();
 * 
 * if(check.contains("true")) { Assert.assertTrue(true,
 * "Question filtering shwoing Tick icon ");
 * System.out.println("Question filtering shwoing Tick icon" );
 * log.info("Question filtering showing Tick icon");
 * Extentlog.log(LogStatus.PASS, "Question filtering showing Tick icon"); } else
 * {
 * 
 * Assert.assertTrue(false, "Question filtering not showing Tick icon ");
 * System.out.println("Question filtering not showing Tick icon");
 * log.info("Question filtering showing cross icon");
 * Extentlog.log(LogStatus.FAIL, "Question filtering showing cross icon"); }
 * driver.close(); driver.switchTo().window(ParanetWindow);
 * log.info("click on run option"); Extentlog.log(LogStatus.INFO,
 * "click on run option"); PLD.RunlinkBtn();
 * log.info("click on Audience Web App option"); Extentlog.log(LogStatus.INFO,
 * "click on Audience Web App option"); PLD.click_AWP(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);} Thread.sleep(5000); String
 * ss=driver.getTitle(); System.out.println(ss); PLD.ClickQA();
 * log.info("User Entering question under textfield Enter your question here");
 * Extentlog.log(LogStatus.INFO,
 * "User Entering question under textfield Enter your question here");
 * //PLD.enterquestion(); PLD.EnterQuestion.sendKeys(TestA1);
 * log.info("User clicked on asked button"); Extentlog.log(LogStatus.INFO,
 * "User clicked on asked button"); PLD.AskButton();
 * log.info("User clicked on Submit button"); Extentlog.log(LogStatus.INFO,
 * "User clicked on submit button"); PLD.SubmitQuestion(); String
 * Question=PLD.Checked_NO_Question_Display();
 * if(Question.equalsIgnoreCase("True")) { Assert.assertTrue(true,
 * "Posted question not display on Audience Web App ");
 * System.out.println("Posted question not display on Audience Web App" +
 * check); log.info("Posted question not display on Audience Web App");
 * Extentlog.log(LogStatus.PASS,
 * "Posted question not display on Audience Web App");
 * 
 * }
 * 
 * else { Assert.assertTrue(false,
 * "Posted question display on Audience Web App ");
 * System.out.println("Posted question not display on Audience Web App" +
 * check); log.info("Posted question display on Audience Web App");
 * Extentlog.log(LogStatus.FAIL, "Posted question display on Audience Web App");
 * } driver.close(); driver.switchTo().window(ParanetWindow);
 * log.info("Click on projector pannel"); Extentlog.log(LogStatus.INFO,
 * "Click on projector pannel"); PLD.click_Projectorpannel(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);} Thread.sleep(5000);
 * System.out.println(ParanetWindow); log.
 * info("Click on Technology and Corporate Communications under projector pannel screen"
 * ); Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications under projector pannel screen"
 * );
 * 
 * PLD.Select_projectPanneloption(); String active=PLD.checkprojectorscreen();
 * if(active.equalsIgnoreCase("true")) { Assert.assertTrue(true,
 * "user should see the question just posted"); System.out.println(active); log.
 * info("Switch to Projector Panel, user should see the question just posted ");
 * Extentlog.log(LogStatus.PASS,
 * "Switch to Projector Panel, user should see the question just posted ");
 * 
 * } else { System.out.println(active); Assert.assertTrue(false,
 * "user should not see the question you have just posted too"); log.
 * info("Switch to Projector Panel, user should not see the question just posted "
 * ); Extentlog.log(LogStatus.INFO,
 * "Switch to Projector Panel, user should not see the question just posted"); }
 * driver.close(); driver.switchTo().window(ParanetWindow);
 * log.info("User Switch to admin panel"); Extentlog.log(LogStatus.INFO,
 * "User switch tab to admin panel"); PLD.click_Adminpannel();
 * System.out.println(ParanetWindow); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000); log.
 * info("Clicked on Technology and Corporate Communications under admin pannel screen"
 * ); Extentlog.log(LogStatus.INFO,
 * "Clicked on Technology and Corporate Communications under admin pannel screen"
 * ); PLD.click_Admin_pannel_firstoption();
 * log.info("Clicked on pending section under questions section");
 * Extentlog.log(LogStatus.INFO,
 * "Clicked on pending section under questions section"); PLD.click_PendingQ();
 * log.info("Clicked on the â€œAllowedâ€? link on the left");
 * Extentlog.log(LogStatus.INFO, "Click on the â€œAllowedâ€? link on the left");
 * PLD.click_AllowBTn(); Thread.sleep(3000); PLD.click_Allowedlink(); String
 * StatusAllowed=PLD.check_statusallow();
 * 
 * { if(StatusAllowed.equalsIgnoreCase("true")) { Assert.assertTrue(true,
 * "User should see the questions he/she just approved");
 * log.info("User should see the questions he/she just approved ");
 * Extentlog.log(LogStatus.PASS,
 * "User should see the questions he/she just approved"); } else {
 * Assert.assertTrue(false,
 * "User should not see the questions he/she just approved");
 * log.info("User should not see the questions he/she just approved");
 * Extentlog.log(LogStatus.FAIL,
 * "User should not see the questions he/she just approved"); } driver.close();
 * driver.switchTo().window(ParanetWindow); log.info("Click on Run links");
 * Extentlog.log(LogStatus.INFO, "Click on Run links  "); PLD.RunlinkBtn();
 * log.info("Click on Audience Web App option"); Extentlog.log(LogStatus.INFO,
 * "Click on Audience Web App option  "); PLD.click_AWP(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);}
 * log.info("Click on Technology and Corporate Communications");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications"); PLD.ClickQA(); String
 * AWAQ=PLD.Question_AWA.getText().toString(); System.out.println(AWAQ);
 * 
 * if(AWAQ.equalsIgnoreCase(AWAQ)) { Assert.assertTrue(true,
 * "On AWA section user should see the question he/she just approved");
 * System.out.println(AWAQ);
 * log.info("On AWA section user should see the question he/she just approved");
 * Extentlog.log(LogStatus.PASS,
 * "On AWA section user should see the question he/she just approved"); } else {
 * Assert.assertTrue(false,
 * "On AWA section user should not see the question he/she just approved");
 * System.out.println(AWAQ); log.
 * info("On AWA section user should not see the question he/she just approved");
 * Extentlog.log(LogStatus.FAIL,
 * "On AWA section user should not see the question he/she just approved"); }
 * driver.close(); driver.switchTo().window(ParanetWindow);
 * log.info("Switch tab to Projector Panel"); Extentlog.log(LogStatus.INFO,
 * "Switch tab to Projector Panel"); PLD.click_Projectorpannel(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * log.info("Click on Technology and Corporate Communications");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications");
 * 
 * PLD.Select_projectPanneloption(); String Projectorscreen
 * =PLD.verify_projectpannelquestiontext(); System.out.println(Projectorscreen);
 * 
 * if(Projectorscreen.equalsIgnoreCase("true")) { Assert.assertTrue(true,
 * "On Projector pannel user should see the question he/she just approved");
 * System.out.println(Projectorscreen); log.
 * info("On Projector pannel user should see the question he/she just approved"
 * ); Extentlog.log(LogStatus.PASS,
 * "On Projector pannel user should see the question he/she just approved"); }
 * else { Assert.assertTrue(false,
 * "On Projector pannel user should not see the question he/she just approved");
 * System.out.println(Projectorscreen); log.
 * info("On Projector pannel user should not see the question he/she just approved"
 * ); Extentlog.log(LogStatus.FAIL,
 * "On Projector pannel user should not see the question he/she just approved");
 * } driver.close(); driver.switchTo().window(ParanetWindow); //////////////Mark
 * a question as Active//////////////////////
 * log.info("Switch tab to Admin Panel"); Extentlog.log(LogStatus.INFO,
 * "Switch tab to Admin Panel"); PLD.click_Adminpannel(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * log.info("Click on Technology and Corporate Communications");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications");
 * PLD.click_Admin_pannel_firstoption();
 * log.info("clicked on â€œActiveâ€? on the question he/she just approved.");
 * Extentlog.log(LogStatus.INFO,
 * "clicked on â€œActiveâ€? on the question he/she just approved.");
 * PLD.click_activelink(); driver.close();
 * driver.switchTo().window(ParanetWindow);
 * log.info("Switch tab to Projector Panel"); Extentlog.log(LogStatus.INFO,
 * "Switch tab to Projector Pane"); PLD.click_Projectorpannel(); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * log.info("Click on Technology and Corporate Communications");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications");
 * PLD.Select_projectPanneloption(); String Projectorscreen1
 * =PLD.verify_projectpannelquestiontext();
 * System.out.println(Projectorscreen1);
 * 
 * if(Projectorscreen1.equalsIgnoreCase("true")) { Assert.assertTrue(true,
 * "User should see the question He/She just â€œActiveâ€?.");
 * System.out.println(Projectorscreen1);
 * log.info("User should see the question He/She just â€œActiveâ€?.");
 * Extentlog.log(LogStatus.PASS,
 * "User should see the question He/She just â€œActiveâ€?."); } else {
 * Assert.assertTrue(false,
 * "User should see the question He/She just â€œActiveâ€?.");
 * System.out.println(Projectorscreen1);
 * log.info("User should see the question He/She just â€œActiveâ€?.");
 * Extentlog.log(LogStatus.PASS,
 * "User should see the question He/She just â€œActiveâ€?."); }
 * 
 * driver.close(); driver.switchTo().window(ParanetWindow);
 * 
 * //////////////Mark a question as Answered////////////////
 * log.info("Switch tab to Admin Panel"); Extentlog.log(LogStatus.INFO,
 * "Switch tab to Admin Panel");
 * 
 * PLD.click_Adminpannel();
 * 
 * for(String childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * log.info("Click on Technology and Corporate Communications");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications");
 * 
 * PLD.click_Admin_pannel_firstoption();
 * log.info("clicked â€œAnsweredâ€? on the question he/she just activated");
 * Extentlog.log(LogStatus.INFO,
 * "clicked â€œAnsweredâ€? on the question he/she just activated");
 * PLD.click_Answeredlink(); Thread.sleep(3000); driver.close();
 * driver.switchTo().window(ParanetWindow); log.info("Switch tab to AWA");
 * Extentlog.log(LogStatus.INFO, "Switch tab to AWA"); PLD.RunlinkBtn();
 * PLD.click_AWP(); Thread.sleep(5000); for(String
 * childwindow:driver.getWindowHandles()) {
 * driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * log.info("Click on Technology and Corporate Communications");
 * Extentlog.log(LogStatus.INFO,
 * "Click on Technology and Corporate Communications"); PLD.ClickQA(); String
 * AWA=PLD.check_Answeredlinkstatus(); if(AWA.equalsIgnoreCase("true")) {
 * Assert.assertTrue(true,
 * "User should see â€œAnsweredâ€? on the question He/She just marked as answered."
 * ); log.
 * info("User should see â€œAnsweredâ€? on the question He/She just marked as answered."
 * ); Extentlog.log(LogStatus.PASS,
 * "User should see â€œAnsweredâ€? on the question He/She just marked as answered."
 * ); } else { Assert.assertTrue(false,
 * "User should not see â€œAnsweredâ€? on the question He/She just marked as answered. "
 * ); log.
 * info("User should not see â€œAnsweredâ€? on the question He/She just marked as answered."
 * ); Extentlog.log(LogStatus.FAIL,
 * "User should not see â€œAnsweredâ€? on the question He/She just marked as answered."
 * ); }
 * 
 * driver.close(); driver.switchTo().window(ParanetWindow);
 * 
 * PLD.click_Projectorpannel(); log.info("Switch tab to Projector Panel");
 * Extentlog.log(LogStatus.INFO, "Switch tab to Projector Panel"); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000);
 * PLD.Select_projectPanneloption(); log.
 * info("Clicked on Technology and Corporate Communications under projector pannel"
 * ); Extentlog.log(LogStatus.INFO,
 * "Clicked on Technology and Corporate Communications under projector pannel");
 * String active1=driver.findElement(By.xpath(
 * "/html/body/div/div[1]/div/div[12]/div/span/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div"
 * )).getAttribute("data-html"); System.out.println(active);
 * if(active1.equalsIgnoreCase("true")) { Assert.assertTrue(true,
 * "user should not see this question anymore"); System.out.println(active);
 * log.info("ser should not see this question anymore");
 * Extentlog.log(LogStatus.PASS, "ser should not see this question anymore");
 * 
 * } else { System.out.println(active); Assert.assertTrue(false,
 * "user should see this question"); log.info("user should see this question");
 * Extentlog.log(LogStatus.FAIL, "user should see this question"); } }
 * 
 * 
 * 
 * 
 * 
 * 
 * //////////////////////Sending an
 * Announcement//////////////////////////////////////////////
 * 
 * @Test(priority=3 ,enabled=false,dataProvider="userData1") public void
 * Sending_Announcement(String messagetext,String name) throws
 * InterruptedException { Extentlog = extent.startTest("Sending_Announcement");
 * Extentlog.log(LogStatus.INFO, "user login to applciation"); CybexLoginPage
 * PLD=new CybexLoginPage(); log=Logger.getLogger("devpinoyLogger");
 * log.info("Opening Brwoser "); prop.getProperty("browser");
 * PLD.click_Notification(); PLD.click_Event(); PLD.click_ConfirmationBox();
 * String ParanetWindow= driver.getWindowHandle(); PLD.click_Adminpannel();
 * log.info("Clicked on Admin Pannel option"); Extentlog.log(LogStatus.INFO,
 * "Clicked on Admin pannel option"); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}
 * log.info("Clicked on the loudspeaker icon on the top right");
 * Extentlog.log(LogStatus.INFO,
 * "Clicked on the loudspeaker icon on the top right");
 * PLD.Click_LoudspeakerBtn(); PLD.AnnouncementTestBox.sendKeys(messagetext);
 * //PLD.Click_AnnouncementTextBox(); log.info("Entering Announcement message");
 * Extentlog.log(LogStatus.INFO, "Entering Announcement message");
 * PLD.Click_Saveforlater(); log.info("Clicked on save for later button");
 * Extentlog.log(LogStatus.INFO, "Clicked on save for later button");
 * PLD.click_AnnouncementsendBTn();
 * log.info("Clicked on send and confirm button"); Extentlog.log(LogStatus.INFO,
 * "Clicked on send and confirm button"); PLD.click_ConfirmBTn();
 * driver.close(); driver.switchTo().window(ParanetWindow); PLD.RunlinkBtn();
 * log.info("clicked on AWP option under run section");
 * Extentlog.log(LogStatus.INFO, "clicked on AWP option under run section");
 * PLD.click_AWP(); Thread.sleep(3000); for(String
 * childwindow:driver.getWindowHandles())
 * {driver.switchTo().window(childwindow);}Thread.sleep(5000); try{
 * log.info("clicked on close button under AWP page");
 * Extentlog.log(LogStatus.INFO, "clicked on close button under AWP page");
 * PLD.click_AWAcloseBtn(); Assert.assertTrue(true);
 * log.info("Test case passed "); Extentlog.log(LogStatus.PASS,
 * "testcase pass"); } catch(Exception e) { Assert.assertTrue(false);
 * log.info("Test case failed message pop up not display on AWP screen ");
 * Extentlog.log(LogStatus.FAIL,
 * "Test case failed message pop up not display on AWP screen "); }
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 */