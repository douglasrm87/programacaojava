package programacao2.aula08.swing.aovivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FramePanelButtonListener implements ActionListener {
	public static void main(String[] args) {
		new FramePanelButtonListener().processar();
		
	}
	private void processar() {
		// massa 
		JButton botaoCarregar = new JButton("Carregar XML");
		ImageIcon guj = new ImageIcon("guj_2x.png");
		
		botaoCarregar.addActionListener(new OuvinteBotaoCaregar());
		
		JButton botaoSair = new JButton(guj);
		botaoSair.addActionListener(new FramePanelButtonListener());

		// recheio
		JPanel painel = new JPanel();
		painel.add(botaoSair);
		painel.add(botaoCarregar);
		
		// ao forno
		JFrame janela = new JFrame("Introdução");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela .pack();
		janela.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("botao foi clicado.");
		
	}

}
