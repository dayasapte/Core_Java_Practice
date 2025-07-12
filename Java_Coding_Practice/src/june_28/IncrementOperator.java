package june_28;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// Increment Operator ++
		
		
		//Example 1
		/*
		int a = 100;
		a++;
		//a = a+1; //100+1 
		System.out.println(a);
		*/
		
		//Example 2 
		/*
		int a = 200;
		int result = a++;  //Post Increment Operation 
		System.out.println(result);   //200
		System.out.println(a);     //201 
		*/
		
		//Example 3 
		int a = 500;
		int result = ++a;           //Pre Increment Operation
		System.out.println(result); //501
		System.out.println(a);  //501

	}

}
