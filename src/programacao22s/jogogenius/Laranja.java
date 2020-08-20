package jogogenius;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Laranja extends JogoGenius implements ActionListener {
	public Laranja(JToggleButton obj) {
		JogoGenius.botaoLaranja = obj;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JogoGenius.vetJogador[indVetJogador] = LARANJA;
		indVetJogador++;

		apresentarVetorJogador();


		System.out.println("Cliquei no laranja.");
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					piscar(botaoLaranja);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		JogoGenius.jogadasTempJogador++;
		validarJogadas();
	}

	

}
