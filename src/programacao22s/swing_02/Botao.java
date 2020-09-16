package programacao22s.swing_02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botao {
	public static void main(String[] args) {
		JButton b1 = new JButton("Abrir XML");
		JButton b2 = new JButton("B1");
		
		JPanel painel = new JPanel();
		painel.add(b1);
		painel.add(b2);
		
		JFrame quadro = new JFrame("Nome da minha tela");
		quadro.add(painel);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.pack();
		quadro.setVisible(true);
		
		
	}

}
