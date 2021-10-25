package programacaooo20212.aula07.view;

public class VetorUnidimensional extends ClasseAbstrataDimensao {

	protected int[] dim1;
	protected static int linha;

	@Override
	public  void imprimir() {
		for (int i = 0; i < this.dim1.length; i++) {
			System.out.println("Elemento " + i + " : " + this.dim1[i]);
		}
	}

	@Override
	public void adicionar(int valor) {
		this.dim1[linha] = valor;
		linha++;
		if (linha == this.dim1.length) {
			System.out.println("Vetor foi excedido. O próximo valor será colocado na posição 0 do vetor. Recomeçando.");
			linha = 0;
		}
	}

	public VetorUnidimensional(int novaDim) {
		super();
		if (novaDim <= 0 || novaDim > 2000000) {
			throw new IllegalArgumentException("Dimensao viola os limites do int.");
		}
		this.dim1 = new int[novaDim];
	}

	public VetorUnidimensional() {
		super();
		this.dim1 = new int[TAMANHO];
	}

}
