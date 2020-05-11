import java.util.ArrayList;

// Implementation of LinkedLists as an alternative to ArrayLists
public class LinkedList<E> {
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void showList() {
		Node position = head;
		while (position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}
	
	public int length()
	{
		int count = 0;
		Node position = head;
		while (position != null) {
			count++;
			position = position.link;
		}
		return count;
	}
	
	public void addANoteToStart(E addData) {
		head = new Node(addData, head);
	}
	
	public void deleteHeadNode() {
		if (head != null) {
			head = head.link;
		} else {
			System.out.println("Deleting from an empty list.");
			System.exit(0);
		}
	}
	
	// onList method that tests if the element is in the list. Returns true if
	// it is and returns false if it is not
	public boolean onList(E target) {
		boolean result = false;
		Node position = head;
		while (position != null) {
			if (position.data == target) {
				result = true;
			}
			position = position.link;
		}
		return result;
	}
	
	// convert LinkedList to ArrayList
	public ArrayList<E> toArrayList(){
		ArrayList<E> result = new ArrayList<E>();
		Node position = head;
		while (position != null) {
			result.add(position.data);
			position = position.link;
		}
		return result;
	}
	
	private class Node {
		private E data;
		private Node link;
		
		@SuppressWarnings("unused")
		public Node() {
			link = null;
			data = null;
		}
		
		public Node(E newData, Node linkValue) {
			data = newData;
			link = linkValue;
		}
	}
	
	

}
