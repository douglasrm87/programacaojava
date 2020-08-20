package programacao1.sexta.aula02;

import java.util.Scanner;

public class Raio {
	public static void main(String[] args) {
		double area = 0.0;
		final double PI = 3.14;
		double raio = 0.0;
		/*Faça um algoritmo para calcular a área de uma 
circunferência, considerando a fórmula 
ÁREA = p * RAIO * RAIO. 
Utilize as variáveis AREA e RAIO, a constante 
p (PI =3,14159) e os operadores aritméticos de 
multiplicação.*/
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o raio:");
		raio = leia.nextDouble();
		
		area = raio * raio * PI;
		System.out.println("Area = " + area);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
		
		
		
		
		
		
		
		
	
	}

}
