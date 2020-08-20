package programacao1.terca.aula07;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		new Menu().processar();
	}

	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");
	private void processar() {
		System.out.println("1 - Cadastrar.");
		System.out.println("2 - Consultar");
		System.out.println("3 - Remover");
		System.out.println("4 - Atualizar");
		System.out.println("5 - Consolidar");
		System.out.println("6 - Filtrar");
		System.out.println("7 - Fechar Pedido");
		System.out.println("8 - Finalizar");
		System.out.println("Digite sua opção:");
		int op = this.leia.nextInt();
		if (op == 1) {
			System.out.println("opcao 1");
		}else {
			if (op == 2) {
				System.out.println("opcao 2");
			}
			else {
				if (op ==3) {
					System.out.println("opcao 3");
				}else {
					if (op == 4) {
						System.out.println("opca 4");
					}
				}
			}
		}
		
		
		
		
	}

}
