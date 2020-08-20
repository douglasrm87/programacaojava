package programacao1.sexta.aula07.aovivo;

public class Carrinho {
	
	public final int TOTAL = 50;
	private Camisa vetorCamisa[] = new Camisa[TOTAL];
	private int controleCamisa = 0;
	public void adicionarCamisa(Camisa c) {
		//logica de programacao
		vetorCamisa[controleCamisa] = c;
		controleCamisa++;
	}
	public double fecharPedidoCamisa() {
		//logica de programacao
		double tot = 0.0;
		for (int i = 0; i < controleCamisa; i++) {
			tot = tot + vetorCamisa[i].getValor();
		}
		return tot;
	}

	private Calca vetorCalca[] = new Calca[TOTAL];
	private int controleCalca = 0;
	public void adicionarCalca(Calca c) {
		//logica de programacao
		vetorCalca[controleCalca] = c;
		controleCalca++;
	}
	public double fecharPedidoCalca() {
		//logica de programacao
		double tot = 0.0;
		for (int i = 0; i < controleCalca; i++) {
			tot = tot + vetorCalca[i].getValor();
		}
		return tot;
	}

	private Sapato vetorSapato[] = new Sapato[TOTAL];
	private int controleSapato = 0;
	public void adicionarSapato(Sapato c) {
		//logica de programacao
		vetorSapato[controleSapato] = c;
		controleSapato++;
	}
	public double fecharPedidoSapato() {
		//logica de programacao
		double tot = 0.0;
		for (int i = 0; i < controleSapato; i++) {
			tot = tot + vetorSapato[i].getValor();
		}
		return tot;
	}

	
}
