package padraoprojeto.aula07.chainofresponsability.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class PrincipalChain {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static Server server;
	private static int QDADETentativas = 2;

	private static void init() {
		server = new Server();
		// usuarioPadrao = "drm@drm.com" ;
		// senhaPadrao = "drm";
		// Simulando uma busca de banco de dados com usuário cadastrados.
		server.register(Middleware.usuarioPadrao, Middleware.senhaPadrao);
		server.register("drm@fac.com", "pass");
		server.register("user@example.com", "user_pass");

		// Vamos criar a estrutura de Encadeamento.
		// 01) valida se não estourou o tempo, 02) valida autenticacao ok e por
		// fim 03) valida o perfil.
		Middleware middleware = new EstrangularTentativaMiddleware(PrincipalChain.QDADETentativas);
		middleware.linkWith(new AutenticacaoCheckMiddleware(server)).linkWith(new AutorizacaoRoleCheckMiddleware());

		// Server gets a chain from client code.
		server.setMiddleware(middleware);
	}

	public static void main(String[] args) throws IOException {
		init();

		boolean success;
		do {
			System.out.print("Digitar seu email: ");
			String email = reader.readLine();
			System.out.print("Password: ");
			String password = reader.readLine();
			success = server.logIn(email, password);
		} while (!success);
	}
}