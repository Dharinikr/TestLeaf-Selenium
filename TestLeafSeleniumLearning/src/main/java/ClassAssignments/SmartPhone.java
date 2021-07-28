package ClassAssignments;

public class SmartPhone extends AndroidPhone  {
	
	
	public void connectWhatsapp() {
		
		System.out.println("whats app connected");
		
	}
	public static void main(String[] args) {

SmartPhone sp = new SmartPhone();


sp.connectWhatsapp();
sp.saveContact();
sp.makeCall();
sp.takeVideo();

}
}
	
	
	

