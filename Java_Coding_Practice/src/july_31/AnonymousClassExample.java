package july_31;

public class AnonymousClassExample {

	public static void main(String[] args) {
		
		MyInterface obj = new MyInterface() {

			@Override
			public void display() {
				
				System.out.println("Anonymous Class Example with Interface");
				
			}		
		};
		obj.display();
	}

}
