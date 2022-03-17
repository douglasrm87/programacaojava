package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

//https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469
@Stateless
public class Matematica implements MatematicaRemote {

	/**
	 * Default constructor.
	 */
	public Matematica() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer soma(Integer a, Integer b) {
		return a + b;
	}

	@Override
	public Integer subtrai(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a - b;
	}
}