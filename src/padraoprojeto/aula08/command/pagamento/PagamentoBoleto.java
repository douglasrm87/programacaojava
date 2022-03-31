package padraoprojeto.aula08.command.pagamento;

public class PagamentoBoleto implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		System.out.println("Boleto criado!\n" + compra.getInfoNota());
	}

}
