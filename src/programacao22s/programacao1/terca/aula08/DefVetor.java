package programacao1.terca.aula08;

import java.util.Scanner;

public class DefVetor {
	public static void main(String[] args) {

		String vetorNome[] = { "DRM", "JSS", "ETW", "OLA", "QUE", "TAL" };

		String strNome = "DRM,JSS,ETW,OLA,QUE,TAL";
		String vetoN[] = strNome.split(",");

		int vetJogo[];
		vetJogo = new int[50];

		int quiz[] = { 1, 3, 5, 2, 809 };
		double quizD[] = { 1, 3, 5, 2, 80.9 };
		int vetTam[];
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor;");
		
		int tam = leia.nextInt();
		
		vetTam = new int [tam];
		System.out.println("Tamanho do vetor:" + vetTam.length);
		
		
		
		
		leia.close();

	}

}
