package padraoprojeto.aula02.abstractfactory.exerciciocarro;

public class CarroSemTeto extends Carro{
	public void produzir() {
		System.out.println("Produzindo modelo popular sem teto solar");
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarIsofilme() {
	 
	}

}
