package programacao1.terca.aula02;

import java.util.Scanner;

/*
a) Obtenha o valor para a variável HT (horas trabalhadas no mÃªs);
b) Obtenha o valor para a variável VH (valor hora trabalhada):
c) Obtenha o valor para a variável PD 
(percentual de desconto);
d) Calcule o salÃ¡rio bruto => SB = HT * VH;
e) Calcule o total de desconto => TD = (PD/100)*SB;
f) Calcule o salÃ¡rio lÃ­quido => SL = SB â€“ TD;
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, SalÃ¡rio Liquido.

 */
public class CalculaHora {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double ht;
		double valorH;
		double percDesc;
		System.out.println("Quantidade Horas Trabalhadas");
		ht = leia.nextDouble();
		System.out.println("Valor Horas Trabalhadas");
		valorH = leia.nextDouble();
		System.out.println("Pecentual");
		percDesc = leia.nextDouble();
		double valorBruto = ht * valorH;
		double totalDesc = (percDesc / 100) * valorBruto;
		double valoLiq = valorBruto - percDesc;
		System.out.println("Valor Bruto:" + valorBruto);
		System.out.println("Total Desc:" + totalDesc);
		System.out.println("Valor Liquido:" + valoLiq);
		leia.close();
	}
}
