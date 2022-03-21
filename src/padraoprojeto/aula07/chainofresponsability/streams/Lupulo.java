package padraoprojeto.aula07.chainofresponsability.streams;
import java.util.ArrayList;
import java.util.List;
public class Lupulo {
	private String nomeLupulo;
	private double percentualAlphaAcido; // foco no amargor da cerveja artesanal
	private double percentualBetaAcido; // foco n sabor da cerveja artesanal
	private static Lupulo[] lupuloAmargor = new Lupulo[] { new Lupulo("Columbus", 15.4, 2.3), new Lupulo("Magnum", 12.4, 2.5),
			new Lupulo("Galaxy", 15.1, 3.4), new Lupulo("Admiral", 13.1, 2.2), new Lupulo("Zeus", 14.2, 2.1),
			new Lupulo("Citra", 13.1, 4.1) };
	private static Lupulo[] lupuloAroma = new Lupulo[] { new Lupulo("Amarillo", 5.4, 3.3), new Lupulo("Merkur", 2.9, 3.1),
			new Lupulo("Saaz", 5.1, 4.4), new Lupulo("Saphir", 3.1, 2.6), new Lupulo("Fuggle", 4.2, 2.6),
			new Lupulo("Centennial", 3.1, 4.1) };
	private static Lupulo[] lupuloSabor = new Lupulo[] { new Lupulo("Cascade", 3.3, 3.5), new Lupulo("Magnum", 4.4, 4.5),
			new Lupulo("Galaxy", 5.1, 4.4), new Lupulo("Simcoe", 3.1, 2.2), new Lupulo("Blanc", 6.1, 3.1),
			new Lupulo("Melon", 4.7, 2.8) };
	public Lupulo(String nomeLupulo, double percentualAlphaAcido, double percentualBetaAcido) {
		this.nomeLupulo = nomeLupulo;
		this.percentualAlphaAcido = percentualAlphaAcido;
		this.percentualBetaAcido = percentualBetaAcido;
	}
 	public static List<Lupulo> carregarLupulos(int id) {
		List<Lupulo> listaLupulos = new ArrayList<>();
		listaLupulos.add(lupuloAmargor[id]);
		listaLupulos.add(lupuloAroma[id]);
		listaLupulos.add(lupuloSabor[id]);
		return listaLupulos;
	}
	@Override
	public String toString() {
		return "_13_36_Lupulo [nomeLupulo=" + this.nomeLupulo + ", percentualAlphaAcido=" + this.percentualAlphaAcido
				+ ", percentualBetaAcido=" + this.percentualBetaAcido + "]";
	}
}
