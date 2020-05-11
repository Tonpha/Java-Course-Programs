
public class LinearSearch {
	// Method that searches for an objective in the array
	public static int linearSearch(String[] array, String key) {
		// Iterate through the array and check each index
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		// Return -1 if the key is not found
		return -1;
	}

	public static void main(String[] args) {
		// Program that finds a char in a string
		String[] s1 = {"String","Other","Nothing"};
		
		int result = linearSearch(s1,"Other");
		
		if (result == -1) {
			System.out.println("String not found.");
		} else {
			System.out.printf("String found at index of %d.\n", result);
		}

	}

}
