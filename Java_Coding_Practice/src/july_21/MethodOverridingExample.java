package july_21;

//Hierarchy Inheritance
class Bank {  //parent
	
	double interestRate() {
		return 5.5;
	}
}

class BOFA extends Bank{   //Child1
	
	double interestRate() {  //Overriding
		return 7.5;
	}
}

class JPMC extends Bank{  //Child2
	
	double interestRate() { //Overriding
		return 9.5;
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		
		BOFA bo = new BOFA();
		double d1 = bo.interestRate();
		System.out.println(d1);
		
		JPMC jp = new JPMC();
		double d2 = jp.interestRate();
		System.out.println(d2);
	
		 

	}

}
