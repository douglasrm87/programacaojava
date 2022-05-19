package padraoprojeto.aula14.interpreter;

public class Principal {
	public static void main(String[] args) {
		  Operador somar = new Somar(new Numero(1), new Numero(4));
	        System.out.println(somar.interpretar());
	        Operador subtrair = new Subtrair(somar, new Numero(2));
	        System.out.println(subtrair.interpretar());
	        Operador multiplicar = new Multiplicar(subtrair, somar);
	        System.out.println(multiplicar.interpretar());
	        Operador dividir = new Dividir(new Numero(30), multiplicar);
	        System.out.println(dividir.interpretar());
	}

}