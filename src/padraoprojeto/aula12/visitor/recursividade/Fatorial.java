package padraoprojeto.aula12.visitor.recursividade;

public class Fatorial {
	public static void main(String[] args) {
		Fatorial r = new Fatorial();
		int resp = r.fatorial(5);
		System.out.println(resp);
	}
	public int fatorial(int x) {
		// Se x for igual a 0 (zero) ent�o retorna 1.
		if (x == 0) {
			return 1;
		}
		/* Para qualquer outro n�mero, calcula o seu valor multiplicado pelo fatorial de
		 * seu antecessor.*/
		return x * fatorial(x - 1);
	}
}
