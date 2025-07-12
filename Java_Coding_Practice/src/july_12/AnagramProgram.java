package july_12;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String str1 = "Silent";
		String str2 = "Listen";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//Check the Length
		if(str1.length() == str2.length()) {
			
			//convert strings to char Arrays
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			//sort the both Arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//If both sorted Char Arrays are same then it is Anagram
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result) {
				System.out.println(str1+" "+str2+" Are Anagram Strings");
			}
			else {//when characters are not matching
				System.out.println(str1+" "+str2+" Are Not Anagram Strings");
			}
		}
		
		else { //length is not matching
			System.out.println(str1+" "+str2+" Are Not Anagram Strings");
		}

	}

}
