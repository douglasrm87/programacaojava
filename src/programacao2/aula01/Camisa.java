package programacao2.aula01;

public class Camisa {
	String cor;
	String tam;
	String modelo;
	double preco;

	@Override
	public String toString() {
		return "CamisaConstrutor [cor=" + this.cor + ", tam=" + this.tam + ", modelo=" + this.modelo + ", preco=" + this.preco
				+ "]";
	}

	// Aqui precisa de um método para apresentar na tela os dados da camisa

}
