package programacao1.terca.aula08;

import java.util.Date;

public class Cliente {
	// Atributos
	private String nome;
	private int cpf;
	private Date dtNascimento;

	// Metodos

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		boolean ret = ValidaCPF.isCPF(String.valueOf(cpf));
		if (!ret) {
			throw new IllegalArgumentException("CPF Inválido:" + cpf);
		}
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
