package sistemaoperacional.socketservidor;
/*
Classe Servidor Multicast
*/
/*
Classe Servidor Multicast
*/


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.DateFormat;
import java.util.Date;
//Este servidor fica constantemente enviando noticias. Os clientes passam a recebê-la após serem inicializados.
public class ExemploMulticastServidor {
	public static void main(String[] args) {
		
		DatagramPacket tPacote;
		byte[] tBuffer;
		String tTexto;
		InetAddress tEndereco;
		DateFormat tFormat;

		tFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.MEDIUM);

		try (DatagramSocket tSocket = new DatagramSocket(6000);){
			

			tEndereco = InetAddress.getByName("230.0.0.1");

			while (true) {
				tTexto = tFormat.format(new Date());
				tBuffer = new byte[tTexto.length()];
				tBuffer = tTexto.getBytes();

				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
				}
				System.out.println("Enviando...");

				tPacote = new DatagramPacket(tBuffer, tBuffer.length,
						tEndereco, 6000);
				tSocket.send(tPacote);
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
