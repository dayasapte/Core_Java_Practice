package july_23;

public class WrapperClassesExample2 {

	public static void main(String[] args) {
		
		//Case2: all primitive data types into String
		
		int a = 10;
		double d = 123.45;
		char ch ='D';
		boolean b = true;
		
		String str1 = String.valueOf(a);
		System.out.println(str1);
		
		String str2 = String.valueOf(d);
		System.out.println(str2);
		
		String str3 = String.valueOf(ch);
		System.out.println(str3);
		
		String str4 = String.valueOf(b);
		System.out.println(str4);
		
		Integer x = 100;
		String str = Integer.toString(x);
		System.out.println(str);

		double d1 = 100.567;
		String str_1 =  Double.toString(d1);
		System.out.println(str_1);
	}

}
