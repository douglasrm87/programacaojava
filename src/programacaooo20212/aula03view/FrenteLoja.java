package programacaooo20212.aula03view;

import java.util.Scanner;

import programacaooo20212.aula03controller.Carrinho;

public class FrenteLoja {

	public static void main(String[] args) {
		System.out.println("1-Adicionar Calca");
		System.out.println("2-Adicionar Camisa");
		System.out.println("3-Adicionar sapato");
		System.out.println("4-Adicionar Meia");
		System.out.println("5-Adicionar Cinto");
		System.out.println("Digite sua opção:");
		Scanner leia = new Scanner(System.in);

		int op = leia.nextInt();

		switch (op) {
		case 1:

			System.out.println("Digite o modelo da calca:");
			String modelo = leia.next();
			System.out.println("tem cinto (S/N)?");
			String temCinto = leia.next();
			boolean temcinto01 = false;
			if (temCinto.equals("s")) {
				temcinto01 = true;
			}
			System.out.println("Digite a cor:");
			String cor = leia.next();
			System.out.println("Digite a tamanho (P/M/G/GG):");
			String tamanho = leia.next();
			System.out.println("Digite o preco:");
			double preco = leia.nextDouble();
			System.out.println("Digite o marca:");
			String marca = leia.next();
			System.out.println("Digite o tipo da Calca:");
			String tpCalca = leia.next();

			Carrinho car = new Carrinho();
			car.adicionarCalca(temcinto01, tpCalca, cor, tamanho, preco, marca, modelo);

		default:
			break;
		}

		leia.close();
	}

}
