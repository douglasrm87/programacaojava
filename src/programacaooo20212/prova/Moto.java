package programacaooo20212.prova;
public class Moto {
	private String fabricacao;
	private String chassi;
	private String cor;
	private String fabricante;
	private String modelo;
	private Float preco;
	public Moto() {
		super();
	}
	public Moto(String fabricacao, String chassi, String cor, String fabricante, String modelo, Float preco) {
		super();
		this.fabricacao = fabricacao;
		this.chassi = chassi;
		this.cor = cor;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.preco = preco;
	}
	public void atualizarPreco(float porcentagem) {
		setPreco(this.preco += (porcentagem / 100 * this.preco));
	}
	public String imprimir() {
		return this.toString();
	}
	@Override
	public String toString() {
		return "Moto [fabricacao=" + fabricacao + ", chassi=" + chassi + ", cor=" + cor + ", fabricante=" + fabricante
				+ ", modelo=" + modelo + ", preco=" + preco + "]";
	}
	public String getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		if (chassi == null || chassi.length() == 0) {
//		if (chassi.length() == 0 || chassi == null) {
			throw new IllegalArgumentException("Chassi com valor incorreto.");
		}
		this.chassi = chassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
}
