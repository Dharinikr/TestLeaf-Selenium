package week6.day1.testNgDay3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCase implements IRetryAnalyzer {
	
	int maxCount = 3;
	int retryCount = 0;

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retryCount < maxCount) {
		retryCount++;
		return true;
		
	}
		return false;
}
}
