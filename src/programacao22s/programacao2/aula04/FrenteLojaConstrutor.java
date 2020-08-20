package programacao2.aula04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import programacao2.aula03.FrenteLojaHeranca;

public class FrenteLojaConstrutor {
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");
	private String cor;
	private String tamanho;
	private String modelo;
	private double preco;
	private String marcaaaa;

	// concentrado a leitura dos dados para eviar redundãncia
	private void lerDadosSuper() {
		System.out.println("Digite a cor:");
		this.cor = this.leia.next();
		System.out.println("Digite tamanho:");
		this.tamanho = this.leia.next();
		System.out.println("Digite o modelo:");
		this.modelo = this.leia.next();
		System.out.println("Digite o preço:");
		this.preco = this.leia.nextDouble();
		System.out.println("Digite a marca:");
		this.marcaaaa = this.leia.next();

	}

	public static void main(String[] args) {
		new FrenteLojaConstrutor().processar();
	}

	private void processar() {
		CarrinhoHeranca carHeranca = new CarrinhoHeranca();

		int op = 0;
		// Aqui precisa aparecer um loop para que eja possível interagir com os
		// itens
		while (op != 9) {
			System.out.println("1 - Adicionar Calça:");
			System.out.println("2 - Adicionar CamisaConstrutor:");
			System.out.println("3 - Adicionar Cinto:");
			System.out.println("4 - Adicionar Sapato:");
			System.out.println("7 - Fechar pedido");
			System.out.println("9 - Fim");
			System.out.println("Digite sua opção.");
			op = this.leia.nextInt();
			switch (op) {
			case 1:
				// calca
				lerDadosSuper();

				System.out.println("Digite tp calca:");
				String tpCalca = this.leia.next(); // boca de sino, bag,
													// bombacha
				System.out.println("Tem cinto (S/N):");
				String temCinto = this.leia.next();
				Calca cal = new Calca();
				if (temCinto.equalsIgnoreCase("s")) {
					cal.temCinto = true;
				}
				cal.cor = this.cor;
				cal.marca = this.marcaaaa;
				cal.tamanho = this.tamanho;
				cal.tpCalca = tpCalca;
				cal.preco = this.preco;
				cal.modelo = this.modelo;
				carHeranca.adicionarVestuario(cal);

				break;

			case 2:
				lerDadosSuper();

				System.out.println("Digite o tipo da gola:");
				String tpGola = this.leia.next();
				// Com o uso dos construtores deixamos de precisar utilizar atribuicao a cada um
				// dos atributos. Observe a quantidade de linhas que reduzimos.
				
				CamisaConstrutor cam = new CamisaConstrutor(this.cor, this.tamanho, this.preco, this.marcaaaa,
						this.modelo, tpGola);

				carHeranca.adicionarVestuario(cam);
				break;

			case 3:
				// cinto
				lerDadosSuper();
				// Com o uso dos construtores deixamos de precisar utilizar atribuicao a cada um
				// dos atributos
				Cinto cinto = new Cinto();
				System.out.println("Feito em couro (S/N):");
				String eCouro = this.leia.next();
				if (eCouro.equalsIgnoreCase("s")) {
					cinto.eCouro = true;
				}
				System.out.println("Digite quantidade de furos:");
				int qdadeFuros = this.leia.nextInt();
				cinto.qdadeFuros = qdadeFuros;
				cinto.cor = this.cor;
				cinto.modelo = this.modelo;
				cinto.preco = this.preco;
				cinto.tamanho = this.tamanho;
				cinto.marca = this.marcaaaa;
				carHeranca.adicionarVestuario(cinto);

				break;
			case 4:
				lerDadosSuper();
				Sapato sapato = new Sapato();
				// Com o uso dos construtores deixamos de precisar utilizar atribuicao a cada um
				// dos atributos
				sapato.dtFabricação = leData("Digitar data de fabricação (AAAA/MM/DD):");
				sapato.cor = this.cor;
				sapato.modelo = this.modelo;
				sapato.preco = this.preco;
				sapato.tamanho = this.tamanho;
				sapato.marca = this.marcaaaa;
				carHeranca.adicionarVestuario(sapato);
				break;
			case 7:
				System.out.println("Imprimindo Ticket de compra.");
				double valorGeral = carHeranca.calcularValorVestuario();
				System.out.println("TOTAL A pagar:" + valorGeral);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida. Redigite");
				break;
			}
		} // Aqui precisa fechar o loop
	}

	private Date leData(String msg) {
		/*
		 * estes passos podem ser utilizados para a leitura de uma data no formato
		 * string e ser convertida para um objeto Date. Este objeto do tipo Date pode
		 * ser usado em uma pesquisa de banco de dados.
		 */
		String data;
		do {
			do {
				// apresenta a mensagem na tela
				System.out.print(msg);
				// realiza a leitura da data
				data = this.leia.next();
				// valida se a data lida está correta
			} while (data.length() != 10);
		} while (data.charAt(4) != '/' || data.charAt(7) != '/');
		// quebra a data lida em um vetor, usando o / como separador
		String[] datVet = data.split("/");
		/*
		 * converte a string lida em uma data do tipo Calendar. É necessário subtrair um
		 * do mês, devido ao java iniciar o controle dos meses em 0.
		 */
		Calendar cal = new GregorianCalendar(Integer.parseInt(datVet[0]), Integer.parseInt(datVet[1]) - 1,
				Integer.parseInt(datVet[2]));
		// converte a data de Calendar para Date.
		Date dt = new Date(cal.getTimeInMillis());
		return dt;
	}


}
