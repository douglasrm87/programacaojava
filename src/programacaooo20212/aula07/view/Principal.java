package programacaooo20212.aula07.view;

import java.util.Scanner;

public class Principal {
	private ClasseAbstrataDimensao dimensao = null;

	public static void main(String[] args) {
		Principal obj = new Principal();
		obj.executar();
	}

	private void executar() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("**************************************");
			System.out.println("1 - Vetor");
			System.out.println("2 - Matriz");
			System.out.println("3 - Sair");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				vetorMenu();
				break;
			case 2:
				matrizMenu();
				break;
			default:
				if (opcao == 3) {
					sc.close();
					System.exit(0);
				}
				System.out.println("Opção inválida.");
			}
		}
	}

	private void matrizMenu() {
		// TODO Auto-generated method stub
		
	}

	private void vetorMenu() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("**************************************");
			System.out.println("1 - Adicionar Vetor Tamanho Padrão.");
			System.out.println("2 - Adicionar Vetor Tamanho Especificado via teclado.");
			System.out.println("3 - Imprimir vetor criado.");
			System.out.println("4 - Sair.");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				vetorAdicionarPadrao();
				break;
			case 2:
				vetorAdicionarTamEspecifico();
				break;
			case 3:
				imprimir();
				break;
			case 4:
				loop = false;
				sc.close();
				break;
			}
		}
		sc.close();
	}

	private void imprimir() {
		// TODO Auto-generated method stub
		
	}

	private void vetorAdicionarTamEspecifico() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a dimensao:");
		int d = leia.nextInt();
		dimensao = new VetorUnidimensional(d);
		dimensao.adicionar(10);
		dimensao.adicionar(20);
		dimensao.adicionar(30);
		dimensao.adicionar(40);
		leia.close();
		
	}

	private void vetorAdicionarPadrao() {

		dimensao = new VetorUnidimensional();
		dimensao.adicionar(10);
		dimensao.adicionar(20);
		
	}
	
	
	
}
