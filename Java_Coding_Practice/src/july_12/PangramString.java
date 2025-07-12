package july_12;

public class PangramString {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		int flag = 1;
		
		if(str.length()<26) {
			System.out.println(str+" is not the Pangram String");
			
		}
		else {
			
			for(char ch='a';ch<='z';ch++) {
				
				if(str.indexOf(ch)<0) {
					flag = 0;       //Non-Alphabet
				}
			}
			
			
			if(flag == 1)
				System.out.println("Pangram String");
			
			else {
				System.out.println("Not a Pangram String ");
			}
		}
	}
	

}
