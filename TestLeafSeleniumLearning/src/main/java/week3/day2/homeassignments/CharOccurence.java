package week3.day2.homeassignments;

public class CharOccurence {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count=0;
		char check='e';
		
		char[] charArray = str.toCharArray();
		int length=charArray.length;
		System.out.println("Array Length:"+ length);
		for(int i=0;i<length;i++) {
		if(charArray[i]==check) {
			
			count = count+1;//count++;
		}
		}
		System.out.println("Character Occurence is:"+count);
		
	
		
		/*char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			System.out.println(ch);
			
		}
		
		int length = str.length();
		System.out.println(length);
		
		for(int i=0;i<length;i++) {
			
			if(charArray==check) {
			i++;
			
				}
			System.out.println(i);
		
		}
		*/
	}

}
