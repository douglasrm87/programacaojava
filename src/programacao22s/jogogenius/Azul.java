package jogogenius;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Azul extends JogoGenius implements ActionListener {

	public Azul(JToggleButton obj) {
		JogoGenius.botaoAzul = obj;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JogoGenius.vetJogador[indVetJogador] = AZUL;
		JogoGenius.indVetJogador++;

		apresentarVetorJogador();

		System.out.println("Cliquei no Azul.");
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					piscar(botaoAzul);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		JogoGenius.jogadasTempJogador++;
		validarJogadas();
	}

	

}
