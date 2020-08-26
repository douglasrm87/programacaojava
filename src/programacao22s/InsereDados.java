package programacao22s;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsereDados implements Constantes {

	public static void main(String[] args) {
		new InsereDados().processar();
	}

	private void processar() {
		FAQ f = new FAQ(0, 1, "Teste");
		inserirFAQ(f);
//		FAQ f2 = new FAQ(0, 1, "Teste","Conteudo Teste");
//		inserirFAQDetalhe(f2);

	}
	// Inserir dados
	// 1 - FAQ

	public void inserirFAQ(FAQ faq) {
		StringBuilder sql = new StringBuilder();
		sql.append(INSERT_INTO);
		sql.append(FAQ_FACULDADE_PAI);
		sql.append(ABRE_PARENTESES);

		sql.append(ID_PAI);
		sql.append(VIRGULA);
		sql.append(ID_DETALHE);
		sql.append(VIRGULA);
		sql.append(DESC_ITEM);
		sql.append(FECHA_PARENTESES);
		sql.append(VALUES);
		sql.append(ABRE_PARENTESES);
		sql.append(INTERROGACAO);
		sql.append(VIRGULA);
		sql.append(INTERROGACAO);
		sql.append(VIRGULA);
		sql.append(INTERROGACAO);
		sql.append(FECHA_PARENTESES);
		System.out.println("Comando insert: " + sql);

		ConexaoBanco minhaConexao = new ConexaoBanco();
		try (Connection con = minhaConexao.conectarBanco();
				PreparedStatement pstmCli = con.prepareStatement(sql.toString());) {

			pstmCli.setInt(1, faq.getIdPai());
			pstmCli.setInt(2, faq.getIdItem());
			pstmCli.setString(3, faq.getDescItem());
			pstmCli.execute();

		} catch (SQLException e) {
			if (REGISTRO_DUPLICADO.equals(e.getSQLState())) {
				System.out.println("Item duplicado");
			} else {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 2 - FAQ Detalhe
	public void inserirFAQDetalhe(FAQ faq) {
		StringBuilder sql = new StringBuilder();
		sql.append(INSERT_INTO);
		sql.append(FAQ_FACULDADE_PAI);
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

		ConexaoBanco minhaConexao = new ConexaoBanco();
		try (Connection con = minhaConexao.conectarBanco();
				PreparedStatement pstmCli = con.prepareStatement(sql.toString());) {

			pstmCli.setInt(1, faq.getIdPai());
			pstmCli.setInt(2, faq.getIdItem());
			pstmCli.setString(3, faq.getDescItem());
			pstmCli.setString(4, faq.getConteudoAluno());
			pstmCli.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
