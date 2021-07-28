package week1.day2;

public class SumOfEachDigit {

	public static void main(String[] args) {

		int input = 123;
		int sum = 0;
		int rem;
		
		// 123/10=12
		//123%10=3
		
		while (input>0)
		{
			rem= input % 10; //3//2
			
			sum = sum+rem;//3//5
			input = input/10;//12//1
			
			
		}		System.out.println(sum);
	}

}
