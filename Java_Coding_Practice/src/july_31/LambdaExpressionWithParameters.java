package july_31;

public class LambdaExpressionWithParameters {

	public static void main(String[] args) {
		
		Greetings obj = (name) -> System.out.println("Hello "+name);
		obj.SayHello("Dayanand");

	}

}
