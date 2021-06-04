package sistemaoperacional.socketcliente;
/*
Classe que representa um socket em Java. Possui diversos construtores para facilitar o uso, mas basicamente os par�metros solicitados s�o: identifica��o do �servidor� e porta do servi�o requisitado. O pr�prio construtor � o respons�vel pela solicita��o da conex�o e continua tentando at� que ocorra: sucesso, erro de E/S ou endere�o n�o encontrado. 
	
InetAddress getLocalAddress( )
int getLocalPort( )
Retornam o endere�o e a porta do computador no qual o socket est� sendo executado.
InetAddress getInetAddress( )
int getPort( )
Retornam o endere�o e a porta do computador no qual o socket est�  conectado.
*/
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ExemploSocket {
	public static void main(String[] args)
	{
		String 		tHost;
		int 			tPorta;
		
		Scanner sc = new Scanner (System.in).useDelimiter("\r\n");
		while(true){
			// Modo de uso: www.google.com.br
			System.out.print("Digite um host : ");
			tHost = sc.next();
			if (tHost.equals("fim"))
				break;
			// Modo de uso: 80
			System.out.println("Digite o n�mero da porta : ");
			tPorta = sc.nextInt();		
			try (Socket tSocket = new Socket(tHost, tPorta);)	{
				
				System.out.println("Conex�o estabelecida.");
				System.out.println("Porta Local: " + tSocket.getLocalPort());
				System.out.println("Porta Remota: " + tSocket.getPort());
				System.out.println("In Buffer Size: " +	tSocket.getReceiveBufferSize());
				System.out.println("Out Buffer Size: " +tSocket.getSendBufferSize());
				System.out.println("Time Out: " + tSocket.getSoTimeout());	
				System.out.println("Keep Alive? " + tSocket.getKeepAlive());
				System.out.println("Local Address: " + tSocket.getLocalAddress());
				System.out.println("InetAddress: " + tSocket.getInetAddress());
				tSocket.close();
			}
			catch(UnknownHostException e){
				System.out.println("IP n�o encontrado.");
				e.printStackTrace();
			}
			catch(IOException e) {
				System.out.println("Erro na conex�o.");
				e.printStackTrace();
			}
		}
		sc.close();
	}
}


