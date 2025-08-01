package coding;

import java.util.HashSet;

public class PangramProgramUsingHashSet {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		
		if(str.length()<26) {
			
			System.out.println("Not a Pangram String");
		}
		
		else 
		{
			HashSet<Character> hs = new HashSet<>();
			
			for(int i=0;i<str.length();i++) {
				 
				hs.add(str.charAt(i));
			}
			
			if(hs.size()==26)
				
				System.out.println("Pangram String");
			
			else
				System.out.println("Not a Pangram String");
		}
		
		
	}

}
