package july_21;


class Base
{
	void m1(String str) {
		System.out.println(str);
	}
	
	void m2(String s) {
		System.out.println(s);
	}
}

class Subclass extends Base{
	
	void m1(String str) {     //Overriding
		System.out.println(str+"  Child Class Method");
	}
	
	void m2(String str1, String str2) {	   //Overloading
		System.out.println(str1+str2);
	}
}
public class MethodOverloadingVsMethodOverriding {

	public static void main(String[] args) {
		
		Subclass obj = new Subclass();
		obj.m1("Dayanand");               //Overridden method in the child class
		obj.m2("Sapte");                  //Method from parent class
        obj.m2("Dayanand", "Sapte");      //Overloading method in the child class
	}

}
