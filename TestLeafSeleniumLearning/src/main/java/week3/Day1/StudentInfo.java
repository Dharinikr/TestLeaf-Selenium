package week3.Day1;

public class StudentInfo {

	public void getStudentDetails(String name) {
		System.out.println(name);
	}
	
	public void getStudentInfo(int ID) {
		System.out.println(ID);
	}
	
	//it has same method name as above but we used 2 arguments ID and String. it is allowed 
	public void getStudentInfo(int ID, String name) {
		System.out.println(ID+ name);
	}
	
	//whereas when we use same method name and same arguments-here arguments position 
	//is different from above. the error displays at the compilation time
	
	public void getStudentInfo(String name, int ID) {
		System.out.println(name + ID);
	}
	
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();
		si.getStudentDetails("DD");
		si.getStudentInfo(22);
		si.getStudentInfo(33,"KK");
		si.getStudentInfo(44,"AA");
		

	}

}
