package padraoprojeto.aula03.factorymethod;
public class FabricaFiesta implements FabricaDeCarro {
	@Override
	public Carro criarCarro() {
		return new Palio();
	}
}