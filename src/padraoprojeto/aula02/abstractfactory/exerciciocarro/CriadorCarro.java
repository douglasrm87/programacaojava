package padraoprojeto.aula02.abstractfactory.exerciciocarro;

public class CriadorCarro {
	public Carro criarCarro(String tipo) {
		Carro pq = null;
		if ("1".equals(tipo)) {
			pq = (Carro) new CarroTetoSolar();
		} else if ("2".equals(tipo)) {
			pq = (Carro) new CarroSemTeto();
		} else if ("3".equals(tipo)) {
			pq = (Carro) new CarroEspComTeto();
		} else if ("4".equals(tipo)) {
			pq = (Carro) new CarroEspSemTeto();
		}
		return pq;
	}

}
