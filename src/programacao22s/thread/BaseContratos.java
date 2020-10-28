package programacao22s.thread;

public class BaseContratos {
	private int contrato;
	private int cdBras;
	public int getCdBras() {
		return cdBras;
	}
	public void setCdBras(int cdBras) {
		this.cdBras = cdBras;
	}
	public BaseContratos(int contrato, int cdBras) {
		super();
		this.contrato = contrato;
		this.cdBras = cdBras;
	}
	public int getContrato() {
		return contrato;
	}
	public void setContrato(int contrato) {
		this.contrato = contrato;
	}
	

}
