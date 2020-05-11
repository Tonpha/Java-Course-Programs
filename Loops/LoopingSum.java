
public class LoopingSum {
	// Program that sums up the looping variable
	public static void main(String[] args) {
		int start = 2;
		int end = 10;
		int total = 0;
		if (start <= end) {
			for (int i = start; i <= end; i++) {
				total += i;
			}
		} else {
			for (int i = start; i >= end; i--) {
				total += i;
			}
		}
		
		System.out.printf("The sum of all integers from %d to %d is %d.%n", start, end, total);

	}

}
