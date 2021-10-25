package programacaooo20212.aula07.view;

public class ATM {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1000);
		cc.sacar(1000);
		
		cc = new ContaCorrenteEspecial(1000,500);
		cc.sacar(1500);
	}

}
