package padraoprojeto.aula07.chainofresponsability.login;

public class AutenticacaoCheckMiddleware extends Middleware {
    private Server server;

    public AutenticacaoCheckMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("Email N�O Esta registrado. Falhou.");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Senha errada. Falhou.");
            return false;
        }
        // Para o padr�o de projeto encadear as chamadas.
        return checkNext(email, password);
    }
}