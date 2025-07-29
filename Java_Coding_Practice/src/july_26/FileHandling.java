package july_26;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		
		//Create a new text file 
		/*File fileobj = new File("Test.txt");
		fileobj.createNewFile(); */
		
	    //write some information into the file
		/*
		FileWriter writer = new FileWriter("Test.txt");
		writer.write("This is for writing information to file\nMy Name is Dayanand");
		writer.close();
		*/
		
		//Read the information from file
		/*
		File myFile = new File("Test.txt");
		Scanner sc = new Scanner(myFile);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		*/
		
		//Delete the file
		File file = new File("Test.txt");
		if(file.delete()) {
			System.out.println("File is deleted");
		}
		else {
			System.out.println("File is not deleted");
		}
		

	}

}
