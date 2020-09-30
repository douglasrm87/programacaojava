package programacao22s_04_layout;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuLayoutBorderLayout2 {
	public static void main(String[] args) {
		JButton b1 = new JButton("primeiro");
		JButton b2 = new JButton("segundo");
		JButton b3 = new JButton("terceiro");
		
		Panel p = new Panel();
		BorderLayout bl = new BorderLayout(5,5);
 
		p.setLayout(bl);
		p.add(b1,BorderLayout.NORTH);
		p.add(b2,BorderLayout.SOUTH);
		p.add(b3,BorderLayout.EAST);
		
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