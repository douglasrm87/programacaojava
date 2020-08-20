package jogogenius;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Vermelho extends JogoGenius implements ActionListener {

	public Vermelho(JToggleButton obj) {
		JogoGenius.botaoVermelho = obj;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JogoGenius.vetJogador[indVetJogador] = VERMELHO;
		indVetJogador++;

		apresentarVetorJogador();

		System.out.println("Cliquei no Vermelho.");
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					piscar(botaoVermelho);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		JogoGenius.jogadasTempJogador++;
		validarJogadas();
	}

}
