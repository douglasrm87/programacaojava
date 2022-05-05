package padraoprojeto.aula11.observer.net;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class TemperaturaClimatica extends Observable implements Runnable {
	Scanner sc = new Scanner(System.in);

    public void run() {
    	  addObserver(new Observer() {
             public void update(Observable obj, Object arg) {
                 System.out.println("TemperaturaClimatica." + arg);
             }
         });
    	 
    }
}
