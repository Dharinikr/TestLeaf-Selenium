package week3.day2.classassignment;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String[] companies = {"TCS","Wipro","Infosys","FIS","TCS","Wipro"};

		Set<String> values = new LinkedHashSet<String>();
		
		 
		 for(String eachData : companies) {
			 values.add(eachData);
		 }
		 
		 System.out.println(values);
		
		 
		 for(String eachValue : values) {
			 
			 System.out.println(eachValue);
					 }
		 
		 //to sort the array
		Set<String> sortedvalues = new TreeSet<String>(values);
		 for (String ascii : sortedvalues) {
				
		}
		 System.out.println(sortedvalues);
		 
		 for (String sortedascii : sortedvalues) {
			 System.out.println(sortedascii);
		}
		 

	}

}
