package padraoprojeto.aula09.mediator.celular;

public class SymbianColleague extends Amigos {

	public SymbianColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Symbian recebeu: " + mensagem);
	}

}
