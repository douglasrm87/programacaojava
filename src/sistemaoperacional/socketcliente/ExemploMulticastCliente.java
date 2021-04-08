package sistemaoperacional.socketcliente;


/*
Classe Cliente Multicast
*/

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;


public class ExemploMulticastCliente {
	public static void main(String[] args) {
		String tLinha;
		MulticastSocket tServidor;
		byte[] tBuffer;
		InetAddress tEndereco;
		DatagramPacket tPacote;

		try {
			tServidor = new MulticastSocket(6000);

			tEndereco = InetAddress.getByName("230.0.0.1");

			tServidor.joinGroup(tEndereco);

			tBuffer = new byte[50];

			while (true) {
				tPacote = new DatagramPacket(tBuffer, tBuffer.length);
				tServidor.receive(tPacote);

				tLinha = new String(tPacote.getData());
				System.out.println(tLinha);
			}
		} catch (UnknownHostException e) {
			System.out.println("IP n�o encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na conex�o.");
			e.printStackTrace();
		}
	}
}
