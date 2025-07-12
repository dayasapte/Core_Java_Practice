package june_28;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
		// && || !
		
		boolean b1 = 10>20;  //false
		boolean b2 = 20>10;  //true
		
		boolean result = b1&&b2;
		System.out.println(result); //false
		
		
		boolean logicalor = b1||b2;
		System.out.println(logicalor);  //true
		
		

	}

}
