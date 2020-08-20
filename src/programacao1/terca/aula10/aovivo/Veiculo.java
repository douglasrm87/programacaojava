package programacao1.terca.aula10.aovivo;

public abstract class Veiculo {
	private String id;
	private String marca;
	private String modelo;
	private double preco;
	private String vetAcessorios[] = new String[5];

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Veiculo(String id, String marca, String modelo, double preco) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
