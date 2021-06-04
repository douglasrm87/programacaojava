package sistemaoperacional.socketcliente;
/*
Classe que representa um socket em Java. Possui diversos construtores para facilitar o uso, mas basicamente os parâmetros solicitados são: identificação do “servidor” e porta do serviço requisitado. O próprio construtor é o responsável pela solicitação da conexão e continua tentando até que ocorra: sucesso, erro de E/S ou endereço não encontrado. 
	
InetAddress getLocalAddress( )
int getLocalPort( )
Retornam o endereço e a porta do computador no qual o socket está sendo executado.
InetAddress getInetAddress( )
int getPort( )
Retornam o endereço e a porta do computador no qual o socket está  conectado.
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
			System.out.println("Digite o número da porta : ");
			tPorta = sc.nextInt();		
			try (Socket tSocket = new Socket(tHost, tPorta);)	{
				
				System.out.println("Conexão estabelecida.");
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
				System.out.println("IP não encontrado.");
				e.printStackTrace();
			}
			catch(IOException e) {
				System.out.println("Erro na conexão.");
				e.printStackTrace();
			}
		}
		sc.close();
	}
}


