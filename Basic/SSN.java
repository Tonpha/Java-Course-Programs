import java.util.*;

public class SSN {
	// Program that asks for a SSN input and check if the format is correct
	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Create a String variable for the SSN and the appended portion
		String SSN;
		
		// Ask for an input and assign it to a string variable
		System.out.print("Enter your SSN (DDD-DD-DDDD): ");
			SSN = input.next();
			
		// Check if the input is the right length
		if (SSN.length() > 11 || SSN.length() < 11) {
			System.out.println("Your input is not the right length. Please follow the given format. Try Again.");
			System.exit(1);
		} 
		
		// Check if each number is actually a digit using a loop
		for (int i = 0; i < SSN.length(); i++) {
			if (i == 3 || i == 6) {
				if (SSN.charAt(i) != '-') {
					System.out.println("Please remember to include the dashes (-). Try Again.");
					System.exit(2);
				} else {
					continue;
				}
			} else if (!(Character.isDigit(SSN.charAt(i)))) {
				System.out.println("Please only enter digits for the D's. Try again.");
				System.exit(3);
			}
		}
				
		// Display the final SSN
		System.out.println("Thank you for your input. Your SSN is " + SSN);
		
		input.close();

	}

}
