package padraoprojeto.aula09.mediator.celular;

public class IOSColleague extends Amigos {

	public IOSColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("iOs recebeu: " + mensagem);
	}

}
