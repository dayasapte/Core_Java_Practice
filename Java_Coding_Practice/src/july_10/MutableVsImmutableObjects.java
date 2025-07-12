package july_10;

import java.util.Arrays;

public class MutableVsImmutableObjects {

	public static void main(String[] args) {
		
		
		//Immutable - we cannot change the value
		/*
				String str = new String("Welcome");
				System.out.println(str);
				
				str.concat("to java strings");
				System.out.println(str);
				*/
		//Mutable - we can change the value
		/*
		int arr[] = {11,20,8,9,3,45,88,57,77,34}; //unsorted 
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //sorting in the memory
		System.out.println(Arrays.toString(arr));
		*/
				
		//StringBuffer - Mutable- we can change the value
				StringBuffer sb = new StringBuffer("Welcome");
				System.out.println(sb);
				
				sb.append(" to java strings");
				System.out.println(sb);
		
		
		
		
	}

}
