package programacaooo20212.prova;

public class ProvaAV1 {
	public static void main(String args[]) {
		int v1 = 9;
		String v2 = "";
		while (v1 > 1) {
			v2 = v1 % 2 + v2;
			v1 /= 2;
		}
		System.out.print(v1);
		System.out.println(v2);
		int i = 123;
		System.out.printf(">%2b + %1$5d< \n", i, false);
		System.out.printf(">%2$b + %1$5d< \n", i, false);
	}
}
