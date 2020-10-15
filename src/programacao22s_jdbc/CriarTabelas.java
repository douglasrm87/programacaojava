package programacao22s_jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class CriarTabelas implements Constantes  {
	public static void main(String[] args) {
		new CriarTabelas().processar();
	}
	private void processar() {
		Scanner leia = new Scanner (System.in);
		System.out.println("1 - Criar tabelas");
		System.out.println("2 - Remover tabelas");
		int op = leia.nextInt();
		switch (op) {
		case 1:
			criarTabelaFAQ();
			criarTabelaFAQDetalhes();
			break;
		case 2:
			removerTabelaFAQDetalhe();
			removerTabelaFAQ();
			break;
		default:
			break;
		}
		leia.close();
	}
	public void criarTabelaFAQ() {
		ConexaoBanco minhaConexao = new ConexaoBanco();
		try (Connection con = minhaConexao.conectarBanco();) {
			StringBuilder sql = new StringBuilder();
			sql.append(CREATE_TABLE_IF_NOT_EXISTS);
			sql.append(FAQ_FACULDADE_PAI);
			sql.append(ABRE_PARENTESES);

			sql.append(ID_PAI);
			sql.append(INT_NOT_NULL);
			sql.append(VIRGULA);

			sql.append(ID_DETALHE_PAI);
			sql.append(INT_NOT_NULL);
			sql.append(VIRGULA);
			
			sql.append(DESC_ITEM);
			sql.append(TEXT_NOT_NULL);
			sql.append(VIRGULA);

			sql.append(PRIMARY_KEY);
			sql.append(ABRE_PARENTESES);
			sql.append(ID_DETALHE_PAI);
			sql.append(FECHA_PARENTESES);
			sql.append(FECHA_PARENTESES);

			System.out.println("SQL Criar tabela " + FAQ_FACULDADE_PAI + " - " + sql);

			try (Statement stmt = con.createStatement();) {
				int ret = stmt.executeUpdate(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public void removerTabelaFAQ() {
		ConexaoBanco minhaConexao = new ConexaoBanco();
		try (Connection con = minhaConexao.conectarBanco();) {
			StringBuilder sql = new StringBuilder();
			sql.append(" DROP TABLE ");
			sql.append(FAQ_FACULDADE_PAI);

			System.out.println("SQL remover tabela " + FAQ_FACULDADE_PAI + " - " + sql);

			try (Statement stmt = con.createStatement();) {
				int ret = stmt.executeUpdate(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public void removerTabelaFAQDetalhe() {
		ConexaoBanco minhaConexao = new ConexaoBanco();
		try (Connection con = minhaConexao.conectarBanco();) {
			StringBuilder sql = new StringBuilder();
			sql.append(" DROP TABLE ");
			sql.append(FAQ_FACULDADE_DETALHE);

			System.out.println("SQL remover tabela " + FAQ_FACULDADE_DETALHE + " - " + sql);

			try (Statement stmt = con.createStatement();) {
				int ret = stmt.executeUpdate(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public void criarTabelaFAQDetalhes() {
		ConexaoBanco minhaConexao = new ConexaoBanco();
		try (Connection con = minhaConexao.conectarBanco();) {
			StringBuilder sql = new StringBuilder();
			sql.append(CREATE_TABLE_IF_NOT_EXISTS);
			sql.append(FAQ_FACULDADE_DETALHE);
			sql.append(ABRE_PARENTESES);

			sql.append(ID_DETALHE_PAI);
			sql.append(INT_NOT_NULL);
			sql.append(VIRGULA);

			sql.append(ID_DETALHE);
			sql.append(INT_NOT_NULL);
			sql.append(VIRGULA);
			
			sql.append(DESC_ITEM);
			sql.append(TEXT_NOT_NULL);
			sql.append(VIRGULA);

			sql.append(DESC_CONTEUDO_ALUNO);
			sql.append(TEXT_NOT_NULL);
			sql.append(VIRGULA);

			sql.append(PRIMARY_KEY);
			sql.append(ABRE_PARENTESES);
			// chave primária composta
			sql.append(ID_DETALHE);
			sql.append(VIRGULA);
			sql.append(ID_DETALHE_PAI);
			sql.append(FECHA_PARENTESES);
			sql.append(VIRGULA);
			//chave estrangeira
			sql.append(FOREIGN_KEY);
			sql.append(ABRE_PARENTESES);
			sql.append(ID_DETALHE_PAI);
			sql.append(FECHA_PARENTESES);

			sql.append(REFERENCES);
			sql.append(FAQ_FACULDADE_PAI);
			sql.append(ABRE_PARENTESES);
			sql.append(ID_DETALHE_PAI);
			sql.append(FECHA_PARENTESES);
			sql.append(FECHA_PARENTESES);

			System.out.println("SQL Criar tabela " + FAQ_FACULDADE_DETALHE + " - " + sql);

			try (Statement stmt = con.createStatement();) {
				int ret = stmt.executeUpdate(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
