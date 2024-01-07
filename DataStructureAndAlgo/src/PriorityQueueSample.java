import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		empty param will not be in reversed order
		Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
		
		queue.offer(1.5);
		queue.offer(3.5);
		queue.offer(2.5);
		queue.offer(4.5);
		queue.offer(10.5);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
