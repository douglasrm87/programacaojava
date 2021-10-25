package programacaooo20212.prova;
import java.util.Scanner;
public class PrincipalMoto {
	public static void main(String[] args) {
		// Criar uma referência para a classe Moto.
		Moto refMoto;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digitar a data de fabricação:");
		String fabricacao = leia.next();
		System.out.println("Digitar o chassi:");
		String chassi = leia.next();
		System.out.println("Digitar cor:");
		String cor = leia.next();
		System.out.println("Digitar fabricante:");
		String fabricante = leia.next();
		System.out.println("Digitar modelo:");
		String modelo = leia.next();
		System.out.println("Digitar preço:");
		Float preco = leia.nextFloat();
		refMoto = new Moto(fabricacao, chassi, cor, fabricante, modelo, preco);
		refMoto.atualizarPreco(20);
		System.out.println(refMoto.toString());
		leia.close();
	}
}
