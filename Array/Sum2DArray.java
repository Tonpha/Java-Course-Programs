import java.util.*;

public class Sum2DArray {
	// Method that takes two 2D arrays and returns their sum
	public static double[][] addMatrix(double[][] m1, double[][] m2){
		double[][] result = new double[m1.length][m1[0].length];
		
		// Loop through each element and find their sum
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				// Assign the sum to the right element in the result matrix
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// Testing 2D array addition
		Scanner input = new Scanner(System.in);
		
		double[][] array1 = new double[3][3];
		double[][] array2 = new double[3][3];
		
		// Taking in user input to fill the 2D arrays
		System.out.print("Enter 9 numbers for array 1: ");
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				array1[x][y] = input.nextDouble();
			}
		}
		
		System.out.print("Enter 9 numbers for array 2: ");
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				array2[x][y] = input.nextDouble();
			}
		}
		
		input.close();
		
	}

}
