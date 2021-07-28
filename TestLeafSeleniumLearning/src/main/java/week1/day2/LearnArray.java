package week1.day2;

import java.util.Arrays;

public class LearnArray {
	
	/*Array is an container to save multiples values of same 
	data type in single variable. Limitation in array is we need
to define the size of the array in the beginning itself 
	and if there is change we need to do it manually*/

     public static void main(String[] args) {
    	 int[] values = new int[3];
    	 
    	 values[0] = 10;
    	 values[1] = 15;
    	 values[2] = 20;
    	 System.out.println(values[1]);
    	 System.out.println("-----------------");
    	 
    	 //last index=size of array-1
    	
    	 //ANOTHER WAY OF DECLARING ARRAY
    	 
    	 int[] values1 = {10,20,30,40};
    	 System.out.println(values1[1]);
    	 System.out.println("-----------------");
    	 
    	 /*TO KNOW SIZE OF ARRAY.length is a property to 
    	 calculate the size of array*/
    	
    	 int[] values2 = {10,20,30,40,50,60,70,80,90,100};
    	 int arraySize = values2.length;
    	 System.out.println("The size of array is " + arraySize);
    	 System.out.println("-----------------");
    	 
    	 //TO GET LAST ITEM/VALUE PRINTED IN ARRAY: arrayname[index]--- index is arraysize-1
    	// System.out.println(values2[9]);
    	System.out.println(values2[arraySize-1]);
    	 System.out.println("-----------------");
    	 
    	 //TO PRINT ALL VALUES IN THE ARRAY
    	 
    	 for(int i=0; i<values.length; i++)
    	 { 
    		 System.out.println(values[i]);
     
     }
    	 System.out.println("-----------------");
     
		//TO PRINT ARRAY IN REVERSE ORDER
    	 
    	 for(int i=values.length-1; i>=0; i--)
    	 { 
    		 System.out.println(values[i]);
     
     }
    	 System.out.println("-----------------");
    	 
    	 //TO SORT THE ARRAY IN ASCENDING ORDER
    	 
    	 Arrays.sort(values);
    	 
    	 for(int i=0; i<values.length; i++)
    	 { 
    		 System.out.println(values[i]);
     
     }
    	 System.out.println("-----------------");

    	 //TO SORT THE ARRAY IN DESCENDING ORDER
    	 
    	 for(int i=values.length-1; i>=0; i--)
    	 { 
    		 System.out.println(values[i]);
     
     }
    	 
     
	}
}



