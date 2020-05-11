import java.util.*;

public class SumLinkedList {

	public static void main(String[] args) {
		// Use Collection to make an integer linked list. Read its size from keyboard.
		// Find sum of the elements of list and Print it.
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		String command = "";
		
		while (!command.equalsIgnoreCase("end")) {
			System.out.println("Please enter a list command (add,remove,size,print,end): ");
			command = input.next();
			
			if (command.equalsIgnoreCase("add")) {
				System.out.println("Please enter an integer you would like to add: ");
				int newInt = input.nextInt();
				System.out.println("Please enter the index for this integer: ");
				int newIndex = input.nextInt();
				if (newIndex > list.size()) {
					list.add(newInt);
				} else {
					list.add(newIndex, newInt);
				}	
			} else if (command.equalsIgnoreCase("remove")) {
				System.out.println("Please enter the index of the element you would like to remove: ");
				int newIndex = input.nextInt();
				if (newIndex >= list.size()) {
					System.out.println("That index is too large.");
				} else {
					list.remove(newIndex);
				}
			} else if (command.equalsIgnoreCase("size")) {
				System.out.println("The size of this list is " + list.size());
			} else if (command.equalsIgnoreCase("print")) {
				System.out.println(list);
			} else if (command.equalsIgnoreCase("end")) {
				System.out.println("You have chosen to end this session. Confirm? (Y/N): ");
				String end = input.next();
				if (end.equalsIgnoreCase("N")) {
					command = "";
					System.out.println("Resuming...");
				} else {
					System.out.println("Understood. Good bye.");
				}
			} else {
				System.out.println("Command not recognized...");
			}
		}
		
		int sum = 0;
		while (list.size() > 0) {
			sum += list.poll();
		}
		System.out.println("The sum of the elements in this list is " + sum);
		
		input.close();
	}

}
