package july_23.subPackage;

import july_23.Test;

public class TestMain2 extends Test {

	public static void main(String[] args) {
		
		
		//Test obj = new Test();
		
		TestMain2 object = new TestMain2();
		
		System.out.println(object.x);
		object.method();
		
		//obj.x; //default variable not visible in another package
		//obj.method(); //default method not visible in another package

	}

}
