import java.util.Arrays;

public class BinarySearch {
	// Part 1: Method that searches for a number in an array using the binary search method
	public static int binarySearch(int[] num, int n) {
		// This method requires the input array to be sorted smallest to largest. The method Arrays.sort(array) can do this
		// Instantiate three index variables necessary for binary search
		int start = 0;
		int end = num.length - 1;
		int mid = (num.length - 1) / 2;
		
		// Create a loop that runs until either the number is found or the bounds no longer make sense
		while (start <= end) {
			if (num[mid] == n) {
				return mid;
			} else if (num[mid] < n) {
				// If the number in the middle is smaller than the objective, make the start bound one space larger than the middle
				start = mid + 1;
			} else {
				// If the number in the middle is larger than the objective, make the end bound one space smaller than the middle
				end = mid - 1;
			}
			// Recalculate the middle point after each loop iteration
			mid = (end + start) / 2;
		}
		// If the objective is not found, return -1 which means false
		return -1;
	}
	
	// Method that searches for a string in an array
	public static int stringSearch(String[] strings, String s) {
		// This method works the same way as the previous method
		// The only difference is a method must be used to compare the objective and the middle string
		int start = 0;
		int end = strings.length - 1;
		int mid = (start + end) / 2;
		
		while (start <= end) {
			// The compareTo() method is used to compare the objective string to the current middle string
			// If the method returns 0, the two strings are equal
			if (strings[mid].compareTo(s) == 0) {
				return mid;
			} else if (strings[mid].compareTo(s) > 0) {
				// If the method returns greater than 0, the middle is larger than the objective string
				end = mid - 1;
			} else {
				// If the method returns less than 0, the middle is smaller than the objective string
				start = mid + 1;
			}
			// Recalculating the middle after each loop iteration
			mid = (start + end) / 2;
		}
		
		return -1;
	}
	
	// Part 3: Method that compares two integer arrays and returns if all their elements are equal
	public static boolean equals(int[] list1, int[] list2) {
		// First, check if both lists are equal length
		if (list1.length != list2.length) {
			// If the lengths are not equal, return false
			return false;
		} else {
			// Iterate through the list indexes
			for (int i = 0; i < list1.length; i++) {
				if (list1[i] != list2[i]) {
					// If the components at an index do not match, return false
					return false;
				}
			}
		}
		// Return true if the method reaches reaches this point
		return true;
	}

	public static void main(String[] args) {
		// Testing Part 1
		int[] nums = {1,3,19,7,2,12,14,18,24};
		int number = 14;
		
		Arrays.sort(nums);
		
		System.out.printf("The index of %d is %d.\n", number, binarySearch(nums, number));
		
		// Testing Part 2
		String[] myStrings = {"This", "is", "a", "String"};
		String s = "String";
		
		Arrays.sort(myStrings);
		
		System.out.printf("The index of '%s' is %d.\n", s, stringSearch(myStrings, s));

		//Testing Part 3
		int[] nums1 = {1,2,3,4,6};
		int[] nums2 = {1,2,3,4,5};
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		System.out.println("The two arrays are equal: " + equals(nums1, nums2));
		
	}

}
