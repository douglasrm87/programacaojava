package programacao1.terca.aula02;

import java.util.Scanner;

public class Concatena {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = leia.next();
		System.out.println("Digite seu sobrenome:");
		String sobrenome = leia.next();

		System.out.println(nome + sobrenome);

		leia.close();

	}

}
