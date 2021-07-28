package week1.day1;

//how to call methods in main methods example
public class Car {
	
	//syntax:
	//Access specifier returnType Method(){}
	
	public static void driveCar() {
		
		System.out.println("drive a car");	
		
		System.out.println("----------------");
		
		applyBrake();	
	}
	
	public static void applyBrake() {
		
		System.out.println("brake applied");	
		
		System.out.println("----------------");
		
	}
	
	public static void main(String[] args) {
		
	//Syntax for calling other methods in main method:
		//Classname.Objectname=new Classname();
		
		Car myCar=new Car();
		myCar.driveCar();
		
		
		Car myMobile=new Car();
		myMobile.applyBrake();
		
	/* we can call one method in another method without 
		creating object. Only in main method we need to create 
		object to call another method.*/
		
      }
	}


