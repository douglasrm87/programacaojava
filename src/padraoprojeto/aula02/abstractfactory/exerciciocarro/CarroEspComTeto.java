package padraoprojeto.aula02.abstractfactory.exerciciocarro;

public class CarroEspComTeto  extends Carro{
	public void produzir() {
		System.out.println("Produzindo modelo esportivo com teto solar");
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
