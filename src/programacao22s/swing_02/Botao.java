package programacao22s.swing_02;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botao {
	public static void main(String[] args) {
		
		/// Lembrando que o Framework Swing usa o padrão de projeto Composite.
		JButton b1 = new JButton("Abrir XML");
		
		ImageIcon img = new ImageIcon("laranja.jpg");
		
		JButton b2 = new JButton(img);
		
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
