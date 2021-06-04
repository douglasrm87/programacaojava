package sistemaoperacional.memoria;

import java.util.ArrayList;
import java.util.List;

public class EstouroHeapRamThread extends Thread {
	static String str = new String();
	static StringBuffer strB = new StringBuffer();

	public void run() {
		while (true) {
			List<String> lista = new ArrayList<>(1000000);
			for (;;) {
				str += "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
				for (;;) {
					str += "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
					strB.append(str);
				}
			}
		}
	}
}