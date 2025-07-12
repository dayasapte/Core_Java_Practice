package july_10;

public class ReverseAnString {

	public static void main(String[] args) {
		
		
		//Approach-1
		/*
		String str = "Welcome"; //emocleW
		String rev = "";  //Empty String
		
		for(int i=str.length()-1;i>=0;i--) {	
			rev = rev + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
		
	
		//Approach-2
		String s="Dayanand";
		String rev1 = "";  
		
		char arr[] = s.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev1 = rev1 + arr[i];
		}
		System.out.println(s);
		System.out.println(rev1);
		*/
		//Approach-3
		StringBuffer str2 = new StringBuffer("Dayanand");
		System.out.println(str2);
		System.out.println(str2.reverse());
		
		//Approach-4
		StringBuilder str3 = new StringBuilder("Sapte");
		System.out.println(str3);
		System.out.println(str3.reverse());
		
		
		

	}

}
