package programacao2.aula05;

public abstract class VestuarioConstrutorMetodoAbstrato {
	protected String cor;
	protected String tamanho;
	protected double preco;
	protected String marca;
	protected String modelo;

	protected boolean aplicaDesconto;
	protected double percentualDesconto = 1; 

	

	public VestuarioConstrutorMetodoAbstrato(String cor, String tamanho, double preco, String marca, String modelo,
			boolean aplicaDesconto) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.marca = marca;
		this.modelo = modelo;
		this.aplicaDesconto = aplicaDesconto;
	}

	public VestuarioConstrutorMetodoAbstrato(String cor, String tamanho, double preco, String marca, String modelo,
			boolean aplicaDesconto, double percentualDesconto) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.marca = marca;
		this.modelo = modelo;
		this.aplicaDesconto = aplicaDesconto;
		this.percentualDesconto = percentualDesconto;
	}

	public VestuarioConstrutorMetodoAbstrato(String cor, String tamanho, double preco, String marca, String modelo) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.marca = marca;
		this.modelo = modelo;
	}

	public VestuarioConstrutorMetodoAbstrato() {
		super();
	}

	protected abstract void aplicarDesconto();

}
