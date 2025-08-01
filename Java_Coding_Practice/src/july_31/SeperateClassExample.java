package july_31;

class SeperateClass implements MyInterface {
	
	@Override
	public void display() {
		System.out.println("Sperate Class Example");
		
	}

}
public class SeperateClassExample {

	public static void main(String[] args) {
		
		MyInterface obj = new SeperateClass();
		obj.display();
		

	}

}

