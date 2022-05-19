package padraoprojeto.aula14.interpreter.romano;

public class UmDigitoRomano extends NumeroRomanoInterpreter {

	@Override
	public String um() {
		return "I";
	}

	@Override
	public String quatro() {
		return "IV";
	}

	@Override
	public String cinco() {
		return "V";
	}

	@Override
	public String nove() {
		return "IX";
	}

	@Override
	public int multiplicador() {
		return 1;
	}

}
