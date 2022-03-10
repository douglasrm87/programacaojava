package padraoprojeto.aula04.adapter;

public class ClientePrincipal {
	public static void main(String[] args) {
		// Situação anterior
		Tomada2Pinos t2 = new Tomada2Pinos();
		t2.ligarNaTomadaDeDoisPinos();

		System.out.println("\n\nPartindo para adaptação.");
		// Situação ajustada pela necessidade
		Tomada3Pinos t3 = new Tomada3Pinos();
		AdapterTomada a = new AdapterTomada(t3);
		// vamos ligar na tomada 2 pinos porem vai acabar sendo ligada em uma toma de 3.
		a.ligarNaTomadaDeDoisPinos();
	}

}
