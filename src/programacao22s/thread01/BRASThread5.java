package programacao22s.thread01;

public class BRASThread5 extends Thread {
	private static final int _5000 = 8000;
	private int idBras = 0;
	private boolean ret = false;
	private boolean fim = false;

	public void run() {
		validarBras05();
	}

	public BRASThread5(int idBras) {
		super();
		this.idBras = idBras;
	}

	// equipamento 01
	private void validarBras05() {
		System.out.println("Entrei no BRAS5");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS5");
		this.fim = true;
		switch (this.idBras) {
		case 5:
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
