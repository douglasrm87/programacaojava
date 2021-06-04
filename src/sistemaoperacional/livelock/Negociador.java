package sistemaoperacional.livelock;


public class Negociador {
	static final Policia police = new Policia();
	static final Sequestrador criminal = new Sequestrador();
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				police.aguardarLiberacaoRefem(criminal);
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				criminal.receberValorResgate(police);
			}
		});
		t2.start();
	}
}
