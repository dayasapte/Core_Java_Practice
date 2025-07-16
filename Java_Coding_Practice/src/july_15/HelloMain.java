package july_15;

public class HelloMain {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		
		hello.messgae1();    //1 
		
		int x = hello.message2();  //2 
		System.out.println(x);
		
		hello.message3("DayanandS"); //3
		
		String fullname = hello.message4("Dayanand", "Sapte");  //4
		System.out.println(fullname);

	}

}
