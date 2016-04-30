
public class MyQueue {
	String msg;
	public synchronized void publish(){
		for (int i = 1; i <= 10; i++) {
			if(msg != null){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			msg = "Msg-"+i;
			System.out.println("Publishing "+msg);
			notify();
		}
	}
	
	public synchronized void consume(){
		for (int i = 1; i <= 10; i++) {
			if(msg == null){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consuming"+msg);
			msg = null;
			notify();
		}
	}
}
