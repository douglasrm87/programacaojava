package programacao2.aula07.swing.aovivo;

import javax.swing.JFileChooser;

public class AberturaArquivo {
	public static void main(String[] args) {
		new AberturaArquivo().processar();
	}

	public void processar() {
		// massa da lsanha
		// Criamos a tela para abertura dos diret�rios
		JFileChooser arqAula = new JFileChooser();

		// Aponta para o diret�rio atual. �ltimo utilizado no micro.
		arqAula.setCurrentDirectory(new java.io.File("c:\\"));
		// Titulo da Janela
		arqAula.setDialogTitle("Abertura diret�rio.");
		// N�o apresentar� arquivos
		arqAula.setAcceptAllFileFilterUsed(false);

		// Definindo que somente ser� disponibilizado diret�rios
		arqAula.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		// Apresentar� a tela no centro do monitor.
		int retAbertura = arqAula.showOpenDialog(null);
		if (retAbertura == JFileChooser.APPROVE_OPTION) {
			System.out.println("Diret� escolhido: " + arqAula.getCurrentDirectory());
			// Caso o bot�o cancelar seja pressionado.
		} else if (retAbertura == JFileChooser.CANCEL_OPTION) {
			System.out.println("Bot�o cancelar foi escolhido. ");
		} else if (retAbertura == JFileChooser.ERROR_OPTION) {
			System.out.println("Erro na sele��o do arquivo. ");
		}
	}
}