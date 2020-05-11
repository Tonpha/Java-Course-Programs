import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// Program to read 5 double numbers from keyboard and add them to ArrayList.
		// Then find the max element of ArrayList and print it.
		Scanner input = new Scanner(System.in);
		ArrayList<Double> myList = new ArrayList<Double>();
		double max = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Please enter a double number for the list: ");
			myList.add(input.nextDouble());
		}
		for (int i = 0; i < myList.size(); i ++) {
			if (myList.get(i) > max) {
				max = myList.get(i);
			}
		}
		System.out.println("The maximum double in the ArrayList is " + max);
		
		input.close();

	}

}
