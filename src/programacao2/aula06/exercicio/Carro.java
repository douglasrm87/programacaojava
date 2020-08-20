package programacao2.aula06.exercicio;

public class Carro extends Locomocao {
	private boolean isArcondicionado;
	private int qdadePortas;
	private int qdadeLugares;
	private boolean is4x4;

	public boolean isArcondicionado() {
		return this.isArcondicionado;
	}

	public void setArcondicionado(boolean isArcondicionado) {
		this.isArcondicionado = isArcondicionado;
	}

	public int getQdadePortas() {
		return this.qdadePortas;
	}

	public void setQdadePortas(int qdadePortas) {
		this.qdadePortas = qdadePortas;
	}

	public int getQdadeLugares() {
		return this.qdadeLugares;
	}

	public void setQdadeLugares(int qdadeLugares) {
		this.qdadeLugares = qdadeLugares;
	}

	public boolean isIs4x4() {
		return this.is4x4;
	}

	public void setIs4x4(boolean is4x4) {
		this.is4x4 = is4x4;
	}

	@Override
	public String toString() {
		return "Carro [isArcondicionado=" + this.isArcondicionado + ", qdadePortas=" + this.qdadePortas
				+ ", qdadeLugares=" + this.qdadeLugares + ", is4x4=" + this.is4x4 + "]";
	}

	public Carro(double precoDiaria, String modelo, int qdadeDias, boolean isEletric, boolean isArcondicionado,
			int qdadePortas, int qdadeLugares, boolean is4x4) {
		super(precoDiaria, modelo, qdadeDias, isEletric);
		this.isArcondicionado = isArcondicionado;
		this.qdadePortas = qdadePortas;
		this.qdadeLugares = qdadeLugares;
		this.is4x4 = is4x4;
	}

}
