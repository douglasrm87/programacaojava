package programacao2.aula08.swing.aovivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import programacao2.aula07.swing.aovivo.AberturaArquivo;

public class FramePanelButtonListenerInterna implements ActionListener {
	public static void main(String[] args) {
		new FramePanelButtonListenerInterna().processar();

	}

	private void processar() {
		// massa
		JButton botaoCarregar = new JButton("Carregar XML");
		ImageIcon guj = new ImageIcon("guj_2x.png");

		botaoCarregar.addActionListener(new OuvinteBotaoCaregarInterna());

		JButton botaoSair = new JButton(guj);
		botaoSair.addActionListener(new FramePanelButtonListenerInterna());

		// recheio
		JPanel painel = new JPanel();
		painel.add(botaoSair);
		painel.add(botaoCarregar);

		// ao forno
		JFrame janela = new JFrame("Introdução");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("botao foi clicado.");

	}

	private final class OuvinteBotaoCaregarInterna implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Cliqei no botão Carrregar");
			AberturaArquivo abertura = new AberturaArquivo();
			abertura.processar();

		}
	}
}
