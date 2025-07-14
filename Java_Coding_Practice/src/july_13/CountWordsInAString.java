package july_13;

public class CountWordsInAString {

	public static void main(String[] args) {
		
		//String str = "Dayanand Sapte Automation";
		
		String str = "Java String Program to Count the Words";
		
		int count = 1;  //Initialize with 1
		
		for(int i=0;i<str.length();i++) {   //iterate entire string
			
			if (str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
	}

}
