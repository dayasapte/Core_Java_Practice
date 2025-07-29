package july_26;


class Container<T>
{
T value;
T id;
T key;
}


public class GenericsDemo {

	public static void main(String[] args) {
		
		Container<Integer> object = new Container<>();
		
		object.value = 123;
		object.id = 101;
		object.key = 1000;
		
		Container<String> object1 = new Container<String>();
		object1.value = "Dayanand";
		object1.id = "Sapte";
		object1.key = "Automation";
		

	}

}
