
public class ConsumerThread extends Thread {
	MyQueue q;
	
	public ConsumerThread(MyQueue q) {
		this.q = q;
	}

	public void run() {
		q.consume();
	}
}
