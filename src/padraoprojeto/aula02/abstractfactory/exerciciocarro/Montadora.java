package padraoprojeto.aula02.abstractfactory.exerciciocarro;

public class Montadora {
	public void montarCarro(String tipo) {
		CriadorCarro cp = new CriadorCarro();
		Carro carro = cp.criarCarro(tipo);
		if (carro != null) {
			carro.produzir();
			carro.montagem();
			carro.entrega();
			carro.customizacoes();
			carro.adicionarDetalhes();
			carro.adicionarIsofilme();
			
		}
	}
}