package padraoprojeto.aula06.chainofresponsability.pedido;

import java.util.Date;
import java.util.List;

public class NotaPedido {
	private Long idPedido;

	private Date data;

	private String cliente;

	private List<ItemPedido> itens;

	public NotaPedido(Long idPedido, Date data, String cliente, List<ItemPedido> itens) {
		super();
		this.idPedido = idPedido;
		this.data = data;
		this.cliente = cliente;
		this.itens = itens;
	}

	public String getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "\n\nNotaPedido [idPedido=" + idPedido + ", data=" + data + ", cliente=" + cliente + ", itens=" + itens
				+ "]";
	}

}
 