package july_21;

final class TestClass {
	
	final int a = 1000;
	
	final void display() {
		System.out.println("Parent display method");
	}
}

//class Child extends TestClass {  //Not possible to extend final class into the child class
	
	
	/*
	void display () {  //Overriding final is not possible
		
		System.out.println("child display method");
	}
	*/
//}

public class FinalKeyword {

	public static void main(String[] args) {
	
		//TestClass obj = new TestClass();
		//System.out.println(obj.a);
		
		//obj.a = 2000;  //compile time  error
		//System.out.println(obj.a);
		
		//Child obj = new Child();
		
		//obj.display();
	}

}
