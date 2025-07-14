package july_13;

public class PangramString {

	public static void main(String[] args) {
		
		String str = "The Quick Brown Fox Jumps Over The Lazy Dog";   //all 26 Alphabets
		int flag =1;
		
		str = str.toLowerCase(); //Convert to LowerCase
		
		if(str.length()<26) {
			
			System.out.println(str + "is not a Pangram String ");
		}
		else {
			
			for(char ch='a';ch<='z';ch++) {  //ascii code
				
				if(str.indexOf(ch)<0) {  //one alphabet is missing - not pangram
					flag = 0;
				}
				
			}
			
			if(flag == 1)
			System.out.println(str + " is a Pangram String");
			else {
				System.out.println(str + " is Not a Pangram String");
			}
			
		}
	}

}
