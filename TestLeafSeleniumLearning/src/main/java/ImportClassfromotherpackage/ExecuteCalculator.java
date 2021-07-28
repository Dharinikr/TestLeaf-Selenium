package ImportClassfromotherpackage;
//keyword packagename.classname
import week1.day2.Calculator;

public class ExecuteCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int addition=calc.add(10,20);
		System.out.println(addition);

		int subtraction=calc.sub(30,20);
		System.out.println(subtraction);

		double multiplication=calc.mult(30.2,20.3);
		System.out.println(multiplication);
	}

}
