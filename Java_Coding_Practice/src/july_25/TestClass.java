package july_25;

class A {
	
}

class B extends A{
	
	
}

class C extends B{
	
}
public class TestClass {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		A a1 = new B();  //valid
		A a2 = new C();  //valid
		
		B b1 = new C();       //valid
		B b2 = (B) new A();  //manual process
		
	}

}
