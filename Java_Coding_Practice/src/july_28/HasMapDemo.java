package july_28;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap hm = new HashMap();
		//Map m = new HashMap();
		HashMap<Integer,String> map = new HashMap<Integer,String>(); 
	    
		//adding values into the HashMap - Key, value pairs
		map.put(101,"Swaroop");
		map.put(102,"Ram");
		map.put(103,"Kumar");
		System.out.println(map);
       
		map.put(101, "Dayanand");
		System.out.println(map);
		
		//Size of the HashMap
		System.out.println(map.size());
		
		//Remove one key value pair
		map.remove(103);
		System.out.println(map);
		System.out.println(map.size());
		
		//Retrieve value of an Given key
		System.out.println(map.get(102));
		
		//Retrieve all the  keys and values from HashMap
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
		}
	}


