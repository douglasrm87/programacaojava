package padraoprojeto.aula10.strategy.avancado;

public class DBA extends Funcionario {

	public DBA(double salarioBase) {
		super (salarioBase);
		this.estrategiaDeCalculo = new CalculoImposto15Ou10PorCento();
	}
 

}
