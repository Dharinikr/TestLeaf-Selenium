package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority1 extends LearnPriority {
	
	@Test(priority = 4)   
	public void createLead1() {
		System.out.println("CreateLead1");
	}
	
	@Test(priority =6 ) 
	public void editLead1() {
		System.out.println("EditLead1");
	}
	
	@Test(priority = 5)
	public void mergeLead1() {
		System.out.println("MergeLead1");

}
}
