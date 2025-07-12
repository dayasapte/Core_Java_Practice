package july_8;

public class LinearSearchInArray {

	public static void main(String[] args) {
		
		int a[] = {10,22,9,55,88,33,11,34,99};
		int num = 888;
		boolean status = false;
		/*
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {  //comparison
				
				System.out.println("Number is found in the array");
				status = true;
				
				break;
				
			}
		}
		if(status==false)
		System.out.println("Number is not found in the array");
         */
		
		for(int x:a) {
			if(x==num) {
				System.out.println("Number is found in the array");
				status=true;
				break;
			}
		}
			if(status==false)
				System.out.println("Number is not found in the array");
		
	}

}
