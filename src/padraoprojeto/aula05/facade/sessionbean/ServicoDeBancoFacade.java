package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.Stateless;
import javax.inject.Inject;
//https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469
@Stateless
public class ServicoDeBancoFacade {

	@Inject
	ClienteService clienteService;

	@Inject
	EmprestimoService emprestimoService;

	@Inject
	ContaService contaService;

	public boolean getEmprestimo(int sessionId, double quantidade) {
		boolean resultado = false;
		long id = clienteService.getCliente(sessionId);

		if (clienteService.verificaId(id)) {
			if (emprestimoService.avaliarCredito(id, quantidade)) {
				if (contaService.getEmprestimo(quantidade)) {
					resultado = contaService.setSaldoCliente(id, quantidade);
				}
			}
		}

		return resultado;
	}
}
