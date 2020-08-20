package programacao1.terca.aula10.aovivo;

public class Patinete  extends Veiculo{
	private double larguraPrancha;
	private String pesoMaximo;
	public double getLarguraPrancha() {
		return larguraPrancha;
	}
	public void setLarguraPrancha(double larguraPrancha) {
		this.larguraPrancha = larguraPrancha;
	}
	public String getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(String pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	public Patinete(String id, String marca, String modelo, double preco, double larguraPrancha, String pesoMaximo) {
		super(id, marca, modelo, preco);
		this.larguraPrancha = larguraPrancha;
		this.pesoMaximo = pesoMaximo;
	}
	

}
