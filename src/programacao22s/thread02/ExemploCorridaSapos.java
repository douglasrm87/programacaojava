package programacao22s.thread02;

public class ExemploCorridaSapos {
	/* Aplica��o que simula uma corrida de sapos usando threads */

	final static int NUM_SAPOS = 5; // QTE. de sapos na corrida

	final static int DISTANCIA = 500; // Dist�ncia da corrida em cm

	public static void main(String[] args) {
		/* colocando sapos na corrida */
		for (int i = 1; i <= NUM_SAPOS; i++) {
			ExemploCorridaSaposThread objThread = new ExemploCorridaSaposThread("SAPO_" + i, DISTANCIA);
			objThread.start();
			objThread.setPriority(i);
		}
	}
}
