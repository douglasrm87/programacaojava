package programacaooo20212.aula02;

public abstract class Vestuario {
	protected String cor;
	protected String tamanho;
	protected double preco;
	protected String marca;
	protected String modelo;
	@Override
	public String toString() {
		return "VestuarioConstrutor [cor=" + this.cor + ", tamanho=" + this.tamanho + ", preco=" + this.preco + ", marca=" + this.marca + ", modelo="
				+ this.modelo + "]";
	}
}
