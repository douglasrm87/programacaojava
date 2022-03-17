package padraoprojeto.aula05.compositequestionario;

import java.util.ArrayList;
import java.util.List;
//https://robsoncastilho.com.br/2013/07/10/design-patterns-usando-composite-para-montar-uma-estrutura-em-arvore/
//bloco (o composto)
public class Bloco extends ElementoDoQuestionario {
	private List<ElementoDoQuestionario> elementos = new ArrayList<ElementoDoQuestionario>();

	public Bloco(String descricao) {
		super(descricao);
	}
	public void adicionar(ElementoDoQuestionario item) {
		elementos.add(item);
	}
	public void remover(ElementoDoQuestionario item) {
		elementos.remove(item);
	}
	@Override
	public void exibir() {
		System.out.println("Bloco: " + descricao);
		for (ElementoDoQuestionario item : elementos) {
			item.exibir();
		}
	}
}
