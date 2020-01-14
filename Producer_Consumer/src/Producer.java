import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			
				String msg = new Date().toString();			
				queue.add(new Date().toString());
				
				System.out.println("[Producer] : " + msg + ", [" + queue.size() + "]");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}