package padraoprojeto.aula07.chainofresponsability.pedido;

public class Produto {

	private Long codigo;

	private String descricao;

	private double valor;

	public Produto(Long codigo, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + "]";
	}

}