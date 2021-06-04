package sistemaoperacional.memoria;

public class FatorialReucursivo {
	public static int NUM = 6;
	public static void main(String[] args) {
		System.out.println("Fatorial de " + NUM + ":" + 		calcularFatRecursivo(NUM));
	}
	public static int calcularFatRecursivo (int num) {
		 if (num > NUM ) {       //StackOverflow
//		if (num <= 1) {
			return 1;
		}
		// Usando a recursividade
		return num * calcularFatRecursivo(num - 1);
	}
}
