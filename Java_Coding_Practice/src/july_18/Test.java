package july_18;

public class Test {
	
	Test(){  //1  constructor
		
		System.out.println("default constructor");
	}
	
	Test(String str){ //2 constructor
		this();  //calling 1 constructor
		System.out.println(str);
		
	}
	
	Test(String str,int x){ // 3 constructor
		this("Testing"); //calling 2 constructor
		System.out.println(str +" "+x);
	}

	public static void main(String[] args) {
		
		Test obj = new Test("Dayanand",35);
		

	}

}
