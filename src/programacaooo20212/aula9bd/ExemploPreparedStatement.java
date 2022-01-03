package programacaooo20212.aula9bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExemploPreparedStatement {
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
	
	public static void main(String[] args) {
		new ExemploPreparedStatement().processar();
	}
	private void processar() {
		ExemploPreparedStatement dmlObj = new ExemploPreparedStatement();
		
		int opcao = 0;
		while (opcao != 9) {
			
			try {
				System.out.println("1 - Criar tabela vendaaaaas. ");
				System.out.println("2 - Inserir dados da venda. ");
				System.out.println("3 - Selecionar dados da venda por período. ");
				System.out.println("9 - Fim ");
				System.out.println("Entre com uma opção: ");
				 
				opcao = sc.nextInt();
			 
				if (opcao == 9) {
					break;
				}
				switch (opcao) {
				case 1:
					dmlObj.criarTabelaVenda();
					break;
				case 2:
					dmlObj.inserirVenda();
					break;
				case 3:
					dmlObj.selecionarVendas();
					break;
				default:
				}
			} catch (MyClassException e) {
				if (e.getCodigo() == 1050) {
					System.out.println("\n\nTabela venda já existe.\n");
				} else if (e.getCodigo() == 1064) {
					System.out.println("\nNenhuma data foi digitada. \n");
				} else if (e.getCodigo() == 1062) {
					// A chave primária da tabela venda é a matricula.
					System.out.println("\nAtenção: Registro duplicado. \n");
				} else if (e.getCodigo() == 1146) {
					System.out.println("\nAtenção: Criar a tabela venda. \n");
				} else {
					System.out.println("Mensagem do objeto: " + e.getMessage());
					System.out.println("Classe: " + e.getClasse());
					System.out.println("Método: " + e.getMetodo());
					System.out.println("Mensagem original: " + e.getMensagem());
					System.out.println("__________________________________\n");
				}
			}
		}
	 

	}

	private void inserirVenda() throws MyClassException {
		try  {

			System.out.println("Digite o nome do vendedor: ");
			String nome = sc.next();
			System.out.println("Digite a matrícula (OBS.: chave primária): ");
			int matricula = sc.nextInt();
			MinhaConexao mCon = new MinhaConexao();
			Connection con = mCon.conectar();
			PreparedStatement stmt = con
					.prepareStatement("INSERT INTO venda ( matricula , nome_vendedor , data ) VALUES (?,?,?) ");
			stmt.setInt(1, matricula);
			stmt.setString(2, nome);
			Date dUtil = new Date();
			stmt.setDate(3, new java.sql.Date(dUtil.getTime()));
			stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			MyClassException obj = new MyClassException("Erro em SQLException. Error Code:" + e.getErrorCode());
			obj.setClasse(getClass().getName());
			obj.setMensagem(e.getMessage());
			obj.setMetodo("inserirVenda");
			obj.setPacote(getClass().getPackage().toString());
			obj.setCodigo(e.getErrorCode());
			throw obj;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selecionarVendas() throws MyClassException {
		String dtIni = null;
		String dtFim = null;

		MinhaConexao mCon = new MinhaConexao();
		
		try (
				Connection con = mCon.conectar();) {

			System.out.println("Digite a data inicial (DD/MM/AAAA): ");
			dtIni = sc.next();
			System.out.println("Digite a data Final (DD/MM/AAAA): ");
			dtFim = sc.next();
			StringBuffer sql = new StringBuffer("SELECT matricula , nome_vendedor , data FROM venda WHERE ");
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			java.sql.Date dataIni = null;
			if (!dtIni.equals("")) {
				sql.append(" data >= ?   ");
				dataIni = new java.sql.Date(format.parse(dtIni).getTime());
			}
			java.sql.Date dataFim = null;
			if (!dtFim.equals("")) {
				if (!dtIni.equals("")) {
					sql.append(" AND ");
				}
				sql.append(" data <= ? ");
				dataFim = new java.sql.Date(format.parse(dtFim).getTime());
			}
			PreparedStatement stmt = con.prepareStatement(sql.toString());
			if (dataIni != null) {
				stmt.setDate(1, dataIni);
			}
			if (dataFim != null) {
				if (dataIni == null) {
					stmt.setDate(1, dataFim);
				} else {
					stmt.setDate(2, dataFim);
				}
			}
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("*************************");
				System.out.println("Matricula: " + rs.getInt(1));
				System.out.println("Nome Vendedor: " + rs.getString(2));
				System.out.println("Data Venda: " + rs.getDate(3));
				System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			MyClassException obj = new MyClassException("Erro em SQLException. Error Code:" + e.getErrorCode());
			obj.setClasse("ExemploComandoSQLDinamico");
			obj.setMensagem(e.getMessage());
			obj.setMetodo("selecionarVendas");
			obj.setCodigo(e.getErrorCode());
			throw obj;
		} catch (ParseException e) {
			MyClassException obj = new MyClassException(
					"Erro em ParseException. Digitar a data no formato DD/MM/AAAA, caso 						 contrário dará erro.");
			obj.setClasse("ExemploComandoSQLDinamico");
			obj.setMensagem(e.getMessage());
			obj.setMetodo("selecionarVendas");
			throw obj;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void criarTabelaVenda() throws MyClassException {

		ExemploCriaTabelas ex = new ExemploCriaTabelas();
		ex.criaVenda();
	}
}
