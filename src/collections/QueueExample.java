package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("TEK");
		queue.add("Systems");
		queue.add("Global");

		System.out.println(queue);
		System.out.println("head:"+queue.element());
		
		System.out.println("head:"+queue.peek());
		System.out.println("Queue after peek"+queue);
		System.out.println("head:"+queue.poll());
		System.out.println("Queue after pool"+queue);

		Iterator<String> element = queue.iterator();

		while (element.hasNext()) {
			String string = (String) element.next();
			System.out.println(string);

		}

		PriorityQueue<Integer> queueInt = new PriorityQueue<>();

		queueInt.add(23);
		queueInt.add(20);
		queueInt.add(1);
		queueInt.add(24);

		System.out.println(queueInt);

		Iterator<Integer> element2 = queueInt.iterator();

		while (element2.hasNext()) {
			int i = (int) element2.next();
			System.out.println(i);

		}

	}

}
