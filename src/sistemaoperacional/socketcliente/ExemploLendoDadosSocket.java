package sistemaoperacional.socketcliente;

/*
InputStream getInputStream( )
OutputStream getOutputStream( )
Retornam os streams padr�es para entrada e sa�da de dados. Atrav�s de filtros apropriados podem ser convertidos para outros tipos de streams.
void close( )
Fecha a conex�o.

Ap�s o estabelecimento da conex�o deve-se abrir um canal para a transfer�ncia dos dados, atrav�s do uso de streams. Cada ponto conectado possui duas streams: InputStream, para recebimento e OutputStream, para o envio de dados. Com este formato fica muito f�cil enviar e receber dados, bastando para isso o uso das fun��es de streams tal como read( ) e write( ).
Deve-se destacar que tanto a conex�o quanto a transfer�ncia s�o realizadas sem nenhum conhecimento sobre qual placa de rede est� sendo usada, bem como plataforma, funcionamento do protocolo, etc. 

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ExemploLendoDadosSocket {
	public static void main(String[] args)
	{
		String 			tHost;
		Socket          		tSocket;
		OutputStream    		tArq1;
		PrintWriter     		tArq2;
		InputStream		tArq3;
		InputStreamReader	tArq4;		
		BufferedReader		tArq5;
		InetAddress		tEnd;
		String 			tLinha;
		Scanner sc = new Scanner (System.in);
		
		while(true)
		{
			System.out.print("Digite um host : ");
			tHost = sc.nextLine();
			if (tHost.equals("fim"))
				break;
				
			try
			{
				tSocket = new Socket(tHost, 80);
				// Define a quantidade de segundos que no m�ximo ser� mantida para a conex�o.
				tSocket.setSoTimeout (9000); // milissegundos
	
				System.out.println("Conex�o estabelecida.");
				
				tArq1 = tSocket.getOutputStream();	
				tArq2 = new PrintWriter(tArq1, true);
				
				tArq3 = tSocket.getInputStream();
				tArq4 = new InputStreamReader(tArq3);
		        	tArq5 = new BufferedReader(tArq4);

				tEnd = tSocket.getInetAddress();
		
		        tArq2.println("GET / HTTP/1.1");
		        tArq2.println("Host:" + tEnd.getHostName());
		        tArq2.println("\r\n");
		
		        while (true)
		        {
		        	tLinha = tArq5.readLine();
		        	if (tLinha == null)
		        		break;

					System.out.println(tLinha);
		        }
		        tArq2.close();
			   tArq5.close();
			   tSocket.close();
			}
			catch(UnknownHostException e)
			{
				System.out.println("IP n�o encontrado.");
				e.printStackTrace();
			}
			catch(IOException e)
			{
				System.out.println("Erro na conex�o.");
				e.printStackTrace();
			}
		}				
	}
}
