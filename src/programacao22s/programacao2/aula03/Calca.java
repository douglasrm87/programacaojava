package programacao2.aula03;

public class Calca extends Vestuario {
	// Observamos alguns atributos repetidos entre os itens de nossa loja
	String tpCalca; // boca de sino, bag, bombacha
	boolean temCinto;
	@Override
	public String toString() {
		return super.toString() + " Calca [tpCalca=" + this.tpCalca + ", temCinto=" + this.temCinto + "]";
	}
	
	// por termos atributos repetidos o método de impressão fica com itens
	// repetidos também.
	 
	
}
