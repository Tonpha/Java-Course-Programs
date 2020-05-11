import java.util.*;

public class RandomElapsedTime {
	// Method that generates random numbers using Random and Math and print the time elapsed
	public static long randomTimeElapsed(int x) {
		// Create Random class object
		Random rng = new Random();
		
		int random1;
		// Set a variable equal to the system time when starting process
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < x; i++) {
			random1 = rng.nextInt(100);
			//random1 = (int) rng.nextDouble() * 100;
		}
			
		long end = System.currentTimeMillis();
		// Return the time elapsed from start to finish
		return end - start;
	}
		
	public static long mathTimeElapsed(int x) {
		long start = System.currentTimeMillis();
		
		int random2;
			
		for (int i = 0; i < x; i++) {
			random2 = (int) Math.random() * 100;
		}
			
		long end = System.currentTimeMillis();
		// Return the time elapsed from start to finish
		return end - start;
	}
		

	public static void main(String[] args) {
		// Testing randomTimeElapsed and mathTimeElapsed to find difference in speed
		int x = 5000000;
		System.out.printf("The time elapsed to generate %d numbers using the Random class is %d\n", x, randomTimeElapsed(x));
			
		System.out.printf("The time elapsed to generate %d numbers using the Math class is %d\n", x, mathTimeElapsed(x));

	}

}
