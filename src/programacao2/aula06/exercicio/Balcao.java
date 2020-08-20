package programacao2.aula06.exercicio;

import java.util.Scanner;

public class Balcao {
	public static void main(String[] args) {
		new Balcao().processar();
	}

	Contrato contrato = new Contrato();
// criar um metodo para leitura centralizada.
	// Tudo que for da super classe ler centralizado.
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

	private void processar() {
		/// menu
		int op = 0;
		double total = 0.0;
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
				System.out.println("Digite o valor:");
				double precoDiaria = this.leia.nextDouble();
				System.out.println("Digite o modelo:");
				String modelo = this.leia.next();
				System.out.println("Digite o periodo:");
				int qdadeDias = this.leia.nextInt();
				System.out.println("Carro Elétriico (s/n):");
				String strEletric = this.leia.next();
				boolean isEletrico = false;
				if (strEletric.equalsIgnoreCase("s")) {
					isEletrico = true;
				}
				System.out.println("Carro tem ar (s/n):");
				String strArcondicionado = this.leia.next();
				boolean isArcondicionado = false;
				if (strArcondicionado.equalsIgnoreCase("s")) {
					isArcondicionado = true;
				}
				System.out.println("Digite a quantidade de portas:");
				int qdadePortas = this.leia.nextInt();
				System.out.println("Digite qdade lugare:");
				int qdadeLugares = this.leia.nextInt();
				System.out.println("Digite se e 4x4 (s/n):");
				String str4x4 = this.leia.next();
				boolean is4x4 = false;
				if (str4x4.equalsIgnoreCase("s")) {
					is4x4 = true;
				}
				Carro novoCarro = new Carro(precoDiaria, modelo, qdadeDias, isEletrico, isArcondicionado, qdadePortas,
						qdadeLugares, is4x4);
				this.contrato.adicionarLocomoca(novoCarro);
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
				total += this.contrato.calcularItensAlugados();
				break;

			case 9:
				System.out.println("Sistema será encerrado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while (op != 9);

		System.out.println("Deverá pagar: " + total);
		this.leia.close();
	}

}
