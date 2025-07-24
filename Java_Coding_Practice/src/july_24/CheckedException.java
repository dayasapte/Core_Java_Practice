package july_24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException  {
		
		System.out.println("Start of the Program");
		System.out.println("Statement1");
		
		
		//Thread.sleep(5000);
		FileInputStream file = new FileInputStream("C:\\Test.txt");
		
		System.out.println("Statement2");
		System.out.println("End of the Program");
	}

}
