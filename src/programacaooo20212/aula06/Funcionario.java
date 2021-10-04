package programacaooo20212.aula06;

public abstract class Funcionario {
	private double salario;
	public abstract void aumentarSalario(double meta);
	public Funcionario(double salario) {
		super();
		this.salario = salario;
	}
	public Funcionario( ) {
 
	}
	public double getSalario() {
		return this.salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}	
	

}
