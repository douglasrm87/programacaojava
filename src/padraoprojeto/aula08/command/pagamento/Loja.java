package padraoprojeto.aula08.command.pagamento;

public class Loja {
	protected String nomeDaLoja;

	public Loja(String nome) {
		nomeDaLoja = nome;
	}

	public void executarCompra(double valor, PagamentoCommand formaDePagamento) {
		Compra compra = new Compra(nomeDaLoja);
		compra.setValor(valor);
		formaDePagamento.processarCompra(compra);
	}
}
