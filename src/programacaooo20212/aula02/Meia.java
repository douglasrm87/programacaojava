package programacaooo20212.aula02;

public class Meia extends Vestuario {
	private String tpCano;

	@Override
	public String toString() {
		return super.toString() + " Meia [tpCano=" + this.tpCano + "]";
	}

	public String getTpCano() {
		return tpCano;
	}

	public void setTpCano(String tpCano) {
		this.tpCano = tpCano;
	}

}
