package programacao3;

public interface InterfaceBase {
	public String valor = "10";

	default void acelerar(int param) {
		System.out.println("Acelera��o Constante");
//		valor = param;
	}
}
