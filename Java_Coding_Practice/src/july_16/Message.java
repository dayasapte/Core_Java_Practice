package july_16;

public class Message {
	
	//variables
	String text;
	String firstName;
	String lastName;
	
	//methods
	Message(){  //default constructor- no inputs
		
		text = "Hello";
		firstName = "";
		lastName = "";

		
		System.out.println(text+" "+firstName+" "+lastName);
	}
	
	Message(String fname){  ///parameterized constructor with one input
		
		text = "Hi";
		firstName = fname;
		lastName = "";
		System.out.println(text+" "+firstName+" "+lastName);
	}
	
    Message(String fname,String lname){  ///parameterized constructor with two inputs
		
		text = "Hey";
		firstName = fname;
		lastName = lname;
		System.out.println(text+" "+firstName+" "+lastName);
		
	}


}
