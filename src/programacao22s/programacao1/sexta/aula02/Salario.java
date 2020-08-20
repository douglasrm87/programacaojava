package programacao1.sexta.aula02;

import java.util.Scanner;

public class Salario {
	/*
	 * 5. Faça um algoritmo que: a) Obtenha o valor para a variável HT (horas
	 * trabalhadas no mês); b) Obtenha o valor para a variável VH (valor hora
	 * trabalhada): c) Obtenha o valor para a variável PD (percentual de
	 * desconto); d) Calcule o salário bruto => SB = HT * VH; e) Calcule o total
	 * de desconto => TD = (PD/100)*SB; f) Calcule o salário líquido => SL = SB
	 * – TD; g) Apresente os valores de: Horas trabalhadas, Salário Bruto,
	 * Desconto, Salário Liquido.
	 */
	public static void main(String[] args) {
		double ht = 0.0;
		double hr = 0.0;
		double pd = 0.0;
		double sb = 0.0;
		double td = 0.0;
		double sl = 0.0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite HT:");
		ht = leia.nextDouble();
		System.out.println("Digite HR:");
		hr = leia.nextDouble();
		System.out.println("Digite PD:");
		pd = leia.nextDouble();
		sb = ht * hr;
		td = (pd / 100) * sb;
		sl = sb - td;
		System.out.println("Horas trabalhadas:" + ht);
		System.out.println("Salário Bruto:" + sb);
		System.out.println("Desconto:" + pd);
		System.out.println("Salário Liquido:" + sl);

		leia.close();
	}

}
