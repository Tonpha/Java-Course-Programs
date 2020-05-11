import java.util.*;

public class ReversedNumbers {
	// Program that prints the reverse of the integer argument
	public static void reverse(int num) {
		
		System.out.print("The reversed number is ");
		
		// Continuously loop while the number is greater than 0
		while (num > 0) {
			// Print the remainder of the number divided by 10, which is the number in the ones place
			System.out.print(num % 10);
			// Divide the number by 10 to shift the ones place
			// Since the variable is an integer, it will round down
			num = num / 10;
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a large number: ");
		int n = input.nextInt();
		
		reverse(n);
		
		input.close();

	}

}
