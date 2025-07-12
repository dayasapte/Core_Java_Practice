package july_7;

import java.util.Arrays;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		
		int arr[] = {31,25,43,11,78,97};  //first array
		int rev[] = new int[arr.length];  //reverse array
		int index = 0;
	
		for(int i=arr.length-1;i>=0;i--,index++) {
			rev[index]=arr[i];		
		}
		/*
		for(int x=0;x<rev.length;x++) {
			System.out.print(rev[x]+" ");
		}
		*/
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.println("Output Array : "+Arrays.toString(rev));
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array :"+Arrays.toString(arr));
	}

}
