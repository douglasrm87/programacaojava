//Implementar uma classe Java que apresente uma interface gr�fica com uma data e hor�rio. A interface dever� atualizar os segundos da interface gr�fica para representar um rel�gio em funcionamento. A atualiza��o deste rel�gio dever� ocorrer com o uso de uma Thead. Para isto implementar uma segunda classe que ser� a respons�vel por atualizar a interface gr�fica.

package programacao22s.swing_03;
import java.awt.Font;import java.util.Calendar;import java.util.Date;import javax.swing.JTextField;
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
