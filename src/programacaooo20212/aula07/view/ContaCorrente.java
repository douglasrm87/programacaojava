package programacaooo20212.aula07.view;

public class ContaCorrente {
	private final double PI = 3.1415;
	private double saldo;

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque Realizado com sucesso.");
		} else {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
	}

	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}

}
