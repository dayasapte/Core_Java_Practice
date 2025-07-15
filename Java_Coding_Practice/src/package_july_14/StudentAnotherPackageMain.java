package package_july_14;

import july_14.Student;

public class StudentAnotherPackageMain {

	
	//Main method in another package
	public static void main(String[] args) {
		
		//created object for student
		Student stu = new Student();
		
		
		//Defined values
		stu.rollnum = 100;
		stu.name = "Bill Gates";
		stu.grade = 'A';
		stu.address = "India";
		
		//calling the methods
		stu.displayAllValues();
		stu.displayRollNum();
		
		
		

	}

}
