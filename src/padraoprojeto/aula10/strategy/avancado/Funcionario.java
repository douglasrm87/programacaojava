package padraoprojeto.aula10.strategy.avancado;

public abstract class Funcionario {
	protected double salarioBase;
	protected CalculaImposto estrategiaDeCalculo;

	public Funcionario(double salarioBase) {
		super();
		this.salarioBase = salarioBase;
	}

	public double calcularSalarioComImposto() {
		return estrategiaDeCalculo.calculaSalarioComImposto(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
}
