package padraoprojeto.aula05.compositequestionario;

//https://robsoncastilho.com.br/2013/07/10/design-patterns-usando-composite-para-montar-uma-estrutura-em-arvore/
//Item Folha do modelo Composite
public class Questao extends ElementoDoQuestionario {
	public Questao(String descricao) {
		super(descricao);
	}
 
	@Override
	public void exibir() {
		System.out.println("	Questão: "+descricao);
	}
}
