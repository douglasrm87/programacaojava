package programacao1.terca.aula05;

import java.util.Scanner;

public class ExemploSwitchMenu {
	Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		new ExemploSwitchMenu().processar();
	}

	private void processar() {
		int op = 0;
		// Gera débito técnico.
//		while (true) {
		while (op != 9) {
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Consultar.");
			System.out.println("3 - Remover.");
			System.out.println("4 - Atualizar.");
			System.out.println("5 - Validar.");
			System.out.println("9 - Fim.");

			System.out.println("Digite a sua opção:");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("Escolheu cadastrar");
				break;
			case 2:
				System.out.println("Escolheu Consultar");
				break;
			case 3:
				System.out.println("Escolheu Remover");
				break;
			case 4:
				System.out.println("Escolheu Atualizar");
				break;
			case 9:
//				System.exit(0);// para o caso do while (true) que gerou Débito Técnico.
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		}

	}

}
