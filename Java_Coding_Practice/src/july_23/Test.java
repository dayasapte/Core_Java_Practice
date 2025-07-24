package july_23;

public class Test {
	/*
	private int x = 100;  //private variable in test class
	private void method() {
		System.out.println("Private method in the test class");
	}
    */
	
	
	//default- within same class and other class in same package
	/*
    int x =1000;
	void method() {
		System.out.println("method-default accesss modifier");
	}
	 */
	
	/*
	protected int x = 500;
	protected void method() {
		System.out.println("Method-public access modifier");
	}
	*/
	public int x = 500;
	public void method() {
		System.out.println("Method-public access modifier");
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test();
		System.out.println(obj1.x);
		obj1.method();
	}
}
