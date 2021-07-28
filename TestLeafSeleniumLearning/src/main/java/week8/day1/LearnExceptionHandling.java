package week8.day1;

public class LearnExceptionHandling {
	
	
	public static void main(String[] args) {
		int num1=10;
		int num2 = 0;
		int result;
		int[] values= {10,20,30};
		
		try {
			result=num1/num2;
			System.out.println(result);
			System.out.println(values[3]);
		}
		
		/*//inner try catch
		try {
			System.out.println(values[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}*/
		
		catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block always getting exected");
		}
		
System.out.println("End of program");
	}

}
