package programacao1.sexta.aula02;

import java.util.Scanner;

public class NomeSobrenome {
	public static void main(String[] args) {
		String nome;
		String sobreNome;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		nome = leia.next();
		System.out.println("Digite seu sobrenome");
		sobreNome = leia.next();
		System.out.println(nome + " " + sobreNome);
		
		
		
		
		
		
		
		
		
		leia.close();
		
		
		
	}

}
