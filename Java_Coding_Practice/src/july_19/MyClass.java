package july_19;

public class MyClass {
	
	//static variable
	static int counter=0;
	
	//non-static variable- instance variable
	int instanceNumber = 0;
	
	
	//Default Constructor
	MyClass(){
		counter++;
		instanceNumber++;
	}
	
	
	//static method
	static void displayCounter() {	
		System.out.println("Static variable counter "+counter);
	}
	
	//non-static method- instance  method
	void displayInstanceNumber() {
		System.out.println("Instance Variable: "+instanceNumber);
	}
	
    //Main Method-execution point starts here
	public static void main(String[] args) {
		
		
		MyClass obj1 = new MyClass();  //first object
		displayCounter();
		obj1.displayInstanceNumber();
		
		MyClass obj2 = new MyClass();  //second object
		displayCounter();
		obj2.displayInstanceNumber();
	
		

	}

}
