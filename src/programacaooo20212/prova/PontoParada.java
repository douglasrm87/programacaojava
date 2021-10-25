package programacaooo20212.prova;
public class PontoParada {
	public static final int BICICLETAS = 3;
	public static int contadorEmprestado = 0;
	Bicicleta[] bikeVet = new Bicicleta[PontoParada.BICICLETAS];
	public boolean consultar() {
		for (Bicicleta bicicleta : bikeVet) {
			if (bicicleta.isEmprestada() == false) {
				return true;
			}
		}
		return false;
	}
	public int emprestar(Bicicleta bikeParam) {
		for (Bicicleta bicicleta : bikeVet) {
			if (bicicleta.isEmprestada() == false) {
				this.bikeVet[PontoParada.contadorEmprestado] = bikeParam;
				PontoParada.contadorEmprestado++;
				return 1;
			}
		}
		return 0;
	}
	public int emprestarProfessor(Bicicleta bikeParam) {
		for (int i = 0; i < bikeVet.length; i++) {
			if (this.bikeVet[i].isEmprestada() == true) {
				this.bikeVet[i] = bikeParam;
				this.bikeVet[i].setEmprestada(false);
				return 1;
			}
		}
		return 0;
	}
	public void listarBicicletas() {
		for (Bicicleta bicicleta : bikeVet) {
			System.out.println(bicicleta);

		}
	}
	public PontoParada() {
		for (int i = 0; i < bikeVet.length; i++) {
			this.bikeVet[i] = new Bicicleta("1111", "Yellow", i + "", false);
		}
	}
}
