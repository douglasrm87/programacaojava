package programacao2.aula03;

public class CarrinhoHeranca {
	// Nesta classe que passou a ausar heran�a poderemos ter um �nico m�todo
	// para cada item que seja necess�rio comercializar. sem heran�a para cada
	// novo imte um novo conjunto de m�todos e atributos precisam ser criados.
	// Comparar com a classe Carrinho a diferen�a.
	final static int TAM = 100;
	Vestuario vestuarioVetor[] = new Vestuario[TAM];
	int contadorVestuario = 0;
	// Passamos a receber a superclasse como par�rametro.
	// A classe VestuarioConstrutor representa todos os itens que vendemos.
	public void adicionarVestuario(Vestuario vestGenerico) {
		this.vestuarioVetor[this.contadorVestuario] = vestGenerico;
		this.contadorVestuario++;
	}
	public double calcularValorVestuario() {
		double total = 0.0;
		for (int i = 0; i < this.contadorVestuario; i++) {
			total += this.vestuarioVetor[i].preco;
			System.out.println(this.vestuarioVetor[i]);
		}
		return total;
	}
}
