import java.util.Arrays;

public class ShiftingArray {
	// Method that returns an array with the elements shifted one to the left
	public static double[] shiftLeft(double[] list) {
		// Create an empty array of the same size as the input
		double[] result1 = new double[list.length];
		
		// Loop through the input array and set elements to one index to the left on the new array
		for (int i = 0; i < list.length; i++) {
			// The first element is set to the end of the new array
			if (i == 0) {
				result1[list.length - 1] = list[i];
			} else {
				result1[i - 1] = list[i];
			}
		}
		// Return the new array
		return result1;
	}
	
	// Method that returns an array with the elements shifted one to the right
	public static double[] shiftRight(double[] list) {
		// Works the same way as the shiftLeft method but in the opposite direction
		double[] result2 = new double[list.length];
		
		for (int i = list.length - 2; i >= 0; i--) {
			result2[i + 1] = list[i];
		}
		
		result2[0] = list[list.length - 1];
		
		return result2;
	}

	public static void main(String[] args) {
		// Testing the array shift methods
		double[] myNums = {5.0, 2.3, 7.5, 6.2, 1.0};
		
		System.out.println(Arrays.toString(shiftLeft(myNums)));
		
		System.out.println(Arrays.toString(shiftRight(myNums)));
		
	}

}
