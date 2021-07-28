package week9.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static  void main(String[] args) {
		
		Map<Integer, String> values = new LinkedHashMap<Integer, String>();
		
		//to assign values values.put(Key, value)
		
		values.put(100, "Babu");
		values.put(300, "Sarath");
		values.put(200, "Hari");
		values.put(500, "Naveen");
		values.put(400, "Sam");
		//it takes latest value
		values.put(200, "Dhivya");
		values.put(200, "Bowya");
		//values can be same, but keys has to be unique, else it will take only the latest one
		values.put(600, "Hari");
		
		
		//to get value using key
		System.out.println(values.get(200));// it prints the latest value
		
		System.out.println("-----------------");
		
		//to print all 
		System.out.println(values);
		
		System.out.println("-----------------");
		
		//converting the key and value into entry and add those into set
		Set <Entry<Integer, String>> entrySet = values.entrySet();
		
		for (Entry<Integer, String> eachEntry : entrySet) {
			
			System.out.println(eachEntry);
		}
			
			/*//to print only value
			System.out.println(eachEntry.getValue());
			
			//to print only key
			System.out.println(eachEntry.getKey());
			
			//to get both
			System.out.println(eachEntry.getKey() + "-->" + eachEntry.getValue());*/
		}
	
	
	
	
	
}
