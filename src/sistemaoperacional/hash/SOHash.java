package sistemaoperacional.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SOHash {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String senha = "minhasenha12";
		MessageDigest algorithm;
		byte messageDigest[];
		
		try {
			algorithm = MessageDigest.getInstance("MD5");
			messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
			System.out.println("Formato MD5: " + messageDigest);
			
			algorithm = MessageDigest.getInstance("SHA-256");
			messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
			System.out.println("Formato SHA-256: " + messageDigest);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
