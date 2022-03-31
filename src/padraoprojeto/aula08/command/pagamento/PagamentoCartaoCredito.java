package padraoprojeto.aula08.command.pagamento;

public class PagamentoCartaoCredito implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("Compra emitida!\n" + compra.getInfoNota());
	}

}