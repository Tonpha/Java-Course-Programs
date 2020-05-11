import java.util.Arrays;

public class Misc2DArray {
	
	public static int[] m1(int[][] m) {
		// A method to return the length and width of a 2d array as an array
		// First, create an empty array of length 2 to return later
		int[] result = new int[2];
		// Set the first number equal to the length of the 2d array
		result[0] = m.length;
		// Set the second number equal to the width of the 2d array
		result[1] = m[0].length;
		// Return the result
		return result;
	}

	public static void main(String[] args) {
		// Working with 2D arrays
		// Creating an empty 2D array
		int[][] array1 = new int[5][6];
		int[] x = {1,2};
		// Inserting a 1D array into a 2D array
		array1[0] = x;
		
		// Inspecting the 2D array
		System.out.println(array1[0][1]);
		System.out.println(Arrays.deepToString(array1));
		
		
		// Printing a 2D array starting from the last row and last column to the first
		int[][] array2 = {{1,2},{3,4},{5,6}};
		// Iterate through each row from the last to the first
		for (int i = array2.length-1; i >= 0; i--) {
			// Iterate through each column in the current row from the last to the first
			for (int j = array2[i].length-1; j >= 0; j--) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// Returns the sum of all the elements in the first column of the 2D array
		int[][] array3 = {{1,2},{3,4},{5,6}};
		int sum = 0;
		// Iterates through each row of the 2D array
		for (int i = 0; i < array3.length; i++) {
			// Adds the first element of the current row to the sum
			sum += array3[i][0];
		}
		// Prints the final sum
		System.out.println(sum);
		
		
		// Testing the m1 method at the beginning of this code
		int[][] array = {{1,2,3,4},{5,6,7,8}};
		System.out.println(m1(array)[0]);
		System.out.println(m1(array)[1]);
		
		
		// Fill an empty array with random double numbers between 0 and 100
		double[] r = new double[100];
		
		for (int i = 0; i < r.length; i++) {
			// Generating random doubles scaled between 0 and 100
			r[i] = Math.random() * 100;
		}

	}

}
