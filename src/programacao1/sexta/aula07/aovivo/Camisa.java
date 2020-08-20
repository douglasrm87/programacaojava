package programacao1.sexta.aula07.aovivo;

public class Camisa extends Vestuario{
	 
	private String tpGola;
	 
	public String getTpGola() {
		return tpGola;
	}
	public void setTpGola(String tpGola) {
		this.tpGola = tpGola;
	}
	@Override
	public String toString() {
		return super.toString() + " Camisa [tpGola=" + tpGola + "]";
	}
 

	
}
