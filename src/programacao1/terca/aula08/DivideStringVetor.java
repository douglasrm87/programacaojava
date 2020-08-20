package programacao1.terca.aula08;

public class DivideStringVetor {
	public static void main(String[] args) {
		String strNomes = "Douglas,David,Julia,Mariana,Pedro,PAtrick,Tiago";
		String strNumSena = "20,10,3,6,1,57";
		String strNotas = "40;70;90";

		String strNomeVetor[] = strNomes.split(",");
		for (int i = 0; i < strNomeVetor.length; i++) {
			System.out.println("Nome:" + strNomeVetor[i]);
		}
		String strNumSenaVetor[] = strNumSena.split(",");
		for (int i = 0; i < strNumSenaVetor.length; i++) {
			System.out.println("Numero Sena:" + strNumSenaVetor[i]);
		}
		String strNotasVetor[] = strNotas.split(";");
		System.out.println("AV1:" + strNotasVetor[0]);
		System.out.println("AV2:" + strNotasVetor[1]);
		System.out.println("AV3:" + strNotasVetor[2]);

	}
}
