package programacaooo20212.aula9bd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExemploCriaTabelas {
	Connection con;

	public String criaVenda() throws MyClassException {
		String createString = "create table venda" + "( data DATE , " + "  nome_vendedor VARCHAR(32) , "
				+ "  matricula int , " + "   primary key (matricula)" + " )";
		try {
			executaCriacao(createString);
		
		} catch (SQLException e) {
			// -1303 Caso a tabela ja tenha sido criada no access
			// 335544351 Caso a tabela ja tenha sido criada no Firebird
			if ((e.getErrorCode() == -1303) || (e.getErrorCode() == 335544351)) {
				return "venda";
			} else {
				MyClassException obj = new MyClassException("Erro em SQLException. Error Code:" + e.getErrorCode());
				obj.setClasse("ExemploCriaTabelas");
				obj.setMensagem(e.getMessage());
				obj.setMetodo("criaVenda");
				throw obj;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String criaContaCorrente() throws MyClassException {
		String createString = "create table contacorrente" + "( num_agencia int NOT NULL , "
				+ "  num_conta int NOT NULL , " + "  nome VARCHAR(32) , " + "  saldo int , "
				+ "   primary key (num_agencia , num_conta)" + " )";
		try {
			executaCriacao(createString);
			
		} catch (SQLException e) {
			// -1303 Caso a tabela ja tenha sido criada no access
			// 335544351 Caso a tabela ja tenha sido criada no Firebird
			if ((e.getErrorCode() == -1303) || (e.getErrorCode() == 335544351)) {
				return "contacorrente";
			} else {
				MyClassException obj = new MyClassException("Erro em SQLException. Error Code:" + e.getErrorCode());
				obj.setClasse("ExemploCriaTabelas");
				obj.setMensagem(e.getMessage());
				obj.setMetodo("criaContaCorrente");
				throw obj;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private void tabelaDuplicada(String nomeTabela) throws MyClassException {
		System.out.println("A tabela " + nomeTabela + " já existe, portanto será removida");
		System.out.println("Para criar esta tabela executar este programa novamente.");

		try (Scanner var = new Scanner(System.in);) {

			System.out.println("Deseja Continuar o drop da tabela: " + nomeTabela);
			String opcao = var.nextLine();
			if (opcao.equalsIgnoreCase("s")) {
				String createString = "drop table " + nomeTabela;
				try {
					executaCriacao(createString);
				} catch (SQLException e) {
					MyClassException obj = new MyClassException("Erro em SQLException. Error Code:" + e.getErrorCode());
					obj.setClasse("ExemploCriaTabelas");
					obj.setMensagem(e.getMessage());
					obj.setMetodo("tabelaDuplicada");

					throw obj;
				}
				System.out.println("Tabela Removida");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String criaClientes() throws MyClassException {
		String createString = "create table clientes " + "( id int NOT NULL primary key , " + "  nome VARCHAR(32) )";
		try {
			executaCriacao(createString);
			
		} catch (SQLException e) {
			// -1303 Caso a tabela ja tenha sido criada no access
			// 335544351 Caso a tabela ja tenha sido criada no Firebird
			if ((e.getErrorCode() == -1303) || (e.getErrorCode() == 335544351)) {
				return "clientes";
			} else {
				MyClassException obj = new MyClassException("Erro em SQLException. Error Code:" + e.getErrorCode());
				obj.setClasse("ExemploCriaTabelas");
				obj.setMensagem(e.getMessage());
				obj.setMetodo("criaClientes");
				throw obj;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void executaCriacao(String createString) throws SQLException, MyClassException, ClassNotFoundException {
		MinhaConexao mCon = new MinhaConexao();
		Connection conLocal = mCon.conectar();
		Statement stmt;
		stmt = conLocal.createStatement();
		int ret = stmt.executeUpdate(createString);
		// Comandos DDL não possuem retorno e por isto será impresso -1. Podemos
		// recuperar a quantidade
		// de linhas destas duas formas.
		System.out.println("Linhas afetadas (getUpdateCount): " + stmt.getUpdateCount());
		System.out.println("Linhas afetadas: " + ret);
		stmt.close();
		conLocal.close();
	}

	public Connection defineConexao() throws MyClassException {
		System.out.println("1 - Conectar no Access");
		System.out.println("2 - Conectar no Firebird");
		try (Scanner var = new Scanner(System.in).useDelimiter("\r\n");) {
			System.out.println("Digite sua opção: ");
			int opcao = var.nextInt();

			if (opcao == 1) {
//				con = ConexaoBD.carregarBancoDados();
			} else {
//				con = ConexaoBDFireBird.carregarBancoDados();
			}
			return con;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	public static void main(String args[]) {
		ExemploCriaTabelas obj = new ExemploCriaTabelas();
		String nomeTabela = null;
		try (Connection con = obj.defineConexao();) {

			nomeTabela = obj.criaClientes();
			if (nomeTabela != null) {
				obj.tabelaDuplicada(nomeTabela);
			}
			nomeTabela = obj.criaContaCorrente();
			if (nomeTabela != null) {
				obj.tabelaDuplicada(nomeTabela);
			}
			nomeTabela = obj.criaVenda();
			if (nomeTabela != null) {
				obj.tabelaDuplicada(nomeTabela);
			}

		} catch (MyClassException e) {
			System.out.println("Mensagem do objeto: " + e.getMessage());
			System.out.println("Classe: " + e.getClasse());
			System.out.println("Método: " + e.getMetodo());
			System.out.println("Mensagem original: " + e.getMensagem());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
