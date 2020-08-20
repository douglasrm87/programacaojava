package programacao2.aula03;

import java.util.Scanner;

public class FrenteLoja {
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");
	private String cor;
	private String tamanho;
	private String modelo;
	private double preco;
	private String marcaaaa;

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
		new FrenteLoja().processar();
	}

	private void processar() {
		Carrinho car = new Carrinho();
		int op = 0;
		// Aqui precisa aparecer um loop para que eja possível interagir com os
		// itens
		while (op != 9) {
			/*
			 * debito tecnico while (true) {
			 */

			System.out.println("1 - Adicionar Calça:");
			System.out.println("2 - Adicionar CamisaConstrutor:");

			// Novos itens que passaremos a vender
			// Para cada um criar uma classe e definir os atributos.
			// Na classe Carrinho implementar os atributos e métodos para tornar
			// possível adicionar estes novos intens no carrinho

			System.out.println("3 - Adicionar Cinto:");
			System.out.println("4 - Adicionar Sapato:");
			System.out.println("5 - Adicionar UnderWear:");
			System.out.println("6 - Adicionar Meia:");

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

				car.adicionarCalca(cal);

				break;

			case 2:
				lerDadosSuper();
				Camisa cam = new Camisa();
				cam.cor = this.cor;
				cam.modelo = this.modelo;
				cam.preco = this.preco;
				cam.tamanho = this.tamanho;
				cam.marca = this.marcaaaa;
				car.adicionarCamisa(cam);
				break;

			case 3:
				// cinto
				lerDadosSuper();
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

				car.adicionarCinto(cinto);
				break;
			case 7:
				System.out.println("Imprimindo Ticket de compra.");
				double valorCam = car.calcularValor();
				System.out.println("Deve pagar CamisaConstrutor:" + valorCam);
				double valorCal = car.calcularValorCalca();
				System.out.println("Deve pagar Calca:" + valorCal);
				double valorCinto = car.calcularValorCinto();
				System.out.println("Deve pagar Cinto:" + valorCinto);

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
}
