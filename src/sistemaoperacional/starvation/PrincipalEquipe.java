package sistemaoperacional.starvation;


public class PrincipalEquipe {
	public static void main(String[] args) {
		Funcionario worker = new Funcionario();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			new Thread(new Runnable() {
				public void run() {
					
					
					worker.work();
				}
			}).start();
		}
	}
}


