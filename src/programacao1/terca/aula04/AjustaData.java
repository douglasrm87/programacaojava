package programacao1.terca.aula04;

import java.util.Scanner;

public class AjustaData {
	public static void main(String[] args) {
		/*
		 * 18. Admitindo que uma data é lida pelo algoritmo em uma variável inteira, e
		 * não em uma variável do tipo data, crie um algoritmo que leia uma data no
		 * formato DDMMAA e imprima essa data no formato AAMMDD, onde:
		 */

		int dataInt = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite data (DDMMAA):");
		dataInt = leia.nextInt();
		// Mostrar AAMMDD
		String dataStr = String.valueOf(dataInt);
		char vetorData[] = dataStr.toCharArray();
		System.out.println(
				"Nova data:" + vetorData[4] + vetorData[5] + vetorData[2] + vetorData[3] + vetorData[0] + vetorData[1]);

		leia.close();

	}

}
