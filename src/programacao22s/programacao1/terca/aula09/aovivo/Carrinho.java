package programacao1.terca.aula09.aovivo;

public class Carrinho {
	// atributos
	// metodos
	Camisa vetorCamisa[] = new Camisa[50];
	int controleQdadeCam = 0;

	public void adicionarCamisa(Camisa c) {
//		this.vetorCamisa[this.controleQdadeCam] = c; // possivel problema
		this.vetorCamisa[this.controleQdadeCam] = new Camisa();
		this.vetorCamisa[this.controleQdadeCam] = c;
		this.controleQdadeCam++;
	}
	public double fecharCamisa() {
		double totalCam = 0.0;
//		for (int i = 0; i < this.vetorCamisa.length; i++) {// por que dara erro.
		for (int i = 0; i < this.controleQdadeCam; i++) {// por que dara erro.
			totalCam = totalCam + this.vetorCamisa[i].getPreco();
			System.out.println(this.vetorCamisa[i]);
		}
		return totalCam;
	}

	
	// para cada produto prcisamos duplicar 15 linhas de código.
	Calca vetorCalca[] = new Calca[50];
	int controleQdadeCalca = 0;

	public void adicionarCalca(Calca c) {
//		this.vetorCamisa[this.controleQdadeCam] = c; // possivel problema
		this.vetorCalca[this.controleQdadeCalca] = new Calca();
		this.vetorCalca[this.controleQdadeCalca] = c;
		this.controleQdadeCalca++;
	}
	public double fecharCalca() {
		double totalCalca = 0.0;
		for (int i = 0; i < this.controleQdadeCalca; i++) {// por que dara erro.
			totalCalca = totalCalca + this.vetorCalca[i].getPreco();
			System.out.println(this.vetorCalca[i]);
		}
		return totalCalca;
	}

	
	
}
