package jogogenius;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class Computador extends JogoGenius implements ActionListener {

	public Computador(List<ComputadorDTO> obj) {
		JogoGenius.jogadasComputador = obj;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					for (ComputadorDTO computadorDTO : jogadasComputador) {
						piscar(computadorDTO.getIdBotao(),computadorDTO.getBotaoPressionado());
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Tente acertar a sequencia.");

			}
		}).start();

	}


}
