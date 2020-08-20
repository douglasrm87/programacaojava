package programacao1.terca.aula07;

import java.util.Scanner;

public class MenuSwitch {
	public static void main(String[] args) {
		new MenuSwitch().processar();
	}

	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

	private void processar() {
		// gerou debito tecnico
		while (true) {
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Consultar");
			System.out.println("3 - Remover");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Consolidar");
			System.out.println("6 - Filtrar");
			System.out.println("7 - Fechar Pedido");
			System.out.println("9 - Finalizar");
			System.out.println("Digite sua opção:");
			int op = this.leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Opção 1");
				break;
			case 2:
				System.out.println("Opcao 2");
				break;
			case 3:
				System.out.println("Opcao 2");
				break;

			case 9:
				System.exit(0);
			default:
				break;
			}
		}
	}

}
