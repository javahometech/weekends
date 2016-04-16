
public class HelloThread extends Thread {
	public void run() {
		System.out.println("Welcome I'm a thread");
	}
	
	public static void main(String[] args) {
		HelloThread t = new HelloThread();
		t.start();
	}
}
