package padraoprojeto.aula03.factorymethod;
public class FabricaCelta implements FabricaDeCarro {
	@Override
	public Carro criarCarro() {
		return new Palio();
	}
}