package july_25;

public class TypeCastingPrimitiveDataTypes {

	public static void main(String[] args) {
	
		//Upcasting : Smaller to Larger value
		
		//int-->long
		int intvalue = 1000;
		long longvalue = intvalue;         //automatic
		System.out.println(longvalue);
		
		
		
		//float-->double
		float floatvalue = 12.45f;
		double doublevalue = floatvalue;    //automatic
		System.out.println(doublevalue);
		
		
		//Downcasting : Larger to smaller value
		
		//long--> int 
		
		long longval = 100000000000l;
		int intval = (int) longval;            //manual 
		System.out.println(intval);
		
		//double -->float
		
		double doubleval = 345.44;
		float floatval = (float)doubleval;     //manual
		System.out.println(floatval);
		
		int intval1 = (int)doubleval;
		System.out.println(intval1);
		
		
		 

	}

}
