package programacao1.terca.aula11.caixa.aovivo;

import java.util.Date;
import java.util.Scanner;

import programacao1.terca.aula11.aovivo.Buffet;
import programacao1.terca.aula11.aovivo.Marmita;
import programacao1.terca.aula11.aovivo.Pedido;

public class Caixa {
	public static void main(String[] args) {
		Caixa c = new Caixa();
		c.processar();
	}

	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");
	private double preco;
	private String nomeGarcom;

	private void lerDadosComum() {
		System.out.println("Digite o pre�o:");
		this.preco = leia.nextDouble();
		System.out.println("Digite o nome do Gar�ompre�o:");
		this.nomeGarcom = leia.next();
	}

	private void processar() {
		Pedido ped = new Pedido(new Date());
		int op = 0;
		do {
			System.out.println("1 - Adicionar Marmita");
			System.out.println("2 - Adicionar Buffet");
			System.out.println("3 - Adicionar Espeto Corrido");
			System.out.println("4 - Adicionar Executivo");
			System.out.println("7 - Fechar Pedido");
			System.out.println("9 - Sair sistema");
			System.out.println("Digite sua op��o:");
			op = this.leia.nextInt();

			switch (op) {
			case 1:
				lerDadosComum();
				System.out.println("Digite o tamanhno da marmita (1/2/3):");
				int tp = leia.nextInt();
				Marmita mar = new Marmita();
				mar.setNomeGarcom(this.nomeGarcom);
				mar.setTipomarmita(tp);
				
				mar.setPreco(this.preco); // faltou esta linha
				
				ped.registrarPrato(mar);
				break;
			case 2:
				lerDadosComum();
				
				System.out.println("Digite o preco do Kh:");
				double pKg = leia.nextDouble();
				Buffet buf = new Buffet();
				System.out.println("Op��o livre (s/n):");
				String opLIvre = leia.next();
				if(opLIvre.equalsIgnoreCase("s")) {
					buf.setLivre(true);
				}
				buf.setNomeGarcom(this.nomeGarcom);
				buf.setPrecoKg(this.preco);
				buf.setPreco(this.preco); // faltou esta linha
				ped.registrarPrato(buf);
				
				
				break;
			case 3:
				lerDadosComum();
				break;
			case 4:
				lerDadosComum();
				break;
			case 7:
				System.out.println("Total a pagar: " + ped.fecharPedido());
				break;
			case 9:

				break;

			default:
				break;
			}
		} while (op != 0);

	}

}
