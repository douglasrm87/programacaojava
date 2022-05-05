package padraoprojeto.aula11.observer.net;

import java.util.Observable;
import java.util.Observer;

public class SujeitoClimatico {
    public static void main(String[] args) {
        System.out.println("Sujeito Climatico.");
        ObservadorClimatico eventSource = new ObservadorClimatico();

        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Observers acionados via Broadcast." + arg);
            }
        });

        new Thread(eventSource).start();
    }
}