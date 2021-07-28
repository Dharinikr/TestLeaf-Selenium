package week6.day1.testNgDay3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	
	@Test
	//@Test(retryAnalyzer = RetryFailedTestCase.class)
	public void createLead() {
		System.out.println("Create Lead");
		//deliberately making this test case fail
		throw new NoSuchElementException();
		
	}
	
	@Test
	//@Test(retryAnalyzer = RetryFailedTestCase.class)
	public void editLead() {
		System.out.println("Edit Lead");
	}

}
