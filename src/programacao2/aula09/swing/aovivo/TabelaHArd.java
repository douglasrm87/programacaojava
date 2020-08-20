package programacao2.aula09.swing.aovivo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelaHArd {

	public static void main(String[] args) {
		// massa
		String colunas[] = { "M�veis", "Eletro", "Utens�lios", "Pets" };
		String linhas[][] = { /* 0 */{ "Sof�", "TV", "Faca", "Dog" }, /* 1 */{ "Cama", "Aspirador", "Colher", "Cat" },
				/* 2 */{ "Estante", "Som", "Garfo", "Duck" } };

		JTable table = new JTable(linhas, colunas); // uso do construtopr
		JScrollPane scrollPane = new JScrollPane(table);

		// recheio
		JPanel painel = new JPanel();
		painel.add(scrollPane, BorderLayout.CENTER); // usando atributo est�tico
		painel.setBackground(Color.GREEN);// usando atributo est�tico

		// levar ao forno
		JFrame tela = new JFrame("Minha tabela bonita");
		tela.add(painel);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // usando atributo est�tico
		tela.setSize(900, 500);
		tela.setVisible(true);

	}

}
