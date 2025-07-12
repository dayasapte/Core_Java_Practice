package july_12;

public class RemoveJunkSpecialCharactersInStrings {

	public static void main(String[] args) {
		
		String str = "#@&*#@&@Java Strings646363653653 #$*()Pro!#$&gram@@()";
		
		//Regular Expression
		
		//Remove Alphanumeric values from string
		String str1= str.replaceAll("[a-zA-z0-9]", "");
		System.out.println(str1);
		
		
		//Remove junk special characters from string
		String str2= str.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(str2);
		
		//Retain only numbers
		
		 String str3 = str.replaceAll("[^0-9]", "");
		 System.out.println(str3);
		 
		 
		 //Remove the numbers
		 
		 String str4 = str.replaceAll("[0-9]", "");
		 System.out.println(str4); 
		 
		 //Remove all other characters except alphabets
		 
		 String str5 = str.replaceAll("[a-zA-Z]", "");
		 System.out.println(str5);


	}

}
