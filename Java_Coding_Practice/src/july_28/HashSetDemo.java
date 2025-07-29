package july_28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashSet hs = new HashSet();
		//Set mySet = new HashSet();
		//HashSet<Integer> set = new HashSet<Integer>();
		
		//Adding elements into the HashSet
		
		hs.add(100);
		hs.add("Sanchit");
		hs.add(true);
		hs.add(231.999);
		hs.add(null);
		hs.add(100);
		hs.add(200);
		hs.add(null);
		hs.add("Sanchit");
		
		System.out.println(hs);
		
		//Remove element from the Hashset
		hs.remove(100);
		System.out.println(hs);
		
		//Insert in the Middle of Hashset
	    //Not Possible to insert elements inbetween
		
		//Retrieve specific element using index
		//Not Possible to retrieve specific index
		
		//Convert the HashSet into ArrayList
		ArrayList list = new ArrayList(hs);
		System.out.println(list.get(2));
		
		
		//Retrieve All the elements from the HashSet
		//Normal for loop not possible as no index
		
		//Enhanced for loop - for each
		/*for(Object x:hs) {
			System.out.println(x);
			
		}*/
		
		//Using Iterator
		Iterator  it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		
		//Clear all the elements 
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		
		
		
	}

}
