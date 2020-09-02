package programacao22s;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PesquisaDados implements Constantes {

	public static void main(String[] args) {
		new PesquisaDados().processar();
	}

	private void processar() {
		List<FAQ> listaFaqs = selecionarTodosFAQ();
		for (FAQ faq : listaFaqs) {
			System.out.println(faq);

		}
	}

	// select c1,c2 from tabela where c1=?
	public List<FAQ> selecionarTodosFAQ() {
		StringBuilder sql = new StringBuilder();
		sql.append(SELECT);
		sql.append(ID_PAI);
		sql.append(VIRGULA);
		sql.append(ID_DETALHE);
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
					linha.setIdItem(rs.getInt(ID_DETALHE));
					linha.setDescItem(rs.getString(DESC_ITEM));
					listaFaqs.add(linha);
				}
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
		return listaFaqs;
	}

	// 2 - FAQ Detalhe
	public void inserirFAQDetalhe(FAQ faq) {
		StringBuilder sql = new StringBuilder();
		sql.append(INSERT_INTO);
		sql.append(FAQ_FACULDADE_DETALHE);
		sql.append(ABRE_PARENTESES);

		sql.append(ID_PAI);
		sql.append(VIRGULA);
		sql.append(ID_DETALHE);
		sql.append(VIRGULA);
		sql.append(DESC_ITEM);
		sql.append(VIRGULA);
		sql.append(DESC_CONTEUDO_ALUNO);
		sql.append(FECHA_PARENTESES);
		sql.append(VALUES);
		sql.append(ABRE_PARENTESES);
		sql.append(INTERROGACAO);
		sql.append(VIRGULA);
		sql.append(INTERROGACAO);
		sql.append(VIRGULA);
		sql.append(INTERROGACAO);
		sql.append(VIRGULA);
		sql.append(INTERROGACAO);
		sql.append(FECHA_PARENTESES);
		System.out.println("Comando insert: " + sql);

//		ConexaoBanco minhaConexao = new ConexaoBanco();
//		try (Connection con = minhaConexao.conectarBanco();
//				PreparedStatement pstmCli = con.prepareStatement(sql.toString());) {
//
//			pstmCli.setInt(1, faq.getIdPai());
//			pstmCli.setInt(2, faq.getIdItem());
//			pstmCli.setString(3, faq.getDescItem());
//			pstmCli.setString(4, faq.getConteudoAluno());
//			pstmCli.execute();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
