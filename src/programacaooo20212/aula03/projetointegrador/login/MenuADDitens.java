package programacaooo20212.aula03.projetointegrador.login;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//git filter-branch 
@ManagedBean 
@ViewScoped
public class MenuADDitens implements Serializable {
	private static final long serialVersionUID = 1094801825228386363L;
      
	public void adicionarCalca() {
		System.out.println("Escolhido adicionar Calça");
	}

	public void adicionarCamisa() {
		System.out.println("Escolhido adicionar Camisa");
	}

	public void adicionarCinto() {
		System.out.println("Escolhido adicionar Cinto");
	}

	public void adicionarSapato() {
		System.out.println("Escolhido adicionar Sapato");
	}

	public void adicionarUnderWear() {
		System.out.println("Escolhido adicionar Underwear");
	}

	public void adicionarMeia() {
		System.out.println("Escolhido adicionar Meia");
	}

}
