package week1.day2;

public class StudentInfo {
	
	//HOW TO RETURN DATA TO METHOD
	
	public String getStudentName () {
		
		return "DD";  //System.out.println("DD");
	}

      /*HOW TO PASS DATA TO METHOD.INPUT TO A METHOD CAN BE
	  GIVEN ONLY THROUGH ARGUMENTS*/
	
	public void printStudentDetails(String name, int id) {
		
		System.out.println(name + id + " student details");
	}
	

public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo();
		
		String name = si.getStudentName();
		
		System.out.println(name);	
		
		si.printStudentDetails("DD" , 123);
		
	}
	
}
