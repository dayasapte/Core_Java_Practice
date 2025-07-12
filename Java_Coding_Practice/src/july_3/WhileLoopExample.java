package july_3;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		//Example 1 : Print 1 to 10 numbers - while loop
		/*
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		*/
		//Example 2 : Print Java message for 10 times
		/*
		int j=1;
		while(j<=10) {
			System.out.println("Java");
			j++;
		}
		*/
		//Example 3 : Printing odd numbers from 1 to 10 
		/*
		int i =1;
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i);
			}
			    i++;
		}
		*/
		
		//Example 4 : Printing Even Numbers from 1 to 10
		/*
		int i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		*/
		
		//Example 5 : Printing both odd and even numbers between 1 to 10
		/*int i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.println("Odd Number :"+i);
			}
			else {
				System.out.println("Even Number :"+i);
			}
			i++;
		}*/
		
		//Example 6 : print odd only
		
		int i = 1;
		while(i<=10) {
				System.out.println(i);
				i+=2;
			}
			
		//Example 7 : print even only
		int j = 2;
		while(j<=10) {
				System.out.println(j);
				j+=2;
			}
	

	}

}
