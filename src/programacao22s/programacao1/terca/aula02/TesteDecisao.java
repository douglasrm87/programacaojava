package programacao1.terca.aula02;

import java.util.Scanner;

public class TesteDecisao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a AV1");
		double av1 = leia.nextDouble();
		double novaNota = av1;
		if (av1 < 40) {
			System.out.println("Dever� fazer a AVs");
			double avs = leia.nextDouble();
			novaNota = (av1 + avs) / 2;
			System.out.println("Nova nota AV1:");
		}
		System.out.println("Digite a AV2");
		double av2 = leia.nextDouble();
		if (novaNota < 40 && av2 < 40) {
			System.out.println("Reprovado");
		} else if (novaNota < 40 || av2 < 40) {
			System.out.println("Digite a AV3");
			double av3 = leia.nextDouble();
			if (av2 > 40) {
				System.out.println("M�dia:" + (av2 + av3) / 2);
			} else {
				System.out.println("M�dia:" + (av1 + av3) / 2);
			}
		} else {
			System.out.println("M�dia:" + (novaNota + av2) / 2);
		}
		leia.close();
	}

}
