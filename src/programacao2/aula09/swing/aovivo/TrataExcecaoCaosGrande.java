package programacao2.aula09.swing.aovivo;

import java.util.Scanner;

public class TrataExcecaoCaosGrande {
	public static void main(String[] args) {
		new TrataExcecaoCaosGrande().processar();
	}
	Scanner leia = new Scanner(System.in);
	private void processar() {

		System.out.println("Digitar uma idade:");
		try {
			int idade = leia.nextInt();
			if (idade >= 16) {
				System.out.println("Pode votar");
			} else {
				System.out.println("N�o Pode votar");
			}
			int retDetran = avaliarDetran(idade);
			if (retDetran == 0) {
				System.out.println("N�o pode dirigir e tamb�m pode ser que n�o pode casar");
			} else {
				System.out.println("Pode dirigir");
			}
		} catch (Exception e) {
			System.out.println("Dado de entrada inv�lido. Reentre.");
		}
		leia.close();
	}

	private int avaliarDetran(int idade) {
		int retCasamento = avaliarCasamento(idade);

		if (idade < 18 || retCasamento == 0) {
			return 0; // onde 0 significa que n�o pode dirigir
		}
		return 1; // onde 1 pode dirigir
	}

	private int avaliarCasamento(int idade) {
		if (idade < 21) {
			return 0; // onde 0 significa que n�o pode dirigir
		}
		return 1; // onde 1 pode dirigir
	}

}
