package july_9;

import java.util.Arrays;

public class StringExample6 {

	public static void main(String[] args) {
		
		//split - it will create multiple string based on delimeter
		
		String str = "Dayanand Sapte Automation";
		String s[] = str.split(" ");
		
		System.out.println(Arrays.toString(s));
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		
		String str2 = "testuser123@gmail.com";
		String s2[] = str2.split("@");
		System.out.println(Arrays.toString(s2));
		
		String amount = "$23,33,67";
		String s3[] = amount.split(",");
		System.out.println(Arrays.toString(s3));
		System.out.println(s3[0]);

	}

}
