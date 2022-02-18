package padraoprojeto.aula01;

public class UsuarioImutavel {
	private final String nome; // obrigatorio
	private final String sobreNome; // obrigatorio
	private final int idade; // Opcional
	private final String telefone; // Opcional
	private final String endereco; // Opcional
	private final double salario; // Opcional
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
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public double getSalario() {
		return salario;
	}
	@Override
	public String toString() {
		return "UsuarioImutavel [nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", telefone="
				+ telefone + ", endereco=" + endereco + ", salario=" + salario + "]";
	}
	
	// Classe Interna
	public static class UsuarioImutavelBuilder {
		private String nome = null; // obrigatorio
		private String sobreNome = null; // obrigatorio
		private int idade; // Opcional
		private String telefone; // Opcional
		private String endereco; // Opcional
		private double salario; // Opcional
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
