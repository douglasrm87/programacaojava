package programacaooo20212.aula9bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public interface InterfaceJava8 {
	public void criaTabela() throws SQLException;

	default public void criaTabela(String comando) throws SQLException {
		Connection tabCon = obterConexao();
		if (tabCon != null) {
			Statement stmt = tabCon.createStatement();
			stmt.executeUpdate(comando);
			stmt.close();
			tabCon.close();
		} else {
			System.out.println("Problemas na conexão.");
		}
	}

	default public Connection obterConexao() {
		// MinhaConexao obj = new MinhaConexao();
		// return obj.obterConexao();
		String usuario = "root";
		String senha = "minhasenha";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não disponível.");
		}
		String urlMysql = "jdbc:mysql://localhost:3306/meubanco?createDatabaseIfNotExist=true";
		try (Connection conexao = DriverManager.getConnection(urlMysql, usuario, senha);) {
			return conexao;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("URL, usuário ou senha inválidos.");
		}
		return null;
	}
}
