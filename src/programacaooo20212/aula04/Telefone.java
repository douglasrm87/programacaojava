package programacaooo20212.aula04;

import java.util.Scanner;

public class Telefone {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("1 - Efetuar liga��o");
		System.out.println("2 - Efetuar liga��o DDD");
		System.out.println("3 - Gravar �udio.");
		System.out.println("4 - Recuperar �udio.");

		int op = leia.nextInt();
		int numero = 0;
		BaseTelefone minhaBase = new BaseTelefone();
		String msg;
		switch (op) {
		case 1:
			System.out.println("Digite o numero:");
			numero = leia.nextInt();
			minhaBase.efetuarLigacao(numero);

			break;
		case 2:
			System.out.println("Digite o numero:");
			numero = leia.nextInt();

			System.out.println("Digite o DDD:");
			int ddd = leia.nextInt();
			minhaBase.efetuarLigacao(numero,ddd);

			break;
			
		case 3:
			System.out.println("Digite sua mensagem:");
			msg = leia.next();
			minhaBase.gravarConversa(msg);

			break;
			
		case 4:
			System.out.println("Digite o ID do �udio:");
			int id = leia.nextInt();
			msg = minhaBase.obterConversa(id);
			System.out.println("O Audio da mensagem ID:" + id +" = " + msg);

			break;
		default:
			break;
		}

		leia.close();
	}

}
