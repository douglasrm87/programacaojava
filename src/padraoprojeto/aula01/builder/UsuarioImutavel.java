package padraoprojeto.aula01.builder;

public class UsuarioImutavel {
// obrigatorio
	public String nome = null; // obrigatorio
// obrigatorio
	public String sobreNome = null; // obrigatorio
// Opcional
	public int idade; // Opcional
// Opcional
	public String telefone; // Opcional
// Opcional
	public String endereco; // Opcional
// Opcional
	public double salario; // Opcional

	public UsuarioImutavel(UsuarioImutavelBuilder builder) {
		super();
		this.nome = builder.nome;
		this.sobreNome = builder.sobreNome;
		this.idade = builder.idade;
		this.telefone = builder.telefone;
		this.endereco = builder.endereco;
		this.salario = builder.salario;
	}

	// Criar somente métodos de Acesso - getXXXX()
	@Override
	public String toString() {
		return "UsuarioImutavel [nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", telefone="
				+ telefone + ", endereco=" + endereco + ", salario=" + salario + "]";
	}

	// Classe Interna
	public static class UsuarioImutavelBuilder {
		// obrigatorio
		public String nome = null; // obrigatorio
	// obrigatorio
		public String sobreNome = null; // obrigatorio
	// Opcional
		public int idade; // Opcional
	// Opcional
		public String telefone; // Opcional
	// Opcional
		public String endereco; // Opcional
	// Opcional
		public double salario; // Opcional
		public UsuarioImutavelBuilder(String nome, String sobreNome) {
			this.nome = nome;
			this.sobreNome = sobreNome;
		}

		public UsuarioImutavelBuilder idade(int idade) {
			this.idade = idade;
			return this;
		}

		public UsuarioImutavelBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public UsuarioImutavelBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		// Return the finally consrcuted User object
		public UsuarioImutavel build() {
			UsuarioImutavel user = new UsuarioImutavel(this);
			validateUserObject(user);
			return user;
		}

		private void validateUserObject(UsuarioImutavel user) {
			if (this.nome != null && this.nome.length() < 3) {
				throw new IllegalArgumentException("Nome: " + user.nome + " com menos de 3 caracteres");
			}
		}
	}
}
