package padraoprojeto.aula10.strategy;

public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int DBA = 3;
	protected double salarioBase;
	protected int cargo;
	protected CalculaImposto estrategiaDeCalculo;

	public Funcionario(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		switch (cargo) {
		case DESENVOLVEDOR:
			estrategiaDeCalculo = new CalculoImposto15Ou10PorCento();
			cargo = DESENVOLVEDOR;
			break;
		case DBA:
			estrategiaDeCalculo = new CalculoImposto15Ou10PorCento();
			cargo = DBA;
			break;
		case GERENTE:
			estrategiaDeCalculo = new CalculoImposto20Ou15PorCento();
			cargo = GERENTE;
			break;
		default:
			throw new RuntimeException("Cargo n�o encontrado :/");
		}
	}

	public double calcularSalarioComImposto() {
		return estrategiaDeCalculo.calculaSalarioComImposto(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
}
