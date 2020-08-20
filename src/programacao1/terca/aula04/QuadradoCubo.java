package programacao1.terca.aula04;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {
		// entrada
		int numero = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o numero:");
		numero = leia.nextInt();

		// processamento e saida ficaram juntos
		System.out.println("Quadrado:" + numero * numero);

		System.out.println("Cubo:" + numero * numero * numero);

		leia.close();
	}

}
