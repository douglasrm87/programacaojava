package programacao2.aula05.exercicio;

import java.util.Scanner;

public class Balcao {
	public static void main(String[] args) {
		new Balcao().processar();
	}

// criar um metodo para leitura centralizada.
	// Tudo que for da super classe ler centralizado.
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

	private void processar() {
		/// menu
		int op = 0;
		do {
			System.out.println("1 - Alugar Carro");
			System.out.println("2 - Alugar Patinete");
			System.out.println("3 - Alugar Moto");
			System.out.println("4 - Alugar Bicicleta");
			System.out.println("7 - Gerar Boleto");
			System.out.println("9 - Encerrar aplicação");
			System.out.println("Digite sua opção.");
			op = this.leia.nextInt();
			switch (op) {
			case 1:

				// Usar Construtor
				// Usar leitura centralizada
				// ler os itens especificos
				// Criar um objeto com construtor
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 7:

				break;

			case 9:
				System.out.println("Sistema será encerrado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while (op != 9);

		this.leia.close();
	}

}
