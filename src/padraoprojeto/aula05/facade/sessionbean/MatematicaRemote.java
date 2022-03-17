package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.Remote;

@Remote
public interface MatematicaRemote {
	public Integer soma(Integer a, Integer b);

	public Integer subtrai(Integer a, Integer b);
}
