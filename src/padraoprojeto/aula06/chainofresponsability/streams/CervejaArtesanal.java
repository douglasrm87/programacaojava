package padraoprojeto.aula06.chainofresponsability.streams;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class CervejaArtesanal {
	private Long idProducao;
	private int indAmargorIBU;
	private String estilo;
	private List<Lupulo> listaLupulos;
	private boolean dryHOP;
	private LocalDateTime dataProducao;
	private CervejaArtesanal(Long idProducao, int indAmargorIBU, String estilo, List<Lupulo> listaLupulos,
			boolean dryHOP, LocalDateTime dataProducao) {
		this.idProducao = idProducao;
		this.indAmargorIBU = indAmargorIBU;
		this.estilo = estilo;
		this.listaLupulos = listaLupulos;
		this.dryHOP = dryHOP;
		this.dataProducao = dataProducao;
	}
	@Override
	public String toString() {
		return "CervejaArtesanal [idProducao=" + this.idProducao + ", indAmargorIBU=" + this.indAmargorIBU + ", estilo="
				+ this.estilo + ", listaLupulos=" + this.listaLupulos + ", dryHOP=" + this.dryHOP + "]";
	}
	public static List<CervejaArtesanal> carregarCervejasArtesanais() {
		// Atenção: java.util.Arrays.asList() produz uma lista, porem não permite remover elementos.
		List<CervejaArtesanal> listaCervejas = Arrays.asList(
				new CervejaArtesanal(1l, 42, "American Pale Ale", Lupulo.carregarLupulos(0), true, LocalDateTime.now()),
				new CervejaArtesanal(2l, 65, "Indian Pale Ale", Lupulo.carregarLupulos(1), true,
						LocalDateTime.of(2018, Month.JUNE, 14, 11, 30)),
				new CervejaArtesanal(3l, 25, "Irish Red Ale", Lupulo.carregarLupulos(2), false,
						LocalDateTime.now().minusDays(50)),
				new CervejaArtesanal(4l, 105, "Petroleum Ale", Lupulo.carregarLupulos(3), false,
						LocalDateTime.now().minusMonths(3)));
		// ordenar pelo IBU. usando o novo método sort() da interface List.
		return listaCervejas;
	}
	// ordenar a lista de cerveja pelo indice de amargor. Cerveja com menor amargor será a primeira.
	public static Comparator<CervejaArtesanal> classificarPorIBU() {
		Comparator<CervejaArtesanal> localFiltroIBU = new Comparator<CervejaArtesanal>() {
			@Override
			public int compare(CervejaArtesanal b1, CervejaArtesanal b2) {
				return (b1.indAmargorIBU > b2.indAmargorIBU ? 1 : (b1.indAmargorIBU < b2.indAmargorIBU ? -1 : 0));
			}
		};
		return localFiltroIBU;
	}
	public Long getIdProducao() {
		return idProducao;
	}
	public int getIndAmargorIBU() {
		return indAmargorIBU;
	}
	public boolean isDryHOP() {
		return dryHOP;
	}
	public void setListaLupulos(List<Lupulo> listaLupulos) {
		this.listaLupulos = listaLupulos;
	}
	public LocalDateTime getDataProducao() {
		return dataProducao;
	}
	public String getEstilo() {
		return estilo;
	}
}