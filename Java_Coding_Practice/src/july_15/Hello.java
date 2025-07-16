package july_15;

public class Hello {
	
	
	
	//1) No Input Parameters, No Return Type
	
	void messgae1() {
		
		System.out.println("Dayanand Sapte");
	
	}
	
	//2) No Input Parameters, Return Type
	
	int message2(){
		
		int a =10;
		a++;
	
		return a;
	}
	
	//3) Has Input Parameters, No Return Type
	
	void message3(String name) {
		
		System.out.println(name);
		
	}
	
	//4) Has Input Parameters and Has return type
	
	String message4 (String firstname, String Lastname) {
		
		return firstname + " " +Lastname;
		
	}

}
