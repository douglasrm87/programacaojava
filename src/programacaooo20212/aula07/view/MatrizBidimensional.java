package programacaooo20212.aula07.view;

public class MatrizBidimensional extends VetorUnidimensional {
	private int[][] dim2;
	private int coluna;

	public MatrizBidimensional(int novaDim) {
		super();
		if (novaDim <= 0 || novaDim > 2000000) {
			throw new IllegalArgumentException("Dimensao viola os limites do int.");
		}
		this.dim2 = new int[novaDim][novaDim];
	}

	public MatrizBidimensional() {
		super();
		this.dim2 = new int[TAMANHO][TAMANHO];
	}

	@Override
	public void imprimir() {
		// dim2.length - retorna a quantidade de linhas.
		for (int i = 0; i < this.dim2.length; i++) {
			// dim2[0].length - retorna a quantidade de colunas.
			for (int j = 0; j < this.dim2[linha].length; j++) {
				System.out.println("Elemento " + i + " : " + this.dim2[i][j]);
			}
		}

	}

	@Override
	public void adicionar(int valor) {
		this.dim2[this.linha][this.coluna] = valor;
		if (this.linha < this.dim2.length) {
			this.coluna++;
		}
		// utiliza-se [linha] para identificar a quantidade de colunas de cada linha
		if (this.coluna == this.dim2[linha].length) {
			this.linha++;
			this.coluna = 0;
		}
		if (this.linha == this.dim2.length) {
			this.linha = 0;
			this.coluna = 0;
			System.out.println(
					"Matriz foi excedida. O próximo valor será colocado na  posição linha 0 e coluna 0 da matriz. Recomeçando.");
		}
	}
}
