package padraoprojeto.aula09.mediator.celular;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {

	protected ArrayList<Amigos> contatos;

	public MensagemMediator() {
		contatos = new ArrayList<Amigos>();
	}

	public void adicionarColleague(Amigos colleague) {
		contatos.add(colleague);
	}

	@Override
	public void enviar(String mensagem, Amigos colleague) {
		for (Amigos contato : contatos) {
			if (contato != colleague) {
				definirProtocolo(contato);
				contato.receberMensagem(mensagem);
			}
		}
	}

	private void definirProtocolo(Amigos contato) {
		if (contato instanceof IOSColleague) {
			System.out.println("Protocolo iOS");
		} else if (contato instanceof AndroidColleague) {
			System.out.println("Protocolo Android");
		} else if (contato instanceof SymbianColleague) {
			System.out.println("Protocolo Symbian");
		}
	}

}
