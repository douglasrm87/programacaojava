package sistemaoperacional.memoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstouroHeapRam {
	public static void main(String[] args) {
		new EstouroHeapRam().alocarDadosLista();
	}

	protected Connection conectarBDPostgree() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("");
		con = DriverManager.getConnection("");
		System.out.println("Conexão estabelecida com sucesso.");
		return con;
	}

	public void alocarDadosLista() {
		Connection con;
		EstouroHeapRamThread taVetor[] = new EstouroHeapRamThread[1000000];
		try {
			Connection c = conectarBDPostgree();
			c.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			for (int i = 0; i < 1000000; i++) {
				System.out.println("Tentando parar o SO. 					Thread NR:" + i);
				taVetor[i] = new EstouroHeapRamThread();
				taVetor[i].setPriority(Thread.MAX_PRIORITY);
				taVetor[i].setDaemon(true);
				taVetor[i].start();
			}
		}
	}
}
