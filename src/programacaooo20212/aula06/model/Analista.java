package programacaooo20212.aula06.model;

public class Analista extends Funcionario {

	public void aumentarSalario(double horasTrab) {
		setSalario(getSalario() + horasTrab + horasTrab);
	}

	public Analista(double salario) {
		super(salario);

	}

	public Analista() {
	}

}
