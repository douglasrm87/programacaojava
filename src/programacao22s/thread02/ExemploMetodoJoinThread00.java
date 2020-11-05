package programacao22s.thread02;

public class ExemploMetodoJoinThread00 extends Thread {
	public void run() {
		System.out.println("A classe ExemploMetodoJoinThread00 que possui a thread: " + getName()
				+ " 			esta	executando.");
		for (int i = 0; i < 5; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Erro na execução da thread01");
			}
			System.out.println("Da classe ExemploMetodoJoinThread00 um alo da thread: " + getName());
		}
	}

}
