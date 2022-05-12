package padraoprojeto.aula13.state;

public class MarioCapa implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("AtariOdyssayMario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("AtariOdyssayMario com fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("AtariOdyssayMario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("AtariOdyssayMario grande");
		return new MarioGrande();
	}

}
