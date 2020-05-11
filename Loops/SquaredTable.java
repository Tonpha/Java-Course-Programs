
public class SquaredTable {

	public static void main(String[] args) {
		// Program that prints a table of numbers from 0 to 20 and their corresponding squares
		System.out.println("Number \t Square");
		
		// Loop from 0 to 20
		for (int i = 0; i <= 20; i++) {
			
			// Print the current number and its square in columns
			System.out.printf("%d \t %d \n", i, (int)Math.pow(i, 2));
		}

	}

}
