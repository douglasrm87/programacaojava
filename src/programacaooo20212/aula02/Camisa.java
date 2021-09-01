package programacaooo20212.aula02;

public class Camisa extends Vestuario {
	private String tpGola;
	@Override
	public String toString() {
		return super.toString() + " CamisaConstrutor [tpGola=" + this.tpGola + "]";
	}
	public String getTpGola() {
		return tpGola;
	}
	public void setTpGola(String tpGola) {
		this.tpGola = tpGola;
	}
	
}
