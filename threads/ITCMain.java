
public class ITCMain {
public static void main(String[] args) {
	MyQueue q = new MyQueue();
	PublisherThread t1 = new PublisherThread(q);
	ConsumerThread t2 = new ConsumerThread(q);
	t1.start();
	t2.start();
}
}
