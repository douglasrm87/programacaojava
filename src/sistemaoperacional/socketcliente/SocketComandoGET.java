package sistemaoperacional.socketcliente;

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

public class SocketComandoGET {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		new SocketComandoGET().processar();
	}

	private void processar() throws IOException {
		String tHost;
		InetAddress tEnd;
		String tLinha;
		while (true) {
			System.out.print("Digite um host : ");
			tHost = sc.nextLine();
			if (tHost.equals("fim"))
				break;
			try (Socket tSocket = new Socket(tHost, 80);
					OutputStream tArq1 = tSocket.getOutputStream();
					PrintWriter tArq2 = new PrintWriter(tArq1, true);
					InputStream tArq3 = tSocket.getInputStream();
					InputStreamReader tArq4 = new InputStreamReader(tArq3);
					BufferedReader tArq5 = new BufferedReader(tArq4);) {
				System.out.println("Conexão estabelecida.");
				tEnd = tSocket.getInetAddress();
				tArq2.println("GET / HTTP/1.1");
				tArq2.println("Host:" + tEnd.getHostName());
				tArq2.println("\r\n");
				while (true) {
					tLinha = tArq5.readLine();
					if (tLinha == null)
						break;

					System.out.println(tLinha);
				}
				tSocket.close();
			} catch (UnknownHostException e) {
				System.out.println("IP não encontrado.");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Erro na conexão.");
				e.printStackTrace();
			}
		}
	}
}
