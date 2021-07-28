package week3.day2.homeassignment.org.student;

import week3.day2.homeassignment.org.department.Department;

public class Student extends Department    {
	
	public void studentName() {
		System.out.println("Jaya");
	}
	public void studentDepartment() {
		System.out.println("IT");
	}
	public void studentID() {
		System.out.println("1234");
	}

	public static void main(String[] args) {
		
		Student details = new Student();
		details.studentName();
		details.studentDepartment();
		details.studentID();
		details.departmentName();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		

	}

}
