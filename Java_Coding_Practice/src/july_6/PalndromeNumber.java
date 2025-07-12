package july_6;

public class PalndromeNumber {

	public static void main(String[] args) {

               //Palindrome Number
		
		int num =12321;
		int temp = num;
		
		int reminder = 0;
		int reverse = 0;
		while(num>0) {
			reminder = num%10;
			reverse = reverse*10 + reminder;
			num = num/10;			
		}
		System.out.println(reverse);
		if(temp == reverse)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
		

	}

}
