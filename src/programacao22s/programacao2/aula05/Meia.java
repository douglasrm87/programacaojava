package programacao2.aula05;

public class Meia extends VestuarioConstrutorMetodoAbstrato {
	String tpCano;

	@Override
	public String toString() {
		return super.toString() + " Meia [tpCano=" + this.tpCano + "]";
	}

	@Override
	protected void aplicarDesconto() {
		// TODO Auto-generated method stub
		
	}

}
