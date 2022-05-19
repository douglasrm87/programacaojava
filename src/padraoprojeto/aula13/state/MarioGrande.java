package padraoprojeto.aula13.state;

public class MarioGrande implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Numero ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Numero com fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Numero com capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Numero pequeno");
		return new MarioPequeno();
	}

}
