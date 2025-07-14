package july_13;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		String str = "Dayanand Sapte Automation";  //dnanayaD etpaS noitamotuA
		System.out.println(str);
		String words[] = str.split(" ");  //splitting the string into words
		
		String ReverseString = "";  //Empty String
		
		for(String w:words) {   //Enhanced for loop for Array Navigation
			
			String ReverseWord = "";  //Empty String
			
			for(int i=w.length()-1;i>=0;i--) {
			
				 ReverseWord = ReverseWord + w.charAt(i);
				//Reverses each word character by character
		}
			
			ReverseString = ReverseString + ReverseWord + " ";
		}
		System.out.println(ReverseString);
	}

	}
