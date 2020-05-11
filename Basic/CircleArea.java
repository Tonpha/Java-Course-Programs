import java.util.*;

public class CircleArea {
	// Method to return the area of a circle, given a certain radius
	public static double areaCircle(double radius) {
		float pi = 3.14f;
		double area = radius * radius * pi;
		return area;
	}

	public static void main(String[] args) {
		// Create a system input object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius: ");
		double r = input.nextDouble();
		
		// Print the area of a circle given a radius of the user's input
		System.out.printf("The area of a circle with radius %.3f is %.3f", r, areaCircle(r));

		input.close();
		
	}

}
