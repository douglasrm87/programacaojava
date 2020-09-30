package programacao22s_04_layout;

import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuLayoutFlowLayout {
	public static void main(String[] args) {
		JButton b1 = new JButton("primeiro");
		JButton b2 = new JButton("segundo");
		JButton b3 = new JButton("terceiro");
		
		
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		JFrame quadro = new JFrame("Nome da minha tela");
		
		FlowLayout fl = new FlowLayout();
		quadro.setLayout(fl);
		
		quadro.add(p);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.pack();
		quadro.setVisible(true);
		
		
		
		
		
	}

}
