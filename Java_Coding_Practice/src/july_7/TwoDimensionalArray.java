package july_7;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//declaration the 2D array with length , rows : 3 & columns : 2
		
		//Approach-1
		/*
		int a[][] = new int[3][2];
		
		
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
        a[2][1] = 600;
        
        //Normal for loop 
        /*
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
        */
        //length of the array
        //System.out.println(a.length);
        //System.out.println(a[1].length);
        
        
        
        //Enhanced for loop
        int b[][] = {{1,2,3,4,5,6,},{7,8,9},{10,11,12}};
        
        for(int x[]:b) {
        	for(int y:x) {
        		System.out.print(y+" ");
        	}
        	System.out.println();
        }
        
        
        
	}
}






