package padraoprojeto.aula11.observer;

import java.util.Observable;
import java.util.Observer;

public class ClimaTempoObservador extends Thread {
	String frase;
	SubjectOrigemdoEvento eventSource;
	public ClimaTempoObservador(String frase, SubjectOrigemdoEvento eventSource) {
		this.frase = frase;
		this.eventSource = eventSource;
	}
	public void run() {
		System.out.println(frase);
		eventSource.addObserver(new Observer() {
			public void update(Observable obj, Object arg) {
				System.out.println(frase + " - Temperatura atualizada para:" + arg);
			}
		});
	}
}
