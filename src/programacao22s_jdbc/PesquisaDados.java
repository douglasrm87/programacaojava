package programacao22s_jdbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PesquisaDados implements Constantes {

	public static void main(String[] args) {
		PesquisaDados.testeEstatico();
		new PesquisaDados().processar();
	}

	private static void testeEstatico() {
		System.out.println("ola estatico");
	}

	private void processar() {
		List<FAQ> listaFaqs = selecionarTodosFAQ();

		for (FAQ faq : listaFaqs) {
			System.out.println(faq);
			JOptionPane.showMessageDialog(null, faq);
		}

		System.out.println("\n\n");
		FAQ item = selecionarFAQByIDItemPK(1);
		System.out.println(item);

		// JTable
		String colunas[] = { "ID_PAI", "ID_DETALHE_PAI", "DESC_ITEM" };

		// Criar os registros da JTable
		String linhas[][] = new String[listaFaqs.size()][3];
		for (int i = 0; i < listaFaqs.size(); i++) {
			linhas[i][0] = String.valueOf(listaFaqs.get(i).getIdPai());
			linhas[i][1] = String.valueOf(listaFaqs.get(i).getIdItem());
			linhas[i][2] = String.valueOf(listaFaqs.get(i).getDescItem());
		}

		// Criar o JTable
		JTable table = new JTable(linhas, colunas);
		JScrollPane scrollPane = new JScrollPane(table);
		JPanel painel = new JPanel();
		JFrame tela = new JFrame("Minha tabela bonita");

		painel.add(scrollPane, BorderLayout.CENTER);
		painel.setBackground(Color.GREEN);

		tela.add(painel);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(900, 500);
		tela.setVisible(true);
	}

	// select c1,c2 from tabela where c1=?
	public List<FAQ> selecionarTodosFAQ() {
		StringBuilder sql = new StringBuilder();
		sql.append(SELECT);
		sql.append(ID_PAI);
		sql.append(VIRGULA);
		sql.append(ID_DETALHE_PAI);
		sql.append(VIRGULA);
		sql.append(DESC_ITEM);
		sql.append(FROM);
		sql.append(FAQ_FACULDADE_PAI);
		// SELECT ID_PAI , ID_DETALHE , DESC_ITEM FROM FAQ_FACULDADE_PAI
		System.out.println("Comando select: " + sql);
		// doule 1 doule 2
		List<FAQ> listaFaqs = new ArrayList<>();
		ConexaoBanco minhaClasseCon = new ConexaoBanco();
		try (Connection con = minhaClasseCon.conectarBanco();
				PreparedStatement pstmt = con.prepareStatement(sql.toString());) {
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					FAQ linha = new FAQ();
					linha.setIdPai(rs.getInt(ID_PAI));
					linha.setIdItem(rs.getInt(ID_DETALHE_PAI));
					linha.setDescItem(rs.getString(DESC_ITEM));
					listaFaqs.add(linha);
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		return listaFaqs;
	}

	public FAQ selecionarFAQByIDItemPK(int parametro) {
		StringBuilder sql = new StringBuilder();
		FAQ linha = new FAQ();
		sql.append(SELECT);
		sql.append(ID_PAI);
		sql.append(VIRGULA);
		sql.append(ID_DETALHE_PAI);
		sql.append(VIRGULA);
		sql.append(DESC_ITEM);
		sql.append(FROM);
		sql.append(FAQ_FACULDADE_PAI);
		sql.append(WHERE);
		sql.append(ID_DETALHE_PAI);
		sql.append(IGUAL_E_INTERROGACAO);

		// SELECT ID_PAI , ID_DETALHE , DESC_ITEM FROM FAQ_FACULDADE_PAI
		System.out.println("Comando select por Item: " + sql);
		// doule 1 doule 2
		List<FAQ> listaFaqs = new ArrayList<>();
		ConexaoBanco minhaClasseCon = new ConexaoBanco();
		try (Connection con = minhaClasseCon.conectarBanco();
				PreparedStatement pstmt = con.prepareStatement(sql.toString());) {
			pstmt.setInt(1, parametro);

			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					linha.setIdPai(rs.getInt(ID_PAI));
					linha.setIdItem(rs.getInt(ID_DETALHE_PAI));
					linha.setDescItem(rs.getString(DESC_ITEM));
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		return linha;
	}

	// 2 - FAQ Detalhe
	public void selecionarFAQDetalheTodos(FAQ faq) {
		StringBuilder sql = new StringBuilder();
		sql.append(SELECT);
		sql.append(FAQ_FACULDADE_DETALHE);

		sql.append(ID_PAI);
		sql.append(VIRGULA);
		sql.append(ID_DETALHE_PAI);
		sql.append(VIRGULA);
		sql.append(DESC_ITEM);
		sql.append(VIRGULA);
		sql.append(DESC_CONTEUDO_ALUNO);

		System.out.println("Comando insert: " + sql);

	}

}
