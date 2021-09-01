package programacaooo20212.aula02;

public class Cinto extends Vestuario {
	private boolean eCouro;
	private int qdadeFuros;
	@Override
	public String toString() {
		return super.toString() + 
				" Cinto [eCouro=" + eCouro + ", qdadeFuros=" + qdadeFuros + "]";
	}
	public boolean iseCouro() {
		return eCouro;
	}
	public void seteCouro(boolean eCouro) {
		this.eCouro = eCouro;
	}
	public int getQdadeFuros() {
		return qdadeFuros;
	}
	public void setQdadeFuros(int qdadeFuros) {
		this.qdadeFuros = qdadeFuros;
	}
	
}
