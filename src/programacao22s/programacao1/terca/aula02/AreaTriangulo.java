package programacao1.terca.aula02;

import java.util.Scanner;

/*
 2.	Fa�a um algoritmo que calcule a �rea 
 de um tri�ngulo, considerando a 
 f�rmula �rea = (Base * Altura) / 2. Utilize as 
 vari�veis AREA, BASE e ALTURA e os operadores 
 aritm�ticos de multiplica��o e divis�o.
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
