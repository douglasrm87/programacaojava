package padraoprojeto.aula02.abstractfactory.exerciciocarro;

import java.util.Scanner;

public class FrenteMontadora {
	public static void main(String[] args) {
		System.out.println("Digite o modelo de veiculo desejado:  "
				+ "\nModelos disponiveis: "
				+ "\n1  - Carro popular com teto solar"
				+ "\n2  - Carro popular sem teto solar"
				+ "\n3  - Carro esportivo com teto solar"
				+ "\n4  - Carro esportivo sem teto solar");
		Scanner leia = new Scanner(System.in);
		String op = leia.next();
		Montadora p = new Montadora();
		((Montadora) p).montarCarro(op);
		
		leia.close();
		
	}

}