package july_14;

public class StudentMain {

	
	//Main Method is in another class in same package
	public static void main(String[] args) {
		
		//New Object Creation
		Student student1 = new Student();
	
	     //define values for the variables	
		student1.rollnum = 10;
		student1.name = "Alex";
		student1.grade = 'D';
		student1.address = "United States";
		
		//call methods
		student1.displayAllValues();
		student1.displayRollNum();
		
		//New Object Creation
		Student student2 = new Student();
		
		
		//define values for the variables	
		student2.rollnum = 20;
		student2.name = "John";
		student2.grade='B';
		student2.address = "United Kingdom";
		
		//call methods
		student2.displayAllValues();
		student2.displayRollNum();
		

	}

}
