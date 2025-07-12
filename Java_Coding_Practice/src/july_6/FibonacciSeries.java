package july_6;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13,21
		//Fibonacci Series
		
		int n1=0,n2=1;
		int n3=0;
		int count = 20;
		
		System.out.println(n1+" ");
		System.out.println(n2+" ");
		
		for(int i=3;i<=count;i++) {
			
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
