package programacao22s.swing_03;

import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;

public class Relogio extends Thread {
	private JTextField texto;

	public Relogio(JTextField texto) {
		super();
		this.texto = texto;
	}
	@Override
	public void run() {
		while (true) {
			Date hora = Calendar.getInstance().getTime();
			this.texto.setFont(new Font("Dialog", Font.BOLD, 27));

			this.texto.setText(hora.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
 
				e.printStackTrace();
			}
		}
	}

}
