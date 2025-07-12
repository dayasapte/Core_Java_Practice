package july_6;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		//Reverse of an Number
		
		int num = 12345; //54321 -- 5 Times
		int reminder = 0;
		int reverse = 0;
		
		while(num>0) {
			reminder = num%10;
			reverse = reverse*10+reminder;
			num = num/10;
			
		}
		System.out.println(reverse);

	}

}
