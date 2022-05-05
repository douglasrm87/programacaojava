package padraoprojeto.aula10.strategy.avancado;

public class Principal {
	public static void main(String[] args) {
		Funcionario func = new Desenvolvedor(2100);
		System.out.println(func.calcularSalarioComImposto());

		func = new DBA(1700);
		System.out.println(func.calcularSalarioComImposto());
		
		func = new Gerente(1700);
		System.out.println(func.calcularSalarioComImposto());
	}
}
