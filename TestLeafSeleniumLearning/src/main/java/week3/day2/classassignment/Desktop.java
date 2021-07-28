package week3.day2.classassignment;

public class Desktop implements Software {
	
	public void desktopModel() {
		System.out.println("desktop");
		
	}

	public static void main(String[] args) {
		
		Desktop dp = new Desktop();
		dp.desktopModel();
		dp.hardwareResources();
		dp.softwareResources();

	}

	
	public void hardwareResources() {
		
		System.out.println("hardware");
	}


	public void softwareResources() {
		System.out.println("software");
		
	}

}
