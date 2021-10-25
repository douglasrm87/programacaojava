package programacaooo20212.aula07.view;

public interface InterfaceA {
	default public void apresentarDados(){
		System.out.println("Dados sendo apresentados pela Interface B.");
	}
	default public void processarRegraIntA(){
		System.out.println("Dados sendo processados pela Interface B.");
	}
}
