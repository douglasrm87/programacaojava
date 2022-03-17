package padraoprojeto.aula05.facade.sessionbean;

import javax.ejb.Stateless;

//https://www.devmedia.com.br/como-implementar-pattern-facade-na-nova-plataforma-java-ee/32469
@Stateless
public class EmprestimoService {
         public boolean avaliarCredito(long id, double quantidade) {
                   // verifica se o cliente está qualificado para a quantidade solicitada
                   return true;
         }
}