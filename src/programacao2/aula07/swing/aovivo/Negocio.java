package programacao2.aula07.swing.aovivo;

public final class Negocio {

	/*
	 * <list> <negocio> <preco>43.5</preco> <quantidade>1000</quantidade> </negocio>
	 * </list>
	 * 
	 */

	// atributos
	private double preco;
	private int quantidade;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getVolume() {
		return this.preco * this.quantidade;
	}

}
