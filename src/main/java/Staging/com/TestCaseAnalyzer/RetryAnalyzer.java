package Staging.com.TestCaseAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int counter =0;
	int retrylimtcount=0;
	public boolean retry(ITestResult result)
	{
		if(counter<retrylimtcount)
		{
			counter++;
			return true;
		}
		return false;
	}

}
