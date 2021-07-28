package week1.day2;

public class MyCalculator {

        public int divide(int a, int b) {
			return a/b;
		}
		
		/*HOW TO CALL METHODS FROM OTHER CLASS
		 IN THIS MyCalculator class we are CALLING METHODS
		STORED IN Calculator class.MAIN METHOD CANNOT BE CALLED
		FROM OTHER CLASS. OTHER METHODS CAN BE CALLED*/
		
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int addition=calc.add(10,20);
		System.out.println(addition);

		int subtraction=calc.sub(30,20);
		System.out.println(subtraction);

		double multiplication=calc.mult(30.2,20.3);
		System.out.println(multiplication);
	
		/*NEED TO CREATE OBJECT TO EXECUTE DIVIDE METHOD, BECAUSE IT
	 IS NOT IN MAIN METHOD. ALSO WE CANNOT USE THE OBJECT calc, 
	 BECAUSE IT HAS BEEN CREATED IN DIFFERENT CLASS
	 */
	
		MyCalculator mc = new MyCalculator();
		int division=mc.divide(20,4);
		System.out.println(division);
	}
	
}
