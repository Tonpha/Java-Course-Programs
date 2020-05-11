import java.util.*;

public class StringScanner {

	public static void main(String[] args) {
		// Making a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters for your major and year: ");
		String s1 = input.nextLine();
		
		input.close();
		
		// Ensuring that the characters are in upper case
		String s = s1.toUpperCase();
		
		// Checking the characters and printing the appropriate categories
		if (s.charAt(0) == 'M') {
			System.out.print("Your major is Math, ");
		} else if (s.charAt(0) == 'C') {
			System.out.print("Your major is Computer Science, ");
		} else if (s.charAt(0) == 'I') {
			System.out.print("Your major is Information Technology, ");
		} else {
			System.out.print("Invalid input: Major input is wrong.");
			System.exit(1);
		}
		
		if (s.charAt(1) == '1') {
			System.out.println("and you are a Freshman.");
		} else if (s.charAt(1) == '2') {
			System.out.println("and you are a Sophomore.");
		} else if (s.charAt(1) == '3') {
			System.out.println("and you are a Junior.");
		} else if (s.charAt(1) == '4') {
			System.out.println("and you are a Senior.");
		} else {
			System.out.println("Invalid input: Year input is wrong.");
			System.exit(2);
		}

	}

}
