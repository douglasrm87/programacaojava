package programacaooo20212.aula07.view;

public class ContaCorrenteEspecial extends ContaCorrente {
	private double limite;

	@Override // sobreescrever
	public void sacar(double valor) {
		if ((getSaldo() + limite) >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque Realizado com sucesso.");
		} else {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
	}

	public ContaCorrenteEspecial(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

}
