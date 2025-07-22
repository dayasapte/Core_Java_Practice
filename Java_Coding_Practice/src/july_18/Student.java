package july_18;

public class Student {

	//variables
	 int rollnum = 8485;
	char grade ='A';
	static String city="Pune";
	
	//methods
	static void display1() {
		
		System.out.println("static display method");
	}
	
	void display2() {
		
		System.out.println("non static method");
	}
	
	/*
	public static void main(String[] args) {
		
		
		//object creation is not required for calling static variables and methods
		 
		System.out.println(city);
		
		display1();
		
		
		// object creation is required for non static variables and methods
		 
		Student stu = new Student();
		
		System.out.println(stu.rollnum);
	
		System.out.println(stu.grade);
		
		stu.display2();
		
		System.out.println(stu.city);
		
		stu.display1();

	}
	*/

}
