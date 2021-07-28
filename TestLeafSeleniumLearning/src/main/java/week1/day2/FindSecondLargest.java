package week1.day2;


import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int dataSize = data.length;
		System.out.println("The size of the data array is " + dataSize);
		
		System.out.println("-----------------------");
		 
		for(int i=0; i<dataSize; i++)
    	 { 
    		 System.out.println(data[i]);

     
     }
		System.out.println("-----------------------");
		
				//to find second largest
		//System.out.println(data[4]);--hard coded
		System.out.println("The second largest number is " + data[dataSize-2]);
		
		

		/*for(int i=0; i<data.length-2; i++) { 
	
			System.out.println(data[i]);
   		}*/
		 
		
		
		
	}

}
