
public class OddThread extends Thread{
	public void run() {
		Tasks t = new Tasks();
		try {
			t.oddNumbers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
