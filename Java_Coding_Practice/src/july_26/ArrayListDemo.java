package july_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		//Declaration or creating an object
		ArrayList arrlist = new ArrayList();  //different data types 
		
		//List list = new ArrayList(); //different data types 
		
		//ArrayList<Integer> mylist = new ArrayList();   //Integer data types
		
		
		//Adding the data into the ArrayList 
		arrlist.add(100);
		arrlist.add("daya");
		arrlist.add(234.456);
		arrlist.add(true);
		arrlist.add(100);
		arrlist.add(100);
		arrlist.add(null);
		arrlist.add(500);
		
		
		//Size of the ArrayList
		int size = arrlist.size();
		 System.out.println(size);
		 
		 //print the values in the ArryList
		 System.out.println(arrlist);
		 
		 //Removing the elements-ArrayList
		 arrlist.remove(5);
		 System.out.println(arrlist);
		 
		 //Insert elements at specific index
		 arrlist.add(3, "Sanchit");
		 System.out.println(arrlist);
		 
		 //Modify at specific inded in ArrayList
		 arrlist.set(4,"Test");
		 System.out.println(arrlist);
		 
		 
		 //Retrieve the value at specific index
		 System.out.println(arrlist.get(3));
		 
		 
		 //Retrieve all elements from Arraylist with Index
		 
		 //1-for loop
		 /*for(int i=0;i<arrlist.size()-1;i++) {
			 
			 System.out.println(arrlist.get(i));
		 }*/
		 
		 //2-for each loop  //Enhanced for loop
		 /*for(Object x:arrlist) {
			 System.out.println(x);
		 }*/
		 
		 //3- Using Iterator - Interface in Java Collections
		 Iterator it = arrlist.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
			 
		 }
		 
		 //Checking ArrayList is Empty or not
		 System.out.println(arrlist.isEmpty());
		 
		 
		 //Remove some elements from the ArrayList
		 
		 ArrayList list2 = new ArrayList();
		 list2.add("Sanchit");
		 list2.add(null);
		 list2.add(500);
		 
		 arrlist.removeAll(list2);
		 System.out.println(arrlist);
		 
		 //Remove all the elements from the ArrayList
		 arrlist.clear();
		 System.out.println(arrlist);
		 System.out.println(arrlist.isEmpty());
		 
		
	}

}
