
public class QueueTest {
	// Program that tests Queue methods: enqueue, dequeue, getSize, isEmpty, and show.

	public static void main(String[] args) {
		// Creating queue object.
		Queue q = new Queue();
		System.out.println("Is the queue empty? " + q.isEmpty());
		System.out.println("The size of the queue is " + q.getSize());
		q.show();
		
		// Testing empty queue dequeue method.
		System.out.println(q.dequeue());
		
		// Adding 5 elements to completely fill queue.
		q.enqueue("John");
		q.enqueue("Jane");
		q.enqueue("Josh");
		q.enqueue("Jake");
		q.enqueue("Jill");
		
		// Testing full queue enqueue method.
		q.enqueue("Full");
		
		// Inspecting size and if empty.
		System.out.println("Is the queue empty? " + q.isEmpty());
		System.out.println("The size of the queue is " + q.getSize());
		
		// Printing and removing 2 elements of queue.
		System.out.println("Next in line is " + q.dequeue());
		System.out.println("Next in line is " + q.dequeue());
		
		// Inspecting size and if empty again.
		System.out.println("Is the queue empty? " + q.isEmpty());
		System.out.println("The size of the queue is " + q.getSize());
		
		// Showing current queue.
		q.show();
	}

}
