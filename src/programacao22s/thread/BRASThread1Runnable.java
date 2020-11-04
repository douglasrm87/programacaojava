package programacao22s.thread;

public class BRASThread1Runnable implements Runnable {
	private static final int _5000 = 8000;
	private int idBras = 0;
	private boolean ret = false;

	private boolean fim = false;

	// metodo executado quando o metodo start() e acionado.
	public void run() {
		validarBras01();
	}

	public BRASThread1Runnable() {
	}

	// equipamento 01
	private void validarBras01() {
		System.out.println("Entrei no BRAS1");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS1");
		this.fim = true;

		switch (this.idBras) {
		case 1:
			this.ret = true;
			return;
		}
		this.ret = false;

	}

	public boolean isRet() {
		return ret;
	}

	public boolean isFim() {
		return fim;
	}

	public void setFim(boolean fim) {
		this.fim = fim;
	}

}
