package july_3;

public class ForLoopExample {

	public static void main(String[] args) {
		
		
		//Example 1: Print values from 1 to 10
		/*
		for(int i=1;i<=10;i++) {
			System.out.println(i); 
		}
		
		
		// Example 2 : Print values from 10 to 1
		
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		*/
		//Example 3 : Print odd numbers from 1 to 10
		/*
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("------------------"	);
		
		//Example 4 : Print even numbers from 1 to 10
		
		for(int j=2;j<=10;j+=2) {
			System.out.println(j);
		}
		*/
		
		//Odd and Even Numbers - for loop
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i+" Odd Number");
			}
			else
				System.out.println(i+" Even Number");
		}
		
		

	}

}
