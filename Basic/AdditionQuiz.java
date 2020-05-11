import java.util.*;

public class AdditionQuiz {

	public static void main(String[] args) {
		// Creating a Random class object
		Random rand = new Random();
		
		// Generating two random numbers from the object
		int number1 = rand.nextInt(1000);
		int number2 = rand.nextInt(1000);
		
		// Creating a system input object
		Scanner input = new Scanner(System.in);
		
		// Asking question
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		// Setting user input to a variable
		int answer = input.nextInt();
		
		// Closing the input object; optional
		input.close();
		
		// Checking if the user input is the correct answer
		if (answer == number1 + number2) {
			System.out.println("You are correct!");
		} else {
			System.out.println("Sorry, you are wrong!");
			System.out.println("The correct answer is " + (number1 + number2) + ".");
		}
		
	}

}
