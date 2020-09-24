package programacao22s.swing_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FramePanelButtonClasseInterna {
	public static void main(String[] args) {
		new FramePanelButtonClasseInterna().processar();
	}

	public void processar() {
		JButton botaoCarregar = new JButton("Carregar XML");
		CarregarListener load = new CarregarListener();
		botaoCarregar.addActionListener(load);
		ImageIcon guj = new ImageIcon("guj_2x.png");
		JButton botaoSair = new JButton(guj);
		botaoSair.addActionListener(new SairListener());

		JPanel painel = new JPanel();
		painel.add(botaoCarregar);
		painel.add(botaoSair);
		JFrame janela = new JFrame("Introdução");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
	}

	private final class SairListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
// Implementar as regras de negócio
			System.out.println("Botão sair foi pressionado");
		}
	}

	private final class CarregarListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
// Implementar as regras de negócio
			System.out.println("Botão carregar foi pressionado");

		}
	}
}
