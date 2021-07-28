package week8.day1;

import java.io.FileInputStream;

public class LearnExceptionHandling1 {
	
	public int divide(int num1, int num2 ) {
		int result;
		if(num2>num1) {
			throw new ArithmeticException("wrong input:give first number as greater and second as smaller");
		}
			
		
		result = num1/num2;
		return result;
	}
	
	public static void fileHandling() throws Exception {
		
		FileInputStream fis = new FileInputStream("./data/CreateLead.xlsx");

}

	public static void main(String[] args) {
		
		LearnExceptionHandling1 leh = new LearnExceptionHandling1();
		
		int divide = leh.divide(10, 15);
		
		System.out.println(divide);
	try {
		fileHandling();
		
	}

	catch (Exception e){
		System.out.println(e);
	}
}
}
