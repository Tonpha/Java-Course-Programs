import java.io.*;
import java.util.*;

public class Grader2D {

	public static void main(String[] args) throws FileNotFoundException {
		// Program that takes in a 2D array input text or grades and outputs a 2D array of grades and an average
		// First, make the input and output file objects
		Scanner input = new Scanner(new File("input.txt"));
		PrintWriter output = new PrintWriter("grades.txt");
		
		// Make the 2D array used to import numbers and place results
		double[][] results = new double[20][4];
		double sum;
		
		// Loop through the input file and place numbers into the array
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 3; j++) {
				results[i][j] = (double)input.nextInt();
			}
		}
		
		//System.out.println(Arrays.deepToString(results));
		
		// Loop through the data and calculate the average for each row, placing the
		// result in the last column of the 2D array
		for (int i = 0; i < results.length; i++) {
			sum = 0;
			for(int j = 1; j < 3; j++) {
				sum += results[i][j];
			}
			results[i][3] = sum / 3;
		}
		
		//System.out.println(Arrays.deepToString(results));
		
		// Loop through the 2D array once more to print all the values into the output file
		for (int i = 0; i < results.length; i++) {
			for (int j = 0; j < results[0].length; j++) {
					output.printf("%.2f\t",results[i][j]);
			}
			output.println();
		}
		
		// Close both the input and output objects
		output.close();
		input.close();
	}

}
