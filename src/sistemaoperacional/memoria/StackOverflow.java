package sistemaoperacional.memoria;

public class StackOverflow {
	public static void main(String[] args) {
		new StackOverflow().recursivo(5);
		}
			public int recursivo(int param) {
				System.out.println("Valor Param:" + param);
				if (param == 6) {
					return 0;
				}
				param = param -1;
				recursivo(param);
				return 1;
			}

}
