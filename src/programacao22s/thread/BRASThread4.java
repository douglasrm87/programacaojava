package programacao22s.thread;

public class BRASThread4 extends Thread {
	private static final int _5000 = 8000;
	private int idBras = 0;
	private boolean ret = false;
	private boolean fim = false;

	public void run() {
		validarBras04();
	}

	public BRASThread4(int idBras) {
		super();
		this.idBras = idBras;
	}

	// equipamento 01
	private void validarBras04() {
		System.out.println("Entrei no BRAS4");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS4");
		this.fim = true;
		switch (this.idBras) {
		case 4:
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
