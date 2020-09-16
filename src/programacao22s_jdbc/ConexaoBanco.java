package programacao22s_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
  
public class ConexaoBanco {
	public static void main(String[] args) {
		new ConexaoBanco().processar();
	}

	private void processar () {
		try {
			Connection con = new ConexaoBanco().conectarBanco();
			if (con != null) {
				System.out.println("Conectado com sucesso.");
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection conectarBanco() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/faculdade"; // 2
			Connection con = DriverManager.getConnection(url, "postgres", "123456");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
 
}
