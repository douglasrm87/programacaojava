package programacao2.aula06.exercicio;

public abstract class Locomocao {
	private double precoDiaria;
	private String modelo;
	private int qdadeDias;
	private boolean isEletric;

	public double getPrecoDiaria() {
		return this.precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQdadeDias() {
		return this.qdadeDias;
	}

	public void setQdadeDias(int qdadeDias) {
		this.qdadeDias = qdadeDias;
	}

	public boolean isEletric() {
		return this.isEletric;
	}

	public void setEletric(boolean isEletric) {
		this.isEletric = isEletric;
	}

	@Override
	public String toString() {
		return "Locomocao [precoDiaria=" + this.precoDiaria + ", modelo=" + this.modelo + ", qdadeDias="
				+ this.qdadeDias + ", isEletric=" + this.isEletric + "]";
	}

	public Locomocao(double precoDiaria, String modelo, int qdadeDias, boolean isEletric) {
		super();
		this.precoDiaria = precoDiaria;
		this.modelo = modelo;
		this.qdadeDias = qdadeDias;
		this.isEletric = isEletric;
	}

}
