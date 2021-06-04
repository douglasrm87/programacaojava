package sistemaoperacional.starvation;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Funcionario {
	// Problema -  Observe a palavra synchronized
	public synchronized void work() {
		String name = Thread.currentThread().getName();
		String fileName = name + ".txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));) {
			writer.write("Thread " + name + " wrote this mesasge");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " is working");
		}
	}
}


