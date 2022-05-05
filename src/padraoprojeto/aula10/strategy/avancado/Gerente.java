package padraoprojeto.aula10.strategy.avancado;

public class Gerente extends Funcionario {

	public Gerente(double salarioBase) {
		super (salarioBase);
		estrategiaDeCalculo = new CalculoImposto20Ou15PorCento();
	}
 
}
