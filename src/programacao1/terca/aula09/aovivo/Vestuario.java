package programacao1.terca.aula09.aovivo;

public abstract class Vestuario {
	private String modelo;
	private String marca;
	private double preco;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Vestuario [modelo=" + modelo + ", marca=" + marca + ", preco=" + preco + "]";
	}

}
