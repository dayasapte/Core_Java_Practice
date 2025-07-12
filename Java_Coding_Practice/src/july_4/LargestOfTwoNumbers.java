package july_4;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		
		//Largest of two numbers by if else
		
		//if else
		
		int a=20, b =50;
		
		if(a>b)
			System.out.println(a +" is the largest value");
		else
			System.out.println(b +" is the largest value");

		System.out.println("-----------------------------");
		
		//Largest of two numbers by Ternary Operator
		int x=100,y=50;
		int result = x>y ? x:y;
		
		System.out.println(result);
		
		System.out.println("------------------------------------");
		
		//Check if the person is eligible for voting bases on age
		
		int age = 25;
		if(age>=18) {
			System.out.println("Person is eligible for voting");
		}
		else
			System.out.println("Person is not eligible for voting");
		
		System.out.println("-----------------------------");
		
		int bmi = 15;
		if(bmi<20)
			System.out.println("underweight");
		else if(bmi>=20 && bmi<25)
			System.out.println("Normal Weight");
		else if(bmi>=25 && bmi<30)
			System.out.println("Over Weight");
		else
			System.out.println("Obesity");
		
		
		
		
	}

}
