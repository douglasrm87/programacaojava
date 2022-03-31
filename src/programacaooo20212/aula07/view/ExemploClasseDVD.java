package programacaooo20212.aula07.view;

import java.util.LinkedList;
import java.util.List;

public class ExemploClasseDVD implements ExemploInterfaceDVD {

	private List dvds = new LinkedList();

	public void acrescentarLista(ExemploEstruturaDVD obj) {
		this.dvds.add(obj);
	}

	public void imprimirLista() {
		System.out.println("Lista de DVDs");
		for (int i = 0; i < dvds.size(); i++) {
			System.out.println();
			System.out.print("Nome do Editor: ");
			System.out.println(((ExemploEstruturaDVD) this.dvds.get(i)).getNomeCliente());
			System.out.print("Preco do DVD: ");
			System.out.println(((ExemploEstruturaDVD) this.dvds.get(i)).getPreco());
		}
		System.out.println("****************************");
		System.out.println();
	}

}
