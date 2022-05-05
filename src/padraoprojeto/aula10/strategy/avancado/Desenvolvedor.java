package padraoprojeto.aula10.strategy.avancado;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(double salarioBase) {
		super (salarioBase);
		this.estrategiaDeCalculo = new CalculoImposto15Ou10PorCento();
	}
 
}
