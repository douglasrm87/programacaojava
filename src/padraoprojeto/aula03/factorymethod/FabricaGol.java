package padraoprojeto.aula03.factorymethod;
public class FabricaGol implements FabricaDeCarro {
	@Override
	public Carro criarCarro() {
		return new Gol();
	}
}