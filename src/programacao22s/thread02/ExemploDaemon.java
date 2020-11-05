package programacao22s.thread02;

public class ExemploDaemon extends Thread {

	public ExemploDaemon() {
		setDaemon(true);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("problemas dentro do for");
			}
			System.out.println(" Sou uma Thread daemon. execução: " + i + " De: 50" );
		}
		System.out.println(" A thread daemon esta sendo encerrada.");
	}
}