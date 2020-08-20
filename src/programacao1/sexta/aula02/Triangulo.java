package programacao1.sexta.aula02;


/*
 * 2. Faça um algoritmo que calcule a área de um triângulo, considerando
 * a fórmula Área = (Base * Altura) / 2. Utilize as variáveis AREA, BASE
 * e ALTURA e os operadores aritméticos de multiplicação e divisão.
 */
import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		double area = 0.0;
		double base = 0.0;
		double altura = 0.0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a base:");
		base = leia.nextDouble();
		System.out.println("Digite a altura:");
		altura = leia.nextDouble();
		area = (base * altura) / 2;
		System.out.println("Area:" + area);

		String a;
	
		leia.close();
		

	}

}
