package Staging.com.cybex.pages;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import Staging.com.cybex.base.Base;


public class CybexLoginPage extends Base{
	static Logger log;
	
	
	public CybexLoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}	
	
	

	///----------------------------Page Factory Cybex Login Page -----------------------------------------/////	
		
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public WebElement Email_Field;
	
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	public WebElement Password_Field;
	
	
	@FindBy(xpath="//button[@class='btn btn-site btn-block']")
	public WebElement Login_Btn;
	
	
	//@FindBy(xpath="/html/body/app-root/app-admin-panel-layout/app-admin-panel-header/header/div/div/div[2]/div/ul/li[2]/span[2])")
	
	@FindBy(xpath="//span[@class='user-name']")
	public WebElement ProfileIcon;
	
	@FindBy(xpath="//*[@id=\'dropdown-basic\']/li[2]/a")
	//@FindBy(xpath="/a[@class='dropdown-item' and text()='Logout']")
	public WebElement LogOut_Btn;
	
	@FindBy (xpath="//a[@class='btn-end']")
	public WebElement End_Tour;
	
	public void Clicking_LoginBtn ()
	
	{
		
		WebDriverWait wait=new WebDriverWait(driver,4000);
		flash(Email_Field,driver);
		Email_Field.sendKeys("bhardwajhack@gmail.com");

		flash(Password_Field,driver);
		Password_Field.sendKeys("Amit@12345");
		
		
		WebElement LoginButton=wait.until(ExpectedConditions.elementToBeClickable(Login_Btn));
		flash(Login_Btn,driver);
		LoginButton.click();
		flash(End_Tour,driver);
		End_Tour.click();
		
	}
	
public void Clicking_LogoutBtn () throws InterruptedException
	
	{
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		flash(ProfileIcon,driver);
		ProfileIcon.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		flash(LogOut_Btn,driver);
		LogOut_Btn.click();
	}
		

	
	
	
	
