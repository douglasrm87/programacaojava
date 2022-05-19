package padraoprojeto.aula13.state;

public class MarioPequeno implements MarioState {
	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Numero grande");
		return new MarioGrande();
	}
	@Override
	public MarioState pegarFlor() {
		System.out.println("Numero grande com fogo");
		return new MarioFogo();
	}
	@Override
	public MarioState pegarPena() {
		System.out.println("Numero grande com capa");
		return new MarioCapa();
	}
	@Override
	public MarioState levarDano() {
		System.out.println("Numero morto");
		return new MarioMorto();
	}
}
