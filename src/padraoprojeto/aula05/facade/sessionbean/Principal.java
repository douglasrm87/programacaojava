package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

//https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469
@Stateless
public class Principal {
	@EJB
	ServicoDeBancoFacade servicoGeral;
	public static void main(String[] args) {
		new Principal().processar();
	}
	private void processar() {
		servicoGeral.getEmprestimo(0, 0);
	}
			
}