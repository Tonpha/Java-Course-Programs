import java.util.*;

public class LetterCounter_AvgLoop {
	// Method that counts the amount of letters in a string
	public static int countLetters(String s) {
		// Create returned sum variable
		int num = 0;
		// Iterate through the string and check each character
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				num += 1;
			}
		}
		// Return the total number of letters
		return num;
	}
	
	// Method that averages a number of user inputs
	public static double avgLoop(int n) {
		Scanner inputNum = new Scanner(System.in);
		double avg = 0;
		double total = 0;
		
		// Loops a given number of times and asks for user input to calculate average
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter an integer: ");
			int num = inputNum.nextInt();
			total += num;
			avg = total/i;
			// Prints the current average and remaining amount of inputs each iteration
			System.out.printf("Your current average is %5.2f. You have %d numbers left to enter.\n", avg, n - i);
		}
		
		inputNum.close();
		
		// Return the final average
		return avg;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Practicing the printf method
		String s = "'This is a string.'";
		double d = 532.52389;
		int i = 36;
		
		System.out.printf("My string is %s, my double is %5.2f, and my integer is %d.\n", s, d, i);

		// Testing countLetters method
		System.out.print("Enter a string: ");
		String testS = input.next();
		System.out.printf("There are %d letters in your string.\n", countLetters(testS));
		
		// Testing avgLoop method
		System.out.print("Enter the number of integers to average: ");
		int count = input.nextInt();
		System.out.printf("Your final average is %5.2f.\n", avgLoop(count));
		
		input.close();
		
	}

}
