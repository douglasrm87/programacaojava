package jogogenius;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Verde extends JogoGenius implements ActionListener {

	public Verde(JToggleButton obj) {
		JogoGenius.botaoVerde = obj;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JogoGenius.vetJogador[indVetJogador] = VERDE;
		indVetJogador++;

		apresentarVetorJogador();

		System.out.println("Cliquei no Verde.");
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					piscar(botaoVerde);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		JogoGenius.jogadasTempJogador++;
		validarJogadas();
	}

	

}
