package programacao2.aula04;

public class Calca extends VestuarioConstrutor {
	// Observamos alguns atributos repetidos entre os itens de nossa loja
	String tpCalca; // boca de sino, bag, bombacha
	boolean temCinto;
	@Override
	public String toString() {
		return super.toString() + " Calca [tpCalca=" + this.tpCalca + ", temCinto=" + this.temCinto + "]";
	}
	 
	
	
	// por termos atributos repetidos o m�todo de impress�o fica com itens
	// repetidos tamb�m.
	 
	
}
