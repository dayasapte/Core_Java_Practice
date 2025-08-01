package july_29;

import java.util.HashMap;

public class CountOccurencesInStrig3 {
	
	public static void getOccurences(String str) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		char chArray[] = str.toCharArray();
		
		for(char c:chArray) {
			if(String.valueOf(c).isBlank()) {
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			}
			else
			{
				map.put(c, 1);
			}
			}
		}
		
		System.out.println(str+" : "+map);
		
	}
	

	public static void main(String[] args) {
		
		
		getOccurences("aaabbccccddd");
        getOccurences("test");
        getOccurences("test test");
        getOccurences(" test    test     test");
        getOccurences("Sanchit Sapte");
	}

}
