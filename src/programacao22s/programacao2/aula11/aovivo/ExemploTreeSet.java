package programacao2.aula11.aovivo;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploTreeSet {
	public static void main(String[] args) {
		SortedSet<String> c = new TreeSet<>();
		c.add("Java");
		c.add("C ++");
		c.add("Smalltalk");
		// Por ser repetido n�o ser� inserido no Conjunto
		c.add("Java");
		c.add("Delphi");
		c.add("PHP");
		// imprime todo o conjunto ordenado
		System.out.println("Imprimindo todos os elementos de uma �nica vez: " + c);
		/*
		 * Impress�o ficar�: Imprimindo todos os elementos de uma �nica vez: [C ++,
		 * Delphi, Java, PHP, Smalltalk]
		 */
	}
}
