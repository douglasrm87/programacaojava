package programacaojava;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Teste {
	public static void main(String args[]) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//https://howtodoinjava.com/java/java-security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
		// https://www.devmedia.com.br/como-funciona-a-criptografia-hash-em-java/31139
		String senha = "admin";

		MessageDigest algorithm;
		byte messageDigest[];

		algorithm = MessageDigest.getInstance("MD5");
		messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
		System.out.println("Formato MD5: " + messageDigest);

		algorithm = MessageDigest.getInstance("SHA-256");
		messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
		System.out.println("Formato SHA-256: " + messageDigest);
	}
}
