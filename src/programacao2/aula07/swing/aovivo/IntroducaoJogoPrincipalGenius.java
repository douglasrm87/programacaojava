package programacao2.aula07.swing.aovivo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class IntroducaoJogoPrincipalGenius {
	public static void main(String[] args) {
		new IntroducaoJogoPrincipalGenius().processar();
	}

	protected static final int _1000 = 200;
	private static JToggleButton botaoVerde;// referencia de objeto
	private static JToggleButton botaoAzul;// referencia de objeto
	private static JToggleButton botaoVermelho;// referencia de objeto
	private static JToggleButton botaoLaranja;// referencia de objeto

	JButton computador = new JButton("Computador");

	private void processar() {
		System.out.println("Jogo do Genius iniciando");

		// massa lazanha
		this.computador = new JButton("Computador");

		ImageIcon verde = new ImageIcon("verde.jpg");
		IntroducaoJogoPrincipalGenius.botaoVerde = new JToggleButton(verde);

		ImageIcon azul = new ImageIcon("azul.jpg");
		IntroducaoJogoPrincipalGenius.botaoAzul = new JToggleButton(azul);

		ImageIcon vermelho = new ImageIcon("vermelho.jpg");
		IntroducaoJogoPrincipalGenius.botaoVermelho = new JToggleButton(vermelho);

		ImageIcon laranja = new ImageIcon("laranja.jpg");
		IntroducaoJogoPrincipalGenius.botaoLaranja = new JToggleButton(laranja);

		// carne da lasanha
		JPanel painel = new JPanel();
		painel.add(this.computador);
		painel.add(IntroducaoJogoPrincipalGenius.botaoVerde);
		painel.add(IntroducaoJogoPrincipalGenius.botaoAzul);
		painel.add(IntroducaoJogoPrincipalGenius.botaoVermelho);
		painel.add(IntroducaoJogoPrincipalGenius.botaoLaranja);

		// queijo
		JFrame tela = new JFrame("Jogo Genius");
		tela.add(painel);

		// levar ao forno
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.pack(); // faz a aplicação ficar com a melhor dimensão possivel
		// saindo do forno
		tela.setVisible(true);
		// comer a lasanha
		try {
			for (int i = 0; i < 10; i++) {
				IntroducaoJogoPrincipalGenius.botaoVermelho.setSelected(true);
				Thread.sleep(200);
				IntroducaoJogoPrincipalGenius.botaoVermelho.setSelected(false);
				Thread.sleep(200);
			}
		} catch (Exception e) {
			System.out.println("Problemas com o metodo sleep da classe Thread");
		}
	}
}
