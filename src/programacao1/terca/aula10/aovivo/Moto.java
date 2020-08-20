package programacao1.terca.aula10.aovivo;

public class Moto  extends Veiculo{
	private String estilo; // trail, sport,  Harley

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Moto(String id, String marca, String modelo, double preco, String estilo) {
		super(id, marca, modelo, preco);
		this.estilo = estilo;
	}
	

}
