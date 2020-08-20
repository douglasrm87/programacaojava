package programacao1.sexta.aula01;

import java.util.Scanner;

public class LerDadoss {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = leia.next();

		System.out.println("Digite sua idade:");
		int idade = leia.nextInt();

		leia.close();
	}

}
