package programacao22s.swing_02;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotaoOuvinteIndependente   {
	public static void main(String[] args) {
		
		/// Lembrando que o Framework Swing usa o padrão de projeto Composite.
		JButton b1 = new JButton("Abrir XML");
		b1.addActionListener(new Botao1Ouvinte());
		
		ImageIcon img = new ImageIcon("laranja.jpg");
		
		JButton b2 = new JButton(img);
		b2.addActionListener(new Botao2Ouvinte());
		
		ImageIcon img1 = new ImageIcon("verde.jpg");
		JButton b3 = new JButton(img1);
		b3.addActionListener(new Botao3Ouvinte());
		
				
		JPanel painel = new JPanel();
		painel.add(b1);
		painel.add(b2);
		painel.add(b3);
		
		JFrame quadro = new JFrame("Nome da minha tela");
		quadro.add(painel);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.pack();
		quadro.setVisible(true);
		
		
	}
 

}
