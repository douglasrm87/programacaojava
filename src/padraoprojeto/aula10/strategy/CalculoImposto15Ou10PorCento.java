package padraoprojeto.aula10.strategy;

public class CalculoImposto15Ou10PorCento implements CalculaImposto {
	@Override
	public double calculaSalarioComImposto(Funcionario umFuncionario) {
		if (umFuncionario.getSalarioBase() > 2000) {
			return umFuncionario.getSalarioBase() * 0.85;
		}
		return umFuncionario.getSalarioBase() * 0.9;
	}
}
