
public class MyRunnable implements Runnable{

	public void run() {
		System.out.println("Hello Thread using runnable");
	}

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		
		Thread t = new Thread(my);
		t.start();
//		1) start() creates new stack
//		2) class my.run() on a new stack
	}
}
