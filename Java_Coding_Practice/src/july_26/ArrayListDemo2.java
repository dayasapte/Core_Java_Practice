package july_26;

import java.util.ArrayList;
import java.util.Iterator;

import july_14.Student;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Student> list2 = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(200);
		list.add(500);
		System.out.println(list);
		System.out.println(list.get(2));
		
		//Using Iterator with Integer Genetics
		Iterator<Integer> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		/*
		while(it.hasNext()) {
			System.out.println(it.next());
		} */
	}
	

}
