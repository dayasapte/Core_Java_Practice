package july_16;

public class Addition {
	
	//variables	
	int a,b;

	//methods
	
	void sum() { //case1 - No Inputs	
		a=100;
		b=200;	
		System.out.println(a+b);	
	}
	
	void sum(int x, int y) {  //case2 - two inputs
		System.out.println(x+y);
	}
	
	void sum(int x,double y) { //case3-two inputs-different data type
		
		System.out.println(x+y);
	}
	
	void sum(double x, int y) { //case4-two inputs-order of data type is changed
	
		System.out.println(x+y);
	}

}
