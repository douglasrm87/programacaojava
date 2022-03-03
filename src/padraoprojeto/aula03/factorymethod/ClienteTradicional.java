package padraoprojeto.aula03.factorymethod;

public class ClienteTradicional {
	public static void main(String[] args) {
		FabricaCarro fc = new FabricaCarro();
		Carro celta = fc.criarCarro(ModeloCarro.celta);
		celta.exibirInfo();
		Carro gol = fc.criarCarro(ModeloCarro.gol);
		gol.exibirInfo();
		Carro palio = fc.criarCarro(ModeloCarro.palio);
		palio.exibirInfo();
		Carro fiesta = fc.criarCarro(ModeloCarro.fiesta);
		fiesta.exibirInfo();

	}
}
