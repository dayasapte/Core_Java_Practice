package july_15;

public class Employee {
	
	//variables 
	int empId;
	String empName;
	double salary;
	
	/*
	Employee(){  
		
		System.out.println("Default Constructor");
		
		empId = 500;
		empName = "George";
		salary = 7000.89;
	} */
	
	
	//Parameterized Constructor
	Employee(int id,String name,double sal){
		
		empId = id;
		empName = name;
		salary = sal;
	}
	
	//user defined method
	void printEmployeeData() {
		
		System.out.println(empId+" "+empName+" "+salary);
		
	}
	//Main Method-
	public static void main(String[] args) {
		
		//Employee emp1 = new Employee();
		
		/*
		emp1.empId = 100;
		emp1.empName ="Dayanand";
		emp1.salary = 5600.87;
		*/
		
		Employee emp1 = new Employee(700,"Dayanand",1000.66);
		
		emp1.printEmployeeData();
		
		
		
	

	}

}
