package programacaooo20212.aula9bd;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MinhaConexao {
	public static void main(String[] args) {
		MinhaConexao x = new MinhaConexao();
		try (Connection con = x.conectar();) {
			// x.criartabela(con);
			// x.inserirDadostabela(con);
			x.selecionarFornecedor(con);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Acionar suporte de Ti.");
			System.out.println("Problemas SQl State:" + e.getSQLState());
			System.out.println("Problemas Error CODE:" + e.getErrorCode());
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Problemas na identificação do Driver. Acessar Suporte TI.");
		}
	}

	public Connection conectar() throws ClassNotFoundException, SQLException {

		// para mysql
		// Class.forName("com.mysql.jdbc.Driver");
		// para postgree
		Class.forName("org.postgresql.Driver");
		System.out.println("Apos Class.forname().");

		// String url =
		// "jdbc:mysql://localhost:3306/seguro?createDatabaseIfNotExist=true";
		String url = "jdbc:postgresql://localhost:5432/faculdade";
		Connection con = DriverManager.getConnection(url, "postgres", "12345");
		System.out.println("Apos obter conexao.");
		return con;

	}

	public void criartabela(Connection con) throws SQLException {
		String tabela = "CREATE TABLE " + "Fornecedor (codigo serial,nome varchar(30) NOT NULL,"
				+ "email varchar(50),PRIMARY KEY (codigo))";
		Statement stmt = con.createStatement();
		int ret = stmt.executeUpdate(tabela);
		System.out.println("ID Retorno:" + ret);
		stmt.close();

	}

	public void inserirDadostabela(Connection con) throws SQLException {
		String insere = "insert into Fornecedor ( nome,email ) "
				+ "VALUES ( 'Douglas Mendes' , 'douglas.mendes@estacio.br' )";
		Statement stmt = con.createStatement();
		int ret = stmt.executeUpdate(insere);
		System.out.println("ID Retorno:" + ret);
		stmt.close();
	}

	public void selecionarFornecedor(Connection con) throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select nome,email from Fornecedor");
		while (rs.next()) {
			System.out.println("*************************");
			System.out.println("Nome: " + rs.getString("nome"));
			System.out.println("e-mail: " + rs.getString("email"));
			System.out.println();
		}
		rs.close();
		stmt.close();
		
	}

}
