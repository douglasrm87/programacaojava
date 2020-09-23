package programacao22s.swing_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import programacao22s.xmlcep.EnderecoDTO;
import programacao22s.xmlcep.EnderecoXML;

public class VidaCEP implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Analisando meu CEP");
		String cep = "80050350";
		EnderecoXML meuCep = new  EnderecoXML();
		EnderecoDTO ret = meuCep.carregarDadosArqXML(cep);
		ret.setCep(cep);
		JOptionPane.showMessageDialog(null, ret);
		
	}

}
