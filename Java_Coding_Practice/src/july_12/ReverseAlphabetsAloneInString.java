package july_12;

import java.util.Arrays;

public class ReverseAlphabetsAloneInString {

	public static void main(String[] args) {
		
		String str = "abc123pqr456xyz";  //Output : zyx123rqp456cba
		System.out.println(str);
		
		int left = 0;
		int right = str.length()-1;
		
		char ch[] = str.toCharArray();  //convert string into charArray
		
		while(left<right) {
			if(Character.isDigit(ch[left])) {
				left++;
			}
			else if(Character.isDigit(ch[right])) {
				right--;
				
			}
			
			else {
				
				char temp = ch[left];
				ch[left]  = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		
		System.out.println(new String(ch));
		System.out.println(Arrays.toString(ch));
		
		
		
		

	}

}
