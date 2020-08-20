package programacao2.aula08.swing.aovivo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import programacao2.aula07.swing.aovivo.AberturaArquivo;

public class OuvinteBotaoCaregar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliqei no botão Carrregar");
		AberturaArquivo abertura = new AberturaArquivo();
		abertura.processar();
		
		
	}
	

}
