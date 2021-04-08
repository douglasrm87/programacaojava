package sistemaoperacional.socketservidor;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * Executar pelo ambiente de emulaÁ„o 
 * 
 D:\workspace\livroClienteServidor>java -cp .  modulo18.ExemploServidorSocketBasi
 co
 Msg Enviada pelo Servidor. Esperando uma conex“o...
 */
public class ExemploServidorSocketBasico {
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(3000);
			System.out.println("Porta Local do servidor: " + servidor.getLocalPort());
			System.out.println("InetAddress do servidor: " + servidor.getInetAddress());
			System.out.println("Msg Enviada pelo Servidor. Esperando uma conex„o...");
			Socket cliente = servidor.accept();
			System.out.println("Msg recebida pelo Servidor. Conex„o estabelecida...");
			cliente.close();
			servidor.close();
			System.out.println("Encerrando a conex„o...");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
