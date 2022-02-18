package padraoprojeto.aula01;

public class UsuarioImutavelPrincipal {
	public static void main(String[] args) {
		try {
			UsuarioImutavel user1 = new UsuarioImutavel.UsuarioImutavelBuilder("Douglas", "Mendes").idade(30)
					.telefone("1234567").endereco("Souza Naves").build();
			System.out.println(user1);
			UsuarioImutavel user2 = new UsuarioImutavel.UsuarioImutavelBuilder("Pedro", "Rocha").idade(40)
					.telefone("32309050")
					// no address
					.build();
			System.out.println(user2);
			UsuarioImutavel user3 = new UsuarioImutavel.UsuarioImutavelBuilder("Leandro", "Mendes")
					// No age
					// No phone
					// no address
					.build();
			System.out.println(user3);
			UsuarioImutavel user4 = new UsuarioImutavel.UsuarioImutavelBuilder("AB", "Mendes").build();
			System.out.println(user4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
