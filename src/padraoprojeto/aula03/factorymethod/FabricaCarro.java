package padraoprojeto.aula03.factorymethod;

public class FabricaCarro {
	public Carro criarCarro(ModeloCarro modelo) {
        switch (modelo) {
        case celta:
            return new Celta();
        case fiesta:
            return new Fiesta();
        case gol:
            return new Gol();
        case palio:
            return new Palio();
        default:
            break;
        }
        return null;
    }
}
