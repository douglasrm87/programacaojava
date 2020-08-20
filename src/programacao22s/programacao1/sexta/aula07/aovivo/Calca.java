package programacao1.sexta.aula07.aovivo;

public class Calca extends Vestuario {
	
	private boolean temCinto;
	
	public boolean isTemCinto() {
		return temCinto;
	}
	public void setTemCinto(boolean temCinto) {
		this.temCinto = temCinto;
	}
	@Override
	public String toString() {
		return super.toString() + " Calca [temCinto=" + temCinto + "]";
	}
	 
	
	
	

}
