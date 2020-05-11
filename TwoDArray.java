
public class TwoDArray {

	public static void main(String[] args) {
		// Program that prints all elements of a 2D array with the rows and columns switched
		int[][] m = {{1,2,3},{4,5,6}};
		
		// Iterate through each column
		for (int i = 0; i < m[0].length; i++) {
			// Iterate through each row
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[j][i]);
			}
			System.out.println();
		}
		
		// Program that sums up the elements by column
		for (int i = 0; i < m[0].length; i++) {
			int total = 0;
			for (int j = 0; j < m.length; j++) {
				total += m[j][i];
			}
			System.out.println("The sum of column " + i + " is " + total);
		}

	}

}
