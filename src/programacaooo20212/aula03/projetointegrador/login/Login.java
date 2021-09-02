package programacaooo20212.aula03.projetointegrador.login;

import java.io.Serializable;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
   
@ManagedBean
@ViewScoped
//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
public class Login implements Serializable {
	private static final long serialVersionUID = 1094801825228386363L;
	private String cpfUsuario;
	private String senha; 
	      
	private final static int LOGIN_OK = 0;
 
	public void logar() {
		System.out.println("usuario:" + cpfUsuario);
		System.out.println("senha:" + senha);
		if (cpfUsuario.equals("111.111.111-11") && senha.equals("11111111")) {
			redirecionarTelas(0);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Login não realizado. Usuário ou senha incorretos.", "Redigite."));
		}

	}
	protected void redirecionarTelas(int tipoUsuario) {
		FacesContext fc = FacesContext.getCurrentInstance();
		Application app = fc.getApplication();
		NavigationHandler handler = app.getNavigationHandler();
		
		switch (tipoUsuario) {
		case LOGIN_OK:
			//http://localhost:8080/programacaojava/faces/dukeecommerce.xhtml
			handler.handleNavigation(fc, "", "/paginas/dukeecommerce.xhtml");
			break;
		 

		default:
			break;
		}
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
