package sistemaoperacional.livelock;


public class Sequestrador {
	private boolean hostageReleased = false;
	public void receberValorResgate(Policia police) {
		while (!police.enviarDinheiro()) {
			System.out.println("Sequestrador: Aguardando o pagamento do resgate.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Sequestrador: Libertou refem.");
		this.hostageReleased = true;
	}
	public boolean liberarRefem() {
		return this.hostageReleased;
	}
}

