package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//SET wouldn't execute duplicate values
		//Hashset wouldn't maintain the order
		Set<String> values = new HashSet<String>();
		values.add("Hari");//index of first item 0
		values.add("Dhivya");
		values.add("Bowya");
		values.add("Sam");
		values.add("Naveen");//index of last item= size()-1
		values.add("Hari");//it WON'T allow/execute duplicate value, Hari is declared twice. but one only executed. it will only execute first one
		
		System.out.println(values.size());
		
		System.out.println("-------------------");
		
		for(String eachValue : values) {
			System.out.println(eachValue);
		}
		
		
		System.out.println("-------------------");
		
		//LinkedHashset maintains the order
		Set<String> values1 = new LinkedHashSet<String>();
		values1.add("Hari");//index of first item 0
		values1.add("Dhivya");
		values1.add("Bowya");
		values1.add("Sam");
		values1.add("Naveen");//index of last item= size()-1
		System.out.println(values1.add("Hari"));//it WON'T allow/execute duplicate value, Hari is declared twice. but one only executed
		//it executes only true value. if it duplicate it executes false.
		
		for(String eachValue : values1) {
			System.out.println(eachValue);
		}
		System.out.println("-------------------");
		
		
		//Treeset-execute the list in sorted order 
				Set<String> values2 = new TreeSet<String>();
				values2.add("Hari");//index of first item 0
				values2.add("Dhivya");
				values2.add("Bowya");
				values2.add("Sam");
				values2.add("Naveen");//index of last item= size()-1
				values2.add("Hari");
				
				for(String eachValue : values2) {
					System.out.println(eachValue);
				}
				System.out.println("-------------------");
				
				
			//set is an implementation class. \in this datas are not stored based on index value. So get() method option is not
			//available in set. So to get a single value, we can copy the data in 'list' and then execute.
				
			List <String> listValues = new ArrayList<String>(values1);
			System.out.println(listValues.get(2));
				
	}

}
