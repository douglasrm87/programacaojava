package programacao2.aula05;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sapato extends VestuarioConstrutorMetodoAbstrato {
	Date dtFabrica��o;

	@Override
	public String toString() {
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.DEFAULT);
		return super.toString() + " Sapato [dtFabrica��o=" + dataFormatada.format(this.dtFabrica��o) + "]";
	}

	@Override
	protected void aplicarDesconto() {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.YEAR, 2);// adicionei 2 anos
		d = c.getTime();
		System.out.println(d.toString());

		if (this.aplicaDesconto) {
			this.preco = this.preco * this.percentualDesconto;
		}
	}

}
