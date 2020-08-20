package programacao1.terca.aula05;

import java.util.Scanner;

public class InverteNumeros {
	Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		new InverteNumeros().processar();
	}
	private void processar () {
	
		for (int i = 100; i > 0; i--) {
			System.out.println("i:" + i);
		}
		
		this.leia.close();
	}
}
