package programacao1.sexta.aula06;

public class Camisa {
	private String marca;
	private String cor;
	private String tamanho;
	private double preco;

	
	
	@Override
	public String toString() {
		return "Camisa [marca=" + this.marca + 
				", cor=" + this.cor + ", tamanho=" + 
				this.tamanho + ", preco=" + this.preco + "]";
	}

	
	
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(String tamanho) {
		if (tamanho.equalsIgnoreCase("P") || tamanho.equalsIgnoreCase("M") || tamanho.equalsIgnoreCase("G")
				|| tamanho.equalsIgnoreCase("GG")) {
			this.tamanho = tamanho;
		} else {
			throw new IllegalArgumentException("Valor inválido. Escolher entr P, M, G ou GG");
		}
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			throw new IllegalArgumentException
			("Preço inválido. Digitar um valor positivo.");
		}
	}

}
