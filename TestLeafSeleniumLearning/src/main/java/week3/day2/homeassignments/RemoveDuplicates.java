package week3.day2.homeassignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";		
		int count = 0;
		String[] strWords = text.split("\\s+");
	
		LinkedHashSet<String> newtext = new LinkedHashSet<String>( Arrays.asList(strWords) );
		StringBuilder sbTemp = new StringBuilder();
		for(String s : newtext){
			
			
		    if(count > 0)
		        sbTemp.append(" ");

		    sbTemp.append(s);
		    count++;
		}

		text = sbTemp.toString();

		System.out.println("String after removing duplicate words: "+text);


	}

}
