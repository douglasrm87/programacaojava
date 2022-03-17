package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.Stateless;

//https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469
@Stateless
public class ClienteService {
	public boolean getEmprestimo(double quantidade) {
		// verificar se o banco tem o suficiente
		return true;
	}

	public boolean setSaldoCliente(long id, double quantidade) {
		// configure o novo saldo do cliente e retorna true se tudo foi configurado
		// corretamente
		return true;
	}

	public long getCliente(int sessionId) {
		return 0;
	}

	public boolean verificaId(long id) {
		return false;
	}
}