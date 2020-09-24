package programacao22s.swing_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotaoCOMvida {
	public static void main(String[] args) {
		new BotaoCOMvida().processar();
	}

	private void processar() {

		/// Lembrando que o Framework Swing usa o padrão de projeto Composite.
		JButton b1 = new JButton("Abrir XML");
		b1.addActionListener(new VidaXML());

		JButton b2 = new JButton("Ver meu endereço");
		b2.addActionListener(new VidaCEP());

		ImageIcon img1 = new ImageIcon("verde.jpg");
		JButton b3 = new JButton(img1);
		b3.addActionListener(new VidaBotaoClasseInterna());

		// mais utilizado
		// tambem utilizado na API Android
		JButton b4 = new JButton("Vida classo Anonima.");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("vida com classe anonima");
			}
		});

		// a partir do Java 8 também podemos utilizar o conceito de Lambda

		JButton b5 = new JButton("Vida com Lambda.");
		b5.addActionListener(minhavida -> {
			System.out.println("Dado vida com lambda.");
		});

		JPanel painel = new JPanel();
		painel.add(b1);
		painel.add(b2);
		painel.add(b3);
		painel.add(b4);
		painel.add(b5);

		JFrame quadro = new JFrame("Nome da minha tela");
		quadro.add(painel);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.pack();
		quadro.setVisible(true);

	}

	private final class VidaBotaoClasseInterna implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Cliquei na bola Verde");

		}

	}

}
