package programacao1.terca.aula09.aovivo;

public class Camisa extends Vestuario {
	private String tpGola;
	// Possui 2 Conteúdos
	// Primeiro ele pode conter Atributos
	// private foco no conceito de encapsulamento.

	@Override
	public String toString() {
		return super.toString() + " Camisa [tpGola=" + tpGola + "]";
	}

	public String getTpGola() {
		return tpGola;
	}

	public void setTpGola(String tpGola) {
		this.tpGola = tpGola;
	}

 

	 

	

	   

	
	
}
