package week1.day2;

public class Calculator {

	public int add(int a, int b) {
       
		return a+b;
       
	}

	public int sub(int x, int y) {
	       
		return x-y;
       
	}

	public double mult(double m,double n) {
	       
		return m*n;
       
	}
public static void main(String[] args) {
	
Calculator calc = new Calculator();
 
int addition=calc.add(10,20);
System.out.println(addition);

int subtraction=calc.sub(30,20);
System.out.println(subtraction);

double multiplication=calc.mult(30.2,20.3);
System.out.println(multiplication);

/*method name can be used as variable name. difference is 
method name ends with(). add--variable name
add()--method name
int add=calc.add(10,20);
System.out.println(add); */




}

}
