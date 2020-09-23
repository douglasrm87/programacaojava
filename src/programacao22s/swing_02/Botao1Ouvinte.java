package programacao22s.swing_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import programacao22s.swing_01.NegocioXML;

public class Botao1Ouvinte implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
 		NegocioXML n = new NegocioXML();
		n.localizarArquivo();
		
	}

}
