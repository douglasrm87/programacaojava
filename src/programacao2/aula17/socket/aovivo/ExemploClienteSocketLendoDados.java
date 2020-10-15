package programacao2.aula17.socket.aovivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ExemploClienteSocketLendoDados {
	public static void main(String[] args) throws IOException {
		new ExemploClienteSocketLendoDados().processar();
	}

	Scanner sc = new Scanner(System.in).useDelimiter("\r\n");

	private void processar() throws IOException {
		String tHost;
		int tPorta;

		String tLinha;
		while (true) {
			System.out.print("Digite um host : ");
			tHost = sc.next();
			if (tHost.equals("fim"))
				break;
			System.out.println("Digite o número da Porta(3000): ");
			tPorta = sc.nextInt();
			try (Socket tSocket = new Socket(tHost, tPorta);
					OutputStream tArq1 = tSocket.getOutputStream();
					PrintWriter tArq2 = new PrintWriter(tArq1, true);
					InputStream tArq3 = tSocket.getInputStream();
					InputStreamReader tArq4 = new InputStreamReader(tArq3);
					BufferedReader tArq5 = new BufferedReader(tArq4);) {
				System.out.println("Conexão estabelecida.");

				while (true) {
					System.out.println(" Digite um texto: ");
					tLinha = sc.next();
					if (tLinha.equals("fim") || tLinha.equals("quit")) {
						tArq2.println(tLinha);
						break;
					}
					System.out.println("Enviando...|" + tLinha + "|");
					tArq2.println(tLinha);
					tLinha = tArq5.readLine();
					System.out.println("Recebendo..|" + tLinha + "|");
				}
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
