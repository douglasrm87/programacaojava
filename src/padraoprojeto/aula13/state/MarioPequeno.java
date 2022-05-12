package padraoprojeto.aula13.state;

public class MarioPequeno implements MarioState {
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("AtariOdyssayMario grande");
		return new MarioGrande();
	}
	@Override
	public MarioState pegarFlor() {
		System.out.println("AtariOdyssayMario grande com fogo");
		return new MarioFogo();
	}
	@Override
	public MarioState pegarPena() {
		System.out.println("AtariOdyssayMario grande com capa");
		return new MarioCapa();
	}
	@Override
	public MarioState levarDano() {
		System.out.println("AtariOdyssayMario morto");
		return new MarioMorto();
	}
}
