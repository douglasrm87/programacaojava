package padraoprojeto.aula13.state;

public class MarioFogo implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("AtariOdyssayMario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("AtariOdyssayMario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("AtariOdyssayMario com capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("AtariOdyssayMario grande");
		return new MarioGrande();
	}

}
