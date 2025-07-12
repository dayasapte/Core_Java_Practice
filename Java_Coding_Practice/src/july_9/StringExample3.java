package july_9;

public class StringExample3 {

	public static void main(String[] args) {
		
		//Contains()--- returns boolean -- true/false
		String s1 = "Dayanand";
		String s2 = "nand";
		System.out.println(s1.contains(s2));
		
		//equals--compare strings
		
		String str1 = "Swaroop";
		String str2 = "Swaroop";
		System.out.println(str1.equals(str2));;
		
		//equalsIgnoreCase -- compare strings 
		
		String s3 = "SWAROOP";
		String s4 = "swaroop";
		System.out.println(s3.equalsIgnoreCase(s4));;
		
		//contentEquals
		
		String s5 = "Swaroop";
		String s6 = "swaroop";
		System.out.println(s5.contentEquals(s6));

	}

}
