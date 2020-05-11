import java.util.*;

public class FinalCircle {

	public static void main(String[] args) {
		// Taking in user input for a radius to find the area of a given circle
		// Create a final variable for pi which can't be changed
		final float PI = 3.1415f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for the radius: ");
		double radius = input.nextDouble();
		
		input.close();
		
		double circleArea = radius * radius * PI;
		System.out.println("The area of a circle with a radius of " + radius + " is " + circleArea);
	}

}
