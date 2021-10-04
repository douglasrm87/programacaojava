package programacaooo20212.aula04;

public class exercicio01 {
	
	/*
 Questão 7) (2,0) Desenvolver um algoritmo que receba os valores de uma matriz de 4 linhas e 4 colunas e 
 
 mostre o conteúdo  das linhas pares e das colunas ímpares. Utilizar um para para cada apresentação.
	 */
	
	public static void main(String[] args) {
		int matriz [][] = new int [4][4];
		
		System.out.println("Tamanho da Matriz: " + matriz.length);
		// processar as linhas
		for (int i = 0; i < matriz.length; i++) {
			// processar as colunas			
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i + 10;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			if ((i%2) != 0) {
				continue;
			}
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "	");
			}
			System.out.println();
		}
		
	}
	

}
