package programacao2.aula05;

public class Calca extends VestuarioConstrutorMetodoAbstrato {
	// Observamos alguns atributos repetidos entre os itens de nossa loja
	String tpCalca; // boca de sino, bag, bombacha
	boolean temCinto;

	@Override
	public String toString() {
		return super.toString() + " Calca [tpCalca=" + this.tpCalca + ", temCinto=" + this.temCinto + "]";
	}

	@Override
	protected void aplicarDesconto() {
		if (this.aplicaDesconto && "Jeans".equalsIgnoreCase(this.tpCalca)) {
			this.preco = this.preco * this.percentualDesconto;
		}
	}

	// por termos atributos repetidos o método de impressão fica com itens
	// repetidos também.

}
