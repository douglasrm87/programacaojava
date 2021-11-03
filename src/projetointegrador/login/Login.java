package projetointegrador.login;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Login implements Serializable {

	private static final long serialVersionUID = 1094801825228386363L;

	private String cpfUsuario;
	private String senha;
 
	public void logar() {
		System.out.println("usuario:" + cpfUsuario);
		System.out.println("senha:" + senha);
	
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCpfUsuario() {
		return this.cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}
