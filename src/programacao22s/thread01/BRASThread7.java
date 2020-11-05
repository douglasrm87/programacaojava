package programacao22s.thread01;

public class BRASThread7 extends Thread {
	private static final int _5000 = 8000;
	private int idBras = 0;
	private boolean ret = false;
	private boolean fim = false;

	public void run() {
		validarBras07();
	}

	public BRASThread7(int idBras) {
		super();
		this.idBras = idBras;
	}

	// equipamento 01
	private void validarBras07() {
		System.out.println("Entrei no BRAS7");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS7");
		this.fim = true;
		switch (this.idBras) {
		case 7:
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
