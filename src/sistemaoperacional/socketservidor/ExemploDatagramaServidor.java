package sistemaoperacional.socketservidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ExemploDatagramaServidor {
	public static void main(String[] args) {

		DatagramPacket tPacote;
		byte[] tBuffer;
		String tTexto;
		InetAddress tEndereco;
		int tPorta;
		try (// porta 6000
				DatagramSocket tSocket = new DatagramSocket(6000);) {

			tBuffer = new byte[1024];
			while (true) {
				tPacote = new DatagramPacket(tBuffer, tBuffer.length);
				System.out.println("Servidor Datagrama. Esperando uma conexão...");
				tSocket.receive(tPacote);
				System.out.println("Mensagem recebida do cliente.");
				tBuffer = tPacote.getData();
				tTexto = new String(tBuffer);
				if (tTexto.equals("fim"))
					break;
				tEndereco = tPacote.getAddress();
				tPorta = tPacote.getPort();
				tPacote = new DatagramPacket(tBuffer, tBuffer.length, tEndereco, tPorta);
				System.out.println("Mensagem Enviada para o cliente.");
				tSocket.send(tPacote);
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
