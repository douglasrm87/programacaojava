package padraoprojeto.aula03.factorymethod;
public class FabricaFusca implements FabricaDeCarro {
	@Override
	public Carro criarCarro() {
		return new Fusca();
	}
}