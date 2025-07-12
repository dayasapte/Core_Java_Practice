package july_6;

public class CountTheNumberOfDigits {

	public static void main(String[] args) {
		// Count the number of digits in an number
		
		//Input :  123123;
		//Output : 6
              
		int num = 123123123;
		
		int count = 0;
		
		while(num>0) {
			
			count++;
			num = num/10;
			
		}
		System.out.println(count);
	}

}
