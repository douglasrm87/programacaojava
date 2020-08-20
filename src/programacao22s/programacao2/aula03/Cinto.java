package programacao2.aula03;

public class Cinto extends Vestuario {
	boolean eCouro;
	int qdadeFuros;

	@Override
	public String toString() {
		return super.toString() + 
				" Cinto [eCouro=" + eCouro + ", qdadeFuros=" + qdadeFuros + "]";
	}

}
