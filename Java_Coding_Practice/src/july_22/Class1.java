package july_22;

abstract class Test {
	
	//static, non static variables and methods
	//abstract method and non abstract method
	abstract void method();  //abstract method
	
}
public class Class1 extends Test{

	public static void main(String[] args) {
		Class1 Object = new Class1();
		Object.method();
	

	}

	@Override
	void method() {
		
		System.out.println("Abstract Method - abstract class example");
		
	}

}
