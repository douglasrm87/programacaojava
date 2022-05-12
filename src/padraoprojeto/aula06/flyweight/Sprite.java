package padraoprojeto.aula06.flyweight;

// O Flyweight concreto
public class Sprite extends SpriteFlyweight {
	protected Imagem imagem;

	public Sprite(String nomeDaImagem) {
		imagem = new Imagem(nomeDaImagem);
	}

	@Override
	public void desenharImagem(Ponto ponto) {
		imagem.desenharImagem();
		System.out.println("Fatorial ponto (" + ponto.x + "," + ponto.y + ")!");
	}
}
