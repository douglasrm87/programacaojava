package programacao1.terca.aula13.aovivo;

public class ExemploSobrecarga {
	private int a = 10;
	private int b = 20;

	public static void main(String[] args) {
		new ExemploSobrecarga().processar();
	}

	private void processar() {
		ExemploSobrecarga obj = new ExemploSobrecarga();
		String str = "douglas";
		
	}

	private int imprimirSoma() {
		return this.a + this.b;
	}
// A assinatura de um m�todo � equivalente ao seu nome + seus par�metros, seja em quantidade
	// posi��o ou tipo
//	private double imprimirSoma() {
//		return (a + b) * 1.0;;
//	}
	private int imprimirSoma(int aLocal) {
		return aLocal + this.b;
	}
	private int imprimirSoma(int aLocal , int bLocal) {
		return aLocal + bLocal;
	}
	
	private double imprimirSoma(double aLocal , double bLocal) {
		return aLocal + bLocal;
	}
	
	
}
