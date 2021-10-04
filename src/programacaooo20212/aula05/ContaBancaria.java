package programacaooo20212.aula05;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ContaBancaria {
	private double saldo;
	private Date dataAbertura;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			throw new IllegalArgumentException();
		}
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	// Construtor vazio
	public ContaBancaria() {
		this (0, new Date());
	}
 
	public ContaBancaria(double saldo, Date dataAbertura) {
		super();
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public String getDataAberturaFormatadaJava7() {
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		String dataF = df.format(this.dataAbertura);
		return dataF;
	}

	public String getSaldoFormatado() {
		Locale locale = new Locale("pt", "BR");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(this.saldo);
	}
	public void depositar (double valorAdd) {
		this.saldo = this.saldo + valorAdd;
		
	}
	
	public void sacar (double valorSub) {
		double valorTemp = this.saldo - valorSub;
		if (valorTemp < 0) {
			throw new IllegalArgumentException("Valor do saldo insuficiente.");
		}
		this.saldo = this.saldo - valorSub;
	}

	public void sacar2 (double valorSub) {
		if ((this.saldo - valorSub) < 0) {
			throw new IllegalArgumentException("Valor do saldo insuficiente.");
		}
		this.saldo = this.saldo - valorSub;
	}
	
}
