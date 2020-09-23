package programacao22s.swing_03;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotaoCOMvida {
	public static void main(String[] args) {
		
		/// Lembrando que o Framework Swing usa o padrão de projeto Composite.
		JButton b1 = new JButton("Abrir XML");
		b1.addActionListener(new VidaXML());
		
		JButton b2 = new JButton("Ver meu endereço");
		b2.addActionListener(new VidaCEP());
		
		ImageIcon img1 = new ImageIcon("verde.jpg");
		JButton b3 = new JButton(img1);
				
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
