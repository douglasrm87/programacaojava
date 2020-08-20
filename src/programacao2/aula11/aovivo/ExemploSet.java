package programacao2.aula11.aovivo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ExemploSet {
	public static void main(String[] args) {
		Collection<String> set = new HashSet<>();
		set.add("Java");
		set.add("C ++");
		set.add("Smalltalk");
		// Por ser repetido n�o ser� inserido no Conjunto
		set.add("Java");
		set.add("Delphi");
		set.add("PHP");
		// imprime todo o conjunto.
		// os elementos ser�o apresentados em qualquer ordem.
		System.out.println("Imprimindo todos os elemento de uma �nica vez: " + set);
		/*
		 * Impress�o ficar�: Imprimindo todos os elemento de uma �nica vez: [Java,
		 * Smalltalk, C ++, PHP, Delphi]
		 */
		/*
		 * Para recuperar os elementos de um objeto do tipo SET utilizar um iterator
		 */
		Iterator it = set.iterator();
		System.out.println("Imprimindo cada elemento do conjunto.");
		while (it.hasNext()) {
			Object val = it.next();
			System.out.println("*********************************************");
			System.out.println(val.toString());
		}
	}
}
