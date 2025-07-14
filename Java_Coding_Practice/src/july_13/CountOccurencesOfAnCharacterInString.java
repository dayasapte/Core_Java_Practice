package july_13;

public class CountOccurencesOfAnCharacterInString {

	public static void main(String[] args) {
	
		
		String str = "Java String Example";
		
		int len = str.length();  //length of the String
		
		int temp = str.replace("a", "").length();  // all the a will be replaced with empty value
		
		
		int count = len-temp;   // this will count of a occurrences 
		System.out.println(count);
		
		
	}

}
