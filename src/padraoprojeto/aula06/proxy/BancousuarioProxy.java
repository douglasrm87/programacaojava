package padraoprojeto.aula06.proxy;

public class BancousuarioProxy extends BancoUsuario implements BancoInterface {
	protected String usuario, senha;

	public BancousuarioProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return super.getNumeroDeUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return super.getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
