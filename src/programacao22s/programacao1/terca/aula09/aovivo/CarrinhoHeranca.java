package programacao1.terca.aula09.aovivo;

public class CarrinhoHeranca {
	// atributos
	// metodos
	Vestuario vetorVestuario[] = new Vestuario[50];
	int controleQdadeVest = 0;

	public void adicionarVestuario(Vestuario c) {
		this.vetorVestuario[this.controleQdadeVest] = c;
		this.controleQdadeVest++;
	}

	public double fecharItensVestuario() {
		double totalCam = 0.0;
		for (int i = 0; i < this.controleQdadeVest; i++) {// por que dara erro.
			totalCam = totalCam + this.vetorVestuario[i].getPreco();
			System.out.println(this.vetorVestuario[i]);
		}
		return totalCam;
	}

}
