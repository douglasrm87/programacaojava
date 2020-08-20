package programacao2.aula05;

public class Cinto extends VestuarioConstrutorMetodoAbstrato {
	boolean eCouro;
	int qdadeFuros;

	@Override
	public String toString() {
		return super.toString() + " Cinto [eCouro=" + this.eCouro + ", qdadeFuros=" + this.qdadeFuros + "]";
	}

	public Cinto(String cor, String tamanho, double preco, String marca, String modelo, boolean eCouro,
			int qdadeFuros) {
		super(cor, tamanho, preco, marca, modelo);
		this.eCouro = eCouro;
		this.qdadeFuros = qdadeFuros;
	}

	public Cinto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cinto(String cor, String tamanho, double preco, String marca, String modelo, boolean aplicaDesconto,
			double percentualDesconto) {
		super(cor, tamanho, preco, marca, modelo, aplicaDesconto, percentualDesconto);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void aplicarDesconto() {
		if (this.aplicaDesconto && !this.eCouro) {
			this.preco = this.preco * this.percentualDesconto;
		}
	}
}
