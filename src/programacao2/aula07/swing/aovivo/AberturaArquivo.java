package programacao2.aula07.swing.aovivo;

import javax.swing.JFileChooser;

public class AberturaArquivo {
	public static void main(String[] args) {
		new AberturaArquivo().processar();
	}

	public void processar() {
		// massa da lsanha
		// Criamos a tela para abertura dos diretórios
		JFileChooser arqAula = new JFileChooser();

		// Aponta para o diretório atual. ùltimo utilizado no micro.
		arqAula.setCurrentDirectory(new java.io.File("c:\\"));
		// Titulo da Janela
		arqAula.setDialogTitle("Abertura diretório.");
		// Não apresentará arquivos
		arqAula.setAcceptAllFileFilterUsed(false);

		// Definindo que somente será disponibilizado diretórios
		arqAula.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		// Apresentará a tela no centro do monitor.
		int retAbertura = arqAula.showOpenDialog(null);
		if (retAbertura == JFileChooser.APPROVE_OPTION) {
			System.out.println("Diretó escolhido: " + arqAula.getCurrentDirectory());
			// Caso o botão cancelar seja pressionado.
		} else if (retAbertura == JFileChooser.CANCEL_OPTION) {
			System.out.println("Botão cancelar foi escolhido. ");
		} else if (retAbertura == JFileChooser.ERROR_OPTION) {
			System.out.println("Erro na seleção do arquivo. ");
		}
	}
}