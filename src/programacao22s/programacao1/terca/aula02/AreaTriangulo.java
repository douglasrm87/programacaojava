package programacao1.terca.aula02;

import java.util.Scanner;

/*
 2.	Faça um algoritmo que calcule a área 
 de um triângulo, considerando a 
 fórmula Área = (Base * Altura) / 2. Utilize as 
 variáveis AREA, BASE e ALTURA e os operadores 
 aritméticos de multiplicação e divisão.
 */
public class AreaTriangulo {
	public static void main(String[] args) {

		double base = 0.0, altura = 0.0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a altura:");
		altura = leia.nextDouble();

		System.out.println("Digite a base:");
		base = leia.nextDouble();

		double area = (base * altura) / 2;
		System.out.println("Aread:" + area);
		leia.close();
	}

}
