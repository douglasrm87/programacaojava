package programacao2.aula01;

import java.util.Scanner;

public class ExemploVetorStr {
	public static void main(String[] args) {
		String nome[];
		nome = new String[5];
		nome[0] = "João Pedro";
		nome[1] = "Jessica";
		nome[2] = "Rafael";
		nome[3] = "Rodrigo";
		nome[4] = "Douglas";

		for (int i = 0; i < nome.length; i++) {
			System.out.print("Nome: " + nome[i] + " - ");
		}

		String rua[] = { "São José", "Souza Naves" };
		for (int i = 0; i < rua.length; i++) {
			System.out.println(rua[i]);
		}

		Scanner leia = 
				new Scanner (System.in);
		String fabricaCarro[] = new String[5];
		System.out.println("Informar 5 Fabricas:");
		for (int i = 0; i < fabricaCarro.length; i++) {
			System.out.println
			("Digite a Fabrica - " + (i + 1) + ":");
			fabricaCarro[i] = leia.next();
		}

		// O que FALTOU???????
		for (int i = 0; i < fabricaCarro.length; i++) {
			System.out.println(fabricaCarro[i]);
		}
		
		
		
		
		
		
		
		
		
		leia.close();
	}

}


