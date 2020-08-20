package programacao1.terca.aula09.aovivo;

import java.util.Scanner;

public class Caixa {
	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

	public static void main(String[] args) {
		new Caixa().processar();
	}

	private void processar() {

		Carrinho car = new Carrinho();

		int op = 0;
		do {
			System.out.println("1 - Adicionar camisa");
			System.out.println("2 - Adicionar calca");
			System.out.println("7 - Fechar Pedido");
			System.out.println("9 - Encerrar sistema");
			System.out.println("Digite sua opção:");
			op = this.leia.nextInt();
			switch (op) {
			case 1:
				Camisa cam = new Camisa();
				System.out.println("Adcionando Camisa");
				System.out.println("Digite a marca da camisa:");
				cam.setMarca(this.leia.next());
				System.out.println("Digite a modelo da camisa:");
				cam.setModelo(this.leia.next());
				System.out.println("Digite o preço da camisa:");
				cam.setPreco(this.leia.nextDouble());

				car.adicionarCamisa(cam);

				break;
			case 2:
				Calca cal = new Calca();
				System.out.println("Adcionando CAlca");
				System.out.println("Digite a marca da calca:");
				cal.setMarca(this.leia.next());
				System.out.println("Digite a modelo da calca:");
				cal.setModelo(this.leia.next());
				System.out.println("Digite o preço da calca:");
				cal.setPreco(this.leia.nextDouble());

				System.out.println("Possui passa cinto:");
				String isCinto = this.leia.next();
				if (isCinto.equalsIgnoreCase("s")) {
					cal.setTemCinto(true);
				}

				car.adicionarCalca(cal);

				break;

			case 7:
				System.out.println("Fechar o pedido");
				double valorPagar = car.fecharCamisa();
				valorPagar += car.fecharCalca();
				System.out.println("Total do pedido:" + valorPagar);
				break;

			case 9:
				System.out.println("Encerrando o istema Caixa");
			default:
				break;
			}
		} while (op != 9);
	}

}
