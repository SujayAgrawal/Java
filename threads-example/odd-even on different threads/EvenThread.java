package practice;

public class EvenThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 2 == 0) {
				System.out.println("EVEN " + i + " thread name " + Thread.currentThread().getName());
			}
		}
	}
}
