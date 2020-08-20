package programacao2.aula17.socket.aovivo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ExemploServidorSocketBasico {
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(3000);

			System.out.println("Msg Enviada pelo Servidor. Esperando uma conex�o...");

			Socket cliente = servidor.accept();

			System.out.println("Msg Enviada pelo Servidor. Conex�o estabelecida...");

			cliente.close();

			System.out.println("Encerrando a conex�o...");
			servidor.close();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
