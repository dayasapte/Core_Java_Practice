package july_16;

public class PrintNumbers_ASCII {

	public static void main(String[] args) {
		// Print numbers 1 to 100
		//we should not use any numbers in the program
		
		//First Approach
		System.out.println("First Approach");
		int one = 'A'/'A';
		String str = "qqqqqqqqqq";
		int len = str.length();
		
		
		for(int i=one;i<=len*len;i++) {
			System.out.println(i);
		}

		
		//Second Approach
		
		System.out.println("Second Approach");
		for(int i=one;i<='d';i+=one) {
			System.out.println(i);
			
		}
		
	}

}
