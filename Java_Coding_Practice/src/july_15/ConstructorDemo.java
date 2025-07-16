package july_15;

public class ConstructorDemo {
	
	//Variables
	int a;
	int b;
	
	
	
	ConstructorDemo(){  //Default Constructor
		
		a=100;
		b=200;
		
	}
	
	ConstructorDemo(int x, int y){ //parameterized constructor
		
		a = x;
		b = y;
	}
	
	void sum() {
		System.out.println(a+b);
	}
	
    //Main method-execution will start here
	public static void main(String[] args) {
		
		
		//default constructor
		ConstructorDemo cd1 = new ConstructorDemo();
		cd1.sum(); //calling a method
		
		//parameterized constructor
		ConstructorDemo cd2 = new ConstructorDemo(300,700);
		cd2.sum();  //calling a method
		

	}

}
