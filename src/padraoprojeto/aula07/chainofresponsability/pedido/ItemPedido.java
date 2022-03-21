package padraoprojeto.aula07.chainofresponsability.pedido;

public class ItemPedido {

	private Long idItem;

	private Produto produto;

	private Integer quantidade;

	private double total;

	public ItemPedido(Long idItem, Produto produto, Integer quantidade, double total) {
		super();
		this.idItem = idItem;
		this.produto = produto;
		this.quantidade = quantidade;
		this.total = total;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "ItemPedido [idItem=" + idItem + ", produto=" + produto + ", quantidade=" + quantidade + ", total="
				+ total + "]";
	}

}
 