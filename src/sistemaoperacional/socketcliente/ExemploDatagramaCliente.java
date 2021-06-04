package sistemaoperacional.socketcliente;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
/*
 * Para executar. Rode o servidor no Eclipse e o cliente no emulador texto.
 D:\workspace\livroClienteServidor>java -cp . modulo18.ExemploDatagramaCliente
 Digite um host :
 localhost
 Entre com o texto :
 3000
 3000
 Entre com o texto :
 ola datagrama
 ola
 Entre com o texto :
 datagrama
 Entre com o texto :
 ola
 ola
 Entre com o texto :
 */
public class ExemploDatagramaCliente {
	public static void main(String[] args) {
		String tHost;
		String tLinha;
		
		byte[] tBuffer;
		InetAddress tEndereco;
		DatagramPacket tPacote;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Digite um host : ");
			tHost = sc.next();
			if (tHost.equals("fim"))
				break;
			try (DatagramSocket tServidor = new DatagramSocket();) {
				
				tEndereco = InetAddress.getByName(tHost);
				while (true) {
					System.out.println("Entre com o texto : ");
					tLinha = sc.next();
					if (tLinha.equals("fim"))
						break;
					tBuffer = tLinha.getBytes(); // porta 6000
					tPacote = new DatagramPacket(tBuffer, tBuffer.length, tEndereco, 6000);
					tServidor.send(tPacote);
					tPacote = new DatagramPacket(tBuffer, tBuffer.length);
					tServidor.receive(tPacote);
					tLinha = new String(tPacote.getData());
					System.out.println(tLinha);
				}
				tServidor.close();
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
