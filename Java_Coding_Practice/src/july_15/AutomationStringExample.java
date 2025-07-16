package july_15;

public class AutomationStringExample {

	public static void main(String[] args) {
		
		String str = "AuToMation";
		
		str = str.replaceAll("[a-z]", "");
		System.out.println(str);
	}

}
