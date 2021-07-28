package week1.day1;

public class Callingglobalvariables
{ 
	
	long mobNumber = 123456789L;
	String mobColour = "Brown";
	double mobWeight = 1.2;
	Boolean isRefubrished = true;
	

	public static void main(String[] args) {
		
		Callingglobalvariables mobSpec = new Callingglobalvariables();
		
		System.out.println(mobSpec.mobNumber);
		System.out.println(mobSpec.mobColour);
		System.out.println(mobSpec.mobWeight);
		System.out.println(mobSpec.isRefubrished);
	}

}
