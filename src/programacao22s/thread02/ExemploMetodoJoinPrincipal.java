package programacao22s.thread02;

public class ExemploMetodoJoinPrincipal {
	public static void main(String[] str) {
		ExemploMetodoJoinThread00 T0 = new ExemploMetodoJoinThread00();
		ExemploMetodoJoinThread01 T1 = new ExemploMetodoJoinThread01(T0);
		System.out.println("Iniciando a execução das threads.");
		T0.start();
		T1.start();
	}

}
