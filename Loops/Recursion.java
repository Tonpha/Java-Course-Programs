
public class Recursion {
	
	// Recursion method that adds 10 a certain amount of times
	public static int recursive(int amount, int times) {
		if (times <= 1) {
			return amount;
		} else {
			return amount + recursive(amount, times-1);
		}
	}
	
	public static void main(String[] args) {
		// Testing the recursion method
		int a = 10;
		int b = 5;
		
		System.out.println("Adding a to itself b times results in " + recursive(a,b));
	}

}
