
public class Div5And6 {

	public static void main(String[] args) {
		// Program that prints all numbers that are divisible by 5 and 6 from 100 to 1000, ten per line
		int numInLine = 0;
		for (int i = 100; i <= 1000; i++) {
			
			// Check if the number is divisible by both 5 and 6
			if (i % 5 == 0 & i % 6 == 0) {
				numInLine += 1;
				
				// Check if this is the tenth number of this line
				if (numInLine == 10) {
					
					// Print the number and end the line, also reset the count
					System.out.println(i + "\t");
					numInLine = 0;
					
				} else {
					
					// Just print the number
					System.out.print(i + "\t");
				}
			}
		}
	}

}
