package week3.day2.homeassignments;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		char[] chArray = test.toCharArray();
		System.out.println(chArray);
		int length = chArray.length;
		System.out.println(length);
	
		for(int i = length-1;i>=0;i--) {
		System.out.print(test.charAt(i));
		}
		
	
		System.out.println("---------------------");
	
	//find char using index	
	
		
		int stringLength = test.length();
		System.out.println(stringLength);
		
		for(int j = stringLength-1;j>=0;j--) {
		
			}
		System.out.println(test.charAt(2));
	}
}
		
		
	
	
	