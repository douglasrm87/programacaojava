package programacao22s.thread02;

public class ExemploDaemonNormal extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				/*
				 * Quando esta thread terminar irá automaticamente encerrar a thread daemon.
				 */
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Erro dentro do for");
			}
			System.out.println(" Sou uma thread normal");
		}
		System.out.println(" A thread normal esta sendo encerrada.");
	}
}
