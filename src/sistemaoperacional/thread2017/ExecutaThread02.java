package sistemaoperacional.thread2017;

public class ExecutaThread02 extends Thread {
	public void run() {
		MinhaThreadPrincipal.y = 1;
		yield();
		System.out.println("____________FIM");
		 
		if (MinhaThreadPrincipal.x == 0) {
			System.out.println("2");
		}
	}
}