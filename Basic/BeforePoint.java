import java.util.*;

public class BeforePoint {

	public static void main(String[] args) {
		// Program reads floating-point number from keyboard and finds number of digits before point
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a floating point number: ");
		String f = Double.toString(input.nextDouble());
		int d = f.indexOf('.');
		System.out.println("The number of digits before the period is " + d);
				
		input.close();

	}

}
