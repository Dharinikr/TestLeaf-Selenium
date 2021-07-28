package week3.day2.homeassignments;

public class test {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] ch = test.toCharArray(); 
		for(int i= ch.length -1; i >=0; i--) {
			System.out.print(ch[i]);

		}

		for(int i= test.length()-1; i >=0; i--) {
			System.out.println(test.charAt(i));

		}
	}

}
