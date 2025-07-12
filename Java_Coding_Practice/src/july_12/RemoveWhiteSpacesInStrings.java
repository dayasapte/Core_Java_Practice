package july_12;

public class RemoveWhiteSpacesInStrings {

	public static void main(String[] args) {
		
		String str = "Da ya na nd Sa p       te    Au     to m a t     ion";
		str = str.replaceAll("\\s", ""); //remove all spaces 
		System.out.println(str);

	}

}
