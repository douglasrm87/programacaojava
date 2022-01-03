package programacaooo20212.aula9bd;

import java.sql.SQLException;

public class VendaInterface implements InterfaceJava8 {

	@Override
	public void criaTabela() throws SQLException {
		System.out.println("Estou na Venda.");
		String comando = null;
		// Acessar o MySQL e criar a tabela vendam
		comando = "create table venda (nome_vendedor VARCHAR(32) , " + "matricula int , "
				+ " primary key (matricula) ) ";
		criaTabela(comando);
	}
}
