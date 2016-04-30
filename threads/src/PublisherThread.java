
public class PublisherThread extends Thread {
	MyQueue q;
	
	public PublisherThread(MyQueue q) {
		this.q = q;
	}

	public void run() {
		q.publish();
	}
}
