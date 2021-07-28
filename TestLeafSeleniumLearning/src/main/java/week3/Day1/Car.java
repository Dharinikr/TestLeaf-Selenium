package week3.Day1;

public class Car extends Vehicle {

	
	public void switchOnAc() {
	System.out.println("switch on AC");
	
	}
	public static void main(String[] args) {
		
Car myCar = new Car();

//extends is the keyword with that we can call other class by creating one object.myCar is the object created
//if we create object for child class then we can access object in both parent and child class
//to call Car class we need to create a object, to call vehicle class we need to create another object in this main method.extends keyword is used to create an object with which both methods can be called
myCar.applyBrake();
myCar.soundHorn();
myCar.switchOnAc();


// to call vehicle class we need to create other object in main method. so we are using extends keyword above with that one object created can be used for both car and vehicle class 
//example if we create object only for parent class we cannot access child class
Vehicle myVeh = new Vehicle();
myVeh.applyBrake();
myVeh.soundHorn();

	}

}
