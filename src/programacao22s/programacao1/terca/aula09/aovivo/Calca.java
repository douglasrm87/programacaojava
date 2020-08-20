package programacao1.terca.aula09.aovivo;

public class Calca extends Vestuario { // aplicando Herança

	private boolean temCinto;

	@Override
	public String toString() {
		return super.toString() + " Calca [temCinto=" + temCinto + "]";
	}

	public boolean isTemCinto() {
		return temCinto;
	}

	public void setTemCinto(boolean temCinto) {
		this.temCinto = temCinto;
	}

}
