package programacao22s.swing_layouts;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuGridLayout {
	 public static void main(String[] args) {
		    JFrame.setDefaultLookAndFeelDecorated(true);
		    Panel p = new Panel();
		    
		    String bola = "0";
			String x = "1";
		    
		    p.setLayout(new GridLayout(3, 3));
		    JButton b1 = new JButton();
		    p.add(b1);
		    b1.addActionListener(b1Vida -> {
				b1.setText(bola);
			});
		    JButton b2 = new JButton();
		    p.add(b2);
		    b2.addActionListener(b2Vida -> {
				b2.setText(x);
			});
		    JButton b3 = new JButton();
		    p.add(b3);
		    b3.addActionListener(b3Vida -> {
				b3.setText(bola);
			});
		    JButton b4 = new JButton();
		    p.add(b4);
		    b4.addActionListener(b4Vida -> {
				b4.setText(x);
			});
		    JButton b5 = new JButton();
		    p.add(b5);
		    b5.addActionListener(b5Vida -> {
				b5.setText(bola);
			});
		    JButton b6 = new JButton();
		    p.add(b6);
		    b6.addActionListener(b6Vida -> {
				b6.setText(x);
			});
		    JButton b7 = new JButton();
		    p.add(b7);
		    b7.addActionListener(b7Vida -> {
				b7.setText(bola);
			});
		    JButton b8 = new JButton();
		    p.add(b8);
		    b8.addActionListener(b8Vida -> {
				b8.setText(x);
			});
		    JButton b9 = new JButton();
		    p.add(b9);
		    b9.addActionListener(b9Vida -> {
				b9.setText(bola);
			});
		   
		    JFrame frame = new JFrame("GridLayout Test");
		    frame.add(p);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(700,400);
		    frame.setVisible(true);
		  }

}
