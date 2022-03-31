package padraoprojeto.aula09.mediator.celular;

public class AndroidColleague extends Amigos {

	public AndroidColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Android recebeu: " + mensagem);
	}

}
