package programacao1.terca.aula02;

import java.util.Scanner;

/*
 1.	Faça um algoritmo para calcular a área de uma 
 circunferência, considerando a fórmula 
 ÁREA = p * RAIO2. Utilize as variáveis AREA e RAIO, 
 a constante p (pi =3,14159) e os operadores 
 aritméticos de multiplicação.
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
