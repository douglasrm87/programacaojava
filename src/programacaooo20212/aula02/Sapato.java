package programacaooo20212.aula02;

import java.text.DateFormat;
import java.util.Date;

public class Sapato extends Vestuario {
	private Date dtFabrica��o;
	@Override
	public String toString() {
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.DEFAULT);
		return super.toString() + " Sapato [dtFabrica��o=" + dataFormatada.format(this.dtFabrica��o) + "]";
	}
	public Date getDtFabrica��o() {
		return dtFabrica��o;
	}
	public void setDtFabrica��o(Date dtFabrica��o) {
		this.dtFabrica��o = dtFabrica��o;
	}
	
}
