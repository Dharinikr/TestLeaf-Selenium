package week3.day2.homeassignment.org.college;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The Student ID is " + id);
		
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student ID and Name is " + id  +  name);
		
	}
	
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("The Student Email and contact is " + email  +  phonenumber);
		
	}
	
	public static void main(String[] args) {
		 Students information = new Students();
		 information.getStudentInfo(1234);
		 information.getStudentInfo(1234, "KK");
		 information.getStudentInfo("kk@yahoo.com", 123456789);
		 
	

	}

}
