package padraoprojeto.aula09.mediator.celular;

public class Cliente {
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
	
		// Model
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		SymbianColleague symbian = new SymbianColleague(mediador);
	
		//Controller
		mediador.adicionarColleague(android);
		mediador.adicionarColleague(ios);
		mediador.adicionarColleague(symbian);
		
		// Model
		symbian.enviarMensagem("Oi, eu sou um Symbian!");
		System.out.println("=========");
		android.enviarMensagem("Oi Symbian! Eu sou um Android!");
		System.out.println("=========");
		ios.enviarMensagem("Olá todos, sou um iOs!");
	}
}
