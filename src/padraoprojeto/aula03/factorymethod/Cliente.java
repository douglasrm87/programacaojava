package padraoprojeto.aula03.factorymethod;
public class Cliente {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		Carro carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();

		fabrica = new FabricaGol();
		carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();

		fabrica = new FabricaFiesta();
		carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();

		fabrica = new FabricaCelta();
		carro = fabrica.criarCarro();
		carro.exibirInfo();
	}
}
