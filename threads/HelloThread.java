
public class HelloThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Welcome I'm a thread");
	}
	
	public static void main(String[] args) {
		HelloThread t = new HelloThread();
		t.setDaemon(true);
		t.start();
	}
}
