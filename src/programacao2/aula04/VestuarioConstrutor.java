package programacao2.aula04;

public abstract class VestuarioConstrutor {
	protected String cor;
	protected String tamanho;
	protected double preco;
	protected String marca;
	protected String modelo;

	@Override
	public String toString() {
		return "VestuarioConstrutor [cor=" + this.cor + ", tamanho=" + this.tamanho + ", preco=" + this.preco
				+ ", marca=" + this.marca + ", modelo=" + this.modelo + "]";
	}

	public VestuarioConstrutor(String cor, String tamanho, double preco, String marca, String modelo) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.marca = marca;
		this.modelo = modelo;
	}

	public VestuarioConstrutor() {
		super();
	}

	 

}
