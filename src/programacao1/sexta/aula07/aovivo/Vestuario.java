package programacao1.sexta.aula07.aovivo;

public class Vestuario {
	private String marca;
	private String modelo;
	private double valor;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Vestuario [marca=" + marca + ", modelo=" + modelo + ", valor=" + valor + "]";
	}
	
	
}
