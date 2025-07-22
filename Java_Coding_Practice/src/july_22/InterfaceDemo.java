package july_22;


interface Book
{
	int numOfPages = 150;   //final static variables
	String author = "Dayanand";  //final static
	
	
	void method1();  //abstract method 
	
	default void method2() {
		
		System.out.println("Default method");
		
	}
	
	static void method3() {
		System.out.println("Static method");
	}
}


public class InterfaceDemo implements Book{
	
	@Override
	public void method1() {
		System.out.println("Abstract Method Code");
	}

	void method4(String str) {
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		/*
		//Case1
		InterfaceDemo obj = new InterfaceDemo();
		obj.method1();  //abstract method implemented
		obj.method2();  //default method of interface 
		
		//obj.method3(); //using child class object we cannot call the static method
		
		Book.method3();  //using interface we can call the static method
		*/
		
		//Case2
		//using the interface reference to call the childclass object
		
		// Book bk = new Book(); //not possible to create an object for interface 
		
		Book bk = new InterfaceDemo(); //child class object with interface reference variable
		bk.method1();
		bk.method2();
		
		Book.method3();
		
		
		InterfaceDemo obj1 = new InterfaceDemo();
		obj1.method4("Dayanand");
	

	}

	

}
