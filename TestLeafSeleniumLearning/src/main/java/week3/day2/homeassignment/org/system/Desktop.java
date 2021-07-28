package week3.day2.homeassignment.org.system;

public class Desktop extends Computer {
	
	public void desktopSize(){
		System.out.println("desktop size is 20 inch");
	}
	

	public static void main(String[] args) {
		
		Desktop comp = new Desktop();
		comp.desktopSize();
		comp.computerModel();
		

	}

}
