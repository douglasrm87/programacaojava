package programacao2.aula06.exercicio;

public class Moto extends Locomocao {
	private int cilindrada;
	private boolean possuiBagageiro;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isPossuiBagageiro() {
		return possuiBagageiro;
	}

	public void setPossuiBagageiro(boolean possuiBagageiro) {
		this.possuiBagageiro = possuiBagageiro;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + this.cilindrada + ", possuiBagageiro=" + this.possuiBagageiro + "]";
	}

	public Moto(double precoDiaria, String modelo, int qdadeDias, boolean isEletric, int cilindrada,
			boolean possuiBagageiro) {
		super(precoDiaria, modelo, qdadeDias, isEletric);
		this.cilindrada = cilindrada;
		this.possuiBagageiro = possuiBagageiro;
	}

}
