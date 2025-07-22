package july_20;

//Hierarchical  Inheritance
  class Parent {
	  
	  int a = 10;
	  void display() {
		  System.out.println("Parent Method");
	  }
  }
  class Child1 extends Parent {
	  
	  int b = 20;
	  void print() {
		  System.out.println("Child1 Method");
	  }	
   }
class Child2 extends Parent {

	  int c = 30;
	  void present() {
		  System.out.println("Child2 Method");
	  }	
   }
  
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();   //Child1 object
		
		System.out.println(ch1.a);   //Parent
		ch1.display();               //Parent
		 
	    System.out.println(ch1.b);   //Child1
        ch1.print();                 //Child1
        
        System.out.println("--------------------------------------------------------------------------------------------");
        
        Child2 ch2 = new Child2();   //Child2 Object
        
        System.out.println(ch2.a);    //Parent
        ch2.display();                //Parent
        
        System.out.println(ch2.c);    //Child2
        ch2.present();                //Child2
        
        
        
		
		

	}

}
