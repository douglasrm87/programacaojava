package padraoprojeto.aula11.observer;

import java.util.Observable;
import java.util.Observer;

public class SimeparObservador extends Thread  {
	String frase;
	SubjectOrigemdoEvento eventSource;
	public SimeparObservador(String frase , SubjectOrigemdoEvento eventSource) {
		this.frase = frase;
		this.eventSource = eventSource;
	}

	public void run() {
//		SubjectOrigemdoEvento eventSource = new SubjectOrigemdoEvento();
//		new Thread(eventSource).start();
//		while (true) {
			System.out.println(frase);
			eventSource.addObserver(new Observer() {
				public void update(Observable obj, Object arg) {
					System.out.println(frase + " - Temperatura atualizada para:" + arg);
				}
			});
//		}

	}
}
