import java.util.*;

public class Recursive {
	// Program that implements recursive methods where solutions involve calling a method within itself until a solution is derived
	// Recursive method to compute m(i)
	public static double m(int i) {
		if (i == 1) {
			return 1.0/3.0;
		} else {
			return (i/((2.0*i)+1)) + m(i-1);
		}
	}
	
	// Recursive program to find X^y where X and y are integers and y>0
	public static int power(int X, int y) {
		if (y == 0) {
			return 1;
		} else {
			return X * power(X, y-1);
		}
	}
	
	// Fibonacci sequence using iterations
	public static int Fibonacci(int n) {
		int first;
		int second = 0;
		int end = 1;
		if (n == 0) {
			return 0;
		}
		for (int count = 1; count < n; count++) {
			first = second;
			second = end;
			end = first + second;
		}
		return end;
	}
	

	public static void main(String[] args) {
		// Compute m(i) for i = 1,2,...,10
		System.out.println("Testing m(i) recursion program...");
		for (int count = 1; count <= 10; count++) {
			System.out.printf("%d: %.3f%n", count, m(count));
		}
		
		// Compute X^y for X = 2 and y = 1,2,...,10
		System.out.println("Testing power recursion program...");
		for (int count = 1; count <= 10; count++) {
			System.out.printf("2^%d: %d%n", count, power(2, count));
		}
		
		// Compute Fibonacci sequence for given input
		Scanner input = new Scanner(System.in);
		System.out.println("Testing Fibonacci iteration program...");
		System.out.print("Please enter an integer: ");
		int index = input.nextInt();
		System.out.printf("The Fibonacci number of index %d is %d%n", index, Fibonacci(index));
		input.close();

	}

}
