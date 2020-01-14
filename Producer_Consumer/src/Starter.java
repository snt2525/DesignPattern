
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Starter {
	static BlockingQueue<String> queue;
	public static void main(String[] args) {
		queue = new LinkedBlockingQueue();
		
		//BlockingQueue queue = new LinkedBlockingQueue();
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
		
	}
}