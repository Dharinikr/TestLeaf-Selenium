package week3.Day1;

public class ChildClass extends Parent1{

	//public class ChildClass extends Parent1, Parent2- cannot put like this. Multiple inheritance not availble in class level
	
	public void childMethod() {
		System.out.println("child method");
	}
	
	
	
	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		cc.childMethod();
		cc.commonMethod();

	}

}
