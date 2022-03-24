package padraoprojeto.aula06.proxy;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Hacker acessando >(");
		BancoUsuario banco = new BancousuarioProxy("Hacker", "1234");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

		System.out.println("\nAdministrador acessando :)");
		banco = new BancousuarioProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
	}
}
