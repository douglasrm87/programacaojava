package padraoprojeto.aula04.adapter;

public class AdapterTomada extends Tomada2Pinos {
	private Tomada3Pinos tomadaDeTresPinos;

	public AdapterTomada(Tomada3Pinos tomadaDeTresPinos) {
		this.tomadaDeTresPinos = tomadaDeTresPinos;
	}

	public void ligarNaTomadaDeDoisPinos() {
		tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	}
}
