package july_25;

class Parent 
{
	String name = "Swaroop";
	void method1() {
		System.out.println("Parent Method");
	}
	
}
class Child extends Parent 
{
	
	int a = 100;
	void method2() {
		System.out.println("Child Method");
	}
}

public class TypeCastingObjects {

	public static void main(String[] args) {
		
		Child ch = new Child();      //Child class object
		
		System.out.println(ch.name); //Parent
		ch.method1();                //Parent
		
		System.out.println(ch.a);    //Child
		ch.method2();                //Child
		
		//Up Casting
		//Parent P = new Parent();    //Parent Class Object
		Parent P = new Child();       //Automatic conversion
		System.out.println(P.name); //Parent
		P.method1();                //Parent
		//System.out.println(P.a);    //Child
		//P.method2();                //Child
		
		//Down Casting
		Child c = (Child) new Parent();   //Manual casting with child
		
		System.out.println(c.name);
		c.method1();
		
		System.out.println(c.a);
		c.method2();
		
		
		
		
		
		

	}

}
