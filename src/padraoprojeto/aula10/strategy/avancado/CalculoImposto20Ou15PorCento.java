package padraoprojeto.aula10.strategy.avancado;

public class CalculoImposto20Ou15PorCento implements CalculaImposto {
	@Override
	public double calculaSalarioComImposto(Funcionario umFuncionario) {
		if (umFuncionario.getSalarioBase() > 3500) {
			return umFuncionario.getSalarioBase() * 0.8;
		}
		return umFuncionario.getSalarioBase() * 0.85;
	}
}
