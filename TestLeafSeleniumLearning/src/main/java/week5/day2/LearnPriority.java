package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	//priority with least value executes first and then in ascending order. can give 0 and also negative value
	//priority can only be used in class level. it cannot be used in xml
	@Test(priority = 1)   //-> 1
	public void createLead() {
		System.out.println("CreateLead");
	}
	
	@Test(priority =3 ) // -> 3
	public void editLead() {
		System.out.println("EditLead");
	}
	
	@Test(priority = 2)// -> 2
	public void mergeLead() {
		System.out.println("MergeLead");
	}

}
