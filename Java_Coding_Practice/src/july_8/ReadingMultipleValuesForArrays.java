package july_8;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingMultipleValuesForArrays {

	public static void main(String[] args) {
		
		int a[] = new int[5];   //Variable declaration
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter an Number: " );
			a[i] = sc.nextInt();
		}
		
		System.out.println("Arrays value: "+Arrays.toString(a));
	
				

	}

}
