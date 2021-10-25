package programacaooo20212.aula07.view;

public interface InterfaceB {
	default public void apresentarDados(){
		System.out.println("Dados sendo apresentados pela Interface A.");
	}
	default public void processarRegraIntB(){
		System.out.println("Dados sendo processados pela Interface A.");
	}
}
