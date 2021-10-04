package programacaooo20212.aula06.model;

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
