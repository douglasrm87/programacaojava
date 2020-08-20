package programacao1.sexta.aula07.aovivo;

import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {
		new Caixa().processar();
	}

	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

 
	private void processar() {
		int op = 0;
		Carrinho car = new Carrinho();
		do {
			System.out.println("1 - Adicionar Camisa.");
			System.out.println("2 - Adicionar Calca.");
			System.out.println("3 - Adicionar Sapato.");

			System.out.println("7 - Fechar Pedido.");

			System.out.println("9 - Encerrar sistema.");
			System.out.println("Digite sua opção:");
			op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Adciionar camisa");
				Camisa cam = new Camisa();
				System.out.println("Digite a marca:");
				String marca = leia.next();
				System.out.println("Digite o modelo:");
				String modelo = leia.next();
				System.out.println("Digite o preco:");
				double preco = leia.nextDouble();
				System.out.println("Digite o tipo da gola:");
				String tpGola = leia.next();
				cam.setMarca(marca);
				cam.setModelo(modelo);
				cam.setValor(preco);
				cam.setTpGola(tpGola);
				// adicionar no carrinho
				car.adicionarCamisa(cam);

				break;
			case 2:

				System.out.println("Adciionar calca");
				Calca cal = new Calca();
				System.out.println("Digite a marca:");
				String marcac = leia.next();
				System.out.println("Digite o modelo:");
				String modeloc = leia.next();
				System.out.println("Digite o preco:");
				double precoc = leia.nextDouble();
				System.out.println("Digite se tem cinto (s/n):");
				String temCinto = leia.next();
				if (temCinto.equalsIgnoreCase("s")) {
					cal.setTemCinto(true);
				}
				cal.setMarca(marcac);
				cal.setModelo(modeloc);
				cal.setValor(precoc);
				// adicionar no carrinho
				car.adicionarCalca(cal);

				break;
				
			case 3:

				System.out.println("Adciionar calca");
				Sapato sap = new Sapato();
				System.out.println("Digite a marca:");
				String marcas = leia.next();
				System.out.println("Digite o modelo:");
				String modelos = leia.next();
				System.out.println("Digite o preco:");
				double precos = leia.nextDouble();
				System.out.println("Digite se tem cinto (s/n):");
				String eCouro = leia.next();
				if (eCouro.equalsIgnoreCase("s")) {
					sap.seteCouro(true);
				}
				sap.setMarca(marcas);
				sap.setModelo(modelos);
				sap.setValor(precos);
				// adicionar no carrinho
				car.adicionarSapato(sap);

				break;
				
				
			case 7:
				System.out.println("Fechar pedido camisa");
				double totalCompra = car.fecharPedidoCamisa();
				System.out.println("Total da compra:" + totalCompra);

				totalCompra += car.fecharPedidoCalca();
				System.out.println("Total da compra:" + totalCompra);

				break;

			default:
				break;
			}
		} while (op != 9);
	}

}
