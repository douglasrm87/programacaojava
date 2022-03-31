package padraoprojeto.aula09.mediator.celular;

public abstract class Amigos {
	protected Mediator mediator;

	public Amigos(Mediator m) {
		mediator = m;
	}

	public void enviarMensagem(String mensagem) {
		mediator.enviar(mensagem, this);
	}

	public abstract void receberMensagem(String mensagem);
}
