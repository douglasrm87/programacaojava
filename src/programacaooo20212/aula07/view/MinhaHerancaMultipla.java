package programacaooo20212.aula07.view;

public class MinhaHerancaMultipla implements InterfaceA, InterfaceB {
	// Devido a ambas as interfaces definirem o m�todo para n�o gerar
	// erro precisa-se redefenir o m�todo na classe concreta.
	public void apresentarDados() {
		System.out.println("Dados sendo apresentados pela Classe Concreta.");
	}

	public static void main(String[] args) {
		new MinhaHerancaMultipla().processar();
	}

	public void processar() {
		apresentarDados();
		processarRegraIntA();
		processarRegraIntB();
	}

}
