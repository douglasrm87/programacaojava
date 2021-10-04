package programacaooo20212.aula04;

public class ExemploVetor {
	
	public static void main(String[] args) {
		int vetor [];
		vetor = new int [5];
		for (int i = 0; i < vetor.length; i++) {
			vetor [i] = i + 10;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valores:" + vetor[i]);
		}
		
	}

}
