package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.Stateless;

//https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469
@Stateless
public class ContaService {
	public long getCliente(int sessionID) {
		// retorna o id do cliente logado no sistema
		return 100005L;
	}

	public boolean verificaId(long x) {
		return true;
	}

	public boolean getEmprestimo(double quantidade) {
		return false;
	}

	public boolean setSaldoCliente(long id, double quantidade) {
		return false;
	}
}