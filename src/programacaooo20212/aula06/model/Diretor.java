package programacaooo20212.aula06.model;

public class Diretor extends Funcionario {
	// esta sendo sobreescrito - override
	public void aumentarSalario(double meta) {
		setSalario(getSalario() + meta);
	}

	public Diretor(double salario) {
		super(salario);

	}

	public Diretor() {
	}
}
