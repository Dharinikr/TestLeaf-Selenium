package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	
		// list is an interface. values is a varible reference to the interface. ArrayList is constructor  of implemented class
		List value = new ArrayList();
		

		//add is the method to add values into list
		value.add("Hari");//index of first item is 0
        value.add(100);
        value.add(true);
        value.add('T');
        value.add(5345.557);//index of the last item is size()-1
	
        System.out.println("----------------");
	   
        //to get number of items
        int count = value.size();
        System.out.println(count);
        System.out.println("----------------");
       
        //to get one item from list
        System.out.println(value.get(2));
        System.out.println("----------------");
     
        //to print in particular order
        for (int i=0;i<count;i++) {
	    System.out.println(value.get(i));
        }
        System.out.println("----------------");
        
        //if we need to add the same data type in list, then generic is used .<>
        
     List<String> values1 = new ArrayList();
     List<String> newValues = new ArrayList();
   
     values1.add("Hari");
     values1.add("Dhivya");
     values1.add("Bowya");
     values1.add("Sam");
     values1.add("Naveen");
     values1.add("Hari");//it allows duplicate value
     System.out.println(values1);
     System.out.println("----------------");
     
     //to remove item using index
       values1.remove(2);
       System.out.println("----------------");
     
       //to remove item using object 
       values1.remove("Sam");
       System.out.println("----------------");

       //List<int> values1 = new ArrayList(); List will not accept primitive data type like int. for that we need to use wrapper class
    List<Integer> values2 = new ArrayList<Integer>();
	values2.add(12);
	values2.add(13);
	values2.add(14);
	System.out.println(values2);
	 System.out.println("----------------");
	
	 //foreach concept & syntax : for(dataType tempVariable:sourceVariable){}
	//temporary variable name format has to be given same as the data type
	
	 for(String eachValue : values1) {
		
		System.out.println(eachValue);
	}
	 System.out.println("----------------");
	 
        //to remove value using foreach
	 for(String eachValue : values1) {
		
	if(eachValue.equals("Naveen")) {
			values1.remove("Naveen");
		}
		for(String eachVal : values1) {
			System.out.println(eachVal);
			
		}
	
	
	}
	 System.out.println("----------------");
	 
	 //to copy one collection to other collection, addAll() is the method to copy or we can give in the constructor itself

	 newValues.addAll(values1);
	System.out.println(newValues);
	
	System.out.println("----------------");
	 
	 //retain all matching items 
	newValues.retainAll(values1);
	
	System.out.println("----------------");
	
	//to remove all the matching items
	//newValues.removeAll(values1);
	
	System.out.println("----------------");
	
	//to sort the list in ascending order-Collections.sort(List); Collections-plural- anything plural is class. Collection-singular it is an interface
	Collections.sort(newValues);
	System.out.println(newValues);
	System.out.println("----------------");
	
//to do in reverse order-Collections.reverse(newValues)
	Collections.reverse(newValues);
	System.out.println(newValues);
	
	//methods are same in Array List and Linked List
	//List<String> values1 = new ArrayList<String>(); same as List<String> values1 = new LinkedList<String>();
	

	}
}
