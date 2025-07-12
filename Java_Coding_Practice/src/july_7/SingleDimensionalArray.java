package july_7;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// 1 D Array
		
		//Approach1
	
		int a[] = new int[5];  //Array Declaration and length of the array
		
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		int length = a.length;
		System.out.println("Length of array a is :" +length); // Array Size is fixed, you cannot change the size later
		//Normal For loop 
		/*
		for(int i=0;i<a.length;i++) {   //a.length = 5
			System.out.println(a[i]);
		}*/
		
		//Enhanced for loop
		/*for(int x:a) {
			System.out.println(x);
		}
		*/
		
		//Approach2 
		int b[] = {1,2,3,4,5,6,7,8,9};  //declaring and assigning the values 
		System.out.println("length of array b is :"+b.length);
		
		for(int x:b) {
			System.out.println(x);
		}
		
		
		

	}

}
