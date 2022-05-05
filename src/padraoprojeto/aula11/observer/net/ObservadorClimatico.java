package padraoprojeto.aula11.observer.net;

import java.util.Observable;
import java.util.Scanner;

public class ObservadorClimatico extends Observable implements Runnable {
	Scanner sc = new Scanner(System.in);

    public void run() {
    	System.out.println("Executando o processo de atualização.");
    	TemperaturaClimatica temp = new TemperaturaClimatica();
    	new Thread(temp).start();
        while (true) {
            String response = sc.next();
            setChanged();
            notifyObservers(response);
            System.out.println("Observador acionado.");
        }
    }
}
