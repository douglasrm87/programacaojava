package programacao2.aula06.exercicio;

public class Bicicleta extends Locomocao {
	private boolean temMarcha;
	private int tamanhoAro;
	private boolean possuiCestinha;

	public boolean isTemMarcha() {
		return temMarcha;
	}

	public void setTemMarcha(boolean temMarcha) {
		this.temMarcha = temMarcha;
	}

	public int getTamanhoAro() {
		return tamanhoAro;
	}

	public void setTamanhoAro(int tamanhoAro) {
		this.tamanhoAro = tamanhoAro;
	}

	public boolean isPossuiCestinha() {
		return possuiCestinha;
	}

	public void setPossuiCestinha(boolean possuiCestinha) {
		this.possuiCestinha = possuiCestinha;
	}

	@Override
	public String toString() {
		return "Bicicleta [temMarcha=" + this.temMarcha + ", tamanhoAro=" + this.tamanhoAro + ", possuiCestinha="
				+ this.possuiCestinha + "]";
	}

	public Bicicleta(double precoDiaria, String modelo, int qdadeDias, boolean isEletric, boolean temMarcha,
			int tamanhoAro, boolean possuiCestinha) {
		super(precoDiaria, modelo, qdadeDias, isEletric);
		this.temMarcha = temMarcha;
		this.tamanhoAro = tamanhoAro;
		this.possuiCestinha = possuiCestinha;
	}

}
