
public class SmallIntBySquared {

	public static void main(String[] args) {
		// Program that finds the smallest integer with a squared value of greater than 12000 using a while loop
		int n = 0;
		
		// Increment the integer until its square is greater than 12000
		while (Math.pow(n, 2) <= 12000) {
			n++;
		}
		
		// Print the final integer once the loop finishes
		System.out.println(n);

	}

}
