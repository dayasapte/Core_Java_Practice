package july_31;

public class AnonymousClassExampleUsingClasses {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass() {
			
			@Override
			public void displayMethod() {
				System.out.println("Anonymous Class Example Using an Parent Class");
			}
			
		};
		
		obj.displayMethod();
	}

}
