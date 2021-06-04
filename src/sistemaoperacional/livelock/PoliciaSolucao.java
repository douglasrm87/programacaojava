package sistemaoperacional.livelock;

public class PoliciaSolucao extends Policia{
	private boolean moneySent = false;
	int tempoMaxEsperaInvasao = 10;
	int tempoEsperaInvasao = 0;

	public void aguardarLiberacaoRefem(Sequestrador criminal) {
		while (!criminal.liberarRefem()) {
			System.out.println("Policia: Aguardando sequestrador liberar refem.");
			System.out.println(tempoEsperaInvasao);
			try {
				Thread.sleep(1000);
				if (this.tempoEsperaInvasao == this.tempoMaxEsperaInvasao) {
					break;
				}
				this.tempoEsperaInvasao++;
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Policia: Enviou dinheirodo resgate.");
		this.moneySent = true;
	}

	public boolean enviarDinheiro() {
		return this.moneySent;
	}
}
