package padraoprojeto.aula07.chainofresponsability.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComparativoRemoveIfIterator {
	public static void main(String[] args) {
		List<Integer> listaIntA = new ArrayList<>();
		List<Integer> listaIntB = new ArrayList<>();
		for (int i = 0; i < 300000; i++) {
			listaIntA.add(i);
			listaIntB.add(i);
		}
		Instant inicio = Instant.now();
		Iterator<Integer> it = listaIntA.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		System.out.println("Tempo em milessegundos - Iterator: " + duracao.toMillis() + " Tamanho:" + listaIntA.size());

		System.out.println("_____________________________________");

		inicio = Instant.now();
		List<Integer> novaListaIntB = new ArrayList<>(listaIntB);
		novaListaIntB.removeIf(inteiro -> listaIntB.remove(inteiro));
		fim = Instant.now();
		duracao = Duration.between(inicio, fim);
		System.out.println("Tempo em milessegundos - removeIf: " + duracao.toMillis() + " Tamanho:" + listaIntB.size());
	}

}
