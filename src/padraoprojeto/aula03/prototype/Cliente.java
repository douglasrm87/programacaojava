package padraoprojeto.aula03.prototype;

public class Cliente {
	public static void main(String[] args) {
		GolPrototype prototipoGol = new GolPrototype();
	
		CarroPrototype golNovo = prototipoGol.clonar();
		golNovo.setValorCompra(27900.0);
		
		CarroPrototype golUsado = golNovo.clonar();
		golUsado.setValorCompra(21000.0);

		System.out.println(golNovo.exibirInfo());
		System.out.println(golUsado.exibirInfo());
	}
}
