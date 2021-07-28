package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		
	    //string is a class which can be declared in 2 ways
		
		//decalred using literal string
		String str1 = "welcome";
		
		//if we give same value stored in different variable, as data is same it saves in the same address
		String str2 = "welcome";
		
		
		String str3= "Welcome";
		
		//using new keyword
		String str4= new String("Welcome");
		
		//in String double equals == used to compare address 
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		
		System.out.println("----------------");
		
		//in String, equals is the method used to compare values
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		System.out.println("----------------");
		
		//to ignore case sensitivity and check
		System.out.println(str1.equalsIgnoreCase(str3));
		
		System.out.println("----------------");
		
		//to check how many characters in string. There is a method called length(). index starts from 0
		System.out.println(str1.length());
		
		System.out.println("----------------");
		
		//charAt() is a method in String used to get particular value by providing the index
		System.out.println(str1.charAt(3));
		
		System.out.println("----------------");
		
        //to get last character
		System.out.println(str1.charAt(str1.length()-1));
		
		System.out.println("----------------");
		
		//to print one letter in each line -use for loop
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("----------------");	
		
		//to print in reverse order
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
		
		System.out.println("----------------");	
		
		//toCharArray() method is used to get each character in the string. it will convert string into char array
		//charAt() and toCharArray are used for the same purpose of getting each character in the string
		
		char[] charArray = str1.toCharArray();
		for(char ch:charArray) {
		System.out.println(ch);
		}
		
		System.out.println("----------------");	
		
		//to find number of words in a sentence. it is based on the space. these words in the sentence are seperated by space
		String str5 = "welcome to the java session";
		String[] words = str5.split(" ");
		System.out.println(words.length);
		
		System.out.println("----------------");
		
		//to print each word in the sentence
		for(String eachWord:words) {
			System.out.println(eachWord);
		
		}
		
		//to remove the duplictae words
		//String str6 = "welcome to the java session to the online session";store this in array and use SET to remove duplicate value
		
		//to replace old character with new character
		
		System.out.println("----------------");
		String str7 = "WELcome";
		String replace=str7.replace('e', '£');
		System.out.println(replace);
		
	//to replace words
		System.out.println("----------------");
		String str8 = "welcome to the java session in the testleaf";
	    String replaceAll = str8.replaceAll("the","a");
	    System.out.println(replaceAll);
	    
	    //to print part of the word using substring() using index 
	    System.out.println("----------------");
		String str9 = "welcome";
		String substring = str9.substring(2);
		System.out.println(substring);
	
		//to print part of the word using substring() using start and end index;  substring will not consider end index it stops at end index-1
		System.out.println("----------------");
	    System.out.println(str9.substring(2, 6));
	}
	
	

}
