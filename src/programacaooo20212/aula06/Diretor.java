package programacaooo20212.aula06;

public class Diretor extends Funcionario {
	public void aumentarSalario(double meta) {
		setSalario(getSalario() + meta);
	}

	public Diretor(double salario) {
		super(salario);

	}

	public Diretor() {
	}
}
