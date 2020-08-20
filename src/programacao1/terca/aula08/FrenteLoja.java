package programacao1.terca.aula08;

import java.util.Scanner;

public class FrenteLoja {
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");
	public static void main(String[] args) {
		new FrenteLoja().processar();
	}
	private void processar() {
		System.out.println("1 - Adicionar Camisa.");
		System.out.println("7 - Fechar Pedido.");
		System.out.println("Digite sua opção:");
		int op = this.leia.nextInt();
		switch (op) {
		case 1:
			break;
		case 7:
			break;
		default:
			break;
		}
	}

}
