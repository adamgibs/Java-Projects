/*
 * Author: Adam Gibson
 * Date: 03/30/2018
 * Description: This program allows users to input any number of words, one at a time, via the console. The program sorts
 * them alphabetically and then displays both the original and sorted list in columns along with the total number
 * of characters entered.
 * */

package String_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * 1.Get input from user and put in ArrayList
		 * 2.Get total character count in ArrayList
		 * 3.Copy the ArrayList to a String[]
		 * 4.Sort the String[].
		 * 5.Display both as lists
		 * */	
		
		ArrayList<String> words = new ArrayList<>();		
		String[] wordsCopy;				
		int count;
		
		words = getUserInput();				
		count = getArrayListCount(words);
		wordsCopy = words.toArray(new String[words.size()]);
		
		Arrays.sort(wordsCopy);
		displayArrays(words, wordsCopy, count);
								
	}

	public static void displayArrays(ArrayList<String> stringList, String[] stringArray, int count) {
		//Displays header for columns
		System.out.printf("%s%18s\n", "Original", "Sorted");
		//Loop that displays each item in list under it's respective header
		for(int i = 0; i < stringList.size(); i++) {
			System.out.printf("%-20s%-10s\n", stringList.get(i), stringArray[i]);
		}
		
		//Displays the total count
		System.out.println("\nTotal characters entered: " + count);				
	}
	
	//Gets a count of all the chars in an ArrayList<String>
	public static int getArrayListCount(ArrayList<String> stringList) {
		int count = 0;
		for(String i : stringList) {
			count += i.length();
		}
		return count;
	}
	
	//Gets user input and adds it to an ArrayList<String>. Returns the ArrayList.
	public static ArrayList<String> getUserInput(){
		Scanner stdIn = new Scanner(System.in);	
		String userInput;
		ArrayList<String> words = new ArrayList<>();
		
		System.out.println("Please input a word or press Ctrl + Z to quit.");
				
		while(stdIn.hasNext()) {
			userInput = stdIn.next();
			words.add(userInput);
									
			System.out.println("Please input one word at a time or press Ctrl + Z to quit.");								
		}
		stdIn.close();
		return words;
	}
}
