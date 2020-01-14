import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<String> queue;
	
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			
				String msg = queue.poll();
				
				System.out.println("[Consumer] : " + msg + ", [" + queue.size() + "]");
			} catch (InterruptedException e) {
					e.printStackTrace();
			}			
		}
	}

}