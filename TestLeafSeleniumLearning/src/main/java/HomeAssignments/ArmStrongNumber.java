package HomeAssignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		
		int orgValue = input;
		
		int rem;
		int calculated = 0;
		
		while(input >0)
		{
			rem= input % 10; //3//2
			
			calculated= calculated + (rem*rem*rem);//3//5
			input = input/10;//12//1
			
			
		}	
		if (calculated == orgValue) {
		
			System.out.println("ArmStrong Number");
			
		}
		else
		{
			System.out.println("Not an ArmStrong Number");
}
	}
}
