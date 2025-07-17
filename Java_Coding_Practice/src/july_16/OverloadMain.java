package july_16;

public class OverloadMain {
	
	void main() {  //no inputs
		
		System.out.println("No Inputs");
		
	}
	
	void main(String str) {  //one String input
		
		System.out.println("String Input: "+str);
		 
	}
	
	void main(int x) {       //one int Input
		
		System.out.println("Int Data type input: "+x);
		
	}
	
	void main(int x,int y) {  //two int inputs
		
		System.out.println("X value is :"+x+ " and Y value is :"+y);
	}
	

	public static void main(String[] args) {
		
		OverloadMain obj = new OverloadMain();
		obj.main();           //no inputs
		obj.main(100);        //int data type as input
		obj.main("Dayanand"); //String as input
		obj.main(100, 200);   //int two inputs

	}

}
