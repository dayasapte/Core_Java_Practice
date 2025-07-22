package july_18;

public class TestClass {

	//methods
	void display1() {
		System.out.println("display1 method");
	}
	
	void display2() {
		 //display1();
		this.display1();
		System.out.println("display2 method");
	}
	
	public static void main(String[] args) {
		
		TestClass obj = new TestClass();
		obj.display2();
		

	}

}
