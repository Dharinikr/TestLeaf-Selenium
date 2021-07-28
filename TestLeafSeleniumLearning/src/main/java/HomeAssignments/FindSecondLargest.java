package HomeAssignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int values[]= {3,2,11,4,6,7};
		
		Arrays.sort(values);
		
		for (int i =0; i<values.length ; i++)
		{

	      System.out.println("Sorted array : "+ values[i]);
		 
	}		
		System.out.println("Second Largest num: " +  values[4]);

	}

}
