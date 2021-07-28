package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Make a phone call");
	}
	
	public void sendMessage() {
		System.out.println("Send a text message");
	}
	
	public void takePhoto() {
		System.out.println("Take a photo in camera");
	}
	
	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMessage();
		myMobile.takePhoto();
		
		
		
	}

}
