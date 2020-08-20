package programacao2.aula05;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SubtrairAno {

	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.YEAR, 2);// adicionei 2 anos
		d = c.getTime();
		System.out.println("ADD:" + d.toString());

		Locale myLocale = Locale.getDefault();
		Calendar dataAtual = Calendar.getInstance(myLocale);
		dataAtual.add(Calendar.DATE, -365);
		System.out.println("SUB:"+dataAtual.getTime());
//		System.out.println("SUB:" + dataAtual);

	}

}
