package collections;

import java.util.PriorityQueue;

public class QueuePeekAndPool {
	
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("TEK");
		queue.add("Systems");
		queue.add("Global");

		System.out.println("head:"+queue.element());
		
		System.out.println("head:"+queue.peek());
		System.out.println("Queue after peek"+queue);
		System.out.println("head:"+queue.poll());
		System.out.println("Queue after pool"+queue);
		System.out.println("head:"+queue.peek());

	}

}
