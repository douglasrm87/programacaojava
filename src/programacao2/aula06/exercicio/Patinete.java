package programacao2.aula06.exercicio;

public class Patinete extends Locomocao {
	private String qrCode;
	private int qdadeRodas;

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public int getQdadeRodas() {
		return qdadeRodas;
	}

	public void setQdadeRodas(int qdadeRodas) {
		this.qdadeRodas = qdadeRodas;
	}

	@Override
	public String toString() {
		return "Patinete [qrCode=" + this.qrCode + ", qdadeRodas=" + this.qdadeRodas + "]";
	}

	public Patinete(double precoDiaria, String modelo, int qdadeDias, boolean isEletric, String qrCode,
			int qdadeRodas) {
		super(precoDiaria, modelo, qdadeDias, isEletric);
		this.qrCode = qrCode;
		this.qdadeRodas = qdadeRodas;
	}

}
