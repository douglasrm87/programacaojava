package programacaooo20212.aula05;

import java.util.Date;

public class ATMBanco {
	public static void main(String[] args) {
		// Aqui criamos o objeto Conta Bancária.
		ContaBancaria conta = new ContaBancaria();
		conta.setSaldo(10000);
		System.out.println("Data:" + conta.getDataAbertura());
		System.out.println("Data:" + conta.getDataAberturaFormatadaJava7());
		System.out.println("Saldo:" + conta.getSaldo());
		System.out.println("Saldo:" + conta.getSaldoFormatado());
		conta.sacar2(10000);
		System.out.println("Saldo Atual:" + conta.getSaldoFormatado());
		
		ContaBancaria conta2 = new ContaBancaria(3000, new Date());
	}
}
