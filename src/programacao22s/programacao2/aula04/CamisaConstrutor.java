package programacao2.aula04;

public class CamisaConstrutor extends VestuarioConstrutor {

	String tpGola;

	@Override
	public String toString() {
		return super.toString() + " CamisaConstrutor [tpGola=" + this.tpGola + "]";
	}

	//Construtor com parâmetros.
	public CamisaConstrutor(String cor, String tamanho, double preco, String marca, String modelo, String tpGola) {
		super(cor, tamanho, preco, marca, modelo);
		this.tpGola = tpGola;
	}
 

}
