import java.util.*;

public class Vowel_SubstringCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Program reads the first letter entered from keyboard and determines if it is a vowel
		System.out.print("Enter a letter: ");
		String s = input.next();
		
		// Check if the user input is the correct format
		if (s.length()>1) {
			System.out.println("Error: Please enter only ONE letter.");
			System.exit(1);
		}
		
		// Set a char variable equal to the uppercase form of the input
		char c = s.toUpperCase().charAt(0);
		
		// Check if the character is a vowel
		if (c=='A' | c=='E' | c=='I' | c=='O' | c=='U') {
			System.out.println("Your letter is a vowel!");
		} else if (!Character.isLetter(c)) {
			// Check if the character is numeric
			System.out.println("Error: Please only enter letters.");
			System.exit(2);
		} else {
			// The character is a non-vowel letter
			System.out.println("Your letter is not a vowel.");
		}
		
		// Program reads two strings from keyboard and checks if the second string is a substring of the first
		System.out.print("Please enter a string: ");
		String s1 = input.next();
		System.out.print("Please enter another string: ");
		String s2 = input.next();
		
		if (s1.indexOf(s2) >= 0) {
			// If the method returns 0 or greater, the argument string is a substring of the object
			System.out.println("The second string IS a substring of the first.");
		} else {
			System.out.println("The second string IS NOT a substring of the first.");
		}
		
		input.close();

	}

}
