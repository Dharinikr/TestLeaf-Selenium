package week3.day2.homeassignments;

public class ChangeOddindextoUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			if(i % 2 != 0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
			//updatedString.append(c);

			//System.out.println("Modified string is: " + updatedString.toString());
		}
			System.out.println((ch));

	}

}
