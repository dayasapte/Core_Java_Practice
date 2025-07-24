package july_23;

public class WrapperClassesExample {

	public static void main(String[] args) {
		
		
		//Case1 : Convert String to other data types
		
		//String str = "Dayanand";    //Invalid input for number
		
		String str = "12345";         //Int value in the String
		int x = Integer.parseInt(str);
		System.out.println(x);
		
		
		
		String str1 = "555.345";       //double value in the String
        String str2 = "111.222";
        System.out.println(str1+str2); //concatenation
        
		double d1 = Double.parseDouble(str1);
		double d2 = Double.parseDouble(str2);
		System.out.println(d1+d2);     //addition
		
		
		//String to Char - String to Character not possible 
		
		//String to Boolean 
		
		String s = "true";    //returns true when it is true
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		
		

	}

}
