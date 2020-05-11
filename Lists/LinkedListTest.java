import java.util.ArrayList;

public class LinkedListTest {

	public static void main(String[] args) {
		// Testing LinkedList class methods
		LinkedList<String> testList = new LinkedList<String>();
		testList.addANoteToStart("End");
		testList.addANoteToStart("Middle");
		testList.addANoteToStart("Start");
		testList.addANoteToStart("Test");
		testList.showList();
		testList.deleteHeadNode();
		testList.showList();
		
		// Testing onList() method
		System.out.println("Is the word 'Test' on this list? " + testList.onList("Test"));
		System.out.println("Is the word 'End' on this List? " + testList.onList("End"));
		
		// Testing toArrayList() method
		ArrayList<String> newList = testList.toArrayList();
		System.out.println(newList);

	}

}
