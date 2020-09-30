package programacao22s.swing_layouts;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuLayoutGridBagLayout {
	public static void main(String[] args) {
		
		int bola = 0;
		int x = 1;
		int vez = 0;
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		JButton b7 = new JButton();
		JButton b8 = new JButton();
		JButton b9 = new JButton();
		
		GridLayout gl = new GridLayout(3,3);
		Panel p = new Panel();
		p.setLayout(gl);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		
		JFrame quadro = new JFrame("Nome da minha tela");
		
		
	 
		quadro.add(p);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.setSize(700, 400);
		quadro.setVisible(true);
		
		
		
		
		
	}

}
/*
		p.setLayout(fl);
		p.add(b1,BorderLayout.NORTH);
		p.add(b2,BorderLayout.SOUTH);
		p.add(b3,BorderLayout.EAST);

*/