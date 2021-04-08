package sistemaoperacional.socketservidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/*
Classe Servidor
*/
import java.net.ServerSocket;
import java.net.Socket;

// Esse servidor retorna tudo o que recebe na conexão
public class ExemploServidorSocketLendoDados {

	public static void main(String[] args) throws IOException {
		new ExemploServidorSocketLendoDados().processar();
	}

	private void processar() throws IOException {
		String tLinha;

		Socket tCliente = null;
		OutputStream tArq1 = null;
		PrintWriter tArq2 = null;
		InputStream tArq3 = null;
		InputStreamReader tArq4 = null;
		BufferedReader tArq5 = null;

		try (ServerSocket tServidor = new ServerSocket(3000);) {

			loop: while (true) {
				System.out.println("Msg Enviada pelo Servidor. Esperando uma conexão...");
				tCliente = tServidor.accept();
				System.out.println("Porta Local: " + tCliente.getLocalPort());
				System.out.println("Porta : " + tCliente.getPort());
				System.out.println("Msg Recebida pelo Servidor. Conexão estabelecida...");

				tArq1 = tCliente.getOutputStream();
				tArq2 = new PrintWriter(tArq1, true);

				tArq3 = tCliente.getInputStream();
				tArq4 = new InputStreamReader(tArq3);
				tArq5 = new BufferedReader(tArq4);

				while (true) {
					tLinha = tArq5.readLine();
					if (tLinha != null) {
						System.out.println("Linha recebida: " + tLinha);
						tArq2.println(tLinha);

						if (tLinha.equalsIgnoreCase("fim"))
							break;
						if (tLinha.equalsIgnoreCase("quit"))
							break loop;
					}
				}

			}
			if (tCliente != null)
				tCliente.close();
			tServidor.close();
			System.out.println("Encerrando a conexão...");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		if (tCliente != null)
			tCliente.close();
		if (tArq1 != null)
			tArq1.close();
		if (tArq2 != null)
			tArq2.close();
		if (tArq3 != null)
			tArq3.close();
		if (tArq4 != null)
			tArq4.close();
		if (tArq5 != null)
			tArq5.close();

	}
}