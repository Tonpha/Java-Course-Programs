import java.util.*;

public class GPA {

	public static void main(String[] args) {
		// Program to read a letter A to F and print the numeric value for the grade
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the letter grade (A-F): ");
		String c = input.next().toUpperCase();
		
		if (c.equals("A")) {
			System.out.println("4");
		} else if (c.equals("B")) {
			System.out.println("3");
		} else if (c.equals("C")) {
			System.out.println("2");
		} else if (c.equals("D")) {
			System.out.println("1");
		} else if (c.equals("F")) {
			System.out.println("0");
		} else {
			System.out.println("Error: Invalid Input");
			System.exit(1);
		}
		
		input.close();

	}

}
