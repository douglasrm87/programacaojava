package padraoprojeto.aula13.state;

public class AtariOdyssayMario {
	protected MarioState estado;
	
	public AtariOdyssayMario() {
		estado = new MarioPequeno();
	}

	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}

	public void pegarFlor() {
		estado = estado.pegarFlor();
	}

	public void pegarPena() {
		estado = estado.pegarPena();
	}

	public void levarDano() {
		estado = estado.levarDano();
	}
}
