package programacao1.terca.aula02;

import java.util.Scanner;

/*
 1.	Fa�a um algoritmo para calcular a �rea de uma 
 circunfer�ncia, considerando a f�rmula 
 �REA = p * RAIO2. Utilize as vari�veis AREA e RAIO, 
 a constante p (pi =3,14159) e os operadores 
 aritm�ticos de multiplica��o.
 */
public class Raio {
	public static void main(String[] args) {
		double raio = 0.0, area = 0.0;
		final double PI = 3.14;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o raio:");
		raio = leia.nextDouble();
		area = PI * (raio * raio);
		System.out.println("Aread:" + area);
		leia.close();
	}

}
