package week3.Day1;

public class Employees {

	String empName;
	int empID;
	
	Employees(){
		this(300);
	empName = "DD";
	empID = 100;
	System.out.println("execute first");
	}
	
	
	
	   Employees(String empName, int empID){
		
		this();
		System.out.println("parameterized constructor");
		this.empName = empName;
		this.empID = empID;
	
		
		//this is a keyword used to declare same name in both global and local variable. this keyword used to describe the variable as  global variable
	}
	   
	
	Employees(int empID){
		System.out.println("constructor with one argument");
	}
	
	
	
	
	
	
		public static void main(String[] args) {
		
		//classname objName = new constructor
		Employees emp = new Employees("prasad", 200);
		
		//if we put Employees emp = new Employees(); it executes default constructors.
		//what type of constructor we put, that will be executed
		//constructor first execute parent constructor and then child constructor
		
		System.out.println(emp.empName);
		System.out.println(emp.empID);

	}

}
