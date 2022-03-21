package padraoprojeto.aula07.chainofresponsability.login;
public class EstrangularTentativaMiddleware extends Middleware {
	private int requisicaoPorMinuto;
	private int request;
	private long tempoAtual;
	public EstrangularTentativaMiddleware(int requestPerMinute) {
		this.requisicaoPorMinuto = requestPerMinute;
		this.tempoAtual = System.currentTimeMillis();
	}
	/* Please, not that checkNext() call can be inserted both in the beginning of
	 * this method and in the end.
	 * This gives much more flexibility than a simple loop over all middleware
	 * objects. For instance, an element of a chain can change the order of checks
	 * by running its check after all other checks.  */
	public boolean check(String email, String password) {
		if (System.currentTimeMillis() > tempoAtual + 60_000) {
			request = 0;
			tempoAtual = System.currentTimeMillis();
		}
		request++;
		if (request > requisicaoPorMinuto) {
			System.out.println("Limite de Tentativas excedidas - Após 1 minuto tente novamente.");
			Thread.currentThread().stop(); // encerra o programa
		}
		return checkNext(email, password);
	}
}