package july_31;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		
		SecondInterface object = () -> {
			
			System.out.println("Lambda Expression with multiple statements");
			System.out.println("second statement");
			System.out.println("third statement");
			System.out.println("fourth statement");
			
		};
		
		object.print();
		
		
	}

}
