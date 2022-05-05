package padraoprojeto.aula10.strategy;

public class Principal {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,
				1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
		
		Funcionario outroNovoFuncionario = new Funcionario(Funcionario.GERENTE,
				1700);
		System.out.println(outroNovoFuncionario.calcularSalarioComImposto());
	}
}
