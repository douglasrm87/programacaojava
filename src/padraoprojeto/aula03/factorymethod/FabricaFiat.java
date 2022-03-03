package padraoprojeto.aula03.factorymethod;
public class FabricaFiat implements FabricaDeCarro {
	@Override
	public Carro criarCarro() {
		return new Palio();
	}
}