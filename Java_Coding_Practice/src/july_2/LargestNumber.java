package july_2;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a = 1000;
		int b = 2000;
		int c = 3000;
		
		if(a>b && a>c) {
			System.out.println("a is the largest value");
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest value");
		}
		else {
			System.out.println("c is the largest value");
		}

	}

}
