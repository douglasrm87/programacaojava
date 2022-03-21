package padraoprojeto.aula06.chainofresponsability.streams;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Scanner;
public class PrincipalCervejariaSacada201 {
	public static void main(String[] args) {
		new PrincipalCervejariaSacada201().processar();
	}
	public void processar() {
		Sacada201Cervejaria sacada201 = new Sacada201Cervejaria();
		Scanner ler = new Scanner(System.in);
		while (true) {
			System.out.println("\n1 - Conferir cervejas Sacada201.");
			System.out.println("2 - Cerveja com estoque esgotado.");
			System.out.println("3 - Visualizar por IBU.");
			System.out.println("4 - Listar produção.");
			System.out.println("5 - Listar cervejas com Dry HOP.");
			System.out.println("6 - Listar cervejas sem Dry HOP.");
			System.out.println("7 - Listar por data de fabricação.");
			System.out.println("8 - Listar IBU acima 90.");
			System.out.println("9 - Trocar lupulo receita.");
			System.out.println("10 - Apresentar estatísticas.");
			System.out.println("0 - Encerrar.");
			int op = ler.nextInt();
			switch (op) {
			case 1:
				listarOpcoesCervejas(sacada201.getListaCervejaArtesanal());
				break;
			case 2:
				listarOpcoesCervejas(sacada201.getListaCervejaArtesanal());
				System.out.println("Informar cerveja esgotada (0 desconsiderar).");
				Long cervejaEsgotada = ler.nextLong();
				if (cervejaEsgotada != 0) {
					sacada201.removerEstoque(cervejaEsgotada);
				}
				listarOpcoesCervejas(sacada201.getListaCervejaArtesanal());
				break;
			case 3:
				List<CervejaArtesanal> listaPorIBU = sacada201.classificarPorIBU(sacada201.getListaCervejaArtesanal(),0);
				listarOpcoesCervejas(listaPorIBU);
				break;
			case 4:
				// exemplo para listar usando forEach().
				sacada201.listarCervejasProduzidas();
				break;
			case 5:
				listarOpcoesCervejas(sacada201.obterCervejasDryHOP(true));
				break;
			case 6:
				listarOpcoesCervejas(sacada201.obterCervejasDryHOP(false));
				break;
			case 7:
				listarOpcoesCervejas(sacada201.obterMaisRecentes());
				break;
			case 8:
				sacada201.listarIBUAcima90();
				break;
			case 9:
				listarOpcoesCervejas(sacada201.getListaCervejaArtesanal());
				System.out.println("Alterar receita de qual cerveja? (0 desconsiderar).");
				int cervejaAtual = ler.nextInt();
				if (cervejaAtual != 0) {
					sacada201.listarCervejasProduzidas(cervejaAtual);
					System.out.println("Alterar para qual receita.");
					int itenslupulo = ler.nextInt();
					sacada201.susbtituirLupulos(cervejaAtual, itenslupulo);
					sacada201.listarCervejasProduzidas(cervejaAtual);
				}
				break;
			case 10:
				sacada201.gerarEstatísticas();
				break;
			case 0:
				ler.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	private void listarOpcoesCervejas(List<CervejaArtesanal> listaCervejas) {
		DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Listar disponíveis:");
		for (CervejaArtesanal cerveja : listaCervejas) {
			System.out.println("\nID Cerveja:" + cerveja.getIdProducao() + " - Estilo:" + cerveja.getEstilo()
					+ "\nIndice amargor:" + cerveja.getIndAmargorIBU() + " IBU\nProduzido em:"
					+ formatador.format(cerveja.getDataProducao()));
		}
	}
}
