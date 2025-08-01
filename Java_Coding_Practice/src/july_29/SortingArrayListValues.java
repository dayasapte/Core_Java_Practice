package july_29;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListValues {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(20);
		arrList.add(5);
		arrList.add(50);
		arrList.add(25);
		arrList.add(100);
		
		
		System.out.println("Input Array List: "+arrList);
		
		
		Collections.sort(arrList);   //Ascending order
		System.out.println("Ascedning Sorted Array List: "+arrList);
		
		Collections.sort(arrList, Collections.reverseOrder());  //Descending order
		System.out.println("Descending sorted Array List: "+arrList);
	}

}
