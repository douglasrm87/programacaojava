package padraoprojeto.aula05.facade.aula;

public class MaquinaDeLavarRoupas {
	private int temperaturaAgua;
	private int duracaoCicloLavagem;
	private int duracaoCicloRotagem;

	public void lavaRoupaMuitoSuja() {
		setTemperaturaAgua(100);
		setDuracaoCicloLavagem(90);
		setDuracaoCicloRotagem(10);
		addDetergente();
		addAlvejante();
		addAmaciante();
		aquecerAgua();
		iniciarLavagem();
	}

	private void iniciarLavagem() {
	}

	private void aquecerAgua() {
	}

	private void addAmaciante() {
	}

	private void addAlvejante() {

	}

	private void addDetergente() {
	}

	public void lavaRoupaPoucoSuja() {
		setTemperaturaAgua(40);
		setDuracaoCicloLavagem(20);
		setDuracaoCicloRotagem(10);
		addDetergente();
		aquecerAgua();
		iniciarLavagem();
	}

	public void setTemperaturaAgua(int temperaturaAgua) {
		this.temperaturaAgua = temperaturaAgua;
	}

	public void setDuracaoCicloLavagem(int duracaoCicloLavagem) {
		this.duracaoCicloLavagem = duracaoCicloLavagem;
	}

	public void setDuracaoCicloRotagem(int duracaoCicloRotagem) {
		this.duracaoCicloRotagem = duracaoCicloRotagem;
	}

}
