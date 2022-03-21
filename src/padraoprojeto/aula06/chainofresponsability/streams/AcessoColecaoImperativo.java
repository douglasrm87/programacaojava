package padraoprojeto.aula06.chainofresponsability.streams;

//http://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.html
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/*
Essa API traz uma forma mais funcional de trabalhar com nossas cole��es. Ela possui diversos m�todos, como o filter, map e reduce, que recebem uma interface funcional como par�metro, nos possibilitando tirar proveito dos novos recursos de lambda e method reference.
 */
public class AcessoColecaoImperativo {
	public static void main(String[] args) {
		new AcessoColecaoImperativo().processar();
	}

	private static int percorrerComIteracao(List<Integer> listaInteiros) {
		Iterator<Integer> it = listaInteiros.iterator();
		int total = 0;
		while (it.hasNext()) {
			Integer num = it.next();
			if (num % 2 == 1) { // n�meros �mpares
				total += num;
			}
		}
		return total;
	}

	private int percorrerComLoop(List<Integer> listaInteiros) {
		int total = 0;
		for (int inteiro : listaInteiros) {
			if (inteiro % 2 == 0) { // n�meros pares
				total += inteiro;
			}
		}
		return total;
	}

	private int total = 0;
	private int percorrerComStream(List<Integer> listaInteiros) {
		listaInteiros.forEach((inteiro -> {
			if (inteiro % 2 == 0) {
				this.total += inteiro;
			}
		}));
		return this.total;
	}

	private void processar() {
		List<Integer> listaInteiros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listaInteiros.add(i);
		}
		System.out.println("Total �pares:" + percorrerComIteracao(listaInteiros));
		System.out.println("Total pares:" + percorrerComLoop(listaInteiros));
		System.out.println("Total pares Stream:" + percorrerComStream(listaInteiros));

	}
}
