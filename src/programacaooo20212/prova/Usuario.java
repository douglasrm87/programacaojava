package programacaooo20212.prova;

import java.util.Scanner;
public class Usuario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		PontoParada ponto = new PontoParada();
		int op = 0;
		while (op != 9) {
			System.out.println("1 - Emprestar: ");
			System.out.println("2 - Listar");
			System.out.println("9 - encerrar");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
			switch (op) {
			case 1:
				if (ponto.consultar()) {
					ponto.emprestar(new Bicicleta("meu CPF", "Yellow", "10", true));
				} else {
					System.out.println("Não ha bicicletas disponíveis.");
				}
				break;
			case 2:
				ponto.listarBicicletas();
				break;
			case 9:
				System.exit(0);
			default:
				break;
			}
		}
		leia.close();
	}
}
