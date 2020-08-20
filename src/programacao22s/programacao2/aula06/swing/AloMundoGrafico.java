package programacao2.aula06.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AloMundoGrafico {

	public static void main(String[] args) {
		new AloMundoGrafico().processar();
	}

	private void processar() {

		// Cria e organiza a janela
		JFrame frame = new JFrame("AloMundoSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adiciona o rotulo "Alo Mundo".

		// Faz com que tenha uma decoracao de janela
		JFrame.setDefaultLookAndFeelDecorated(true);

		JLabel label = new JLabel("Alo Mundo");
		frame.getContentPane().add(label);
		// Exibe a janela
		frame.pack();
		frame.setVisible(true);
	}
 
}
