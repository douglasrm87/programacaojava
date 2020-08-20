package programacao1.sexta.aula05;

public class TesteVetor {
	public static void main(String[] args) {
		int valorInt = 10;
		int vetInt[] = { 10, 20, 30, 40, 90, 50 };
		System.out.println("Primeiro elemento:" + vetInt[0]);
		System.out.println("Terceiro elemento:" + vetInt[2]);

		for (int i = 0; i < vetInt.length; i++) {
			System.out.println("Elementos:" + vetInt[i]);
		}

		String str = "Douglas,Rocha,Mendes,Joao,MArcos,Julia,Euclides";
		String vetStr[];
		vetStr = new String[10];
		vetStr = str.split(",");
		System.out.println("Quarto nome:" + vetStr[3]);
		try {

			int lengths = 0;
			for (int i = 0; i <= vetStr.length; i++) {
				System.out.println("Elementos:" + vetStr[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Te peguei fazendo errado");
		}
	}

}
