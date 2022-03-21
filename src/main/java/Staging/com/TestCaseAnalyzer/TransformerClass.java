package Staging.com.TestCaseAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class TransformerClass implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation annotation , Class testClass, Constructor testconstructor, Method testmethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
