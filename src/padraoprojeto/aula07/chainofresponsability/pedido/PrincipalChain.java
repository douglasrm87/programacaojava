package padraoprojeto.aula07.chainofresponsability.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrincipalChain {

	public static void main(String[] args) {
		new PrincipalChain().processar();
	}

	private void processar() {

		NotaPedido notaPedido;
		ItemPedido itemPedido;
		List<ItemPedido> listaItemPedido = new ArrayList<>();
		List<NotaPedido> listaPedidos = new ArrayList<>();
		Produto produto;

		// Pedido 01
		produto = new Produto(1010L, "Macarrao", 15.50);
		int qdadeProduto = 50;
		itemPedido = new ItemPedido(123L, produto, qdadeProduto, produto.getValor() * qdadeProduto);
		listaItemPedido.add(itemPedido);
		produto = new Produto(2020L, "Batata", 12.90);
		qdadeProduto = 40;
		itemPedido = new ItemPedido(456L, produto, qdadeProduto, produto.getValor() * qdadeProduto);
		listaItemPedido.add(itemPedido);
		produto = new Produto(3030L, "Cenoura", 7.70);
		qdadeProduto = 90;
		itemPedido = new ItemPedido(789L, produto, qdadeProduto, produto.getValor() * qdadeProduto);
		listaItemPedido.add(itemPedido);
		notaPedido = new NotaPedido(123456789L, new Date(), "Douglas Mendes", listaItemPedido);
		listaPedidos.add(notaPedido);

		// Pedido 02
		produto = new Produto(4040L, "Queijo", 16.60);
		qdadeProduto = 25;
		itemPedido = new ItemPedido(001L, produto, qdadeProduto, produto.getValor() * qdadeProduto);
		listaItemPedido.add(itemPedido);

		produto = new Produto(5050L, "Manteiga", 23.90);
		qdadeProduto = 60;
		itemPedido = new ItemPedido(111L, produto, qdadeProduto, produto.getValor() * qdadeProduto);
		listaItemPedido.add(itemPedido);

		produto = new Produto(3030L, "Cenoura", 7.70);
		qdadeProduto = 33;
		itemPedido = new ItemPedido(222L, produto, qdadeProduto, produto.getValor() * qdadeProduto);
		listaItemPedido.add(itemPedido);

		notaPedido = new NotaPedido(000111222L, new Date(), "Douglas Mendes", listaItemPedido);
		listaPedidos.add(notaPedido);
		
		agruparNotaPedidoCliente(listaPedidos);
		agruparNotaPedidoCliente(listaPedidos);
	}

	private void agruparNotaPedidoCliente(List<NotaPedido> pedidos) {

		Map<String, List<NotaPedido>> pedidosPorCliente = pedidos.stream().collect(Collectors.groupingBy( // faz o
																											// agrupamento
																											// pelo que
																											// definirmos
																											// a seguir
				NotaPedido::getCliente));
		System.out.println(pedidosPorCliente);
	}

	 
}
