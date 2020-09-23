package programacao22s.xmlcep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.UnknownFieldException;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class EnderecoXML {
	public static void main(String[] args) {
		new EnderecoXML().carregarDadosArqXML("80050350");

	}

	public EnderecoDTO carregarDadosArqXML(String cep) {
		EnderecoDTO end = new EnderecoDTO();
		try {
			XStream stream = new XStream(new DomDriver());
			stream.alias("webservicecep", EnderecoDTO.class);
			String cepXML = carregarPaginaHTML(cep);
			end = (EnderecoDTO) stream.fromXML(cepXML);
			System.out.println("Meu endereco: " + end);
		} catch (UnknownFieldException e) {
			System.out.println("CEP N�o localizado");
		}
		return end;
	}

	private String carregarPaginaHTML(String cep) {
		StringBuilder conteudoHTML = new StringBuilder();
		URL tUrl;
		InputStream tInput;
		String tLinha;
		try {
			tUrl = new URL(String.format("http://cep.republicavirtual.com.br/web_cep.php?cep=%s&formato=xml", cep));
			tInput = tUrl.openStream();

			try (InputStreamReader tArq1 = new InputStreamReader(tInput);
					BufferedReader tArq2 = new BufferedReader(tArq1);) {
				while (true) {

					tLinha = tArq2.readLine();
					if (tLinha == null) {
						break;
					}
					conteudoHTML.append(tLinha);
					conteudoHTML.append("\n");
					System.out.println("Linha lida da Internet: " + tLinha);
				}
			} catch (MalformedURLException e1) {
				System.out.println("URL inválida: " + e1.getMessage());
			} catch (IOException e2) {
				System.out.println("Erro na obtenção do objeto: " + e2.getMessage());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(
					"Servidor Keyserver não localiza. Verificar se o acesso ao servidor é válido e liberado pela Internet.");
		}
		return conteudoHTML.toString();
	}

}
