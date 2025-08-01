package july_31;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		SecondInterface object = () -> System.out.println("Lambda Expression without parameters");
		object.print();
	}

}
