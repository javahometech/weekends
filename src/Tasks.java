
public class Tasks {
	void oddNumbers() throws InterruptedException {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				Thread.sleep(500);
				System.out.println("Odd " + i);
			}
		}
	}

	void evenNumbers() throws InterruptedException {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				Thread.sleep(500);
				System.out.println("Even " + i);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		final Tasks task = new Tasks();
		Thread t1 = new Thread(){
			public void run() {
				// print odd numbers
				try {
					task.oddNumbers();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(){
			// print even numbers
			public void run() {
				try {
					task.evenNumbers();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}
