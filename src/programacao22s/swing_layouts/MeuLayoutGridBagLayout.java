package programacao22s.swing_layouts;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuLayoutGridBagLayout {
	public static void main(String[] args) {
		JButton b1 = new JButton("primeiro");
		JButton b2 = new JButton("segundo");
		JButton b3 = new JButton("terceiro");
		
		Panel p = new Panel();
	 
		GridBagConstraints cons = new GridBagConstraints();
		GridBagLayout gb = new GridBagLayout();
		
		
 
		p.setLayout(gb);
		p.add(b1,cons);
		p.add(b2,cons);
		p.add(b3,cons);
		
		JFrame quadro = new JFrame("Nome da minha tela");
		
		
	 
		quadro.add(p);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.pack();
		quadro.setVisible(true);
		
		
		
		
		
	}

}
/*
		p.setLayout(fl);
		p.add(b1,BorderLayout.NORTH);
		p.add(b2,BorderLayout.SOUTH);
		p.add(b3,BorderLayout.EAST);

*/