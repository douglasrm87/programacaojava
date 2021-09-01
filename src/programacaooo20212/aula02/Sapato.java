package programacaooo20212.aula02;

import java.text.DateFormat;
import java.util.Date;

public class Sapato extends Vestuario {
	private Date dtFabricação;
	@Override
	public String toString() {
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.DEFAULT);
		return super.toString() + " Sapato [dtFabricação=" + dataFormatada.format(this.dtFabricação) + "]";
	}
	public Date getDtFabricação() {
		return dtFabricação;
	}
	public void setDtFabricação(Date dtFabricação) {
		this.dtFabricação = dtFabricação;
	}
	
}
