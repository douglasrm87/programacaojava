package programacao1.sexta.aula05;

import java.util.Scanner;

public class Arranjo {
	public static void main(String args[]) {
		int a[] = new int[10]; // declara e aloca arranjo inteiro
		Scanner s = new Scanner(System.in); // prepara console
		for (int i = 0; i < a.length; i++) { // lê valores para arranjo
			System.out.print("a[" + i + "]? ");
			a[i] = s.nextInt();
		}
		// exibe arranjo e soma seus elementos
		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			soma += a[i];
		}
		System.out.println("Soma = " + soma);
		System.out.println("Media:" + soma / a.length);

		s.close();
	}
}
