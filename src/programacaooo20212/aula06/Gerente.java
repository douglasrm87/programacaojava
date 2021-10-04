package programacaooo20212.aula06;

public class Gerente  extends Funcionario  {
	

	public void aumentarSalario(double meta) {
		setSalario(getSalario() * meta);
	}

	public Gerente(double salario) {
		super(salario);
		 
	}
	public Gerente( ) {
	}	
}
