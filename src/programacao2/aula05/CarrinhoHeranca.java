package programacao2.aula05;

public class CarrinhoHeranca {
	// Nesta classe que passou a ausar herança poderemos ter um único método
	// para cada item que seja necessário comercializar. sem herança para cada
	// novo imte um novo conjunto de métodos e atributos precisam ser criados.
	// Comparar com a classe Carrinho a diferença.

	final static int TAM = 100;

	VestuarioConstrutorMetodoAbstrato vestuarioVetor[] = new VestuarioConstrutorMetodoAbstrato[TAM];
	int contadorVestuario = 0;

	// PAssamos a receber a superclasse como parãrametro.
	// A classe VestuarioConstrutor representa todos os itens que vendemos.
	public void adicionarVestuario(VestuarioConstrutorMetodoAbstrato vestGenerico) {
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
