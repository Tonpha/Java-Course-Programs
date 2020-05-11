import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StringRemover {
	// Program that reads a text file containing 20 words and adds them to
	// an Arraylist. Then prints and removes the words that start with
	// vowels.

	public static void main(String[] args) throws FileNotFoundException {
		// Adding all words from the file to an Arraylist.
		Scanner input = new Scanner(new File("input.txt"));
		ArrayList<String> words = new ArrayList<String>();
		
		while (input.hasNext()) {
			words.add(input.next().toLowerCase());
		}
		
		// Iterates through the Arraylist to print and remove words
		// that start with a vowel.
		int i = 0;
		
		while (i < words.size()) {
			if (words.get(i).charAt(0) == 'a' | words.get(i).charAt(0) == 'e' | words.get(i).charAt(0) ==  'i' | words.get(i).charAt(0) == 'o' | words.get(i).charAt(0) == 'u') {
				System.out.println(words.get(i));
				words.remove(i);
			} else {
				i++;
			}
		}
		
		// Prints the remaining Arraylist.
		System.out.println("Printing remaining words... " + words);
		
		input.close();
	}

}
