package week3.Day1;

public class BMW extends Car{
	
	public void airBags() {

	System.out.println("safety air bags");
	}	
		public static void main(String[] args) {
BMW bmw = new BMW();
 

bmw.airBags();
bmw.applyBrake();
bmw.soundHorn();
bmw.switchOnAc();

	}

}
