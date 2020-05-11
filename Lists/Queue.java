import java.util.Arrays;

// Queue class that acts as a list where "first in, first out"
public class Queue {
	private int capacity = 5;
	private String[] line = new String[capacity];
	private int size = 0;
	
	public void enqueue(String subject) {
		if (size == capacity) {
			System.out.println("The queue is full. Please wait until there is room.");
		} else {
			line[size] = subject;
			size++;
		}
	}
	
	public String dequeue() {
		if (size == 0) {
			System.out.println("The queue is empty.");
			return "";
		} else {
			String front = line[0];
			
			for (int i = 1; i < capacity; i++) {
				line[i-1] = line[i];
			}
			
			line[capacity-1] = "";
			size--;
			
			return front;
		}
	}
		
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void show() {
		System.out.println(Arrays.deepToString(line));
	}
		
}
	


