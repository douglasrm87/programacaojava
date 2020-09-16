package programacao22s.swing_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Botao2Ouvinte implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("cliquei no botão 2");
		JOptionPane.showMessageDialog(null, "cliquei no botão 2");
		
	}

}
