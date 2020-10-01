package programacao22s.swing_layouts;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeuGridBagLayout {
	public static void main(String[] args) {
 		GridBagConstraints cns = new GridBagConstraints(); // creating constraint
		cns.gridx = 0;
		cns.gridy = 0;
		cns.weightx = 0.3;
		cns.weighty = 0.7;
		cns.anchor = GridBagConstraints.FIRST_LINE_START;
		cns.fill = GridBagConstraints.BOTH;

		JFrame maFrame = new JFrame("Tela Principal"); 
		
		// vai centralizar a abertura da janela
		maFrame.setLocationRelativeTo(null); 
		
		JPanel amarelo = new JPanel(); // creating the header panel
		amarelo.setBackground(Color.YELLOW);
		
		Container container = maFrame.getContentPane();
		container.setLayout(new GridBagLayout()); // setting layout of main frame
		container.add(amarelo, cns);

		JPanel azul = new JPanel();
		azul.setBackground(Color.BLUE);
		cns.gridx = 1;
		cns.gridy = 0;
		cns.weightx = 0.7;
		cns.weighty = 0.7;
		cns.anchor = GridBagConstraints.PAGE_START;
		cns.fill = GridBagConstraints.BOTH;
		container.add(azul, cns);

		JPanel vermelho = new JPanel();
		JButton bv = new JButton("Botao painel vermelho");
		vermelho.setBackground(Color.RED);
		vermelho.add(bv);
		cns.gridx = 0;
		cns.gridy = 1;
		cns.gridwidth = 2;
		cns.weightx = 1.0;
		cns.weighty = 0.3;
		cns.anchor = GridBagConstraints.LAST_LINE_START;
		cns.fill = GridBagConstraints.BOTH;
		container.add(vermelho, cns);

		maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFrame.pack();
		maFrame.setVisible(true);

	}

}
