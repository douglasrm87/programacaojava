package programacao2.aula03;

public class Carrinho {
	// Atributos
	final static int TAM = 100;

	// Aqui ja observamos variaveis redundantes.
	//Para cada novo item adicionaremos 15 linhas de código.
	// Para resolver este modelo de programação é que existe herança.
	Cinto cintoVetor[] = new Cinto[TAM];
	int contadorCinto = 0;
	public void adicionarCinto(Cinto cinto) {
		// Aqui precisa controlar se a quantidade m´xima de camisas foi
		// alcançada. Devido ao uso de vetores
		this.cintoVetor[this.contadorCinto] = new Cinto();
		this.cintoVetor[this.contadorCinto] = cinto;
		this.contadorCinto++;
	}
	public double calcularValorCinto() {
		double total = 0.0;
		for (int i = 0; i < this.contadorCinto; i++) {
			total += this.cintoVetor[i].preco;
			System.out.println(this.cintoVetor[i]);
		}
		return total;
	}
	
	Camisa camisaVetor[] = new Camisa[TAM];
	int contadorCamisa = 0;

	Calca calcaVetor[] = new Calca[TAM];
	int contadorCalca = 0;

	// Observamos que os metodos passam a ser duplicados para cada novo item a
	// ser vendido
	public void adicionarCamisa(Camisa cam) {
		// Aqui precisa controlar se a quantidade m´xima de camisas foi
		// alcançada. Devido ao uso de vetores
		this.camisaVetor[this.contadorCamisa] = new Camisa();
		this.camisaVetor[this.contadorCamisa] = cam;
		this.contadorCamisa++;
	}

	public void adicionarCalca(Calca cal) {
		// Aqui precisa controlar se a quantidade máxima de camisas foi
		// alcançada. Devido ao uso de vetores
		this.calcaVetor[this.contadorCamisa] = new Calca();
		this.calcaVetor[this.contadorCamisa] = cal;
		this.contadorCalca++;
	}

	public double calcularValorCalca() {
		double total = 0.0;
		for (int i = 0; i < this.contadorCalca; i++) {
			total += this.calcaVetor[i].preco;
			System.out.println(this.calcaVetor[i]);
		}
		return total;
	}

	public double calcularValor() {
		double total = 0.0;
		// Não devemos utilizar o tamanho total, pois pode ser que tenha sido
		// comprado apenas uma ou 2 camisas e seguir até o tamanho do vetor vai
		// gerar erro
		/*
		 * Exception in thread "main" java.util.InputMismatchException at
		 * java.util.Scanner.throwFor(Unknown Source) at
		 * java.util.Scanner.next(Unknown Source) at
		 * java.util.Scanner.nextInt(Unknown Source) at
		 * java.util.Scanner.nextInt(Unknown Source) at
		 * aulaP201.Frenteloja.main(FrenteLoja.java:15) Picked up
		 * JAVA_TOOL_OPTIONS: -Djava.vendor="Sun Microsystems Inc."
		 */
		for (int i = 0; i < /* this.camisaVetor.length */
		this.contadorCamisa; i++) {
			total += this.camisaVetor[i].preco;
			System.out.println(this.camisaVetor[i]);
		}
		return total;
	}

}
