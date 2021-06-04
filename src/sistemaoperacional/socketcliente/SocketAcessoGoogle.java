package sistemaoperacional.socketcliente;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class SocketAcessoGoogle {
	Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
	public static void main(String[] args) {
		new SocketAcessoGoogle().processar();
	}
	private void processar() {
		String tHost;
		int tPorta;
		while (true) {
			// Modo de uso: www.google.com.br
			System.out.print("Digite um host : ");
			tHost = sc.next();
			if (tHost.equals("fim")) {
				sc.close();
				break;
			}
			// Modo de uso: 80
			System.out.println("Digite o número da porta : ");
			tPorta = sc.nextInt();
			try (Socket tSocket = new Socket(tHost, tPorta);) {
				System.out.println("Conexão estabelecida.");
				System.out.println("Porta Local: " + tSocket.getLocalPort());
				System.out.println("Porta Remota: " + tSocket.getPort());
				System.out.println("In Buffer Size: " + tSocket.getReceiveBufferSize());
				System.out.println("Out Buffer Size: " + tSocket.getSendBufferSize());
				System.out.println("Time Out: " + tSocket.getSoTimeout());
				System.out.println("Keep Alive? " + tSocket.getKeepAlive());
				System.out.println("Local Address: " + tSocket.getLocalAddress());
				System.out.println("InetAddress: " + tSocket.getInetAddress());

			} catch (UnknownHostException e) {
				System.out.println("IP não encontrado.");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Erro na conexão.");
				e.printStackTrace();
			}
		}
		sc.close();
	}
}

