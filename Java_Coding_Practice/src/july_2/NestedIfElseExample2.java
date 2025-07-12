package july_2;

public class NestedIfElseExample2 {

	public static void main(String[] args) {
		
		//Nested if else
		int age = 10;
		boolean hasLicense = true;
		
		if(age>=18) {
			if(hasLicense) {
				System.out.println("Eligible to drive the vehicle");
			}
			else {
				System.out.println("Not Eligible as No License");
			}
		}
		else {
			System.out.println("You are not eligible to drive due to age criteria");
		}

	}

}
