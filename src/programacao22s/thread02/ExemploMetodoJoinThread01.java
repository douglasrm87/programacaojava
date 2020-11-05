package programacao22s.thread02;

public class ExemploMetodoJoinThread01 extends Thread{
	private Thread atributoThread02;

	public ExemploMetodoJoinThread01(Thread T) {
		this.atributoThread02 = T;
	}

	public void run() {
		System.out.println("A classe ExemploMetodoJoinThread01 que possui a thread: " + getName()
				+ " esta esperando por " + this.atributoThread02.getName() + "...");
		try {
			// Aqui Utilizamos o Metodo Join
			this.atributoThread02.join();
		} catch (InterruptedException e) {
			System.out.println("Erro no metodo run na execução do método join");
		}
		System.out.println(this.atributoThread02.getName() + " terminou.");
		System.out.println("Alo, de " + getName());
	}

}
