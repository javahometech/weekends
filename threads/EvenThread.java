
public class EvenThread extends Thread{
	public void run() {
		Tasks t = new Tasks();
		try {
			t.evenNumbers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
