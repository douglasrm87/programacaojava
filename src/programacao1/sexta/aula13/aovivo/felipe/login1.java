package programacao1.sexta.aula13.aovivo.felipe;

public class login1 {
	public String nome, email, pSMS;
	public long cpf, telefone, cep;

	public login1() {
	}

	@Override
	public String toString() {
		return "login [nome=" + nome + ", email=" + email + ", pSMS=" + pSMS + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", cep=" + cep + ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getpSMS()="
				+ getpSMS() + ", getCpf()=" + getCpf() + ", getTelefone()=" + getTelefone() + ", getCep()=" + getCep()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public login1(String nome, String email, String pSMS, long cpf, long telefone, long cep) {
		super();
		this.nome = nome;
		this.email = email;
		this.pSMS = pSMS;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getpSMS() {
		return pSMS;
	}

	public void setpSMS(String pSMS) {
		this.pSMS = pSMS;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public void imprimir() {
		System.out.println("Nome do cliente" + this.nome);
		System.out.println("Email do Editor" + this.email);
		System.out.println("Telefone" + this.telefone);
		System.out.println("CEP" + this.cep);
		System.out.println("CPF" + this.cpf);
	}

	public void pagamento() {

		System.out.println("TP - Transfer�ncia Banc�ria");
		System.out.println("CC - Cart�o de Cr�dito");
		System.out.println("CD - Cart�o de D�bito");
		System.out.println("PP - Pic Pay");
		System.out.println("AP - Android Pay");

	}

	public void cancelar() {
		System.out.println("Compra cancelada");
	}

	public void confirmacao() {
		System.out.println("Compra confirmada");
	}

	public void logoff() {
		System.out.println("Logoff realizado");
	}

}
