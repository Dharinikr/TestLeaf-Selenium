package week3.Day1;

public class SbiMdu extends SbiHO {
	
	
	public void fixedDeposit(int rate) {
		System.out.println("child class: " + rate);
	}


	

	public static void main(String[] args) {
		 SbiMdu sm = new SbiMdu();
		 sm.fixedDeposit(10);
	}

}