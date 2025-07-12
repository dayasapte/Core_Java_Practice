package july_11;

public class StringComparisons {

	public static void main(String[] args) {
		
		
		//Example1- String Constant Pool 
		/*
		String str1 = "Welcome"; //String Constant Or String Literal
		String str2 = "Welcome";
		
		System.out.println(str1==str2); //compare the objects
		System.out.println(str1.equals(str2)); //compare the values
		*/
		
		//Example2 - Heap Memory - Outside the String Constant Pool
		/*
		String s1 = new String("Dayanand");
		String s2 = new String("Dayanand");
		
		System.out.println(s1==s2); //compare the objects
		System.out.println(s1.equals(s2)); //compare the values
		*/
		
		//Example3
		/*
		String str1 = "Welcome"; //SCP- String Constant Pool
		String str2 = new String("Welcome"); //Heap Memory- outside the SCP
		
		System.out.println(str1==str2); //Compare the Objects
		System.out.println(str1.equals(str2)); //compare the values
		*/
		
		//Example4
		/*
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		String s3 = s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		*/
		
		
		
		
		
		
		
		
		
		

	}

}
