package programacao22s.thread02;

public class ExemploCorridaSaposThread extends Thread {
	String nome; // nome do sapo
	int distanciaCorrida = 0; // dist�ncia j� corrida pelo sapo
	int distanciaTotalCorrida; // dist�ncia a ser corrida pelo sapo
	int pulo = 0; // pulo do sapo em cm
	int pulos = 0; // quantidades de pulos dados na corrida
	static int colocacao = 0; // coloca��o do sapo ao final da corrida
	final static int PULO_MAXIMO = 50; // pulo m�ximo em cm que um sapo pode
	// dar

	/** Construtor da classe. Par�mtros : Nome do Sapo e Dist�ncia da Corrida */
	public ExemploCorridaSaposThread(String nome, int distanciaTotalCorrida) {
		/*
		 * chamando o construtor de Thread passando o nome do sapo como par�metro
		 */
		super(nome);
		this.distanciaTotalCorrida = distanciaTotalCorrida;
		this.nome = nome;
	}

	/** Imprime o �ltimo pulo do sapo e a dist�ncia percorrida */
	public void sapoImprimindoSituacao() {
		System.out.println("O " + this.nome + " pulou " + this.pulo + "cm \t e j� percorreu " + this.distanciaCorrida + "cm");
	}

	/** Faz o sapo pular */
	public void sapoPulando() {
		this.pulos++;
		this.pulo = (int) (Math.random() * PULO_MAXIMO);
		// System.out.println("Math.random(): "+Math.random());
		this.distanciaCorrida += pulo;
		if (this.distanciaCorrida > this.distanciaTotalCorrida) {
			this.distanciaCorrida = this.distanciaTotalCorrida;
		}
	}

	/** Representando o descanso do sapo */
	public void sapoDescansando() {
		/* M�todo que passa vez a outras threads */
		yield();
	}

	/** Imprime a coloca��o do sapo ao final da corrida */
	public void colocacaoSapo() {
		colocacao++;
		System.out.println(nome + " foi o " + colocacao + "� colocado com " + pulos + " pulos");
	}

	/** M�todo run da thread Corrida de Sapos */
	public void run() {
		while (this.distanciaCorrida < this.distanciaTotalCorrida) {
			sapoPulando();
			sapoImprimindoSituacao();
			sapoDescansando();
		}
		colocacaoSapo();
	}
}
