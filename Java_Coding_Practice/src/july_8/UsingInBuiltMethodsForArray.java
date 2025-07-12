package july_8;

import java.util.Arrays;

public class UsingInBuiltMethodsForArray {

	public static void main(String[] args) {
		
		//int arr[] = {10,20,30,11,23,44,32,50};  //unsorted 
		//char ch[] = {'A','Z','B','R','C','E'};  //unsorted
		String s[] = {"java","python","csharp","cplusplus"};
		
		System.out.println("Before Sorting :"+Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting :"+Arrays.toString(s));

	}

}
