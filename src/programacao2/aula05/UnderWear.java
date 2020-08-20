package programacao2.aula05;

public class UnderWear extends VestuarioConstrutorMetodoAbstrato {
	private String tpTecido;

	@Override
	public String toString() {
		return super.toString() + " UnderWear [tpTecido=" + this.tpTecido + "]";
	}

	@Override
	protected void aplicarDesconto() {
		// TODO Auto-generated method stub
		
	}

}
