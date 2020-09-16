package programacao22s.swing_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotaoOuvinte implements ActionListener {
	public static void main(String[] args) {
		
		/// Lembrando que o Framework Swing usa o padrão de projeto Composite.
		JButton b1 = new JButton("Abrir XML");
		b1.addActionListener(new BotaoOuvinte());
		
		ImageIcon img = new ImageIcon("laranja.jpg");
		
		JButton b2 = new JButton(img);
		b2.addActionListener(new BotaoOuvinte());
		
		ImageIcon img1 = new ImageIcon("verde.jpg");
		JButton b3 = new JButton(img1);
		b3.addActionListener(new BotaoOuvinte());
		
				
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

	@Override
	public void actionPerformed(ActionEvent e) {
		 System.out.println("Cliquei no botão.");
		
	}

}
