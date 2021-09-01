package programacaooo20212.aula02;

public class Calca extends Vestuario {
	// Observamos alguns atributos repetidos entre os itens de nossa loja
	private String tpCalca; // boca de sino, bag, bombacha
	private boolean temCinto;
	@Override
	public String toString() {
		return super.toString() + " Calca [tpCalca=" + this.tpCalca + ", temCinto=" + this.temCinto + "]";
	}
	public String getTpCalca() {
		return tpCalca;
	}
	public void setTpCalca(String tpCalca) {
		this.tpCalca = tpCalca;
	}
	public boolean isTemCinto() {
		return temCinto;
	}
	public void setTemCinto(boolean temCinto) {
		this.temCinto = temCinto;
	}
	
	// por termos atributos repetidos o método de impressão fica com itens
	// repetidos também.
	
	
}
