package programacao1.terca.aula10.aovivo;

import java.util.Scanner;

public class Balcao {

	public static void main(String[] args) {
		new Balcao().processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		int op = 0;
		do {
			System.out.println("1 - Adcionar Carro:");
			System.out.println("2 - Adcionar Moto:");
			System.out.println("3- Adcionar Patinete:");
			System.out.println("4- Adcionar Bicicleta:");
			System.out.println("8- Fechar contrato:");
			System.out.println("9- Sairdo sistema:");
			op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Carro");
				break;
			case 2:
				System.out.println("Moto");
				break;
			case 3:
				System.out.println("Patinete");
				break;
			case 4:
				System.out.println("Bicicleta");
				break;
			case 8:
				System.out.println("Fechar Contrato");
				break;
			case 9:
				System.out.println("Sair do sistema");
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (op != 9);

	}

}