///----------------------------Page Factory -----------------------------------------/////	
	
	
	
	/*
	 * @FindBy(xpath="//span[@class='icon icon-tick']") public WebElement GotIt;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//*[contains(@title,'2018 Asia Leadership Conference')]")
	 * WebElement EventName;
	 * 
	 * @FindBy(xpath="//div[@class='confirmation-btn' and //@class='icon-tick']")
	 * WebElement ConfirmationBox;
	 * 
	 * @FindBy(
	 * xpath="//div[@class='btn btn-secondary quick-run-button dropdown-toggle']")
	 * WebElement Runlinks;
	 * 
	 * @FindBy(xpath="//a[text()='Audience Web App']/@href") WebElement
	 * AudienceWebApp;
	 * 
	 * @FindBy(xpath="//a[@class='sessionlist-item-enter-button session-qna']")
	 * WebElement EnterQandA;
	 * 
	 * 
	 * @FindBy(
	 * xpath="//textarea[@class='question-input' and @placeholder='Enter your question here...']"
	 * ) public WebElement EnterQuestion;
	 * 
	 * @FindBy(xpath="//div[@class='question-input-btn-content']") WebElement
	 * AskButton;
	 * 
	 * @FindBy(xpath="//button[@class='btn btn-primary modal-btn modal-btn-ok']")
	 * WebElement SubmitQuestion;
	 * 
	 * @FindBy(xpath="//div[@class='question-content allow-user-select']")
	 * WebElement SubmittedQuestion;
	 * 
	 * @FindBy(xpath="//div[@class='question-vote-count']") WebElement Vote_count;
	 * 
	 * @FindBy(
	 * xpath="//div[@class='icon icon-qna-vote-outline question-vote-triangle']")
	 * WebElement Vote_Icon;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[8]/div/div[4]/div/div/div[1]/div[4]")
	 * WebElement Total_Vote_count;
	 * 
	 * @FindBy(linkText="Admin Panel") WebElement ClickAdminpannel;
	 * 
	 * @FindBy(linkText="Projector Panel") WebElement ClickProjectorpannel;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[1]/div[3]/div[4]/div/div/div[3]/div/div/div[3]/div/div[1]/div/a/div/div[2]/div[4]/span")
	 * WebElement ClickAdminpannelfirstoption;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[6]/div/div[3]/div/div[1]/div/div/div[1]/div/div[2]/label/div[2]")
	 * WebElement CrossIcon;
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[6]/div/div[3]/div/div[1]/div/div/div[1]/div/div[2]/label/div[1]")
	 * WebElement TickIcon;
	 * 
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[6]/div/div[3]/div/div[4]/div/div[1]/div/div/div[2]/div[2]/div[3]/div[1]")
	 * public WebElement Question_Admin;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[8]/div/div[4]/div/div/div[2]/div[1]/div[2]")
	 * public WebElement Question_AWA;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[1]/div[3]/div[4]/div/div/div[3]/div/div/div[3]/div/div[1]/div/a/div/div[2]/div[4]/span")
	 * WebElement ClickProjectorpannelfirstoption;
	 * 
	 * @FindBy(xpath="//div[@class='qna-content']") WebElement
	 * QustiononProjectorpannel;
	 * 
	 * @FindBy(xpath="//*[@id]/div[4]/label/input") WebElement
	 * QuestionfilteringChkBox;
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[6]/div/div[3]/div/div[1]/div/div/div[1]/div/div[2]/label/div[1]")
	 * WebElement QuestionfilteringTick;
	 * 
	 * @FindBy(xpath="//button[@type='submit']") WebElement SaveQABtn;
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div[2]/div/div[5]/div/div[5]/div/div[3]/ul/div[1]/li/div/div[2]/div[3]/div/a/span[1]")
	 * WebElement Editlink;
	 * 
	 * 
	 * @FindBy(xpath="/html/body/div[2]/div/div[5]/div/div[3]/ul/li[2]/label/a/div")
	 * WebElement AgendaLink;
	 * 
	 * @FindBy(xpath="//a[@class='header-nav-button header-nav-button-pigeonholes']"
	 * ) WebElement Pigeonholeslink;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[8]/div/div[4]/div/div/div[1]/div[2]")
	 * WebElement NoQuestion;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div[2]/div/div[5]/div/div[1]/div[2]/div/div[2]/a[1]") WebElement
	 * AWP;
	 * 
	 * 
	 * @FindBy(xpath="//a[@data-routename='question_awaiting']") WebElement
	 * PendingQ;
	 * 
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[6]/div/div[3]/div/div[4]/div/div[1]/div/div/div[4]/span[4]/div[3]")
	 * WebElement AllowBTn;
	 * 
	 * @FindBy(xpath="//a[@data-routename='question_allowed']") WebElement AllowQ;
	 * 
	 * @FindBy(xpath="//div[@class='content']") WebElement statusallow;
	 * 
	 * @FindBy(xpath="//span[@class='normal-icon icon-active']") WebElement
	 * ActiveIcon;
	 * 
	 * @FindBy(xpath="//span[@class='normal-icon icon-answered']") WebElement
	 * Answeredlink;
	 * 
	 * @FindBy(xpath="//span[@class='question-answered ']") WebElement
	 * Answeredlinkstatus;
	 * 
	 * 
	 * 
	 * 
	 * @FindBy(xpath="//span[@class='icon-loudspeaker']") WebElement
	 * LoudspeakerIcon;
	 * 
	 * @FindBy(
	 * xpath="//textarea[@class='announcement-message character-counter-input ']")
	 * public WebElement AnnouncementTestBox;
	 * 
	 * @FindBy(xpath="//button[@class='btn sidebar-tag-btn save-btn btn-tertiary']")
	 * WebElement BTnsaveforlater;
	 * 
	 * @FindBy(xpath="//span[@class='icon icon-send']") WebElement
	 * AnnouncementsendBTn;
	 * 
	 * @FindBy(xpath="//div[@class='btn btn-primary modal-btn modal-btn-ok ']")
	 * WebElement ConfirmBTn;
	 * 
	 * 
	 * @FindBy(xpath="//div[@class='model-bottom-section-button']") WebElement
	 * AWAcloseBtn;
	 * 
	 * @FindBy(xpath=
	 * "/html/body/div/div[1]/div/div[12]/div/span/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div")
	 * WebElement ProjectorBcode;
	 * 
	 */	
	///----------------------------Page Factory -----------------------------------------/////	
	
	
	
	
	
	
	
	///----------------------------Page Method -----------------------------------------/////	
	
	
	
	/*
	 * public void click_AWP() { flash(AWP,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(AWP));
	 * element.click();
	 * 
	 * }
	 * 
	 * public void click_Notification ()
	 * 
	 * { flash(GotIt,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(GotIt));
	 * element.click(); }
	 * 
	 * public void click_Event () { flash(EventName,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(EventName));
	 * element.click(); }
	 * 
	 * public void click_ConfirmationBox () { flash(ConfirmationBox,driver);
	 * WebDriverWait wait=new WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(ConfirmationBox));
	 * element.click(); }
	 * 
	 * public void ClickQA() { flash(EnterQandA,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(EnterQandA));
	 * element.click(); }
	 * 
	 * public void enterquestion() throws InterruptedException {
	 * flash(EnterQuestion,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(EnterQuestion));
	 * //element.sendKeys(TestA1); }
	 * 
	 * public String checkprojectorscreen() throws InterruptedException {
	 * flash(ProjectorBcode,driver); String status
	 * =ProjectorBcode.getAttribute("data-html"); Thread.sleep(3000); return status;
	 * 
	 * }
	 * 
	 * 
	 * public void AskButton() throws InterruptedException {
	 * flash(AskButton,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(AskButton));
	 * element.click();
	 * 
	 * }
	 * 
	 * public void SubmitQuestion() throws InterruptedException {
	 * flash(SubmitQuestion,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(SubmitQuestion));
	 * element.click();
	 * 
	 * }
	 * 
	 * 
	 * public void RunlinkBtn () throws InterruptedException {
	 * flash(Runlinks,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(Runlinks));
	 * element.click();
	 * 
	 * }
	 * 
	 * 
	 * public String gettext() throws InterruptedException {
	 * flash(SubmittedQuestion,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.visibilityOf(SubmittedQuestion));
	 * String question=element.getText().toString(); return question;
	 * 
	 * }
	 * 
	 * 
	 * public String Vote_count() throws InterruptedException {
	 * flash(Vote_count,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement element=wait.until(ExpectedConditions.visibilityOf(Vote_count));
	 * String Votecount=element.getText().toString(); return Votecount;
	 * 
	 * }
	 * 
	 * 
	 * public void click_voteicon() throws InterruptedException {
	 * flash(Vote_Icon,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(Vote_Icon));
	 * element.click();
	 * 
	 * }
	 * 
	 * public void click_Adminpannel() throws InterruptedException {
	 * flash(ClickAdminpannel,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(ClickAdminpannel))
	 * ; element.click(); } public void click_Projectorpannel() throws
	 * InterruptedException { flash(ClickProjectorpannel,driver); WebDriverWait
	 * wait=new WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(
	 * ClickProjectorpannel)); element.click(); }
	 * 
	 * public void click_Admin_pannel_firstoption() throws InterruptedException {
	 * flash(ClickAdminpannelfirstoption,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(
	 * ClickAdminpannelfirstoption)); element.click(); }
	 * 
	 * 
	 * 
	 * 
	 * public String Total_Vote_count() throws InterruptedException {
	 * flash(Total_Vote_count,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.visibilityOf(Total_Vote_count)); String
	 * TotalVotecount=element.getText().toString(); return TotalVotecount; }
	 * 
	 * public void Select_projectPanneloption() throws InterruptedException {
	 * flash(ClickProjectorpannelfirstoption,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(
	 * ClickProjectorpannelfirstoption)); element.click(); }
	 * 
	 * 
	 * public String verify_projectpannelquestiontext() throws InterruptedException
	 * { flash(QustiononProjectorpannel,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.visibilityOf(QustiononProjectorpannel))
	 * ; String Question=element.getAttribute("data-html"); return Question; }
	 * 
	 * 
	 * public String Verify_CrossIcon() throws InterruptedException {
	 * flash(CrossIcon,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement element=wait.until(ExpectedConditions.visibilityOf(CrossIcon));
	 * String Status=element.getAttribute("data-show"); return Status; }
	 * 
	 * public String Verify_TickIcon() throws InterruptedException {
	 * flash(TickIcon,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement element=wait.until(ExpectedConditions.visibilityOf(TickIcon));
	 * String Status=element.getAttribute("data-show"); return Status; }
	 * 
	 * public void Checked_Question_filtering() throws InterruptedException {
	 * flash(QuestionfilteringChkBox,driver); QuestionfilteringChkBox.click();
	 * Thread.sleep(3000); }
	 * 
	 * 
	 * public void Checked_Question_filteringTick() throws InterruptedException {
	 * flash(QuestionfilteringTick,driver);
	 * QuestionfilteringTick.getAttribute("data-show"); Thread.sleep(3000); }
	 * 
	 * public void Click_QABtn() throws InterruptedException {
	 * flash(SaveQABtn,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(SaveQABtn));
	 * element.click(); }
	 * 
	 * 
	 * 
	 * 
	 * public void Agenda_link() throws InterruptedException {
	 * flash(AgendaLink,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(AgendaLink));
	 * element.click(); }
	 * 
	 * public void Edit_link() throws InterruptedException { flash(Editlink,driver);
	 * WebDriverWait wait=new WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(Editlink));
	 * element.click(); } public void Pigeonholes_link() throws InterruptedException
	 * { flash(Pigeonholeslink,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(Pigeonholeslink));
	 * element.click();
	 * 
	 * }
	 * 
	 * 
	 * public String Checked_NO_Question_Display() throws InterruptedException {
	 * flash(NoQuestion,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement element=wait.until(ExpectedConditions.visibilityOf(NoQuestion));
	 * String NoQuestiontext=element.getAttribute("data-show"); return
	 * NoQuestiontext;
	 * 
	 * }
	 * 
	 * public void click_PendingQ() throws InterruptedException {
	 * flash(PendingQ,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(PendingQ));
	 * element.click(); }
	 * 
	 * public void click_AllowBTn() throws InterruptedException {
	 * flash(AllowBTn,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(AllowBTn));
	 * element.click();
	 * 
	 * }
	 * 
	 * public void click_Allowedlink() throws InterruptedException {
	 * flash(AllowQ,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(AllowQ));
	 * element.click(); }
	 * 
	 * public String check_statusallow() throws InterruptedException {
	 * flash(statusallow,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement element=wait.until(ExpectedConditions.visibilityOf(statusallow));
	 * String statusadmin=element.getAttribute("data-html"); return statusadmin; }
	 * 
	 * public void click_activelink() throws InterruptedException {
	 * flash(ActiveIcon,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(ActiveIcon));
	 * element.click(); }
	 * 
	 * public void click_Answeredlink() throws InterruptedException {
	 * flash(Answeredlink,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(Answeredlink));
	 * element.click(); } public String check_Answeredlinkstatus() throws
	 * InterruptedException { flash(Answeredlinkstatus,driver); WebDriverWait
	 * wait=new WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.visibilityOf(Answeredlinkstatus));
	 * String statusAnsweradmin=element.getAttribute("data-show"); return
	 * statusAnsweradmin; }
	 * 
	 * 
	 * 
	 * public void Click_LoudspeakerBtn() throws InterruptedException {
	 * flash(LoudspeakerIcon,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(LoudspeakerIcon));
	 * element.click(); }
	 * 
	 * 
	 * public void Click_AnnouncementTextBox() throws InterruptedException {
	 * flash(AnnouncementTestBox,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(
	 * AnnouncementTestBox)); element.
	 * sendKeys("A new or growing business may take this opportunity to market their establishment within their local community and to their fellow supporters."
	 * ); }
	 * 
	 * public void Click_Saveforlater() throws InterruptedException {
	 * flash(BTnsaveforlater,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(BTnsaveforlater));
	 * element.click(); }
	 * 
	 * public void click_AnnouncementsendBTn() throws InterruptedException {
	 * flash(AnnouncementsendBTn,driver); WebDriverWait wait=new
	 * WebDriverWait(driver,40); WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(
	 * AnnouncementsendBTn)); element.click(); }
	 * 
	 * public void click_ConfirmBTn() throws InterruptedException {
	 * flash(ConfirmBTn,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(ConfirmBTn));
	 * element.click();
	 * 
	 * 
	 * }
	 * 
	 * public void click_AWAcloseBtn() throws InterruptedException {
	 * flash(AWAcloseBtn,driver); WebDriverWait wait=new WebDriverWait(driver,40);
	 * WebElement
	 * element=wait.until(ExpectedConditions.elementToBeClickable(AWAcloseBtn));
	 * element.click(); } public void Option_Audience_WebApp () {
	 * 
	 * List<WebElement> list
	 * =driver.findElements(By.xpath("//div[@class='dropdown-menu']//a"));
	 * 
	 * 
	 * System.out.println(list.size()); for(int j =1;j<list.size();j++) {
	 * System.out.println(list.get(j).getText()); }
	 * 
	 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i).getText());
	 * if(list.get(i).getText().contains("Audience Web App")); list.get(i).click();
	 * break;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void Option_Projector_Panel () {
	 * 
	 * List<WebElement> list
	 * =driver.findElements(By.xpath("//div[@class='dropdown-menu']//a"));
	 * 
	 * 
	 * System.out.println(list.size());
	 * 
	 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i).getText());
	 * //if(list.get(i).getText().matches("Projector Panel"));
	 * if(list.get(i).getText().startsWith("Admin")); list.get(i).click(); break; }
	 * }
	 * 
	 * public void Option_Admin_panel() throws InterruptedException {
	 * Thread.sleep(4000); List<WebElement> list
	 * =driver.findElements(By.xpath("//div[@class='dropdown-menu']//a"));
	 * 
	 * 
	 * System.out.println(list.size());
	 * 
	 * for(int j =1;j<list.size();j++) { System.out.println(list.get(j).getText());
	 * }
	 * 
	 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i).getText());
	 * if(list.get(i).getText().contains("Admin Panel")); list.get(i).click();
	 * 
	 * } }
	 */
	public static void flash(WebElement element ,WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String BGcolor =element.getCssValue("backgroundColor");
		for(int i=0;i<2;i++)
		{
			ChangeColor("#008000",element,driver);
			ChangeColor(BGcolor,element,driver);
			
		}
	}
	
	public static void ChangeColor (String color ,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor ='"+color+"'", element);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
		
			
		}
		
	}

	public static void Wait()
	{
		
	}

	public void getcurrentwindow()
	
	{
	driver.get("https://staging-dashboard.pigeonlab.tech/api/test/accounts/create/account-captivate-live-with-sessions-no-participants?login=true");
    // Get current window handle
    String parentWinHandle = driver.getWindowHandle();
    System.out.println("Parent window handle: " + parentWinHandle);
    // Locate 'Click to open a new browser window!' button using id
    WebElement newWindowBtn = driver.findElement(By.id("win1"));
    // Click the button to open a new window
    newWindowBtn.click();
    // Get the window handles of all open windows
    Set<String> winHandles = driver.getWindowHandles();
    // Loop through all handles
    for(String handle: winHandles){
        if(!handle.equals(parentWinHandle)){
        driver.switchTo().window(handle);
        }
    }

}
}