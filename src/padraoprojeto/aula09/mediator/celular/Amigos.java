package padraoprojeto.aula09.mediator.celular;

public abstract class Amigos {
	protected Mediator mediator;

	public Amigos(Mediator m) {
		this.mediator = m;
	}

	public void enviarMensagem(String mensagem) {
		// Controller
		this.mediator.enviar(mensagem, this);
	}

	public abstract void receberMensagem(String mensagem);
}
