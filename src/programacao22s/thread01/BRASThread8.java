package programacao22s.thread01;

public class BRASThread8 extends Thread {
	private static final int _5000 = 8000;
	private int idBras = 0;
	private boolean ret = false;
	private boolean fim = false;

	public void run() {
		validarBras08();
	}

	public BRASThread8(int idBras) {
		super();
		this.idBras = idBras;
	}

	// equipamento 01
	private void validarBras08() {
		System.out.println("Entrei no BRAS8");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS8");
		this.fim = true;
		switch (this.idBras) {
		case 8:
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
