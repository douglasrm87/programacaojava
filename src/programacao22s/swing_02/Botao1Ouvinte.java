package programacao22s.swing_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Botao1Ouvinte implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("cliquei no bot�o 1");
		JOptionPane.showMessageDialog(null, "cliquei no bot�o 1");
		
	}

}
