package programacaooo20212.aula07.view;

import java.util.Scanner;

public class PrincipalDVD {
 
 

	public void cadastrarDVD(ExemploEstruturaDVD obj) {
		Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
		System.out.println("Nome do Editor: ");
		obj.setNomeCliente(scan.nextLine());
		System.out.println("Valor do DVD: ");
		obj.setPreco(scan.nextDouble());
		scan.close();
	}

	public static void main(String[] args) {
		ExemploClasseDVD obj = new ExemploClasseDVD();
		ExemploEstruturaDVD objEst;
		Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
		while (true) {
			objEst = new ExemploEstruturaDVD();
			System.out.println("1 - Cadastrar DVD");
			System.out.println("2 - Imprimir lista cadastrada");
			System.out.println("3 - Cadastrar DVD com desconto");
			System.out.println("4 - Fim");
			System.out.println("Entre com a opcao desejada: ");
			
			int opcao = scan.nextInt();
			if (opcao == 4)
				scan.close();
				break;
		}
		scan.close();
		
	}
}
