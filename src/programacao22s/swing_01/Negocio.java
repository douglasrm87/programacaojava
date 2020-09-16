package programacao22s.swing_01;

public final class Negocio {
	private double preco;
	private int quantidade;

	@Override
	public String toString() {
		return "Negocio [preco=" + preco + ", quantidade=" + quantidade + "]" + " volume: " + getVolume();
	}

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

	// confere coma terceira forma normal.
	public double getVolume() {
		return quantidade * preco;
	}

}
