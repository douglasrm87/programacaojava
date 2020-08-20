package programacao1.terca.aula10.aovivo;

public class Carro extends Veiculo {
	private String qdadePortas;
	private boolean fourByFour;
	private boolean isAutomatico;
	
	
	public String getQdadePortas() {
		return qdadePortas;
	}
	public void setQdadePortas(String qdadePortas) {
		this.qdadePortas = qdadePortas;
	}
	public boolean isFourByFour() {
		return fourByFour;
	}
	public void setFourByFour(boolean fourByFour) {
		this.fourByFour = fourByFour;
	}
	public Carro(String id, String marca, String modelo, double preco, String qdadePortas, boolean fourByFour,
			boolean isAutomatico) {
		super(id, marca, modelo, preco);
		this.qdadePortas = qdadePortas;
		this.fourByFour = fourByFour;
		this.isAutomatico = isAutomatico;
	}
	 
	
	

}
