package july_20;

 class A {  //Parent
	 
	int a =10;
	void display() {
		System.out.println(a);
	}
}

class B extends A {
	 
	int b = 20;
	void print() {
		System.out.println(b);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
	
		 A objA = new A();       // object creation for class A
		 System.out.println(objA.a); 
		 objA.display();
		 
		 
		 B objB = new B();              //object creation for class B
		 System.out.println("variable a:"+objB.a);  // class A
		 System.out.println("variable b:"+objB.b);  // class B
		 objB.display();              // class A
		 objB.print();                // class B
		 

	}

}
