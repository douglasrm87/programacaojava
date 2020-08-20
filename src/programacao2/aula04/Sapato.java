package programacao2.aula04;

import java.text.DateFormat;
import java.util.Date;

public class Sapato extends VestuarioConstrutor {
	Date dtFabricação;

	@Override
	public String toString() {
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.DEFAULT);
		return super.toString() + " Sapato [dtFabricação=" + dataFormatada.format(this.dtFabricação) + "]";
	}
 
}
