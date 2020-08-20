package programacao1.terca.aula10.aovivo;

public class Bicicleta {
	private String raioRoda;
	private int qdadeMarchas;
	private boolean isEletrica;
	public String getRaioRoda() {
		return raioRoda;
	}
	public void setRaioRoda(String raioRoda) {
		this.raioRoda = raioRoda;
	}
	public int getQdadeMarchas() {
		return qdadeMarchas;
	}
	public void setQdadeMarchas(int qdadeMarchas) {
		this.qdadeMarchas = qdadeMarchas;
	}
	public boolean isEletrica() {
		return isEletrica;
	}
	public void setEletrica(boolean isEletrica) {
		this.isEletrica = isEletrica;
	}
	public Bicicleta(String raioRoda, int qdadeMarchas, boolean isEletrica) {
		super();
		this.raioRoda = raioRoda;
		this.qdadeMarchas = qdadeMarchas;
		this.isEletrica = isEletrica;
	}
	

}
