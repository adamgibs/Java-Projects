package Read_Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFamilyTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * 1. Define data fields and types
		 * 2. Scan text file extracting data and assigning it to each field
		 * 3. Output information to the screen
		 * */
		
	      String textFile = "family.txt";
	      readTextFile(textFile);

	}
	
	//Takes a text file as an argument and prints information to console. Throws an exception
	//if file is not found.
	public static void readTextFile(String file) throws FileNotFoundException {
		Scanner input = new Scanner( new File( file ) );
		
	      
	      String firstName;
	      String lastName; 
	      int age;
	      String relation;
	      
	      //prints headers to console
	      System.out.printf( "%-12s%-12s%-8s%-10s\n",
	         "First Name", "Last Name", "Age", "Relation" );
	      
	      //scans file assigning text to the declared variables
	      while ( input.hasNext() ) 
	      {
	         
	         firstName = input.next(); 
	         lastName = input.next();
	         age = input.nextInt();
	         relation = input.next();

	         //prints out each row
	         System.out.printf( "%-12s%-12s%-8d%-10s\n",
	            firstName, lastName, age, relation );
	      } 

	      input.close(); 
	}
}
