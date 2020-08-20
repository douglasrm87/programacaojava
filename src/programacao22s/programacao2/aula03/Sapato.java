package programacao2.aula03;

import java.text.DateFormat;
import java.util.Date;

public class Sapato extends Vestuario {
	Date dtFabrica��o;

	@Override
	public String toString() {
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.DEFAULT);
		return super.toString() + " Sapato [dtFabrica��o=" + dataFormatada.format(this.dtFabrica��o) + "]";
	}

}
