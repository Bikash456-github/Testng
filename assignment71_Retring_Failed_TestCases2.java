package TestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
@Test
public class assignment71_Retring_Failed_TestCases2 implements IRetryAnalyzer
{
	int inititalcount=0;
	int retrycount=2;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(inititalcount<retrycount)
		{	
			inititalcount++;
		return true;
	}
		return false;
	}
	
	
	
	
	
	
}
