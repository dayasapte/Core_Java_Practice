package july_18;

public class StudentMain {

	public static void main(String[] args) {
		
		//object creation is not required for calling static variables and methods
		
				System.out.println(Student.city);
				
				Student.display1();
			
				
				
				
	 // object creation is required for non static variables and methods
				
				Student stu1 = new Student(); 
				
				System.out.println(stu1.rollnum);
			
				System.out.println(stu1.grade);
				
				stu1.display2();
				
				System.out.println(stu1.city);
				
				stu1.display1();
				
				
                Student stu2 = new Student(); 
				
				System.out.println(stu2.rollnum);
			
				System.out.println(stu2.grade);
				
				stu2.display2();
				
				System.out.println(stu2.city);
				
				stu2.display1();


	}

}
