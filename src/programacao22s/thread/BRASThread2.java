package programacao22s.thread;

public class BRASThread2 extends Thread {
	private static final int _5000 = 8000;
	private int idBras = 0;
	private boolean ret = false;
	private boolean fim = false;

	public void run() {
		validarBras02();
	}

	public BRASThread2(int idBras) {
		super();
		this.idBras = idBras;
	}

	// equipamento 01
	private void validarBras02() {
		System.out.println("Entrei no BRAS2");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS2");
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
