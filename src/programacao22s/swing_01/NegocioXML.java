package programacao22s.swing_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class NegocioXML {
	public void  localizarArquivo() {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(new FileNameExtensionFilter("Apenas XML", "xml"));
		int retorno = chooser.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			// carregar o arquivo.
			try {
				FileReader r = new FileReader(chooser.getSelectedFile());
				List <Negocio> listaNegocio = carregarArquivo (r);
				for (Negocio negocio : listaNegocio) {
					System.out.println(negocio);
					JOptionPane.showMessageDialog(null, negocio);
					
				}
				r.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			
		}

		
	}
	
	private List <Negocio> carregarArquivo (FileReader reader) {
		XStream stream = new XStream(new DomDriver());
		stream.alias("negocio", Negocio.class);
		List <Negocio> listaNegocio = (List<Negocio>) stream.fromXML (reader);
		return listaNegocio;
	}
	
	public static void main(String[] args) {
		new NegocioXML().localizarArquivo();
	}
}
