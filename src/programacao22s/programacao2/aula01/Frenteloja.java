package programacao2.aula01;

import java.util.Scanner;

public class Frenteloja {
	public static void main(String[] args) {
		Carrinho car = new Carrinho();
		int op = 0;
		Scanner leia = new Scanner(System.in);
		while (op != 9) {
			// debito tecnico
			// while (true) {
			// Aqui precisa aparecer um loop
			System.out.println("1 - Fechar pedido");
			System.out.println("2 - Passsar camisas no Leitor:");
			System.out.println("3 - Adicionar Calca:");

			System.out.println("9 - Fim");
			System.out.println("Digite sua opção.");
			op = leia.nextInt();
			switch (op) {
			case 1:
				double valorCam = car.calcularValor();
				System.out.println("Deve pagar CamisaConstrutor:" + valorCam);

				double valorCal = car.calcularValorCalca();
				System.out.println("Deve pagar Calca:" + valorCal);
				break;
			case 2:
				System.out.println("Digite a cor:");
				String cor = leia.next();
				System.out.println("Digite tam:");
				String tamanho = leia.next();
				System.out.println("Digite o modelo:");
				String modelo = leia.next();
				// precisa controlar para garantir que o usuário tenha digitado
				// um
				// valor númerico
				System.out.println("Digite o preço:");
				double preco = leia.nextDouble();
				Camisa cam = new Camisa();
				cam.cor = cor;
				cam.modelo = modelo;
				cam.preco = preco;
				cam.tam = tamanho;
				car.adicionarCamisa(cam);

				break;

			case 3:
				System.out.println("Digite a marca:");
				String marca = leia.next();
				System.out.println("Digite a cor:");
				String corC = leia.next();
				System.out.println("Digite o preço:");
				double precoC = leia.nextDouble();
				System.out.println("Digite tp calca:");
				String tpCalca = leia.next(); // boca de sino, bag, bombacha
				System.out.println("Tem cinto:");
				String temCinto = leia.next();
				Calca cal = new Calca();
				if (temCinto.equalsIgnoreCase("s")) {
					cal.temCinto = true;
				}
				System.out.println("Digite o tamanha:");
				String tam = leia.next();

				cal.cor = corC;
				cal.marca = marca;
				cal.tamanho = tam;
				cal.tpCalca = tpCalca;
				cal.valor = precoC;

				car.adicionarCalca(cal);

				break;

			case 9:
				System.exit(0);
				leia.close();
			default:
				break;
			}
			// Aqui precisa fechar o loop

		}
		leia.close();
	}

}
