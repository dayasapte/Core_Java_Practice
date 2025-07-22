package july_20;


class X{  //Parent
	 
	int a =10;
	void display() {
		System.out.println(a);
	}
}

class Y extends X {   //child1
	 
	int b = 20;
	void print() {
		System.out.println(b);
	}
}

class Z extends Y{     //child2
	
	int c = 30;
	void present() {
		System.out.println(c);
	}
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		/*
		Y object = new Y();   //child1
		System.out.println(object.a); //parent
		object.display(); //parent
		System.out.println(object.b); //child1
		object.print();      //child1 
		*/
		
		 Z object2 = new Z();
		 
		 System.out.println(object2.a);
		 object2.display();
		 System.out.println(object2.b);
		 object2.print();
		 System.out.println(object2.c);
		 object2.present();
		 
		
	}

}
