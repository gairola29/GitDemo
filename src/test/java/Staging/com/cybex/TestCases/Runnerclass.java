package Staging.com.cybex.TestCases;


import org.testng.TestNG;
import Staging.com.cybex.TestCases.CybexHomePageTest;
import Staging.com.ExtentReportListener.ExtentReportListener;



public class Runnerclass {
	
	static TestNG testNg;
	
	public static void main(String[] args) {
		
		ExtentReportListener ext = new ExtentReportListener();
		
		testNg =new TestNG();
		testNg.setTestClasses(new Class[]{CybexHomePageTest.class});
		testNg.addListener(ext);
		testNg.run();
		
		
		
		
		
	}

}
