import java.util.PriorityQueue;
import java.util.Random;

public class CarQueue {
	PriorityQueue<Integer> queue;
	Random random;

	public CarQueue() {
		queue = new PriorityQueue<Integer>();
		random = new Random();
		queue.add(random.nextInt(4));
		queue.add(random.nextInt(4));
		queue.add(random.nextInt(4));
		queue.add(random.nextInt(4));
		queue.add(random.nextInt(4));
	}


	public void addToQueue() {
		class MyRunnable implements Runnable {
			public void run() {
				try {
					while(true) {
						queue.add(random.nextInt(4));
						Thread.sleep(100);
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		Runnable running = new MyRunnable();
		Thread thread = new Thread(running);
		thread.start();
	}

	public int deleteQueue() {
		return queue.remove();
	}
}


