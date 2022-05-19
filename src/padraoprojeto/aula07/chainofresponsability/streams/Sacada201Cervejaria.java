package padraoprojeto.aula07.chainofresponsability.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Sacada201Cervejaria {
	private List<CervejaArtesanal> listaCervejaArtesanal;

	public Sacada201Cervejaria() { // construtor inicializa a lista de cervejas
		this.listaCervejaArtesanal = new ArrayList<>(CervejaArtesanal.carregarCervejasArtesanais());
	}

	public void removerEstoque(Long idProducao) { // uso do m�todo removeIf()
		this.listaCervejaArtesanal.removeIf(cerveja -> cerveja.getIdProducao() == idProducao);
	}

	public void listarIBUAcima90() { // uso do m�todo forEach()
		this.listaCervejaArtesanal.forEach((c -> {
			if (c.getIndAmargorIBU() > 90) {
				System.out.println(c);
			}
		}));
	}

	public void susbtituirLupulos(int idProducao, int novoIDLupulo) {// uso do
																		// m�todo
																		// forEach()
																		// para
																		// troca
																		// na
																		// receita
		this.listaCervejaArtesanal.forEach((cerveja -> {
			if (cerveja.getIdProducao() == idProducao) {
				cerveja.setListaLupulos(Lupulo.carregarLupulos(novoIDLupulo));
			}
		}));
	}

	public void listarCervejasProduzidas(int idProducao) { // uso do m�todo
															// forEach()
		this.listaCervejaArtesanal.forEach((cerveja -> {
			if (cerveja.getIdProducao() == idProducao) {
				System.out.println(cerveja);
			}
		}));
	}

	public void listarCervejasProduzidas() { // uso do m�todo forEach()
		this.listaCervejaArtesanal.forEach(cerveja -> System.out.println(cerveja));
	}

	public List<CervejaArtesanal> obterCervejasDryHOP(boolean dryHOP) { // uso
																		// dos
																		// m�todos
																		// filter()
																		// e
																		// collect()
		return this.listaCervejaArtesanal.stream().filter(c -> c.isDryHOP() == dryHOP).collect(Collectors.toList());
	}

	public List<CervejaArtesanal> obterMaisRecentes() {
		return this.listaCervejaArtesanal.stream() // uso do m�todo sorted()
													// definindo um novo filtro
													// local
				.sorted((cerveja1, cerveja2) -> cerveja1.getDataProducao().compareTo(cerveja2.getDataProducao()))
				.limit(2).collect(Collectors.toList());
	}

	public List<CervejaArtesanal> classificarPorIBU(List<CervejaArtesanal> listaCervejasOriginal, int ordem) {
		// para n�o afetar a lista original, instanciamos um novo objeto.
		List<CervejaArtesanal> listaCervejas = new ArrayList<>(listaCervejasOriginal);
		if (ordem == 1) {
			listaCervejas.sort(CervejaArtesanal.classificarPorIBU()); // usando
																		// o
																		// filtro
																		// da
																		// classe
																		// CervejaArtesanal
		} else {
			listaCervejas.sort(CervejaArtesanal.classificarPorIBU().reversed());
		} // usando o
		// filtro da
		// classe
		// CervejaArtesanal
		return listaCervejas;
	}

	public void gerarEstat�sticas() {
		// Forma declarativa para navegar em uma lista. Pr�ximo das pesquisas
		// feitas com SQL
		OptionalDouble mediaAmargor = this.listaCervejaArtesanal.stream().filter(media -> media.getIndAmargorIBU() > 0)
				.mapToDouble(CervejaArtesanal::getIndAmargorIBU).average(); // usando
																			// o
																			// m�todo
																			// mapToDouble
																			// e
																			// average()
		System.out.println("Media de amargor:" + mediaAmargor.getAsDouble());

		Double somaAmargor = this.listaCervejaArtesanal.stream().filter(soma -> soma.getIndAmargorIBU() > 0)
				.mapToDouble(CervejaArtesanal::getIndAmargorIBU).sum(); // usando
																		// o
																		// m�todo
																		// mapToDouble
																		// e
																		// sum()
		System.out.println("TrabalhoGrupo de amargor:" + somaAmargor);

		OptionalDouble maiorAmargor = this.listaCervejaArtesanal.stream().filter(maior -> maior.getIndAmargorIBU() > 0)
				.mapToDouble(CervejaArtesanal::getIndAmargorIBU).max(); // usando
																		// o
																		// m�todo
																		// mapToDouble
																		// e
																		// max()
		System.out.println("Maior amargor:" + maiorAmargor.getAsDouble());

		OptionalDouble menorAmargor = this.listaCervejaArtesanal.stream().filter(menor -> menor.getIndAmargorIBU() > 0)
				.mapToDouble(CervejaArtesanal::getIndAmargorIBU).min(); // usando
																		// o
																		// m�todo
																		// mapToDouble
																		// e
																		// min()
		System.out.println("Menor amargor:" + menorAmargor.getAsDouble());

		Long qdadeCervejas = this.listaCervejaArtesanal.stream().filter(qdade -> qdade.getIdProducao() > 0)
				.mapToDouble(CervejaArtesanal::getIdProducao).count(); // usando
																		// o
																		// m�todo
																		// mapToDouble
																		// e
																		// count()
		System.out.println("Quantidade de cervejas:" + qdadeCervejas);
	}

	public List<CervejaArtesanal> getListaCervejaArtesanal() {
		return this.listaCervejaArtesanal;
	}
}
