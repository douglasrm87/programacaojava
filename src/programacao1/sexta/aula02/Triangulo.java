package programacao1.sexta.aula02;


/*
 * 2. Fa�a um algoritmo que calcule a �rea de um tri�ngulo, considerando
 * a f�rmula �rea = (Base * Altura) / 2. Utilize as vari�veis AREA, BASE
 * e ALTURA e os operadores aritm�ticos de multiplica��o e divis�o.
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
