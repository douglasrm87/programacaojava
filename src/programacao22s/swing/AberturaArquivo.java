package programacao22s.swing;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AberturaArquivo {
	public static void main(String[] args) {
		// criando meio para termos uma tela de abertura de arquivo no Java Swing
		JFileChooser arquivo = new JFileChooser();
		arquivo.setDialogTitle("Titulo da minha TELA");
		arquivo.setCurrentDirectory(new File("d:\\douglas"));
		int retorno = arquivo.showOpenDialog(null); // apresenta a tela
		if (retorno == JFileChooser.APPROVE_OPTION) { // caso cliquem em abrir.
			System.out.println("Cliquei no abrir.");
			JOptionPane.showMessageDialog(null, "Cliquei no abrir.");
		} else if (retorno == JFileChooser.CANCEL_OPTION) {
			System.out.println("Cliquei no cancelar.");
			JOptionPane.showMessageDialog(null, "Cliquei no cancelar.");
		} else if (retorno == JFileChooser.ERROR_OPTION) {
			System.out.println("Arquivo inválido.");
			JOptionPane.showMessageDialog(null, "Arquivo inválido.");
		}

	}

}
