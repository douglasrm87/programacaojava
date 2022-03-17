package padraoprojeto.aula05.compositequestionario;

//https://robsoncastilho.com.br/2013/07/10/design-patterns-usando-composite-para-montar-uma-estrutura-em-arvore/
public abstract class ElementoDoQuestionario {
	protected String descricao;

	// Classe Base O Componente)
	protected ElementoDoQuestionario(String descricao) {
		this.descricao = descricao;
	}

	public abstract void exibir();
}
