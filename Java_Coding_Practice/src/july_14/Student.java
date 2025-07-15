package july_14;

public class Student {
	
	

	//variables
	public int rollnum;
	public String name;
	public char grade;
	public String address;
	
	
	//methods
	public void displayAllValues() {
		
		System.out.println(rollnum);
		System.out.println(name);
		System.out.println(grade);
		System.out.println(address);
		
	}
  
	public void displayRollNum() {
		
		System.out.println("RollNum Value is :"+rollnum);
	}
	
	//Main Method - Execution Starting Point
	/*
	public static void main(String[] args) {
                    
		//Creating an Object
		Student stu1 = new Student();
		
		//Assigned some values to variables in the runtime
		stu1.rollnum = 1;
		stu1.name = "Dayanand";
		stu1.grade = 'A';
		stu1.address = "India";
		
		//call methods
		stu1.displayAllValues();
		stu1.displayRollNum();
				
		//Creating an Object
		Student stu2 = new Student();
		
		//Assigned some values to variables in the runtime
		stu2.rollnum = 2;
		stu2.name = "Kumar";
		stu2.grade = 'B';
		stu2.address = "Australia";
		
		//call methods
		stu2.displayAllValues();
		stu2.displayRollNum();
		
		
		
		
		
	} */

}
