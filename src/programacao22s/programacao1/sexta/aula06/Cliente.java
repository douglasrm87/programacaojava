package programacao1.sexta.aula06;

public class Cliente {

	// atributos
	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.isEmpty()) {
			throw new IllegalArgumentException("CPF vazio.");
		}
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + this.nome + ", cpf=" +
	this.cpf + "]";
	}

	// metodos set e get

	// validar algum dos atributos

	// metodo toString.

}
