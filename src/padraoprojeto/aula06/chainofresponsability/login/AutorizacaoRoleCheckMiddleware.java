package padraoprojeto.aula06.chainofresponsability.login;

/**
 * ConcreteHandler. Checks a user's role.
 */
public class AutorizacaoRoleCheckMiddleware extends Middleware {
	public boolean check(String email, String password) {
		if (email.equals(Middleware.usuarioPadrao)) {
			System.out.println("Usuário esta AUTORIZADO a continuar como Admin.");
			return true;
		}
		System.out.println("Dados recebidos de: " + email + " Não Autorizado.");
		return checkNext(email, password);
	}
}
