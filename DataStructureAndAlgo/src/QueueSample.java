import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Curry");
		queue.offer("James");
		queue.offer("Bryant");
		
		System.out.println(queue.peek());
		
		String goat = queue.poll();
		queue.poll();
		queue.offer(goat);
		
		System.out.println(goat);
		System.out.println(queue);
	}

}
