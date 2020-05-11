
public class maxDoubleList {
	// Program finds the max of an array of doubles
	public static double maxArray(double[] list) {
		// Set a max variable equal to the first element
		double max = list[0];
		// Iterate through the list and check if each element is greater than the max
		for (int i = 1; i < list.length; i++) {
			if (list[i] > max) {
				// If an element is greater than the current max, replace the max with it
				max = list[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		double[] myList = {5.0, 2.3, 7.5, 6.2, 1.0};
		
		System.out.println("The max of this list is " + maxArray(myList));
	}

}
