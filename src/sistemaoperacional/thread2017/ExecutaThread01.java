package sistemaoperacional.thread2017;

public class ExecutaThread01 extends Thread {
	public void run() {
		MinhaThreadPrincipal.x = 1;
		yield();
		System.out.println("____________FIM");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (MinhaThreadPrincipal.y == 0) {
			System.out.println("1");
		}	
	}
}