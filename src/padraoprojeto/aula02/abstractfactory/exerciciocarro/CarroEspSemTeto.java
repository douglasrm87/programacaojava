package padraoprojeto.aula02.abstractfactory.exerciciocarro;

public class CarroEspSemTeto  extends Carro{
	public void produzir() {
		System.out.println("Produzindo modelo esportivo sem teto solar");
	}
	public void montagem() {
		System.out.println("Finalizando montagem!");
	}
	public void entrega() {
		System.out.println("Pronto para envio!");
	}
	@Override
	public void customizacoes() {
	 
	}
	@Override
	public void adicionarDetalhes() {
 
	}
	@Override
	public void adicionarIsofilme() {
	 
	}

}
