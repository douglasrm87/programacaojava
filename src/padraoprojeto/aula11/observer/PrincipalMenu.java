package padraoprojeto.aula11.observer;

public class PrincipalMenu {
	public static void main(String[] args) {
		SubjectOrigemdoEvento eventSource = new SubjectOrigemdoEvento();
		
		ClimaTempoObservador obs01 = new ClimaTempoObservador("Ouvinte ClimaTempoObservador:",eventSource);
		obs01.start();
		AdaparObservador obs02 = new AdaparObservador("Ouvinte AdaparObservador:",eventSource);
		obs02.start();
		SimeparObservador obs03 = new SimeparObservador("Ouvinte SimeparObservador:",eventSource);
		obs03.start();
		
		new Thread(eventSource).start();
	}
}
