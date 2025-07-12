package july_6;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial -- 5 : 5*4*3*2*1
		
		int num = 10;
		int factorial = 1;
		
		for(int i=1;i<=num;i++) {
			
			factorial = factorial*i;  //1 //1*2 //1*2*3  //1*2*3*4  //1*2*3*4
			 
		}
		
		System.out.println(factorial);

	}

}
